package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.KzdmJbxx;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

public interface KzdmService extends GenericService<KzdmJbxx, Integer> {

    int insert(KzdmJbxx record);

    int insertselective(KzdmJbxx record);

    int update(KzdmJbxx record);

    int deleteByPrimaryKey(Integer id);

    KzdmJbxx selectById(Integer id);


    KzdmJbxx  selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KzdmJbxx record);

    List<KzdmJbxx> searchByPage(String pageNow,Map map);

    Page getSearchPage(String pageNow, Map map);

    List<KzdmJbxx> selectForMap(Map map);



    Model selectKzdmByPage(String pageNow, Model model, String userName);


    List<KzdmJbxx> selectSearchByPage(String pageNow,Map map);

    List<KzdmJbxx> selectAllForLeft(Map map);

    List<String> getRoleNameOfCountry(String username);


}