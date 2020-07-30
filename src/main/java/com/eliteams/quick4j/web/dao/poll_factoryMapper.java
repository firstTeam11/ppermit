package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.poll_factory;
import com.eliteams.quick4j.web.model.poll_factoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface poll_factoryMapper {
    int countByExample(poll_factoryExample example);

    int deleteByExample(poll_factoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(poll_factory record);

    int insertSelective(poll_factory record);

    List<poll_factory> selectByExample(poll_factoryExample example);

    poll_factory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") poll_factory record, @Param("example") poll_factoryExample example);

    int updateByExample(@Param("record") poll_factory record, @Param("example") poll_factoryExample example);

    int updateByPrimaryKeySelective(poll_factory record);

    int updateByPrimaryKey(poll_factory record);
}