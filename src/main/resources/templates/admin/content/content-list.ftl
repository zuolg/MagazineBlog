<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="/layui/css/layui.css">
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

	<table id="mytable">
	</table>

	<script type="text/javascript" src="/layui/layui.js" charset="utf-8"></script>
	<script type="text/javascript" src="/jquery/jquery.min.js"
		charset="utf-8"></script>
	<script type="text/javascript" src="/js/ajax.utils.js" charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
		layui.use('table', function() {
			var table = layui.table;
			
			AjaxUtil.POST({
			    url: "/api/content/model/list",
			    data: {},
			    success: function(json){
			    	console.log(table);
			    	var _data = json.data.list;
			    	//展示已知数据
					table.render({
						elem : '#mytable',
						data : _data,
						cols : [ [ //标题栏
						{
							checkbox : true,
							LAY_CHECKED : true
						}, {
							field : 'id',
							title : 'ID',
							width : 80,
							sort : true
						}, {
							field : 'title',
							title : 'title',
							width : 120
						}, {
							field : 'summary',
							title : 'summary',
							width : 120
						}, {
							field : 'username',
							title : '用户名',
							width : 120
						} ] ],
						skin : 'row', //表格风格
						even : true,
						page : true, //是否显示分页
						limits : [ 20, 50, 100 ],
						limit : 20
					//每页默认显示的数量
					});
			    	 
			    	
			    },
			    error: function(){
			        console.log('请登录后操作');
			    }
			});
		});
	</script>

</body>
</html>