$(function(){
    $("#uploadfile").fileinput({
            uploadUrl: "zip_upload",
            maxFileCount: 1000,
            minFileCount: 1,
            maxFileSize: 0
    });
    $("#calcUsage").click(function(){
        $(location).attr('href','/show')
    });
})