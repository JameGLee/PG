$(function(){
    (function register() {
    //    注册页面手机号失去焦点
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
    })
})