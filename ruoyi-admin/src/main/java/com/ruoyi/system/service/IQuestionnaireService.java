package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Questionnaire;

/**
 * 调查问卷库Service接口
 * 
 * @author ruoyi
 * @date 2024-08-23
 */
public interface IQuestionnaireService 
{
    /**
     * 查询调查问卷库
     * 
     * @param id 调查问卷库主键
     * @return 调查问卷库
     */
    public Questionnaire selectQuestionnaireById(Long id);

    /**
     * 查询调查问卷库列表
     * 
     * @param questionnaire 调查问卷库
     * @return 调查问卷库集合
     */
    public List<Questionnaire> selectQuestionnaireList(Questionnaire questionnaire);

    /**
     * 新增调查问卷库
     * 
     * @param questionnaire 调查问卷库
     * @return 结果
     */
    public int insertQuestionnaire(Questionnaire questionnaire);

    /**
     * 修改调查问卷库
     * 
     * @param questionnaire 调查问卷库
     * @return 结果
     */
    public int updateQuestionnaire(Questionnaire questionnaire);

    /**
     * 批量删除调查问卷库
     * 
     * @param ids 需要删除的调查问卷库主键集合
     * @return 结果
     */
    public int deleteQuestionnaireByIds(String ids);

    /**
     * 删除调查问卷库信息
     * 
     * @param id 调查问卷库主键
     * @return 结果
     */
    public int deleteQuestionnaireById(Long id);
}
