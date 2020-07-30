package com.eliteams.quick4j.web.dao;

import com.eliteams.quick4j.web.model.KzdmJbxx;
import com.eliteams.quick4j.web.model.KzdmJbxxExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface KzdmJbxxMapper {
    int countByExample(KzdmJbxxExample example);

    int deleteByExample(KzdmJbxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KzdmJbxx record);

    int insertSelective(KzdmJbxx record);

    List<KzdmJbxx> selectByExample(KzdmJbxxExample example);

    KzdmJbxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KzdmJbxx record, @Param("example") KzdmJbxxExample example);

    int updateByExample(@Param("record") KzdmJbxx record, @Param("example") KzdmJbxxExample example);

    int updateByPrimaryKeySelective(KzdmJbxx record);

    int updateByPrimaryKey(KzdmJbxx record);


    /**
     * 分页查询，分页条件查询
     *
     * **/
    List<KzdmJbxx> selectKzdmByPage(@Param(value="startPos") Integer startPos, @Param(value="pageSize") Integer pageSize, @Param(value = "map") Map map);


    long getKzdmCount(@Param(value = "map") Map map);

    int getSearchCount(@Param(value = "map")Map map);

    List<KzdmJbxx> selectSearchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map")Map map);



    List<KzdmJbxx> selectAllForLeft(@Param(value = "map")Map map);

    List<KzdmJbxx> searchByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize, @Param(value = "map")Map map);

    List<KzdmJbxx> selectForMap(@Param(value = "map")Map map);
}