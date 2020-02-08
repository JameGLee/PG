<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">

    <title>Document</title>
</head>

<body>
    <div class="main">
        <div class="main_register">
            <form action="userregister" method="POST">
                <ul>
                    <li class="reg"> <input type="text" name="uname" id="name" placeholder="用户名"><span class="error"></span></li>
                    <li class="reg"><input type="password" name="upwd" id="password" placeholder="密码"><span class="error"></span></li>
                    <li class="reg"><input type="password" name="uaffirmpwd" id="affrim" placeholder="确认密码"><span class="error"></span></li>
                    <li class="reg"><input type="text" name="uphone" id="phone" placeholder="注册手机号" maxlength="11"><span class="error"></span>
                        <input type="button" value="发送验证码" id="button" οnclick="send()" ><br>
                    </li>
                    <li class="reg"><input type="text" name="code" placeholder="验证码"><br></li>
                    <li class="reg"><input type="text" name="uemail" id="email" placeholder="注册邮箱"><span class="error"></span></li>
                    <li class="reg sub"><input type="submit" value="点击注册" disabled></li>
                </ul>

            </form>
        </div>
    </div>
</body>
</html>
<script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js" type="text/javascript" ></script>
<script type="text/javascript">
    $(function() {
        (function register() {
            $("#name").blur(function() {
                nameReg = /^[\u4e00-\u9fa5_a-zA-Z0-9]{0,10}$/;
                if ($(this).val() == "") {
                    $(this).addClass("errorInput");
                    $(this).next().css("display", "block").html("用户名不能为空!");
                    return;
                } else if (!nameReg.test($(this).val())) {
                    $(this).addClass("errorInput");
                    $(this).next().css("display", "block").html("请输入长度1-10，可以存在中文数字字母的用户名!");
                } else {
                    $(this).addClass("correctInput");
                    $(this).next().empty();
                }
            });
            // 注册界面手机号栏失去焦点
            $("#phone").blur(function() {
                phoneReg = /^[1][3,4,5,7,8][0-9]{9}$/;
                if ($(this).val() == "") {
                    $(this).addClass("errorInput");
                    $(this).next().css("display", "block").html("手机号码不能为空!");
                    return;
                } else if (!phoneReg.test($(this).val())) {
                    $(this).addClass("errorInput");
                    $(this).next().css("display", "block").html("请输入正确的手机号码!");
                } else {
                    $(this).addClass("correctInput");
                    $(this).next().empty();
                }
            });
            // 邮箱栏失去焦点
            $("#email").blur(function() {
                emailReg = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
                if ($(this).val() == "") {
                    $(this).addClass("errorInput");
                    $(this).next().css("display", "block").html("邮箱不能为空!");
                    return;
                } else if (!phoneReg.test($(this).val())) {
                    $(this).addClass("errorInput");
                    $(this).next().css("display", "block").html("请输入正确的邮箱号码!");
                } else {
                    $(this).addClass("correctInput");
                    $(this).next().empty();
                }
            });

            // 注册界面密码栏失去焦点
            $("#password").blur(function() {
                reg = /^[A-Za-z0-9]{6}$/;
                if (reg.test($(this).val())=="") {
                    $(this).addClass("errorInput");
                    $(this).next().css("display", "block").html("密码不能为空！");
                } else if (!reg.test($(this).val())) {
                    $(this).addClass("errorInput");
                    $(this).next().css("display", "block").html("请输入长度是6位带字母和数字！");
                } else {
                    $(this).addClass("correctInput");
                    // $(this).removeClass("errorInput");
                    $(this).next().empty();
                }
            });
            // 注册界面确认密码失去焦点
            $("#affrim").blur(function() {
                var pwd1 = $('#password').val();
                var pwd2 = $(this).val();
                if (pwd1 == "") {
                    $(this).removeClass("errorInput");
                    $(this).next().html("确认密码不能为空！");
                    $(this).addClass("errorInput");
                    return;
                } else if (pwd1 != pwd2) {
                    $(this).addClass("errorInput");
                    $(this).removeClass("correctInput");
                    $(this).next().css("display", "block").html("两次密码输入不一致！");
                } else {
                    $(this).removeClass("errorInput");
                    $(this).addClass("correctInput");
                    $(this).next().empty();
                }
            });
            //确认密码和密码一致

        })();
    });
    function changeBtnable() {
        $(".sub").removeAttr("disabled");
    }

    function changeBtndisable() {
        $(".sub").attr("disabled", "true");
    }


</script>