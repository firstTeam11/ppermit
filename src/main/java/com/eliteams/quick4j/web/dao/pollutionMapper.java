package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.pollution;
import com.eliteams.quick4j.web.model.pollutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pollutionMapper {
    int countByExample(pollutionExample example);

    int deleteByExample(pollutionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(pollution record);

    int insertSelective(pollution record);

    List<pollution> selectByExample(pollutionExample example);

    pollution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") pollution record, @Param("example") pollutionExample example);

    int updateByExample(@Param("record") pollution record, @Param("example") pollutionExample example);

    int updateByPrimaryKeySelective(pollution record);

    int updateByPrimaryKey(pollution record);
}