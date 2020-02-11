<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
    <script src="${pageContext.request.contextPath}/js/jquery-1.8.0.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/register.js" type="text/javascript"></script>
<%--    <script type="text/javascript">--%>
<%--        function a1() {--%>
<%--            alert("123")--%>
<%--        }--%>
<%--    </script>--%>
    <title>Document</title>
</head>

<body>
<div class="main">
    <div class="main_register">
        <form action="" method="POST">
            <div class="form-submit">
                <div class="form-item">
                    <label>用 户 名</label>
                    <input type="text" name="uname" id="username" value="" placeholder="用户名" onblur="registername()"/>
                </div>
                <div class="input-tip">
                    <span class="name-error"></span>
                </div>
                <div class="form-item">
                    <label>   密   码 </label>
                    <input type="password" name="upwd" id="password" value="" placeholder="密码"/>
                </div>
                <div class="input-tip">
                    <span></span>
                </div>
                <div class="form-item"><label>确认密码</label>
                    <input type="password" name="uaffirmpwd" id="requiredpassword" value="" placeholder="确认密码"/>
                </div>
                <div class="input-tip">
                    <span></span>
                </div>
                <div class="form-item"><label>联系电话</label>
                    <input type="text" name="uphone" id="phone" value="" placeholder="联系电弧"/>
                </div>
                <div class="input-tip">
                    <span></span>
                </div>
                <div class="item-mailcode-wrap" style="display: block;">
                    <div class="form-item form-item-mailcode">
                        <div class="mailcode-left" style="border-right: 1px solid rgb(221, 221, 221); border-top-color: rgb(221, 221, 221); border-bottom-color: rgb(221, 221, 221); border-left-color: rgb(221, 221, 221);">
                            <label>手机验证码</label>
                            <input type="text" name="mailCode" maxlength="6" autocomplete="off" id="mailCode" class="field mailcode" placeholder="请输入手机验证码">
                            <i class="i-status"></i>
                            <i class="i-cancel" style="display: none;"></i>
                        </div>
                        <button id="getMailCode" class="btn-mailcode" type="button" clstag="pageclick|keycount|reg_puser_201804031|16" style="border-top: 1px solid rgb(221, 221, 221); border-right: 1px solid rgb(221, 221, 221); border-bottom: 1px solid rgb(221, 221, 221); border-left: none; border-image: initial;">获取验证码</button>
                        <div class="input-tip">
                            <span></span>
                        </div>
                    </div>
                </div>
                <div class="input-tip">
                    <span></span>
                </div>
            </div>

        </form>
    </div>


</div>
</body>

</html>