/**
 * 判断注册用户名是否存在
 */
function registername() {

    let url = "judge?name=" + $("#username").val();
    //$.get(url,data,success(data, textStatus, jqXHR),dataType)
    // {status}
    let $nameError = $(".name-error");
    $.get(url, function(rs){
        // 字符串 转Json， 不然获取不到值
        let result = JSON.parse(rs);
        let message = "";
        if (result.status === 101) {
            message = result.message;
        }
        // else if (result.status === -100){
        //     message = result.message;
        // }
        $nameError.text(message);
        })
}

/**
 * 判断注册手机号是否存在
 */
function registerphone() {
    let url = "phone?phone=" + $("#phone").val();
    let $phoneError = $(".phone-error");
    $.get(url,function (rs) {
        let result = JSON.parse(rs);
        let message="";
        if (result.status==102){
            message = result.message;
        }
        $phoneError.text(message);
    })
}

/**
 * 判断第二次输入密码和第一次输入密码是否一致
 */
function requiredQwd(){
    let url = "required?pwd="+$("#password").val()+"&requiredPwd="+$("#requiredpassword").val();
    let $requiredError = $(".required-error");
    $.get(url,function (rs) {
        let result = JSON.parse(rs);
        let message = "";
        if (result.status==103){
            message = result.message;
        }
        $requiredError.text(message);
    })
}
