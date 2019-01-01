var md = {
    confirm : function (msg,fn) {
        bootbox.confirm({
            message : msg,
            buttons: {
                confirm: {
                    label: '确认'
                },
                cancel: {
                    label: '取消'
                }
            },
            callback: function (result) {
                if(result){
                    fn();
                }
            }
        })
    },
    alert : function(msg){
        bootbox.alert(msg);
    },
    openDialog : function (title,url,fn,modalSize) {
        if(!fn){
            fn = 'submitForm';
        }
        let size = null;
        if(modalSize == "large" || modalSize == "small"){
            size = modalSize;
        }
        $.get(url,function (data) {
            bootbox.dialog({
                title : title,
                message : data,
                size : size,
                buttons : {
                    confirm: {
                        label: '确认',
                        className : 'btn btn-primary',
                        callback : function () {
                            try {
                                if(typeof(eval(fn)) == 'function'){
                                    eval(fn + '()');
                                }
                            }catch (e) {
                                console.log(e);
                            }
                        }
                    },
                    cancel : {
                        label : "取消",
                        className : 'btn btn-default'
                    }
                }
            });
        })
    },
    openDialogView : function (title,url) {
        $.get(url,function (data) {
            bootbox.dialog({
                title : title,
                message : data,
                buttons : {
                    cancel : {
                        label : "确定"
                    }
                }
            });
        })
    }
}