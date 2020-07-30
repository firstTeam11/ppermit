$(function(){

    $('#addKzdy').click(function() {
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

    $('#listKzdy_1').click(function(e) {
        e.preventDefault();
        var url = this.href;
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    });

    $('#addKzdy_x').unbind("click").bind("click",function(){
        $.ajax({
            type : "POST",
            dataType : "KzdyJbxx",
            async : true,
            url : "rest/kzdy/insert",
            data : $('#insertForm').serialize(),
            success : function() {

                var url = "rest/kzdy/list";
                $.get(url, function(data) {
                    $('#listAll').html(data);
                });
            }
        });
    });
});
