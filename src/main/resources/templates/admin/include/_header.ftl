
<!-- 导航部分 -->
<nav class="navbar navbar-default  navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>

			<a class="navbar-brand"><label class="admin_name">林业调查后台</label></a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<!-- 功能菜单区域   开始  -->
			<ul class="nav navbar-nav ">
				<#list menuVo.menus as menu>
					<li ${menu.classStr} >
						<#if (menu.submenuList?size<=0) ><a href="${menu.url}" ${menu.targetStr} >${menu.name}</a></#if>
						<#if (menu.submenuList?size>0) ><a href="${menu.url}" ${menu.targetStr} class="dropdown-toggle" data-toggle="dropdown">${menu.name}<span
							class="caret"></span>
							</a><ul class="dropdown-menu" role="menu"></#if>
							<#list menu.submenuList as submenu>
								<li ${submenu.classStr}><a href="${submenu.url}" ${submenu.targetStr}>${submenu.name}</a></li>
								<li class="divider"></li>
							</#list>
						<#if (menu.submenuList?size>0) ></ul></#if>
					</li> 
				</#list>
				
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">您好：${user.showUsername} <span
							class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="javascript:;" data-toggle="modal" data-target="#change_pwd_mod" id="xgmm"><i class="icon-calendar"></i>
								修改密码</a></li>
						<li class="divider"></li>
						<li><a href="/admin/logout"><i class="icon-key"></i> 退出登陆</a></li>
					</ul></li>
			</ul>
		</div>
		<input type="hidden" id="distCode" name="distCode" value="${user.distCode}" />
		<!--/.nav-collapse -->
	</div>
</nav>
<!-- /. 导航部分End -->

<!-- Begin 修改密码modal-->
<div id="change_pwd_mod" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" 
	style="display: none;">
	<div class="modal-dialog" id="adminChangePwdForm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">×</span>
					<span class="sr-only">Close</span>
				</button>
				<h4 class="modal-title">修改密码</h4>
			</div>
			<form id="changePwdForm" method="post" class="form-horizontal form-bordered">
				<div class="modal-body titleholder">
					<div class="form-group">
						<label class="col-md-3 control-label">旧密码</label>

						<div class="col-md-6">
							<input type="password" name="oldPassword" class="form-control" placeholder="请输入旧密码" maxlength="15"  v-model="oldPassword" required="required">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">新密码</label>

						<div class="col-md-6">
							<input type="password" name="newPassword" class="form-control" placeholder="请输入新密码" maxlength="15" v-model="newPassword" required="required">
							<span class="help-block">密码长度必须大于5个字符</span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">确认新密码</label>

						<div class="col-md-6">
							<input type="password" name="newPassword1" class="form-control" placeholder="请再次输入新密码" v-model="newPassword2" maxlength="15" required="required">
							<span class="help-block">两次输入的密码必须一样</span>
						</div>
					</div>
					<div class="form-group"></div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary"  v-on:click="myAdmin.changePassword()">
						<i class="fa fa-angle-right"></i> 提交
					</button>
					<button type="button" class="btn" data-dismiss="modal">
						关闭<i class="fa fa-angle-left"></i>
					</button>
				</div>
			</form>
		</div>
	</div>
</div>
<!-- END 修改密码modal-->
