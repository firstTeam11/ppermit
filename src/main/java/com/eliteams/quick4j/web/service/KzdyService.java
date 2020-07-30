package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.KzdyJbxx;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

public interface KzdyService extends GenericService<KzdyJbxx, Integer> {

    int insert(KzdyJbxx record);

    int insertselective(KzdyJbxx record);

    int update(KzdyJbxx record);

    int deleteByPrimaryKey(Integer id);

    KzdyJbxx selectById(Integer id);


    KzdyJbxx  selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(KzdyJbxx record);

    List<KzdyJbxx> searchByPage(String pageNow,Map map);

    Page getSearchPage(String pageNow, Map map);

    List<KzdyJbxx> selectForMap(Map map);



    Model selectKzdyByPage(String pageNow, Model model, String userName);


    List<KzdyJbxx> selectSearchByPage(String pageNow,Map map);

    List<KzdyJbxx> selectAllForLeft(Map map);

    List<String> getRoleNameOfCountry(String username);



}