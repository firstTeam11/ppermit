console.log("kzdy");//控制台显示
$(document).ready(function() {


    var url = "rest/kzdy/list";
    $.get(url, function(data) {
        $('#listAll').html(data);
    });



    $('#addButton').click(function(){
    var url = "rest/kzdy/addKzdy";
    $.get(url, function(data) {
        $('#addDiv').html(data);
    });
});

    $('#addCu').click(function() {
        $.ajax({
            type : "POST",
            dataType : "KzdyJbxx",
            async : false,
            url : "rest/kzdy/insert",
            data : $('#insertForm').serialize(),
        });

        var url = "rest/kzdy/list";
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    });
    $('#searchButton').click(function() {
        var url = "rest/kzdy/searchKzdy";
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
    var url = "rest/kzdy/bulkImportKzdy";
    $.get(url, function(data) {
        $('#bulkImportDiv').html(data);
    });
});


function bulkImport() {
    var fileName = $("#fileName").text();
    $.ajax({
        type:"POST",
        dataType : "json",
        url:"rest/kzdy/bulkImport",
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

$("#cu_youkong").on("change",function () {
    var value = $("#cu_youkong").val();
    if(value!=0){
        var json = {
            "youkong": value
        };
        $('#jsonInput').val(JSON.stringify(json));
        $.ajax({
            type: "POST",
            dataType: "html",
            async: false,
            url: "rest/controlunit/searchYoukong",
            data: json,
            success: function (data) {
                $('#listAll').html(data);//设置所有 listAll 元素的内容
            }
        });
    }
});

$("#exportExcel").click(function () {
    tmp = $('#jsonInput').val();
    test = JSON.parse(tmp);
    $.ajax({
        type : "POST",
        dataType : "html",
        async : false,
        url : "rest/kzdy/exportExcel",
        data : test,
        success : function(data) {
            window.location.href="rest/kzdy/upload";
        }
    });
});
$('#bulkImportButton').click(function() {
    var url = "rest/kzdy/bulkImportKzdy";
    $.get(url, function(data) {
        $('#bulkImportDiv').html(data);
    });
});
