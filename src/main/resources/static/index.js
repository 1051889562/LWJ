$(function () {
    var time = new Date();
    var day = ("0" + time.getDate()).slice(-2);
    var month = ("0" + (time.getMonth() + 1)).slice(-2);
    var today = time.getFullYear() + "-" + (month) + "-" + (day);
    $("input[name=birthday]").val(today);

    $("input[name=sub]").click(function () {
        var uresult = $("input[name=uresult]:checked").val();
        var userType = $("select[name=realName] option:selected").val();
        var realName = $("select[name=realName] option:selected").html();
        var password = $("input[name=password]").val();
        var gender = $("input[name=gender]:checked").val();
        var username = $("input[name=username]").val();
        var birthday = $("input[name=birthday]").val();
        //$("#text").html("username:" + username + " userType:" + userType + " realName:" + realName + " password:" + password
        //    + " gender:" + gender + " birthday:" + birthday + " uresult:" + uresult);
        $.post("/add_user",
            {
                "username": username,
                "userType": userType,
                "realName": realName,
                "password": password,
                "gender": gender,
                "birthday":birthday,
                "uresult":uresult
            },function (data) {
                if(data==true)
                    location.href="/";
            }
            );
    });
});