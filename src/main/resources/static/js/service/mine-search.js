$(function(){
    $("#search").click(function(){
        var instanceId = $("#instanceId").val();
        var customerId = $("#customerId").val();
        $(location).attr('href','/show?customerId='+customerId+'&instanceId='+instanceId)
    });
    $("#back").click(function(){
            $(location).attr('href','/')
        });
    $("#clear").click(function(){
                $(location).attr('href','/show')
        })
})