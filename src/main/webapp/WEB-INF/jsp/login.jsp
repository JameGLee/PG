<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}//js/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}//js/jquery.validate.min.js"></script>
    <title>Document</title>
</head>

<body>
    <div class="d_main">
        <div class="logo">
            <a href="#"><img src="${pageContext.request.contextPath}/images/logo.png" alt=""></a>
        </div>
        <div class="publicity">
            <!-- <img src="../img/publicity.jpg" alt=""> -->
        </div>
        <div class="d_loginwindow">
            <div class="d_mainwindow">
                <table border="0" cellspacing="0" cellpadding="0" class="login">
                    <form id="frm" action="login" method="post" >
                        <tr>
                            <td colspan="2" class="td"><input type="text" name="loginname" id="loginName" placeholder="用户名"></td>
                        </tr>
                        <tr>
                            <td colspan="2" class="td"><input type="password" name="loginpassword" id="loginPwd" placeholder="密码"></td>
                        </tr>
                        <tr>
                            <td class="submit" colspan="2"><input type="submit" value="登录"></td>

                        </tr>

                    </form>
                    ${error }
                </table>
                <ul class="h_refor">
                    <li>
                        <a href="register">立即注册</a>
                    </li>
                    <li>|</li>
                    <li>
                        <a href="#">忘记密码?</a>
                    </li>
                </ul>
            </div>
        </div>

    </div>

    <script type="text/javascript">
        $("#frm").validate({
            rules:{
                loginName:{
                    required:true,
                },
                loginPwd:{
                    required:true,
                },
            },

            messages:{
                loginName:{
                    required:"用户名不可为空",
                },
                loginPwd:{
                    required:"密码不能为空",
                },
            },
            //修改错误信息的位置：error：错误信息的标签    element：当前被验证的元素组件
            errorPlacement:function(error, element){
                error.appendTo(element.parent());
            },
            //失去光标时触发验证：element失去焦点的元素
            onfocusout:function(element){
                $(element).valid();
            }

        });
    </script>
</body>

</html>