package com.tanquandan.blogsystem.mapper;

import com.tanquandan.blogsystem.DAO.Question;
import com.tanquandan.blogsystem.DAO.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    long countByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int deleteByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int insert(Question row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int insertSelective(Question row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    List<Question> selectByExampleWithBLOBsWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    List<Question> selectByExampleWithBLOBs(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    List<Question> selectByExampleWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    List<Question> selectByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    Question selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int updateByExampleSelective(@Param("row") Question row, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("row") Question row, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int updateByExample(@Param("row") Question row, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int updateByPrimaryKeySelective(Question row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(Question row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Mon May 29 09:01:00 CST 2023
     */
    int updateByPrimaryKey(Question row);
}