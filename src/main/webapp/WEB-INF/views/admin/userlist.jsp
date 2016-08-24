<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>焦作市名仕肿瘤医院|管理系统</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="/static/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="/static/dist/css/skins/_all-skins.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
<!-- 引入datatables的css样式 -->
<link rel="stylesheet"
	href="/static/plugins/datatables/dataTables.bootstrap.css" />
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<%@ include file="../include/header.jsp"%>
	<!-- 内容面板-->
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header">
			<h1>管理员首页</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li><a href="#">Examples</a></li>
				<li class="active">Blank page</li>
			</ol>
		</section>

		<!-- Main content -->
		<section class="content">

			<!-- Default box -->
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">全体员工列表</h3>
					<button class="btn btn-success" id="addUserBtn">新增员工</button>
					<button class="btn btn-info">新建员工</button>
					<div class="box-tools pull-right">
						<button type="button" class="btn btn-box-tool"
							data-widget="collapse" data-toggle="tooltip" title="Collapse">
							<i class="fa fa-minus"></i>
						</button>
						<button type="button" class="btn btn-box-tool"
							data-widget="remove" data-toggle="tooltip" title="Remove">
							<i class="fa fa-times"></i>
						</button>
					</div>
				</div>
				<div class="box-body">
					<table id="userdatatables" class="table">
						<thead>
							<tr>
								<th>id</th>
								<th>员工姓名</th>
								<th>员工账号</th>
								<th>电话</th>
								<th>角色</th>
								<th>状态</th>
								<th>#</th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
				</div>
				<!-- /.box-body -->
				<div class="box-footer">Footer</div>
				<!-- /.box-footer-->
			</div>
			<!-- /.box -->

		</section>
		<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->
	<!-- 修改员工信息的摸态框开始 -->
	<div class="modal" id="newUserModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button aria-label="Close" data-dismiss="modal" class="close"
						type="button">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">新增员工</h4>
				</div>
				<div class="modal-body">
					<div class="form-horizontal">
						<form id="newUserForm">
							<div class="form-group">
								<label class="col-sm-2 control-label">姓名</label>
								<div class="col-sm-9">
									<input id="newUsername" class="form-control" type="text"
										placeholder="请输入姓名" name="name">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">账号</label>
								<div class="col-sm-9">
									<input id="newUserUsername" class="form-control" type="text"
										placeholder="请输入账号" name="username">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">密码</label>
								<div class="col-sm-9">
									<input id="newUserPassword" class="form-control" type="text"
										value="123456" name="password">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">电话</label>
								<div class="col-sm-9">
									<input id="newUserTel" class="form-control" type="text"
										placeholder="请输入电话" name="tel">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">角色</label>
								<div class="col-sm-9">
									<select id="newUserRoleid" class="form-control" name="roleid">
										<option value="1">管理员</option>
										<option value="2">员工</option>
										<option value="3">测试</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">状态</label>
								<div class="col-sm-9">
									<select id="newUserEnable" class="form-control" name="enable">
										<option value="true">可用</option>
										<option value="false">禁用</option>
									</select>
								</div>
							</div>
						</form>
					</div>

				</div>
				<div class="modal-footer">
					<button data-dismiss="modal" class="btn btn-default pull-left"
						type="button">取消</button>
					<button id="newUserFormBtn" class="btn btn-primary" type="button">保存</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /修改员工信息的摸态框结束 -->

	<%@ include file="../include/footer.jsp"%>
	<script src="/static/plugins/datatables/jquery.dataTables.min.js"></script>
	<script src="/static/plugins/datatables/dataTables.bootstrap.min.js"></script>
	<script
		src="/static/plugins/jquery-validation-1.15.0/dist/jquery.validate.min.js"></script>
	<script>
		$(function() {
			var dataTable = $('#userdatatables').DataTable({
				search : true,
				serverSide : true,
				ajax : "/admin/userlist/load",
				ordering : true,
				"autoWidth" : false,
				columns : [
					{
						"data" : "id"
					},
					{
						"data" : "name"
					},
					{
						"data" : "username"
					},
					{
						"data" : "tel"
					},
					{
						"data" : "role.name"
					},
					{
						"data" : function(row) {
							if (row.enable) {
								return "<span class='label label-success'>正常</span>";
							} else {
								return "<span class='label label-danger'>禁用</span>";
							}
						}
					},
					/*  {"data":function(row){
					     var timestamp = row.createtime;
					     var day = moment(timestamp);
					     return day.format("YYYY-MM-DD HH:mm");
					 }}, */
					{
						"data" : function(row) {
							if (row.username == 'admin') {
								return "";
							} else {
								return "<a href='javascript:;' class='resetPwd' rel='" + row.id + "'>重置密码</a> &nbsp;&nbsp;" +
									"<a href='javascript:;' class='edit' rel='" + row.id + "'>编辑</a>";
							}
						}
					}
				],
				"language" : { //定义中文
					"search" : "请输入员工姓名或登录账号:",
					"zeroRecords" : "没有匹配的数据",
					"lengthMenu" : "显示 _MENU_ 条数据",
					"info" : "显示从 _START_ 到 _END_ 条数据 共 _TOTAL_ 条数据",
					"infoFiltered" : "(从 _MAX_ 条数据中过滤得来)",
					"loadingRecords" : "加载中...",
					"processing" : "处理中...",
					"paginate" : {
						"first" : "首页",
						"last" : "末页",
						"next" : "下一页",
						"previous" : "上一页"
					}
				}
			})
			$(document).delegate(".resetPwd", "click", function() {
				//获取点击事件id
				if (confirm("即将重置为默认密码123456！")) {
					var id = $(this).attr("rel");
					//使用ajax方式异步请求重置密码
					$.post("/admin/user/resetpassword",
						//数据里面传入一个对象
						{
							"id" : id
						})
						.done(function(data) {
							if (data == 'success') {
								alert("密码重置成功！")
							}
						})
						.fail(function() {
							alert("服务器异常！")
						})
				}
			});
			//新增员工 弹出模态框 使用validate插件
			$("#addUserBtn").click(function() {
				$("#newUserForm")[0].reset()
				$("#newUserModal").modal({
					//显示
					show : true,
					backdrop : 'static',
					//点击背景不返回
					keyborad : false
				})
	
			});
			//新增员工摸态框验证表单
			$("#newUserForm").validate({
				errorclass : "text-danger",
				errElement : "span",
				rules : {
					name : {
						//必须填写
						required : true,
						//长度限制
						rangelength : [ 2, 20 ],
					},
					username : {
						require : true,
						rangelength : [ 5, 20 ],
						//远程验证
						remote : "/admin/user/checkusername"
					},
					password : {
						required : true,
						rangelength : [ 6, 18 ],
					},
					tel : {
						require : true,
						rangelength : [ 7, 13 ],
					}
				},
				//提示信息
				messages : {
					name : {
						required : "请输入真实姓名",
						rangelength : "真实姓名长度2~20位"
					},
					username : {
						required : "请输入用户名",
						rangelength : "用户名的长度5~20位",
						remote : "该用户名已被占用!"
					},
					password : {
						required : "请输入密码",
						rangelength : "密码长度6~18位"
					},
					tel : {
						require : "请输入电话/手机号码",
						rangelength : "长度最大不得超过13位！"
					}
				},
				//添加表单提交句柄
				submitHandler : function(form) {
					$.post("/admin/user/new", $(form).serialize()).done(function(data) {
						if (data == "success") {
							//隐藏摸态框
							$("newUserModal").modal('hide');
							//使用dataTable重新加载表格
							dataTable.ajax.reload();
						}
					})
						.fail(function() {
							alert("服务器异常，添加失败！")
						})
				}
			})
			//绑定点击事件
			$("#newUserFormBtn").click(function() {
				$("#newUserForm").submit();
			})
		})
	</script>
</body>
</html>
