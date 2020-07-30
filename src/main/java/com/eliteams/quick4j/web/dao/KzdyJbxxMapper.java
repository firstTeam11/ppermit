package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.KzdyJbxx;
import com.eliteams.quick4j.web.model.KzdyJbxxExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface KzdyJbxxMapper {
    int countByExample(KzdyJbxxExample example);

    int deleteByExample(KzdyJbxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KzdyJbxx record);

    int insertSelective(KzdyJbxx record);

    List<KzdyJbxx> selectByExample(KzdyJbxxExample example);

    KzdyJbxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KzdyJbxx record, @Param("example") KzdyJbxxExample example);

    int updateByExample(@Param("record") KzdyJbxx record, @Param("example") KzdyJbxxExample example);

    int updateByPrimaryKeySelective(KzdyJbxx record);

    int updateByPrimaryKey(KzdyJbxx record);




    /**
     * 分页查询，分页条件查询
     *
     * **/
    List<KzdyJbxx> selectKzdyByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);


    long getKzdyCount(@Param(value = "map") Map map);

    int getSearchCount(@Param(value = "map") Map map);

    List<KzdyJbxx> selectSearchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);



    List<KzdyJbxx> selectAllForLeft(@Param(value = "map") Map map);

    List<KzdyJbxx> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map") Map map);

    List<KzdyJbxx> selectForMap(@Param(value = "map") Map map);
}