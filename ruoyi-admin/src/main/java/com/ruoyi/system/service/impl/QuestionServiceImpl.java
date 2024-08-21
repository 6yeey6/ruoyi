package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.QuestionMapper;
import com.ruoyi.system.domain.Question;
import com.ruoyi.system.service.IQuestionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 调查问卷库Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-21
 */
@Service
public class QuestionServiceImpl implements IQuestionService 
{
    @Autowired
    private QuestionMapper questionMapper;

    /**
     * 查询调查问卷库
     * 
     * @param id 调查问卷库主键
     * @return 调查问卷库
     */
    @Override
    public Question selectQuestionById(Long id)
    {
        return questionMapper.selectQuestionById(id);
    }

    /**
     * 查询调查问卷库列表
     * 
     * @param question 调查问卷库
     * @return 调查问卷库
     */
    @Override
    public List<Question> selectQuestionList(Question question)
    {
        return questionMapper.selectQuestionList(question);
    }

    /**
     * 新增调查问卷库
     * 
     * @param question 调查问卷库
     * @return 结果
     */
    @Override
    public int insertQuestion(Question question)
    {
        return questionMapper.insertQuestion(question);
    }

    /**
     * 修改调查问卷库
     * 
     * @param question 调查问卷库
     * @return 结果
     */
    @Override
    public int updateQuestion(Question question)
    {
        return questionMapper.updateQuestion(question);
    }

    /**
     * 批量删除调查问卷库
     * 
     * @param ids 需要删除的调查问卷库主键
     * @return 结果
     */
    @Override
    public int deleteQuestionByIds(String ids)
    {
        return questionMapper.deleteQuestionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除调查问卷库信息
     * 
     * @param id 调查问卷库主键
     * @return 结果
     */
    @Override
    public int deleteQuestionById(Long id)
    {
        return questionMapper.deleteQuestionById(id);
    }
}
