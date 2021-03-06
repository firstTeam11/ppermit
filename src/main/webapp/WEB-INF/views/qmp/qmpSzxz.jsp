<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>水质现状报表</title>

  <link rel="stylesheet" href="app/js/3.20/dijit/themes/tundra/tundra.css">
  <link rel="stylesheet" href="app/js/3.20/esri/css/esri.css">
  <link rel="stylesheet" href="app/js/3.20/dojox/widget/ColorPicker/ColorPicker.css">
  <link rel="stylesheet" href="http://js.arcgis.com/3.20/dijit/themes/claro/claro.css">
  <link rel="stylesheet" href="https://js.arcgis.com/3.24/esri/themes/calcite/dijit/calcite.css">
  <link rel="stylesheet" href="https://js.arcgis.com/3.24/esri/themes/calcite/esri/esri.css">

  <link rel="stylesheet" type="text/css" href='app/js/jquery/themes/gray/easyui.css'>
  <link rel="stylesheet" type="text/css" href="app/js/jquery/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="app/css/qmp/public.css">
  <link rel="stylesheet" type="text/css" href="app/css/qmp/qmp.css">

  <%--<script type="text/javascript" src="app/js/3.20/init.js"></script>--%>


  <script type="text/javascript" src='app/js/qmp/qmpSzxz.js'></script>
  <script type="text/javascript" src='app/js/qmp/addQmpSzxz.js'></script>
  <script type="text/javascript" src='app/js/qmp/searchQmp.js'></script>
  <script type="text/javascript" src="app/js/bootstrap-treeview.js"></script>
  <script type="text/javascript" src='app/js/jquery/jquery.easyui.min.js'></script>
  <script type="text/javascript" src='app/js/jquery/locale/easyui-lang-zh_CN.js'></script>
  <script src="https://js.arcgis.com/3.24/"></script>
</head>
<body class="claro">
<div id="all">
  <div id="up">
    <div id="left">
      <div>

      </div>


      <input type="text" id="jsonInput" class="hide"/>


      <div style="margin-top: 10px;">
        <%--<div class="box">
            <div id="head-title">
                <a class="" style="font-size: 15px">实测数据添加与导入</a>
            </div>
            <div class="flex-row">
                <button type="button" class="btnz btnz-info"
                        data-toggle="modal" data-target="#myModal_add" id="addButton">添加
                </button>
                <button type="button" class="btn btn-primary btn-lg hide"
                        data-toggle="modal" data-target="#myModal_edit" id="editModelButton"></button>
            </div>
            <div class="flex" style="margin-bottom: 0px;">
                <button type="button" class="btnz btnz-black"
                        data-toggle="modal" data-target="#myModal_bulkImport" id="bulkImportButton">批量导入
                </button>
            </div>
        </div>--%>
        <div class="box"
             style="align-items: flex-start;padding: 0px;border-bottom-left-radius: 0 !important;border-bottom-right-radius: 0px !important">
          <div id="dmszsb_head" style="margin-bottom: 10px;margin-top: 10px">
            <a style='margin-left: 10px;border-left: solid 3px #00C0C2;padding-left: 5px;font-size: 15px'>水质类别判断</a>
          </div>
        </div>

        <div id="dmszsb_body">
          <div class="box"
               style="margin-bottom: 0px;border-top-left-radius: 0 !important;border-top-right-radius: 0px !important;">
            <div class="flex-row"
                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
              <span>区&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;域</span>
              <select id="szxz_region" style="background: #ffffff;width: 100px">
                <option value="all">所有</option>
              </select>
            </div>
            <div class="flex-row"
                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
              <span>断面级别</span>
              <select id="section_level" style="background: #ffffff;width: 100px">
                <option value="all">所有</option>
                <option value="86">86</option>
                <option value="24">24</option>
                <option value="7">7</option>
              </select>
            </div>

            <div class="flex-row"
                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
              <span>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;份</span>
              <select style="background: #ffffff;width: 100px" id="szxz_year">
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
              </select>
            </div>
            <div class="flex-row"
                 style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
              <span>月份区间</span>
              <select id="szxz_startm" style="background: #ffffff;width: 40px">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
              </select>
              <%--</div>
              <div class="flex-row" style="border: none;justify-content: space-between;width: 100%;padding-left: 10px;padding-right: 10px">
                  <span>结束月份</span>--%>
              <span>-</span>
              <select id="szxz_endm" style="background: #ffffff;width: 40px">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
              </select>
            </div>

            <div class="flex-row" style="border: none;width: 100%">
              <button type="button" class="btnz btnz-black" id="count_szxz"
                      style="width: 243.69px;">水质类别判断计算
              </button>
            </div>
              <div class="flex-row" style="border: none;width: 100%">
                <button type="button" class="btnz btnz-black" id="count_cbyz"
                        style="width: 243.69px;">超标因子现状累计计算
                </button>
              </div>
          </div>
        </div>
      </div>

    </div>
    <div id="right" style="position:relative">
      <%--<div id="rightPane"
           data-dojo-type="dijit/layout/ContentPane"
           data-dojo-props="region:'right'">

          <div data-dojo-type="dijit/layout/AccordionContainer">
              <div data-dojo-type="dijit/layout/ContentPane" id="legendPane"
                   data-dojo-props="title:'Legend', selected:true">
                  <div id="legendDiv"></div>
              </div>
              <div data-dojo-type="dijit/layout/ContentPane"
                   data-dojo-props="title:'Pane 2'">
                  This pane could contain tools or additional content
              </div>
          </div>
      </div>--%>
      <div id="map" data-dojo-type="dijit/layout/ContentPane"
           data-dojo-props="region:'center'"
           style="overflow:hidden;height:470px;width:100%">
        <div id="qmpBilichi" class="box"
             style="width:80px !important;height:20px !important;position:absolute;left:31px;top:400px">
          <div class="head-title">
            <a class="" style="font-size: 15px">比例尺</a>
          </div>
        </div>
        <div id="qmpTuli" class="box"
             style="width:120px !important;height:180px !important;position:absolute;right:0px;top:250px">
          <div class="head-title">
            <a class="" style="font-size: 15px">水质类别</a>
          </div>
          <div class="flex" style="margin-bottom: 0px">
            <div style="width:15px;float:left">
              <img src="app/img/dmcategory1_new.png" style="width:24px;height:24px"/>
              <img src="app/img/dmcategory2.png" style="width:24px;height:24px;"/>
              <img src="app/img/dmcategory3.png" style="width:24px;height:24px"/>
              <img src="app/img/dmcategory4_new.png" style="width:24px;height:24px"/>
              <img src="app/img/dmcategory5.png" style="width:24px;height:24px"/>
              <img src="app/img/dmcategoryL5.png" style="width:24px;height:24px"/>
            </div>
            <div style="width:50px;float:left;margin-left:10px">
              <p style="margin-bottom: 5px">Ⅰ</p>
              <p style="margin-bottom: 5px">Ⅱ</p>
              <p style="margin-bottom: 5px">Ⅲ</p>
              <p style="margin-bottom: 5px">Ⅳ</p>
              <p style="margin-bottom: 5px">Ⅴ</p>
              <p style="margin-bottom: 5px">劣Ⅴ</p>
            </div>
          </div>
        </div>
      </div>

      <div id="mapexport" class="box"
           style="width:160px!important;height:100px !important;position:absolute;right:0px;top:10px">
        <button type="button" class="pbtn" style="font-size: 15px; width: 100px">绘制图形</button>
        <input id="Btn" type="button" style="font-size: 15px; width: 100px" value="地图打印"/>
      </div>
    </div>
    <div id="bookmarks"></div>
    <div id="down">
      <form action="rest/qmp/exportToExcel" method="post">
        <input id="exportToExcel" class="btn btn-success" type="submit"
               style="display: none;background-color:#00c0c2!important;margin-bottom: 2px" value="导出水质类别Excel"/>
      </form>
        <form action="rest/qmp/exportToExcelCbyz" method="post">
            <input id="exportToExcelCbyz" class="btn btn-success" type="submit"
                   style="display: none;background-color:#00c0c2!important;margin-bottom: 2px" value="导出超标因子Excel"/>
            <input id="exportnf" style="display: none;" value="" name="exportnf"/>
        </form>
      <%--<button class="btn btn-success" id="exportToExcel" style="display: none;background-color:#00c0c2!important;margin-bottom: 2px">导出Excel</button>--%>
      <div id="listAll" style="width: auto"></div>
    </div>
    <div id="down2">
      <div id="listAll2" class="hide"></div>
    </div>
  </div>


  <!-- Modal -->
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-body" style="text-align: center">
          <img src="app/img/Loading.gif" width="100px" alt="">
          <strong>加载中，请稍后......</strong>
        </div>
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="myModal_add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
        <h4 class="modal-title" id="myModalLabel">添加控制断面</h4>
      </div>
      <div class="modal-body">
        <div id="addDiv"></div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btnz btnz-info" data-dismiss="modal" id="addQmp_szxz">确认添加</button>
      </div>
    </div>
  </div>
</div>


<div class="modal fade" id="myModal_bulkImport" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
        <h4 class="modal-title" id="myModalLabel">控制断面批量导入</h4>
      </div>
      <div class="modal-body">
        <div id="bulkImportDiv">
        </div>
      </div>
      <div class="modal-footer">
        <a type="button" class="btnz btnz-info" data-dismiss="modal" id="bulkImportQmp_x"
           onclick="bulkImportSzxz()">批量导入</a>
      </div>
    </div>
  </div>
</div>

</body>
</html>