package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.QuestionnaireMapper;
import com.ruoyi.system.domain.Questionnaire;
import com.ruoyi.system.service.IQuestionnaireService;
import com.ruoyi.common.core.text.Convert;

/**
 * 调查问卷库Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-23
 */
@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService 
{
    @Autowired
    private QuestionnaireMapper questionnaireMapper;

    /**
     * 查询调查问卷库
     * 
     * @param id 调查问卷库主键
     * @return 调查问卷库
     */
    @Override
    public Questionnaire selectQuestionnaireById(Long id)
    {
        return questionnaireMapper.selectQuestionnaireById(id);
    }

    /**
     * 查询调查问卷库列表
     * 
     * @param questionnaire 调查问卷库
     * @return 调查问卷库
     */
    @Override
    public List<Questionnaire> selectQuestionnaireList(Questionnaire questionnaire)
    {
        return questionnaireMapper.selectQuestionnaireList(questionnaire);
    }

    /**
     * 新增调查问卷库
     * 
     * @param questionnaire 调查问卷库
     * @return 结果
     */
    @Override
    public int insertQuestionnaire(Questionnaire questionnaire)
    {
        questionnaire.setCreateTime(DateUtils.getNowDate());
        //运营商不为空
//        if (StringUtils.isNotEmpty(questionnaire.getOperator())){
//        String[] splitCompanies = questionnaire.getOperator().split(",");
//        for (String company : splitCompanies) {
//            // 去除可能存在的空格（如果逗号后有空格的话）
//            if ("联通".equals(company)) {
//                questionnaire.setSecInfo2("联通");
//            }
//            if ("电信".equals(company)) {
//                questionnaire.setSecInfo3("电信");
//            }
//            if ("移动".equals(company)) {
//                questionnaire.setSecInfo4("移动");
//            }
//            if ("教育".equals(company)) {
//                questionnaire.setSecInfo5("教育");
//            }
//            if ("广电".equals(company)) {
//                questionnaire.setSecInfo6("广电");
//            }
//            if ("阿里云".equals(company)) {
//                questionnaire.setSecInfo7("阿里云");
//            }
//            if ("腾讯云".equals(company)) {
//                questionnaire.setSecInfo8("腾讯云");
//            }
//            if ("华为云".equals(company)) {
//                questionnaire.setSecInfo9("华为云");
//            }
//            if ("亚马逊云".equals(company)) {
//                questionnaire.setSecInfo10("亚马逊云");
//            }
//            if ("微软云".equals(company)) {
//                questionnaire.setSecInfo11("微软云");
//            }
//         }
//        }
        return questionnaireMapper.insertQuestionnaire(questionnaire);
    }

    /**
     * 修改调查问卷库
     * 
     * @param questionnaire 调查问卷库
     * @return 结果
     */
    @Override
    public int updateQuestionnaire(Questionnaire questionnaire)
    {
//        if (StringUtils.isNotEmpty(questionnaire.getOperator())){
//            String[] splitCompanies = questionnaire.getOperator().split(",");
//            for (String company : splitCompanies) {
//                // 去除可能存在的空格（如果逗号后有空格的话）
//                if ("联通".equals(company)) {
//                    questionnaire.setSecInfo2("联通");
//                }
//                if ("电信".equals(company)) {
//                    questionnaire.setSecInfo3("电信");
//                }
//                if ("移动".equals(company)) {
//                    questionnaire.setSecInfo4("移动");
//                }
//                if ("教育".equals(company)) {
//                    questionnaire.setSecInfo5("教育");
//                }
//                if ("广电".equals(company)) {
//                    questionnaire.setSecInfo6("广电");
//                }
//                if ("阿里云".equals(company)) {
//                    questionnaire.setSecInfo7("阿里云");
//                }
//                if ("腾讯云".equals(company)) {
//                    questionnaire.setSecInfo8("腾讯云");
//                }
//                if ("华为云".equals(company)) {
//                    questionnaire.setSecInfo9("华为云");
//                }
//                if ("亚马逊云".equals(company)) {
//                    questionnaire.setSecInfo10("亚马逊云");
//                }
//                if ("微软云".equals(company)) {
//                    questionnaire.setSecInfo11("微软云");
//                }
//            }
//        }
        return questionnaireMapper.updateQuestionnaire(questionnaire);
    }

    /**
     * 批量删除调查问卷库
     * 
     * @param ids 需要删除的调查问卷库主键
     * @return 结果
     */
    @Override
    public int deleteQuestionnaireByIds(String ids)
    {
        return questionnaireMapper.deleteQuestionnaireByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除调查问卷库信息
     * 
     * @param id 调查问卷库主键
     * @return 结果
     */
    @Override
    public int deleteQuestionnaireById(Long id)
    {
        return questionnaireMapper.deleteQuestionnaireById(id);
    }
}
