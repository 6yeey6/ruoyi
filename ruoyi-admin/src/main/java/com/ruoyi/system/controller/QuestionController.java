package com.ruoyi.system.controller;

import java.util.List;
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
import com.ruoyi.system.domain.Question;
import com.ruoyi.system.service.IQuestionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 调查问卷库Controller
 * 
 * @author ruoyi
 * @date 2024-08-21
 */
@Controller
@RequestMapping("/system/question")
public class QuestionController extends BaseController
{
    private String prefix = "system/question";

    @Autowired
    private IQuestionService questionService;

    @RequiresPermissions("system:question:view")
    @GetMapping()
    public String question()
    {
        return prefix + "/question";
    }

    /**
     * 查询调查问卷库列表
     */
    @RequiresPermissions("system:question:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Question question)
    {
        startPage();
        List<Question> list = questionService.selectQuestionList(question);
        return getDataTable(list);
    }

    /**
     * 导出调查问卷库列表
     */
    @RequiresPermissions("system:question:export")
    @Log(title = "调查问卷库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Question question)
    {
        List<Question> list = questionService.selectQuestionList(question);
        ExcelUtil<Question> util = new ExcelUtil<Question>(Question.class);
        return util.exportExcel(list, "调查问卷库数据");
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
    @Log(title = "调查问卷库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Question question)
    {
        return toAjax(questionService.insertQuestion(question));
    }

    /**
     * 修改调查问卷库
     */
    @RequiresPermissions("system:question:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Question question = questionService.selectQuestionById(id);
        mmap.put("question", question);
        return prefix + "/edit";
    }

    /**
     * 修改保存调查问卷库
     */
    @RequiresPermissions("system:question:edit")
    @Log(title = "调查问卷库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Question question)
    {
        return toAjax(questionService.updateQuestion(question));
    }

    /**
     * 删除调查问卷库
     */
    @RequiresPermissions("system:question:remove")
    @Log(title = "调查问卷库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(questionService.deleteQuestionByIds(ids));
    }
}
