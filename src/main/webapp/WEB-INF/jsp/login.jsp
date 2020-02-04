<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
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
                    <form action="userlogin" method="post">
                        <tr>
                            <td colspan="2" class="td"><input type="text" name="loginname" id="" placeholder="用户名"></td>
                        </tr>
                        <tr>
                            <td colspan="2" class="td"><input type="password" name="loginpassword" id="" placeholder="密码"></td>
                        </tr>
                        <tr>
                            <td class="submit" colspan="2"><input type="submit" value="登录"></td>

                        </tr>

                    </form>

                </table>
                <ul class="h_refor">
                    <li>
                        <a href="#">立即注册</a>
                    </li>
                    <li>|</li>
                    <li>
                        <a href="#">忘记密码?</a>
                    </li>
                </ul>
            </div>
        </div>

    </div>
</body>

</html>