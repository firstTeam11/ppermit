package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.qmp_wrxx;
import com.eliteams.quick4j.web.model.qmp_wrxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface qmp_wrxxMapper {
    int countByExample(qmp_wrxxExample example);

    int deleteByExample(qmp_wrxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(qmp_wrxx record);

    int insertSelective(qmp_wrxx record);

    List<qmp_wrxx> selectByExample(qmp_wrxxExample example);

    qmp_wrxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") qmp_wrxx record, @Param("example") qmp_wrxxExample example);

    int updateByExample(@Param("record") qmp_wrxx record, @Param("example") qmp_wrxxExample example);

    int updateByPrimaryKeySelective(qmp_wrxx record);

    int updateByPrimaryKey(qmp_wrxx record);
}