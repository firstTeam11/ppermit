$(function() {

    $('#update').click(function() {
        $.ajax({
            type : "POST",
            dataType : "KzdyJbxx",
            async : false,
            url : "rest/kzdy/update",
            data : $('#editForm').serialize()
        });

        list();
    });

    function list(){
        var url = "rest/kzdy/list";
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    }

    $('#editK_1').unbind("click").bind("click",function(){
        $.ajax({
            type : "POST",
            dataType : "KzdyJbxx",
            async : true,
            url : "rest/kzdy/update",
            data : $('#editForm').serialize(),
            success : function() {
                var url = "rest/kzdy/list";
                $.get(url, function(data) {
                    $('#listAll').html(data);
                });
            }
        });
    });
});