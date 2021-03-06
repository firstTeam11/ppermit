package com.eliteams.quick4j.web.controller;

import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.KzdmJbxx;
import com.eliteams.quick4j.web.service.KzdmService;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;


@Controller
@RequestMapping("/kzdm")
public class KzdmController {


    @Resource
    private KzdmService kzdmService;


    /**
     * 添加控制断面跳转
     *
     */
    @RequestMapping("/addKzdm")
    public String addCUnit() {
        return "kzdm/addKzdm";
    }


    /**
     * 查询控制断面跳转
     */
    @RequestMapping("/searchKzdm")
    public String searchCu() {
        return "kzdm/searchKzdm";
    }


    /**
     * bulkImport页
     */
    @RequestMapping("/bulkImportKzdm")
    public String bulkImportCu() {
        return "kzdm/bulkImportKzdm";
    }


    /**
     * 添加信息
     */
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(HttpServletRequest request, KzdmJbxx kzdmJbxx) {
        int result = kzdmService.insertselective(kzdmJbxx);
        request.setAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 查询列表
     */
    @RequestMapping("/list")
    public String controlUnitList(HttpServletRequest request, Model model) {
        String pageNow = request.getParameter("pageNow");
        String userName = (String) request.getSession().getAttribute("userName");
        model = kzdmService.selectKzdmByPage(pageNow, model, userName);
        return "kzdm/kzdmList";
    }

    /**
     * 查询修改信息的id
     */
    @RequestMapping("/id")
    public String updateid(HttpServletRequest request, Integer id, Model model) {
        KzdmJbxx kzdmJbxx = kzdmService.selectByPrimaryKey(id);
        model.addAttribute("kzdmJbxx", kzdmJbxx);
        return "kzdm/editKzdm";
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @ResponseBody
    public String update(HttpServletRequest request, KzdmJbxx kzdmJbxx, Model model) {
        int result = kzdmService.updateByPrimaryKeySelective(kzdmJbxx);
        model.addAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 删除 ，根据id删除
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(HttpServletRequest request, Integer id) {
        int result = kzdmService.deleteByPrimaryKey(id);
        request.setAttribute("result", result);
        if (result > 0) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("/search")
    @ResponseBody
    public ModelAndView search(HttpServletRequest request, ModelAndView m) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("kzdm_bh", (String) request.getParameter("kzdm_bh"));
        map.put("kzdm_dybh", (String) request.getParameter("kzdm_dybh"));
        map.put("kzdm_dymc", (String) request.getParameter("kzdm_dymc"));
        map.put("kzdm_lymc", (String) request.getParameter("kzdm_lymc"));
        map.put("kzdm_szhl", (String) request.getParameter("kzdm_szhl"));
        map.put("kzdm_hljb", (String) request.getParameter("kzdm_hljb"));
        map.put("kzdm_hrhl", (String) request.getParameter("kzdm_hrhl"));
        map.put("kzdm_mc", (String) request.getParameter("kzdm_mc"));
        map.put("kzdm_sx", (String) request.getParameter("kzdm_sx"));
        map.put("kzdm_sheng", (String) request.getParameter("kzdm_sheng"));
        map.put("kzdm_shi", (String) request.getParameter("kzdm_shi"));
        map.put("kzdm_qx", (String) request.getParameter("kzdm_qx"));
        map.put("kzdm_czmc", (String) request.getParameter("kzdm_czmc"));
        map.put("kzdm_jb", (String) request.getParameter("kzdm_jb"));
        map.put("kzdm_lx", (String) request.getParameter("kzdm_lx"));
        map.put("kzdm_sfcq", (String) request.getParameter("kzdm_sfcq"));
        map.put("kzdm_szzk", (String) request.getParameter("kzdm_szzk"));
        map.put("kzdm_jcpc", (String) request.getParameter("kzdm_jcpc"));
        map.put("kzdm_jcxm", (String) request.getParameter("kzdm_jcxm"));
        map.put("kzdm_jdd", (String) request.getParameter("kzdm_jdd"));
        map.put("kzdm_jdf", (String) request.getParameter("kzdm_jdf"));
        map.put("kzdm_jds", (String) request.getParameter("kzdm_jds"));
        map.put("kzdm_wdd", (String) request.getParameter("kzdm_wdd"));
        map.put("kzdm_wdf", (String) request.getParameter("kzdm_wdf"));
        map.put("kzdm_wds", (String) request.getParameter("kzdm_wds"));
        map.put("kzdm_szmb", (String) request.getParameter("kzdm_szmb"));
        map.put("kzdm_jd", (String) request.getParameter("kzdm_jd"));
        map.put("kzdm_wd", (String) request.getParameter("kzdm_wd"));
        map.put("kzdm_shhl", (String) request.getParameter("kzdm_shhl"));
        map.put("kzdm_time", (String) request.getParameter("kzdm_time"));
        map.put("username", (String) request.getSession().getAttribute("userName"));
        if (request.getParameter("id") != null) {
            map.put("id", (String) request.getParameter("id"));
        }
        String pageNow = request.getParameter("pageNow");
        List<KzdmJbxx> list = kzdmService.searchByPage(pageNow, map);
        Page page = kzdmService.getSearchPage(pageNow, map);
//
//        //为地图查询数据
//        List<KzdmJbxx> listForMap = kzdmService.selectForMap(map);
//        int i = 0;
//        int j = listForMap.size();
//        String name = "";
//        for (KzdmJbxx c : listForMap) {
//            i++;
//            if (i < j) {
//                name = name + "断面名称='" + c.getKzdmMc().split("（")[0] + "' or ";
//            } else {
//                name = name + "断面名称='" + c.getKzdmMc().split("（")[0] + "'";
//            }
//        }
//        m.addObject("name", name);
//
        m.addObject("list", list);
        m.addObject("page", page);
        m.setViewName("kzdm/kzdmList_S");
        return m;
    }


    @RequestMapping("/getTableName")
    public void getTableName(HttpServletRequest request, HttpServletResponse response) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/new_env";
        String sql = "select column_name from information_schema.columns where table_schema='new_env' and table_name='tbl_kzdm_jbxx'";
        java.sql.PreparedStatement pstmt;
        List list = new ArrayList<String>();
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_env", "root", "root");

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();

            String sql2 = "select count(column_name) from information_schema.columns where table_schema='new_env' and table_name='tbl_kzdm_jbxx'";
            java.sql.PreparedStatement pstmt2;

            pstmt2 = (PreparedStatement) conn.prepareStatement(sql2);
            ResultSet rs2 = pstmt2.executeQuery();
            int a =0;
            while(rs2.next()){
                a = rs2.getInt("count(column_name)");
            }

            sql +=" limit 1,"+(a-6);

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs3 = pstmt.executeQuery();
            while (rs3.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs3.getString(i) + "\t");
                    list.add(rs3.getString(i));
                }
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        String str = gson.toJson(list);
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write(str);
    }


    /**
     * 为左侧菜单筛选内容
     */
    @RequestMapping("/left")
    @ResponseBody
    public List<KzdmJbxx> selectAllForLeft(HttpServletRequest request, Model model) {
        Map map = new HashMap();
        map.put("username", (String) request.getSession().getAttribute("userName"));
        List<KzdmJbxx> list = kzdmService.selectAllForLeft(map);
        return list;
    }


    @RequestMapping("/county")
    @ResponseBody
    public List<String> getRoleNameOfCountry(HttpServletRequest request, Model model) {
        String username = (String) request.getSession().getAttribute("userName");
        List<String> list = kzdmService.getRoleNameOfCountry(username);
        System.out.println(list);
        return list;
    }



    /**
     * 保存数据
     */
    private String fileUploadName;
    public String getFileUploadName() {
        return fileUploadName;
    }

    public void setFileUploadName(String fileUploadName) {
        this.fileUploadName = fileUploadName;
    }

    private String fileUploadPath;

    public String getFileUploadPath() {
        return fileUploadPath;
    }

    public void setFileUploadPath(String fileUploadPath) {
        this.fileUploadPath = fileUploadPath;
    }


    private String fileUploadTime;
    public String getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(String fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUploadCu(HttpServletRequest request) throws Exception{
//        QmpController qmp = new QmpController();
        Map<String, Object> err = new HashMap<String, Object>();
        err.put("status", "myerror");
        Gson gson = new Gson();
        long  startTime=System.currentTimeMillis();
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
        String dir = request.getSession().getServletContext().getRealPath("upload/kzdm");

        if(multipartResolver.isMultipart(request)){

            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
            Iterator<?> iter=multiRequest.getFileNames();
            while(iter.hasNext()){

                MultipartFile file=multiRequest.getFile(iter.next().toString());
                String path = "";
                String filename_forPath = "\\";

                if(file!=null){
                    String TIME = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(java.util.Calendar.getInstance().getTime());
                    this.setFileUploadTime(TIME);
                    String[] fopt = file.getOriginalFilename().split("\\.");
                    System.out.println("orifilename:");
                    System.out.println(file.getOriginalFilename());
                    fopt[1] = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
                    filename_forPath += fopt[0]+'_'+TIME + '.' + fopt[1];
                    String filename = fopt[0]+'_'+TIME + '.' + fopt[1];
                    this.setFileUploadName(filename);
                    System.out.println("filename:");
                    System.out.println(filename);
                    path = dir + filename_forPath;
                    this.setFileUploadPath(path);
                    System.out.println("path:");
                    System.out.println(path);
                    File newFile = new File(path);
                    //上传
                    file.transferTo(newFile);

                }else{

                }
            }
        }
        long  endTime=System.currentTimeMillis();
        System.out.println("上传花费时间："+String.valueOf(endTime-startTime)+"ms");

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", "success");

        return gson.toJson(result);
    }
    @RequestMapping("/bulkImport")
    @ResponseBody
    public String bulkImportCu(HttpServletRequest request) throws Exception {
        long startTime=System.currentTimeMillis();
        String oriFileName = request.getParameter("name");
        String fileName = this.getFileUploadName();
        String filePath = this.getFileUploadPath();
        String fileUploadTime = this.getFileUploadTime();

        String msg = poiExcelKzdm.poiExceltoSql(oriFileName,fileName,filePath,fileUploadTime);
        String[] message = msg.split(" ");
        long  endTime=System.currentTimeMillis();
        String timeCost = String.valueOf(endTime-startTime)+"ms";
        System.out.println("批量导入花费时间："+timeCost);
        Gson gson = new Gson();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg",message[0]);
        result.put("updateCount",message[1]);
        result.put("insertCount",message[2]);
        System.out.println(message[0]);
        System.out.println(message[1]);
        System.out.println(message[2]);
        result.put("time",timeCost);
        return gson.toJson(result);


    }

    @RequestMapping("/upload")
    public ResponseEntity<byte[]> upload(HttpSession session, HttpServletRequest request) throws IOException{
        File file=new File(request.getSession().getServletContext().getRealPath("export/kzdm")+"/temp.xls");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", Long.toString(System.currentTimeMillis())+".xls");
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
        file.delete();
        return re;
    }


    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException{

        Map map = new HashMap();
        map.put("kzdm_bh", (String) request.getParameter("kzdm_bh"));
        map.put("kzdm_dybh", (String) request.getParameter("kzdm_dybh"));
        map.put("kzdm_dymc", (String) request.getParameter("kzdm_dymc"));
        map.put("kzdm_lymc", (String) request.getParameter("kzdm_lymc"));
        map.put("kzdm_szhl", (String) request.getParameter("kzdm_szhl"));
        map.put("kzdm_hljb", (String) request.getParameter("kzdm_hljb"));
        map.put("kzdm_hrhl", (String) request.getParameter("kzdm_hrhl"));
        map.put("kzdm_mc", (String) request.getParameter("kzdm_mc"));
        map.put("kzdm_sx", (String) request.getParameter("kzdm_sx"));
        map.put("kzdm_sheng", (String) request.getParameter("kzdm_sheng"));
        map.put("kzdm_shi", (String) request.getParameter("kzdm_shi"));
        map.put("kzdm_qx", (String) request.getParameter("kzdm_qx"));
        map.put("kzdm_czmc", (String) request.getParameter("kzdm_czmc"));
        map.put("kzdm_jb", (String) request.getParameter("kzdm_jb"));
        map.put("kzdm_lx", (String) request.getParameter("kzdm_lx"));
        map.put("kzdm_sfcq", (String) request.getParameter("kzdm_sfcq"));
        map.put("kzdm_szzk", (String) request.getParameter("kzdm_szzk"));
        map.put("kzdm_jcpc", (String) request.getParameter("kzdm_jcpc"));
        map.put("kzdm_jcxm", (String) request.getParameter("kzdm_jcxm"));
        map.put("kzdm_jdd", (String) request.getParameter("kzdm_jdd"));
        map.put("kzdm_jdf", (String) request.getParameter("kzdm_jdf"));
        map.put("kzdm_jds", (String) request.getParameter("kzdm_jds"));
        map.put("kzdm_wdd", (String) request.getParameter("kzdm_wdd"));
        map.put("kzdm_wdf", (String) request.getParameter("kzdm_wdf"));
        map.put("kzdm_wds", (String) request.getParameter("kzdm_wds"));
        map.put("kzdm_szmb", (String) request.getParameter("kzdm_szmb"));
        map.put("kzdm_jd", (String) request.getParameter("kzdm_jd"));
        map.put("kzdm_wd", (String) request.getParameter("kzdm_wd"));
        map.put("kzdm_shhl", (String) request.getParameter("kzdm_shhl"));
        map.put("kzdm_time", (String) request.getParameter("kzdm_time"));
        map.put("username", (String) request.getSession().getAttribute("userName"));
        if(request.getParameter("id")!=null){
            map.put("id",(String) request.getParameter("id"));
        }
        List<KzdmJbxx> allList = kzdmService.selectForMap(map);

        ArrayList<String> title = new ArrayList<String>();
        Field[] fields=allList.get(0).getClass().getDeclaredFields();
        title.add("ID");
        title.add("控制断面编号");
        title.add("所属控制单元编号");
        title.add("所属控制单元名称");
        title.add("流域名称");
        title.add("所在河流（湖库）");
        title.add("河流级别/湖库属性");
        title.add("汇入河流（湖库、海洋）");
        title.add("断面名称");
        title.add("断面属性");
        title.add("所属省份");
        title.add("所属地市");
        title.add("所属区县");
        title.add("测站名称");
        title.add("断面级别");
        title.add("断面类型");
        title.add("是否在城市建成区");
        title.add("现有/拟增设/新增");
        title.add("监测频次");
        title.add("监测项目");
        title.add("经度度");
        title.add("经度分");
        title.add("经度秒");
        title.add("纬度度");
        title.add("纬度分");
        title.add("纬度秒");
        title.add("功能区水质目标");
        title.add("经度");
        title.add("纬度");
        title.add("所含河流");
        title.add("设置时间");


        response.setContentType("application/binary;charset=UTF-8");
        String fileName=new String(("temp").getBytes(),"UTF-8");
        String path = request.getSession().getServletContext().getRealPath("export/kzdm");
        try{
            ServletOutputStream out=response.getOutputStream();
            response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
            genExcel(allList,title, out, fields,path);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private void genExcel(List<KzdmJbxx> allList, ArrayList<String> title, ServletOutputStream out, Field[] fields, String path){
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("控制断面");
        HSSFRow row;
        HSSFCell cell;

        row = sheet.createRow(0);//创建表格行
        for(int j = 0; j < title.size(); j++) {
            cell = row.createCell(j);//根据表格行创建单元格
            cell.setCellValue(String.valueOf(title.get(j)));
        }

        try {
            for(int i = 0; i < allList.size(); i++) {
                row = sheet.createRow(i+1);//创建表格行
                KzdmJbxx temp = allList.get(i);
                for(int j=0;j<fields.length-1;j++){
                    Field f = temp.getClass().getDeclaredField(fields[j].getName());
                    f.setAccessible(true);
                    Object o = f.get(temp);
                    cell = row.createCell(j);
                    if(o == null){
                        o ="";
                    }
                    cell.setCellValue(o.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("error1");
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path+"/temp.xls");
            wb.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
