//如果引入页面 加入data-main属性，那么paths就不用写了，直接引用当前requier.js所在的路径/+引用名称
require.config({
    paths: {
    	jquery:'../'+path+'/static/js/lib/jquery-2.1.4.min',
        bootstrap: '../'+path+'/static/js/lib/bootstrap-3.3.5.min',
        test:'../'+path+'/static/js/lib/testrequire'
    }
});




