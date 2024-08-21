package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Question;

/**
 * 调查问卷库Service接口
 * 
 * @author ruoyi
 * @date 2024-08-21
 */
public interface IQuestionService 
{
    /**
     * 查询调查问卷库
     * 
     * @param id 调查问卷库主键
     * @return 调查问卷库
     */
    public Question selectQuestionById(Long id);

    /**
     * 查询调查问卷库列表
     * 
     * @param question 调查问卷库
     * @return 调查问卷库集合
     */
    public List<Question> selectQuestionList(Question question);

    /**
     * 新增调查问卷库
     * 
     * @param question 调查问卷库
     * @return 结果
     */
    public int insertQuestion(Question question);

    /**
     * 修改调查问卷库
     * 
     * @param question 调查问卷库
     * @return 结果
     */
    public int updateQuestion(Question question);

    /**
     * 批量删除调查问卷库
     * 
     * @param ids 需要删除的调查问卷库主键集合
     * @return 结果
     */
    public int deleteQuestionByIds(String ids);

    /**
     * 删除调查问卷库信息
     * 
     * @param id 调查问卷库主键
     * @return 结果
     */
    public int deleteQuestionById(Long id);
}
