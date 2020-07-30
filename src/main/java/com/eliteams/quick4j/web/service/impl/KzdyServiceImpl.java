package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.KzdyJbxxMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;

import com.eliteams.quick4j.web.model.KzdyJbxx;
import com.eliteams.quick4j.web.service.KzdyService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class KzdyServiceImpl extends GenericServiceImpl<KzdyJbxx, Integer> implements KzdyService {
    @Resource
    private KzdyJbxxMapper kzdyJbxxMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<KzdyJbxx, Integer> getDao() {
        return (GenericDao<KzdyJbxx, Integer>)kzdyJbxxMapper ;
    }

    @Override
    public int insert(KzdyJbxx model){
        return kzdyJbxxMapper.insertSelective(model);
    }

    @Override
    public int insertselective(KzdyJbxx record) {
        return kzdyJbxxMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return kzdyJbxxMapper.deleteByPrimaryKey(id);
    }


    @Override
    public KzdyJbxx selectByPrimaryKey(Integer id) {
        return kzdyJbxxMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(KzdyJbxx record) {
        return kzdyJbxxMapper.updateByPrimaryKeySelective(record);
    }




    @Override
    public Model selectKzdyByPage(String pageNow, Model model, String userName) {
        Map map = new HashMap<String, String>();
        map.put("kzdy_shi","");
        map.put("kzdy_qx","");
        Long userId = userMapper.getIdByName(userName.trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdy_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdy_shi", arr[0]);
            map.put("kzdy_qx", arr[1]);
        }
        Page page = null;

        List<KzdyJbxx> kzdyJbxx = new ArrayList<KzdyJbxx>();

        int totalCount = (int)kzdyJbxxMapper.getKzdyCount(map);

        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            kzdyJbxx =kzdyJbxxMapper.selectKzdyByPage(page.getStartPos(),page.getPageSize(),map);
        } else {
            page = new Page(totalCount, 1);
            kzdyJbxx =kzdyJbxxMapper.selectKzdyByPage(page.getStartPos(),page.getPageSize(),map);
        }
        model.addAttribute("klist",kzdyJbxx);
        model.addAttribute("page",page);
        return model;
    }

    @Override
    public List<KzdyJbxx> selectSearchByPage(String pageNow, Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);

       if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdy_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdy_shi", arr[0]);
            map.put("kzdy_qx", arr[1]);
        }
        Page page = null;
        List<KzdyJbxx> kzdyJbxx = new ArrayList<KzdyJbxx>();

        int totalCount = (int)kzdyJbxxMapper.getKzdyCount(map);
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            kzdyJbxx =kzdyJbxxMapper.selectKzdyByPage(page.getStartPos(),page.getPageSize(),map);
        } else {
            page = new Page(totalCount, 1);
            kzdyJbxx =kzdyJbxxMapper.selectKzdyByPage(page.getStartPos(),page.getPageSize(),map);
        }
        return kzdyJbxx;
        }

    @Override
    public List<KzdyJbxx> selectAllForLeft(Map map) {
        // TODO Auto-generated method stub
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdy_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdy_shi", arr[0]);
            map.put("kzdy_qx", arr[1]);
        }
        return kzdyJbxxMapper.selectAllForLeft(map);
    }


        @Override
        public List<String> getRoleNameOfCountry(String username) {
            // TODO Auto-generated method stub
            Long userId = userMapper.getIdByName(username);
            Long roleId = roleMapper.getRoleIdByUserId(userId);
            String roleSign = roleMapper.getRoleSignByID(roleId);
            String loc_city = "";
            if (roleSign.equals("1")) {
            } else if (roleSign.equals("2")) {
                String roleName = roleMapper.getRoleNameByID(roleId);
                loc_city = roleName;
            } else if (roleSign.equals("3")) {
                String role = roleMapper.getRoleNameByID(roleId);
                String[] arr = role.split("_");
                loc_city = arr[0];
                String loc_county = arr[1];
            }
            List<String> list = roleMapper.getRoleNameOfCountry(loc_city);
            List<String> list_final = new ArrayList<String>();
            for(int i=0;i<list.size();i++){
                String[] arr = list.get(i).split("_");
                list_final.add(arr[1]);
            }
            return list_final;
        }


    @Override
    public List<KzdyJbxx> searchByPage(String pageNow, Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdy_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdy_shi", arr[0]);
            map.put("kzdy_qx", arr[1]);
        }


        Page page = null;
        List<KzdyJbxx> kzdyJbxx = new ArrayList<KzdyJbxx>();
        int totalCount = (int)kzdyJbxxMapper.getSearchCount(map);

        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            kzdyJbxx = kzdyJbxxMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);
        } else {
            page = new Page(totalCount, 1);
            kzdyJbxx = kzdyJbxxMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);
        }
        return kzdyJbxx;
    }

    @Override
    public Page getSearchPage(String pageNow, Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdy_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdy_shi", arr[0]);
            map.put("kzdy_qx", arr[1]);
        }
        // TODO Auto-generated method stub
        Page page = null;
        int totalCount = (int)kzdyJbxxMapper.getSearchCount(map);
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
        } else {
            page = new Page(totalCount, 1);
        }
        return page;
    }

    @Override
    public List<KzdyJbxx> selectForMap(Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdy_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdy_shi", arr[0]);
            map.put("kzdy_qx", arr[1]);
        }
        return kzdyJbxxMapper.selectForMap(map);
    }




















}



