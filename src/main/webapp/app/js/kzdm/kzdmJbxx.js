
$(document).ready(function() {


    var url = "rest/kzdm/list";
    $.get(url, function(data) {
        $('#listAll').html(data);
    });



    $('#addButton').click(function(){
    var url = "rest/kzdm/addKzdm";
    $.get(url, function(data) {
        $('#addDiv').html(data);
    });
    });

    $('#addKzdm_x').click(function() {
        $.ajax({
            type : "POST",
            dataType : "KzdmJbxx",
            async : false,
            url : "rest/kzdm/insert",
            data : $('#insertForm').serialize(),
        });

        var url = "rest/kzdm/list";
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    });
    $('#searchButton').click(function() {
        var url = "rest/kzdm/searchKzdm";
        $.get(url, function(data) {
            $('#searchDiv').html(data);
        });
    });

    var username = $('.username').text();
    var json = {
        "username": username
    };
    $('#jsonInput').val(JSON.stringify(json));
});

$('#bulkImportButton').click(function() {
    var url = "rest/kzdm/bulkImportKzdm";
    $.get(url, function(data) {
        $('#bulkImportDiv').html(data);
    });
});


function bulkImport() {
    var fileName = $("#fileName").text();
    $.ajax({
        type:"POST",
        dataType : "json",
        url:"rest/kzdm/bulkImport",
        async:false,
        data: {name:fileName},
        success: function(data) {
            console.log(data);
            var msg = data.msg;
            console.log(data.msg)
            var time = data.time;
            console.log(data.updateCount)
            var updateCount = data.updateCount;
            console.log(data.insertCount)
            var insertCount = data.insertCount;
            var newMsg = msg+"\n用时: "+time+"\n更新了："+updateCount+"条数据；\n新增了："+insertCount+"条数据。";
            alert(newMsg);
            // alert(data);


        }
    })

}



$("#exportExcel").click(function () {
    tmp = $('#jsonInput').val();
    test = JSON.parse(tmp);
    $.ajax({
        type : "POST",
        dataType : "html",
        async : false,
        url : "rest/kzdm/exportExcel",
        data : test,
        success : function(data) {
            window.location.href="rest/kzdm/upload";
        }
    });
});
$('#bulkImportButton').click(function() {
    var url = "rest/kzdm/bulkImportKzdm";
    $.get(url, function(data) {
        $('#bulkImportDiv').html(data);
    });
});


$("#qmpmark").on("change", function () {

    complexlist = "";

    var value = $("#qmpmark").val();
    //if(value!=2013){
    if ($("#qmpmark").val() == "请选择") alert(1);
    var datas = {
        "youkong": value,
        "tjnf": $("#qmpmark").val()
    };
    $('#jsonInput').val(JSON.stringify(datas));
    //alert(value+":"+$('#treeselect').val());

    $.ajax({//载入下方表格
        type: "POST",
        dataType: "html",
        async: true,
        url: "rest/qmp/search",
        data: datas,
        success: function (data) {

            setTimeout(function () {

                $('#listAll').html(data);

                $.ajax({//更新地图
                    type: "POST",
                    async: true,
                    url: "rest/qmp/searchAllQmp",
                    data: datas,
                    success: function (data) {
                        updateQmpInMap(data, 0);
                        //alert(complexlist);
                        $("#citylisthead").html("");
                        $("#citylist").html("");
                        list_city(complexlist);
                    }
                });
            }, 1000);
        }
    });

    //}
    $("#qmpmark").val(value);
    //$("#map").toggle();
    /**/
});

function updateQmpInMap(allData) {


    require([
        "esri/geometry/Point",
        "esri/symbols/SimpleMarkerSymbol",
        "esri/symbols/PictureMarkerSymbol",
        "esri/graphic",
        "esri/InfoTemplate"
    ], function (Point,
                 SimpleMarkerSymbol,
                 PictureMarkerSymbol,
                 Graphic,
                 InfoTemplate) {
        var lon = "";
        var lat = "";
        var attr = "";
        graphicLayer.clear();
        for (var i = 0; i < allData.length; i++) {

            if (myrole == 1 || myrole == "admin")
                complexlist += allData[i].locCity + "、";
            else if (myrole == 2 || myrole == 3)
                complexlist += allData[i].locCounty + "、";


            lon = allData[i].locLonD + (allData[i].locLonS / 60 + allData[i].locLonM) / 60;
            lat = allData[i].locLatD + (allData[i].locLatS / 60 + allData[i].locLatM) / 60;

            attr = {
                "id": allData[i].id,
                "watershed": allData[i].watershed,
                "riverName": allData[i].riverName,
                "riverLevel": allData[i].riverLevel,
                "riverTo": allData[i].riverTo,
                "sectionName": allData[i].sectionName,
                "sectionProperty": allData[i].sectionProperty,
                "locProvince": allData[i].locProvince,
                "locCity": allData[i].locCity,
                "locCounty": allData[i].locCounty,
                "testBy": allData[i].testBy,
                "sectionLevel": allData[i].sectionLevel,
                "sectionType": allData[i].sectionType,
                "isUrban": allData[i].isUrban,
                "isAddition": allData[i].isAddition,
                "testFrequency": allData[i].testFrequency,
                "testItems": allData[i].testItems,
                "qualityTarget": allData[i].qualityTarget
            };
            var point = new Point(lon, lat, map.spatialReference);
            var infoTemplate = new InfoTemplate("控制断面信息", html);
            var symbol1 = new PictureMarkerSymbol("app/img/qmp5rep.png", 10, 10);
            graphic = new Graphic(point, symbol1, attr, infoTemplate);
            graphicLayer.add(graphic);

        }
    });
}


$("#count_source").on("change", function () {
    var obj_1 = $('#currentplace').val();
    if (obj_1!==""&&obj_1!==null){
        obj_1 = JSON.parse(obj_1);
    }
    console.log(obj_1);
    $.ajax({
        type: "POST",
        async: true,
        url: "rest/qmp/searchAllQmp",
        data: obj_1,
        success: function (data) {
            allDataGlobal=data;
            // updateQmpInMap(data);//显示选择的市县点
            wait4globaldata();
        }
    });

});
function wait4globaldata() {
    // map.removeLayer(graphicLayer);
    graphicLayer.clear();
    for (var i = 0; i < allDataGlobal.length; i++) {
        attrs = {
            "id": allDataGlobal[i].id,
            "watershed": allDataGlobal[i].watershed,
            "riverName": allDataGlobal[i].riverName,
            "riverLevel": allDataGlobal[i].riverLevel,
            "riverTo": allDataGlobal[i].riverTo,
            "sectionName": allDataGlobal[i].sectionName,
            "sectionProperty": allDataGlobal[i].sectionProperty,
            "locProvince": allDataGlobal[i].locProvince,
            "locCity": allDataGlobal[i].locCity,
            "locCounty": allDataGlobal[i].locCounty,
            "testBy": allDataGlobal[i].testBy,
            "sectionLevel": allDataGlobal[i].sectionLevel,
            "sectionType": allDataGlobal[i].sectionType,
            "isUrban": allDataGlobal[i].isUrban,
            "isAddition": allDataGlobal[i].isAddition,
            "testFrequency": allDataGlobal[i].testFrequency,
            "testItems": allDataGlobal[i].testItems,
            "qualityTarget": allDataGlobal[i].qualityTarget
        };
        lon = allDataGlobal[i].locLonD + (allDataGlobal[i].locLonS / 60 + allDataGlobal[i].locLonM) / 60;
        lat = allDataGlobal[i].locLatD + (allDataGlobal[i].locLatS / 60 + allDataGlobal[i].locLatM) / 60;
        var point = new poi(lon, lat, map.spatialReference);
        var infoTemplate = new infotem("控制断面信息", html);
        var symbol1 = new PicMarkerSymbol("app/img/qmp5rep.png", 10, 10);
        graphic = new grap(point, symbol1, attrs, infoTemplate);
        graphicLayer.add(graphic);
    }
    var value = $("#count_source").val();
    chartHeight = 23;
    if (value == 0 || value == 1) {//化学需氧产生量
        for (var k = 0; k < polldata.length; k++) {
            for (var i = 0; i < allDataGlobal.length; i++) {
                if (allDataGlobal[i].sectionName === polldata[k].KZDM) {
                    var lon = null;
                    var lat = null;
                    lon = allDataGlobal[i].locLonD + (allDataGlobal[i].locLonS / 60 + allDataGlobal[i].locLonM) / 60;
                    lat = allDataGlobal[i].locLatD + (allDataGlobal[i].locLatS / 60 + allDataGlobal[i].locLatM) / 60;
                    var point = new poi(lon, lat, map.spatialReference);
                    chartHeight = polldata[k].HXXYLCSL_D % 80;
                    if (chartHeight) {
                        var histogramsymbol2 = new PicMarkerSymbol("app/img/histogram_orange.png", 6, chartHeight);
                        var histogramsymbol3 = new TexSymbol(polldata[k].HXXYLCSL_D);
                        histogramsymbol2.setOffset(-10, 18);
                        histogramsymbol3.setOffset(-10, 18);
                        var histogramgraph2 = new grap(point, histogramsymbol2);
                        var histogramgraph3 = new grap(point, histogramsymbol3);
                        graphicLayer.add(histogramgraph2);
                        //graphicLayer.add(histogramgraph3);
                        // graphicLayer.on("click",showDetailChart);
                    }
                    break;
                }
            }
        }
    } else if (value == 2) {//化学需氧排放量
        for (var k = 0; k < polldata.length; k++) {
            for (var i = 0; i < allDataGlobal.length; i++) {
                if (allDataGlobal[i].sectionName === polldata[k].KZDM) {
                    lon = allDataGlobal[i].locLonD + (allDataGlobal[i].locLonS / 60 + allDataGlobal[i].locLonM) / 60;
                    lat = allDataGlobal[i].locLatD + (allDataGlobal[i].locLatS / 60 + allDataGlobal[i].locLatM) / 60;
                    var point = new poi(lon, lat, map.spatialReference);
                    chartHeight = polldata[k].HXXYLPFL_D % 80;
                    if (chartHeight !== 0) {
                        var histogramsymbol2 = new PicMarkerSymbol("app/img/histogram_orange.png", 6, chartHeight);
                        var histogramsymbol3 = new TexSymbol(polldata[k].HXXYLPFL_D);
                        histogramsymbol3.setOffset(-10, 18);
                        histogramsymbol2.setOffset(-10, 18);
                        var histogramgraph2 = new grap(point, histogramsymbol2);
                        var histogramgraph3 = new grap(point, histogramsymbol3);
                        graphicLayer.add(histogramgraph2);
                        //graphicLayer.add(histogramgraph3);
                    }
                    break;
                }
            }
        }

    } else if (value == 3) {//氨氮产生量
        for (var k = 0; k < polldata.length; k++) {
            for (var i = 0; i < allDataGlobal.length; i++) {
                if (allDataGlobal[i].sectionName === polldata[k].KZDM) {
                    var lon = null;
                    var lat = null;
                    lon = allDataGlobal[i].locLonD + (allDataGlobal[i].locLonS / 60 + allDataGlobal[i].locLonM) / 60;
                    lat = allDataGlobal[i].locLatD + (allDataGlobal[i].locLatS / 60 + allDataGlobal[i].locLatM) / 60;
                    var point = new poi(lon, lat, map.spatialReference);

                    chartHeight = polldata[k].ADCSL_D % 80;
                    if (chartHeight) {
                        var histogramsymbol2 = new PicMarkerSymbol("app/img/histogram_orange.png", 6, chartHeight);
                        var histogramsymbol3 = new TexSymbol(polldata[k].ADCSL_D);
                        histogramsymbol2.setOffset(-10, 18);
                        histogramsymbol3.setOffset(-10, 18);
                        var histogramgraph2 = new grap(point, histogramsymbol2);
                        var histogramgraph3 = new grap(point, histogramsymbol3);
                        graphicLayer.add(histogramgraph2);
                        //graphicLayer.add(histogramgraph3);
                    }
                    break;
                }
            }
        }
    } else {//氨氮排放量
        for (var k = 0; k < polldata.length; k++) {
            for (var i = 0; i < allDataGlobal.length; i++) {
                if (allDataGlobal[i].sectionName === polldata[k].KZDM) {
                    var lon = null;
                    var lat = null;
                    lon = allDataGlobal[i].locLonD + (allDataGlobal[i].locLonS / 60 + allDataGlobal[i].locLonM) / 60;
                    lat = allDataGlobal[i].locLatD + (allDataGlobal[i].locLatS / 60 + allDataGlobal[i].locLatM) / 60;
                    var point = new poi(lon, lat, map.spatialReference);
                    chartHeight = polldata[k].ADPFL_D % 80;
                    if (chartHeight) {
                        var histogramsymbol2 = new PicMarkerSymbol("app/img/histogram_orange.png", 6, chartHeight);
                        var histogramsymbol3 = new TexSymbol(polldata[k].ADPFL_D);
                        histogramsymbol2.setOffset(-10, 18);
                        histogramsymbol3.setOffset(-10, 18);
                        var histogramgraph2 = new grap(point, histogramsymbol2);
                        var histogramgraph3 = new grap(point, histogramsymbol3);
                        graphicLayer.add(histogramgraph2);
                        //graphicLayer.add(histogramgraph3);
                    }
                    break;
                }
            }
        }
    }

    // map.addLayer(graphicLayer);
}