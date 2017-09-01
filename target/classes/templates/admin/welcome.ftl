<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>欢迎页</title>
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
 
</head>

<body>
    <div class="layui-fluid main">
        <div class="layui-row">
            <div class="layui-col-md12">
                <ul class="layui-timeline">
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">2017年</div>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">更新日志</div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <script src="/layui/layui.js"></script>
    <script>
        layui.use('jquery', function() {
            var $ = layui.jquery;
            $('#test').on('click', function() {
                parent.message.show({
                    skin: 'cyan'
                });
            });
        });
    </script>
</body>

</html>