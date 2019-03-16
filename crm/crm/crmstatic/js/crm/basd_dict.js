function get_cookie(Name) {
    var search = Name + "="//查询检索的值
    var returnvalue = "";//返回值
    if (document.cookie.length > 0) {
        sd = document.cookie.indexOf(search);
        if (sd!= -1) {
            sd += search.length;
            end = document.cookie.indexOf(";", sd);
            if (end == -1)
                end = document.cookie.length;
//unescape() 函数可对通过 escape() 编码的字符串进行解码。
            returnvalue=unescape(document.cookie.substring(sd, end))
        }
    }
    return returnvalue;
}
$(function(){

    //var url = "http://localhost:9002/user/basd/dictlist";http://localhost:9002/user/basd/findByPage
    var url = "http://localhost:9002/user/basd/findByPage";
    var token = get_cookie("token");
    //alert(token);
    var userName = get_cookie("userName");
    var userRole = get_cookie("userRole");
    $("#userRole").html(userRole);
    $("#userName").html(userName);
    $.ajax({
        url:url,
        headers:{
            "token":token
        },
        type:"POST",
        success:function(ret){
            console.log(ret);
            var str = "";
                $.each(ret.data.rows,function (i,dict) {
                     str += "<tr><td>"+dict.dictId+"</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">"+dict.dictType+"</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">"+dict.dictItem+"</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">\n" +dict.dictValue+
                        "\t\t\t\t\t\t\t\t</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">\n" +dict.isEditable+
                        "\t\t\t\t\t\t\t\t</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">\n" +
                        "\t\t\t\t\t\t\t\t\t<a class=\"btn btn-success\" href=\"#\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t<i class=\"icon-zoom-in icon-white\"></i>  \n" +
                        "\t\t\t\t\t\t\t\t\t\t查看\n" +
                        "\t\t\t\t\t\t\t\t\t</a>\n" +
                        "\t\t\t\t\t\t\t\t\t<a class=\"btn btn-info\" href=\"#\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t<i class=\"icon-edit icon-white\"></i>  \n" +
                        "\t\t\t\t\t\t\t\t\t\t编辑\n" +
                        "\t\t\t\t\t\t\t\t\t</a>\n" +
                        "\t\t\t\t\t\t\t\t\t<a class=\"btn btn-danger\" href=\"#\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t<i class=\"icon-trash icon-white\"></i> \n" +
                        "\t\t\t\t\t\t\t\t\t\t删除\n" +
                        "\t\t\t\t\t\t\t\t\t</a>\n" +
                        "\t\t\t\t\t\t\t\t</td>\n" +
                        "\t\t\t\t\t\t\t</tr>"
                });
                $("#dictTable").append(str);
                $("#curPage").html(ret.data.curPage);
                $("#pageCount").html(ret.data.pageCount);
        }
    });

    $("#prePage").click(function () {
        var pageNo = parseInt($("#curPage").html())-1;
        if(pageNo<1){
            alert("已经是第一页了!");
        }else{
            showPage(pageNo);
        }
    });
    $("#nextPage").click(function () {
        var pageNo = parseInt($("#curPage").html())+1;
        var pageCount = parseInt($("#pageCount").html());
        if(pageNo>pageCount){
            alert("已经是最后一页了!");
        }else{
            showPage(pageNo);
        }
    });

    function showPage(pageNo) {
        //var data = {"pageNo":pageNo,"dictType":"客","pageSize":2};
        var data = {"pageNo":pageNo};
        $.ajax({
            url:url,
            headers:{
                "token":token
            },
            contentType:"application/json",
            type:"POST",
            dataType:"json",
            data:JSON.stringify(data),
            success:function(ret){
                $("#dictTable").html("");
                var str = "";
                $.each(ret.data.rows,function (i,dict) {
                    str += "<tr><td>"+dict.dictId+"</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">"+dict.dictType+"</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">"+dict.dictItem+"</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">\n" +dict.dictValue+
                        "\t\t\t\t\t\t\t\t</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">\n" +dict.isEditable+
                        "\t\t\t\t\t\t\t\t</td>\n" +
                        "\t\t\t\t\t\t\t\t<td class=\"center\">\n" +
                        "\t\t\t\t\t\t\t\t\t<a class=\"btn btn-success\" href=\"#\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t<i class=\"icon-zoom-in icon-white\"></i>  \n" +
                        "\t\t\t\t\t\t\t\t\t\t查看\n" +
                        "\t\t\t\t\t\t\t\t\t</a>\n" +
                        "\t\t\t\t\t\t\t\t\t<a class=\"btn btn-info\" href=\"#\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t<i class=\"icon-edit icon-white\"></i>  \n" +
                        "\t\t\t\t\t\t\t\t\t\t编辑\n" +
                        "\t\t\t\t\t\t\t\t\t</a>\n" +
                        "\t\t\t\t\t\t\t\t\t<a class=\"btn btn-danger\" href=\"#\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t<i class=\"icon-trash icon-white\"></i> \n" +
                        "\t\t\t\t\t\t\t\t\t\t删除\n" +
                        "\t\t\t\t\t\t\t\t\t</a>\n" +
                        "\t\t\t\t\t\t\t\t</td>\n" +
                        "\t\t\t\t\t\t\t</tr>"
                });
                $("#dictTable").append(str);
                $("#curPage").html(ret.data.curPage);
                $("#pageCount").html(ret.data.pageCount);
            }
        });
    }
});