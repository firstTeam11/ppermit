package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.KzdmJbxxMapper;
import com.eliteams.quick4j.web.dao.RoleMapper;
import com.eliteams.quick4j.web.dao.UserMapper;

import com.eliteams.quick4j.web.model.KzdmJbxx;
import com.eliteams.quick4j.web.service.KzdmService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class KzdmServiceImpl extends GenericServiceImpl<KzdmJbxx, Integer> implements KzdmService {
    @Resource
    private KzdmJbxxMapper kzdmJbxxMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<KzdmJbxx, Integer> getDao() {
        return (GenericDao<KzdmJbxx, Integer>)kzdmJbxxMapper ;
    }

    @Override
    public int insert(KzdmJbxx model){
        return kzdmJbxxMapper.insertSelective(model);
    }

    @Override
    public int insertselective(KzdmJbxx record) {
        return kzdmJbxxMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return kzdmJbxxMapper.deleteByPrimaryKey(id);
    }


    @Override
    public KzdmJbxx selectByPrimaryKey(Integer id) {
        return kzdmJbxxMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(KzdmJbxx record) {
        return kzdmJbxxMapper.updateByPrimaryKeySelective(record);
    }




    @Override
    public Model selectKzdmByPage(String pageNow, Model model, String userName) {
        Map map = new HashMap<String, String>();
        map.put("kzdm_shi","");
        map.put("kzdm_qx","");
        Long userId = userMapper.getIdByName(userName.trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdm_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdm_shi", arr[0]);
            map.put("kzdm_qx", arr[1]);
        }
        Page page = null;

        List<KzdmJbxx> kzdmJbxx = new ArrayList<KzdmJbxx>();

        int totalCount = (int)kzdmJbxxMapper.getKzdmCount(map);

        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            kzdmJbxx =kzdmJbxxMapper.selectKzdmByPage(page.getStartPos(),page.getPageSize(),map);
        } else {
            page = new Page(totalCount, 1);
            kzdmJbxx =kzdmJbxxMapper.selectKzdmByPage(page.getStartPos(),page.getPageSize(),map);
        }
        model.addAttribute("list",kzdmJbxx);
        model.addAttribute("page",page);
        return model;
    }

    @Override
    public List<KzdmJbxx> selectSearchByPage(String pageNow, Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);

       if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdm_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdm_shi", arr[0]);
            map.put("kzdm_qx", arr[1]);
        }
        Page page = null;
        List<KzdmJbxx> KzdmJbxx = new ArrayList<KzdmJbxx>();

        int totalCount = (int)kzdmJbxxMapper.getKzdmCount(map);
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            KzdmJbxx =kzdmJbxxMapper.selectKzdmByPage(page.getStartPos(),page.getPageSize(),map);
        } else {
            page = new Page(totalCount, 1);
            KzdmJbxx =kzdmJbxxMapper.selectKzdmByPage(page.getStartPos(),page.getPageSize(),map);
        }
        return KzdmJbxx;
        }

    @Override
    public List<KzdmJbxx> selectAllForLeft(Map map) {
        // TODO Auto-generated method stub
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdm_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdm_shi", arr[0]);
            map.put("kzdm_qx", arr[1]);
        }
        return kzdmJbxxMapper.selectAllForLeft(map);
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
    public List<KzdmJbxx> searchByPage(String pageNow, Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdm_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdm_shi", arr[0]);
            map.put("kzdm_qx", arr[1]);
        }


        Page page = null;
        List<KzdmJbxx> KzdmJbxx = new ArrayList<KzdmJbxx>();
        int totalCount = (int)kzdmJbxxMapper.getSearchCount(map);

        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            KzdmJbxx = kzdmJbxxMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);
        } else {
            page = new Page(totalCount, 1);
            KzdmJbxx = kzdmJbxxMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);
        }
        return KzdmJbxx;
    }

    @Override
    public Page getSearchPage(String pageNow, Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdm_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdm_shi", arr[0]);
            map.put("kzdm_qx", arr[1]);
        }
        // TODO Auto-generated method stub
        Page page = null;
        int totalCount = (int)kzdmJbxxMapper.getSearchCount(map);
        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
        } else {
            page = new Page(totalCount, 1);
        }
        return page;
    }

    @Override
    public List<KzdmJbxx> selectForMap(Map map) {
        Long userId = userMapper.getIdByName(map.get("username").toString().trim());
        Long roleId = roleMapper.getRoleIdByUserId(userId);
        String roleSign = roleMapper.getRoleSignByID(roleId);
        if(roleSign.equals("1")){
        }else if(roleSign.equals("2")){
            String roleName = roleMapper.getRoleNameByID(roleId);
            map.put("kzdm_shi", roleName);
        }else if(roleSign.equals("3")){
            String role = roleMapper.getRoleNameByID(roleId);
            String[] arr = role.split("_");
            map.put("kzdm_shi", arr[0]);
            map.put("kzdm_qx", arr[1]);
        }
        return kzdmJbxxMapper.selectForMap(map);
    }


}



