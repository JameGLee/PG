function registername() {

    let url = "judge?name=" + $("#username").val();
    //$.get(url,data,success(data, textStatus, jqXHR),dataType)
    // {status}
    let $nameError = $(".name-error");
    $.get(url, function(rs){
        // 字符串 转Json， 不然获取不到值
        let result = JSON.parse(rs);
        let message = "";
        if (result.status == 101) {
            message = result.message;
        }
        $nameError.text(message);
    },)
}
