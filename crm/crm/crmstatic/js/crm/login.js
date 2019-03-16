
$(function(){
    $("#btnLogin").click(function () {
        var url = "http://localhost:9002/user/userLogin/";
        //取得用户名和密码
        var userName = $("#username").val();
        var userPwd = $("#password").val();
        url+=userName+"/"+userPwd;
        //alert(url);
        $.ajax({
            url:url,
            type:"GET",
            success:function(ret){
                console.log(ret);
                if(ret.data){
                    //取得token放入cookie
                    var token = ret.data.tokenId;
                    //alert(token);
                    document.cookie = "token="+token;
                    document.cookie = "userName="+ret.data.userName;
                    document.cookie = "userRole="+ret.data.userRole;
                    location.href="index.html";
                }else{
                    alert("用户名或密码有误,登录失败!");

                }
            }
        });
    });


});