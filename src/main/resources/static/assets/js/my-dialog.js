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
    openDialog : function (title,url) {
        
    },
    openDialogView : function () {
        
    }
}