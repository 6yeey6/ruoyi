package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
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
