package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.control_unit;
import com.eliteams.quick4j.web.model.control_unitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface control_unitMapper {
    int countByExample(control_unitExample example);

    int deleteByExample(control_unitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(control_unit record);

    int insertSelective(control_unit record);

    List<control_unit> selectByExample(control_unitExample example);

    control_unit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") control_unit record, @Param("example") control_unitExample example);

    int updateByExample(@Param("record") control_unit record, @Param("example") control_unitExample example);

    int updateByPrimaryKeySelective(control_unit record);

    int updateByPrimaryKey(control_unit record);
}