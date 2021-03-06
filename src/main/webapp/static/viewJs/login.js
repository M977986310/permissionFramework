layui.use(['form', 'layer', 'jquery'], function () {
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer
    $ = layui.jquery;


    $(".loginBody .seraph").click(function () {
        layer.msg("这只是做个样式，至于功能，你见过哪个后台能这样登录的？还是老老实实的找管理员去注册吧", {
            time: 5000
        });
    })

    //登录按钮
    form.on("submit(login)", function () {
        let username = $("#userName").val();
        let password = $("#password").val();
        let imgCode = $("#imgCode").val();
        $(this).text("登录中...").attr("disabled", "disabled").addClass("layui-disabled");
        setTimeout(function () {
            $.ajax({
                url: baseUrl + "/sys/login",
                type: "post",
                data: {username: username, password: password},
                before: function (date) {
                    console.log(date);
                },
                success: function (rs) {
                    console.log(rs);
                    if (rs.code === 0) {
                        location.href = baseUrl + "/index";
                    } else {
                        layer.msg(rs.msg);
                    }
                }
            });
        }, 1000);

        return false;
    })

    function login() {


    }

    //表单输入效果
    $(".loginBody .input-item").click(function (e) {
        e.stopPropagation();
        $(this).addClass("layui-input-focus").find(".layui-input").focus();
    })
    $(".loginBody .layui-form-item .layui-input").focus(function () {
        $(this).parent().addClass("layui-input-focus");
    })
    $(".loginBody .layui-form-item .layui-input").blur(function () {
        $(this).parent().removeClass("layui-input-focus");
        if ($(this).val() != '') {
            $(this).parent().addClass("layui-input-active");
        } else {
            $(this).parent().removeClass("layui-input-active");
        }
    })
})
