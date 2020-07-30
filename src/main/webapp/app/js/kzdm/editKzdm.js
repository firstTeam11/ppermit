$(function() {

    $('#update').click(function() {
        $.ajax({
            type : "POST",
            dataType : "KzdmJbxx",
            async : false,
            url : "rest/kzdm/update",
            data : $('#editForm').serialize()
        });

        list();
    });

    function list(){
        var url = "rest/kzdm/list";
        $.get(url, function(data) {
            $('#main-content').html(data);
        });
    }

    $('#editKzdm_1').unbind("click").bind("click",function(){
        $.ajax({
            type : "POST",
            dataType : "KzdmJbxx",
            async : true,
            url : "rest/kzdm/update",
            data : $('#editForm').serialize(),
            success : function() {
                var url = "rest/kzdm/list";
                $.get(url, function(data) {
                    $('#listAll').html(data);
                });
            }
        });
    });
});