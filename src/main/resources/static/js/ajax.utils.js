var AjaxUtil = {
	// 发送get请求
	GET : function(options) {
		this.ajax(options, 'get');
	},
	// 发送post请求
	POST : function(options) {
		this.ajax(options, 'post');
	},
	ajax : function(options, type) {
		var opts = {
			isCommonBefore : false, // 默认是通用的加载中动画
			client : 1, // TODO这里应该根据内核判断
			isCors : false,// 默认不跨域
			isLogin : false
		}

		var opts= $.extend(true, options, opts || {});

		// 跨域，将请求地址 和 请求参数 都作为参数传递调用后台固定的跨域接口
		if (opts.isCors) {
			opts.data = {
				url : opts.url,// 真实的url
				params : JSON.stringify(opts.data), // 请求参数
			}
			opts.url = URL.CORS;
		}

		// 添加默认的参数
		//opts.data.client = opts.client;
		// 需要登录认证的请求
		if (opts.isLogin) {
			opts.data.token = AjaxUtil.getToken()
		}

		$.ajax({
			url : opts.url,
			data : opts.data,
			type : type,
			async : opts.async,
			beforeSend : function() {
				opts.isCommonBefore ? AjaxUtil.loadingShow()
						: (opts.beforeSend && opts.beforeSend())
			},
			success : function(json) {
					console.log(opts.baseUrl || opts.url,' ajax is successful', json);
					opts.success && opts.success(json);
			},
			error : function() {
				console.error(opts.baseUrl || opts.url, ' ajax is error');
				opts.error != undefined ? opts.error() : AjaxUtil.commonError();
			},
			complete : function(XMLHttpRequest, textStatus) {
				console.log(opts.baseUrl || opts.url, ' ajax is complete');
			},
			timeout : opts.timeout || 20000
		})
	}
}