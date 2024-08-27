package com.ruoyi.system.controller;

import java.util.*;

import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.system.util.WordUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Questionnaire;
import com.ruoyi.system.service.IQuestionnaireService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 调查问卷库Controller
 * 
 * @author ruoyi
 * @date 2024-08-23
 */
@Controller
@RequestMapping("/system/questionnaire")
public class QuestionnaireController extends BaseController
{
    private String prefix = "system/questionnaire";

    @Autowired
    private IQuestionnaireService questionnaireService;

    @RequiresPermissions("system:questionnaire:view")
    @GetMapping()
    public String questionnaire()
    {
        return prefix + "/questionnaire";
    }

    /**
     * 查询调查问卷库列表
     */
    @RequiresPermissions("system:questionnaire:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Questionnaire questionnaire)
    {
        startPage();
        List<Questionnaire> list = questionnaireService.selectQuestionnaireList(questionnaire);
        return getDataTable(list);
    }

    /**
     * 导出调查问卷库列表
     */
    @RequiresPermissions("system:questionnaire:export")
    @Log(title = "调查问卷库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Questionnaire questionnaire)
    {
//        List<Questionnaire> list = questionnaireService.selectQuestionnaireList(questionnaire);
        List<Questionnaire> list1 = new ArrayList<>();
        ExcelUtil<Questionnaire> util = new ExcelUtil<Questionnaire>(Questionnaire.class);
        return util.exportExcel(list1, "调查问卷库数据");
    }

    /**
     * 导入模版
     * @return
     */
    @RequiresPermissions("system:questionnaire:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<Questionnaire> util = new ExcelUtil<Questionnaire>(Questionnaire.class);
        return util.importTemplateExcel("资产数据");
    }

    /**
     * 导入数据
     * @param file
     * @param updateSupport
     * @return
     * @throws Exception
     */
    @Log(title = "调查问卷库", businessType = BusinessType.IMPORT)
    @RequiresPermissions("system:questionnaire:importDate")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importDate(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<Questionnaire> util = new ExcelUtil<Questionnaire>(Questionnaire.class);
        List<Questionnaire> userList = util.importExcel(file.getInputStream());
        for (Questionnaire  questionnaire: userList){
            questionnaireService.insertQuestionnaire(questionnaire);
        }
        return AjaxResult.success();
    }

    /**
     * 新增调查问卷库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存调查问卷库
     */
    @RequiresPermissions("system:questionnaire:add")
    @Log(title = "调查问卷库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Questionnaire questionnaire)
    {
        return toAjax(questionnaireService.insertQuestionnaire(questionnaire));
    }

    /**
     * 修改调查问卷库
     */
    @RequiresPermissions("system:questionnaire:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Questionnaire questionnaire = questionnaireService.selectQuestionnaireById(id);
        mmap.put("questionnaire", questionnaire);
        return prefix + "/edit";
    }

    /**
     * 修改保存调查问卷库
     */
    @RequiresPermissions("system:questionnaire:edit")
    @Log(title = "调查问卷库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Questionnaire questionnaire)
    {
        return toAjax(questionnaireService.updateQuestionnaire(questionnaire));
    }

    /**
     * 删除调查问卷库
     */
    @RequiresPermissions("system:questionnaire:remove")
    @Log(title = "调查问卷库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(questionnaireService.deleteQuestionnaireByIds(ids));
    }


    /**
     * 导出
     */
    /**
     * 根据模板导出word
     */
    @Log(title = "根据模板导出word", businessType = BusinessType.EXPORT)
    @RequiresPermissions("system:questionnaire:export")
    @PostMapping("/exportWord")
    @ResponseBody
    public AjaxResult exportWord(long ids, HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map = new HashMap<>();
        Questionnaire questionnaire = questionnaireService.selectQuestionnaireById(ids);
        String title = questionnaire.getCompanyName();
        //        Class clazz = questionnaire.getClass();
//        // 获取类中声明的字段
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field : fields) {
//            // 避免 can not access a member of class com.java.test.Person with modifiers "private"
//            field.setAccessible(true);
//            try {
//                System.out.println(field.getName() + ":"+ field.get(questionnaire));
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//        if(title.equals("true")){
//            map.put("title", "是"+"\u2611" +" " +"否"+"\u25A1");
//        }else{
//            map.put("title", "否"+"\u2611" +" " +"是"+"\u25A1");
//        }
        //TODO 时间戳参数化
        map.put("title", title);
        String str = UUID.randomUUID().toString()+".docx";
        //获取yml配置地址
        String tempDir = RuoYiConfig.getProfile() + "/download/";
        String name = WordUtils.easyPoiExport("static/word/template.docx", tempDir, str, map, request, response);
        return AjaxResult.success(name);
    }
}
