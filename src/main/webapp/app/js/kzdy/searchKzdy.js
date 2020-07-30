$(function() {
    var i = 0;
    var selectArray = {};
    var searchCount = 2;
    var json = {
        "test" : "test"
    };

    var hash = {
        "kzdy_bh" : "控制单元编号",
        "kzdy_mc" : "控制单元名称",
        "kzdy_jb" : "控制单元级别",
        "kzdy_sheng" : "所属省份",
        "kzdy_shi" : "所属地市",
        "kzdy_qx" : "所含区（县）名称",
        "kzdy_xz" : "所含乡镇名称",
        "kzdy_xzs" : "所含乡镇个数",
        "kzdy_lymc" : "流域",
        "kzdy_sx" : "包括水系",
        "kzdy_gl" : "所含干流",
        "kzdy_1jzl" : "所含一级支流",
        "kzdy_2jzl" : "所含二级支流",
        "kzdy_3jzl" : "所含三级支流",
        "kzdy_4jzl" : "所含四级支流",
        "kzdy_syd" : "水资源区",
        "kzdy_time" : "控制单元划定时间"

    }

    var reHash = {
        "控制单元编号" : "kzdy_bh",
        "控制单元名称" : "kzdy_mc",
        "控制单元级别" : "kzdy_jb",
        "所属省份" : "kzdy_sheng",
        "所属地市" : "kzdy_shi",
        "所含区（县）名称" : "kzdy_qx",
        "所含乡镇名称" : "kzdy_xz",
        "所含乡镇个数" : "kzdy_xzs",
        "流域" : "kzdy_lymc",
        "包括水系" : "kzdy_sx",
        "所含干流" : "kzdy_gl",
        "所含一级支流" : "kzdy_1jzl",
        "所含二级支流" : "kzdy_2jzl",
        "所含三级支流" : "kzdy_3jzl",
        "所含四级支流" : "kzdy_4jzl",
        "水资源区" : "kzdy_syd",
        "控制单元划定时间" : "kzdy_time"
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
        url : "rest/kzdy/getTableName",
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

    $('#searchK_x').unbind("click").bind("click",function(){

        $('#jsonInput').val("").val(JSON.stringify(json));
        $('#jumpTmp').val("");

        $.ajax({
            type : "POST",
            dataType : "html",
            async : false,
            url : "rest/kzdy/search",
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


