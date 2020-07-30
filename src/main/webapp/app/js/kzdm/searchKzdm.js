$(function() {
    var i = 0;
    var selectArray = {};
    var searchCount = 2;
    var json = {
        "test" : "test"
    };

    var hash = {
        "kzdm_bh": "控制断面编号",
        "kzdm_dybh": "所属控制单元编号",
        "kzdm_dymc":"所属控制单元名称",
        "kzdm_lymc": "流域名称",
        "kzdm_szhl":"所在河流（湖库）",
        "kzdm_hljb": "河流级别/湖库属性",
        "kzdm_hrhl": "汇入河流（湖库、海洋）",
        "kzdm_mc": "断面名称",
        "kzdm_sx": "断面属性",
        "kzdm_sheng":"所属省份",
        "kzdm_shi": "所属地市",
        "kzdm_qx":"所属区县",
        "kzdm_czmc":"测站名称",
        "kzdm_jb": "断面级别",
        "kzdm_lx": "断面类型",
        "kzdm_sfcq": "是否在城市建成区",
        "kzdm_szzk":"现有/拟增设/新增",
        "kzdm_jcpc": "监测频次",
        "kzdm_jcxm":"监测项目",
        "kzdm_jdd": "经度度",
        "kzdm_jdf":"经度分",
        "kzdm_jds": "经度秒",
        "kzdm_wdd":"纬度度",
        "kzdm_wdf":"纬度分",
        "kzdm_wds":"纬度秒",
        "kzdm_szmb":"功能区水质目标",
        "kzdm_jd":"经度",
        "kzdm_wd": "纬度",
        "kzdm_shhl": "所含河流",
        "kzdm_time": "设置时间"
    }

    var reHash = {
        "控制断面编号" : "kzdm_bh",
        "所属控制单元编号": "kzdm_dybh",
        "所属控制单元名称": "kzdm_dymc",
        "流域名称": "kzdm_lymc",
        "所在河流（湖库）":  "kzdm_szhl",
        "河流级别/湖库属性": "kzdm_hljb",
        "汇入河流（湖库、海洋）": "kzdm_hrhl",
        "断面名称": "kzdm_mc",
        "断面属性": "kzdm_sx",
        "所属省份": "kzdm_sheng",
        "所属地市":  "kzdm_shi",
        "所属区县": "kzdm_qx",
        "测站名称": "kzdm_czmc",
        "断面级别": "kzdm_jb",
        "断面类型":  "kzdm_lx",
        "是否在城市建成区": "kzdm_sfcq",
        "现有/拟增设/新增":  "kzdm_szzk",
        "监测频次":  "kzdm_jcpc",
        "监测项目": "kzdm_jcxm",
        "经度度": "kzdm_jdd",
        "经度分": "kzdm_jdf",
        "经度秒": "kzdm_jds",
        "纬度度":  "kzdm_wdd",
        "纬度分": "kzdm_wdf",
        "纬度秒": "kzdm_wds",
        "功能区水质目标": "kzdm_szmb",
        "经度":   "kzdm_jd",
        "纬度":  "kzdm_wd",
        "所含河流":  "kzdm_shhl",
        "设置时间": "kzdm_time"
    }
    function JSONLength(obj) {
        var size = 0, key;
        for (key in obj) {
            if (obj.hasOwnProperty(key)) size++;
        }
        return size;
    };

    function createJson(json, prop, val) {
        if (typeof val === "undefined") {
            delete json[prop];
        } else {
            json[prop] = val;
        }
    }

    function appendSelect(splitArray) {
        for (i = 0; i < splitArray.length; i++) {
            if (splitArray[i] != "is_del") {
                var selectLi = "";
                selectLi += "<li><a>";
                selectLi += hash[splitArray[i]];
                selectLi += "</a></li>";
                $('#searchSelectTable tr:last td:first div ul').append(selectLi);
            }
        }
    }

    function removeByValue(arr, val) {
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                arr.splice(i, 1);
                break;
            }
        }
    }

    $.ajax({
        type : "POST",
        url : "rest/kzdm/getTableName",
        dataType : "json",
        async : false,
        success : function(result) {
            selectArray = result.toString().split(",");
            appendSelect(selectArray);
        }
    });

    $("#addSearch").click(function() {
        if(searchCount <= JSONLength(hash)){
            if($('#searchSelectTable tr:last td:first div button').text() != "查询条件"){
                var temp = "";
                temp += "<tr>";
                temp += "<td><div class='dropdown'>";
                temp += "<button class='btnz btnz-info dropdown-toggle' type='button' id='dropdownMenu";
                temp += searchCount;
                temp += "' data-toggle='dropdown' aria-haspopup='true' aria-expanded='true'>";
                temp += "查询条件";
                temp += "<span class='caret'></span>";
                temp += "</button>";
                temp += "<ul class='dropdown-menu' aria-labelledby='dropdownMenu";
                temp += searchCount++;
                temp += "'>";
                temp += "</ul></div></td>";
                temp += "<td><input type='text' size='40' class='inpMain' /></td>";
                temp += "</tr>";
                $("#searchSelectTable").append(temp);//向所有段落中追加一些HTML标记，加到末尾
                appendSelect(selectArray);
            }else{
                alert("请您填写完整上一条查询后，再添加新的查询条件，谢谢。")
            }
        }else{
            alert("您不能添加更多的查询条件了=。=")
        }
    });

    $("#removeSearch").click(function() {
        if(searchCount == 2){
            alert("您必须保留至少一条查询条件 ：）")
        }else{
            selectArray.push(reHash[$('#searchSelectTable tr:last td:first div button').text()]);
            $("#searchSelectTable tr:last").remove();
            searchCount--;
        }

    });


    $("#searchSelectTable").on("blur","tr:last td:last input",function(){
        if ($('#searchSelectTable tr:last td:first div button').text().replace(/(^\s*)|(\s*$)/g, '') != "Dropdown") {
            if (reHash[$(this).parent().parent().find('button').text()] != "undefined") {
                var key = reHash[$(this).parent().parent().find('button').text()];
            }else{
                var key = $(this).parent().parent().find('button').text();
            }
            var value = $(this).val();
            createJson(json, key, value);
            createJson(json, "test");
        }
    });

    $('#searchSelectTable').on("click","tr td div ul a",function(e) {
        e.preventDefault();
        var text = reHash[$(this).text()];
        $(this).parent().parent().parent().find('button').text(hash[text]);
        removeByValue(selectArray, text);
    });

    $('#searchKzdm_x').unbind("click").bind("click",function(){

        $('#jsonInput').val("").val(JSON.stringify(json));
        $('#jumpTmp').val("");

        $.ajax({
            type : "POST",
            dataType : "html",
            async : false,
            url : "rest/kzdm/search",
            data : json,
            success : function(data) {
                $('#listAll').html(data);
                var name=$("#nameForMap").val();
                //console.log(name)
                click();
                filterArcGISDynamicMapServiceLayer(name);
            }
        });
    });
});


