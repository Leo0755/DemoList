<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8" />

<title></title>
	<!-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/plugin/jquery.js"></script>
<script type="text/javascript">
	var pageSize = ${pageInfo.pageSize};
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/plugin/tab.js"></script>
	<!-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
<style type="text/css">

<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.STYLE1 {
	font-size: 12px
}

.STYLE4 {
	font-size: 12px;
	color: #1F4A65;
	font-weight: bold;
}

a:link {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;
}

a:visited {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;
}

a:hover {
	font-size: 12px;
	color: #FF0000;
	text-decoration: underline;
}

a:active {
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}

.STYLE7 {
	font-size: 12px;
}
-->
</style>

<script type="text/javascript">
	var highlightcolor = '#eafcd5';
	//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
	var clickcolor = '#51b2f6';
	function changeto() {
		source = event.srcElement;
		if (source.tagName == "TR" || source.tagName == "TABLE")
			return;
		while (source.tagName != "TD")
			source = source.parentElement;
		source = source.parentElement;
		cs = source.children;
		//alert(cs.length);
		if (cs[1].style.backgroundColor != highlightcolor && source.id != "nc"
				&& cs[1].style.backgroundColor != clickcolor)
			for (i = 0; i < cs.length; i++) {
				cs[i].style.backgroundColor = highlightcolor;
			}
	}

	function changeback() {
		if (event.fromElement.contains(event.toElement)
				|| source.contains(event.toElement) || source.id == "nc")
			return

		

		if (event.toElement != source
				&& cs[1].style.backgroundColor != clickcolor)
			//source.style.backgroundColor=originalcolor
			for (i = 0; i < cs.length; i++) {
				cs[i].style.backgroundColor = "";
			}
	}

	function clickto() {
		source = event.srcElement;
		if (source.tagName == "TR" || source.tagName == "TABLE")
			return;
		while (source.tagName != "TD")
			source = source.parentElement;
		source = source.parentElement;
		cs = source.children;
		//alert(cs.length);
		if (cs[1].style.backgroundColor != clickcolor && source.id != "nc")
			for (i = 0; i < cs.length; i++) {
				cs[i].style.backgroundColor = clickcolor;
			}
		else
			for (i = 0; i < cs.length; i++) {
				cs[i].style.backgroundColor = "";
			}
	}
</script>
</head>

<body>
<!-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
	<form method="post"  id="queryForm"   action="${pageContext.request.contextPath}/tag/queryAll">
		<table>
			<tr>
				<td width="100%">公司标签类型名称:<input type="text" name="tname" value="${jname}">
						       <input type="hidden" name="pageNum" id="pageindex" value="${pageInfo.pageNum}">
            <input type="hidden" name="pageSize"  id="pagesize" value="${pageInfo.pageSize}">
            <input type="hidden" name="pages"  id="pagesum" value="${pageInfo.pages}">
            <input type="button" id="clear" value="清空">
            <input type="button" id="search" value="查询"></td>
			</tr>
		</table>
	</form>
<h2 align="center" style="color: red;font-size: 18px">${msg}</h2>
<!-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
	<table width="100%" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="30"><table width="100%" border="0" cellspacing="0"
					cellpadding="0">
					<tr>
						<td width="15" height="30"><img
							src="${pageContext.request.contextPath}/static/imgpage/tab_03.gif"
							width="15" height="30" /></td>
						<td width="1101"
							background="${pageContext.request.contextPath}/static/imgpage/tab_05.gif"><img
							src="${pageContext.request.contextPath}/static/imgpage/311.gif"
							width="16" height="16" /> <span class="STYLE4">栏目列表</span></td>
						<td width="281"
							background="${pageContext.request.contextPath}/static/imgpage/tab_05.gif"><table
								border="0" align="right" cellpadding="0" cellspacing="0">

								<tr>
									<td width="60">
										<table width="87%" border="0" cellpadding="0" cellspacing="0">
											<tr>
												<td class="STYLE1"><div align="center">
														<input type="checkbox" name="checkbox62" id="checkAll"  value="checkbox" />
													</div></td>
												<td class="STYLE1"><div align="center">全选</div></td>
											</tr>
										</table>
									</td>
									<td width="60"><table width="90%" border="0"
											cellpadding="0" cellspacing="0">
											<tr>
												<td class="STYLE1"><div align="center">
														<img
															src="${pageContext.request.contextPath}/static/imgpage/001.gif"
															width="14" height="14" />
													</div></td>
												<td class="STYLE1"><div align="center"><a href="${pageContext.request.contextPath}/tag/doadd">新增</a></div></td>
											</tr>
										</table></td>
									<td width="60"><table width="90%" border="0"
											cellpadding="0" cellspacing="0">
											<tr>
												<td class="STYLE1"><div align="center">
														<img
															src="${pageContext.request.contextPath}/static/imgpage/114.gif"
															width="14" height="14" />
													</div></td>
												<td class="STYLE1"><div align="center"><a href="#">修改</a></div></td>
											</tr>
										</table></td>
									<td width="52"><table width="88%" border="0"
											cellpadding="0" cellspacing="0">
											<tr>
												<td class="STYLE1"><div align="center">
														<img
															src="${pageContext.request.contextPath}/static/imgpage/083.gif"
															width="14" height="14" />
													</div></td>
												<td class="STYLE1"><div align="center"><a href="#" >删除</a></div></td>
											</tr>
										</table></td>
								</tr>
							</table></td>
						<td width="14"><img
							src="${pageContext.request.contextPath}/static/imgpage/tab_07.gif"
							width="14" height="30" /></td>
					</tr>
				</table></td>
		</tr>
		<tr>
			<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="9"
							background="${pageContext.request.contextPath}/static/imgpage/tab_12.gif">&nbsp;</td>
						<td bgcolor="#f3ffe3"><table width="99%" border="0"
								align="center" cellpadding="0" cellspacing="1" bgcolor="#c0de98"
								onmouseover="changeto()" onmouseout="changeback()">
							<!-- xxxxxxxxxxxxxxxxxxxxx  显示栏选项  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
								<tr>
									<td width="6%" height="26"
										background="${pageContext.request.contextPath}/static/imgpage/tab_14.gif"
										class="STYLE1"><div align="center" class="STYLE2 STYLE1">选择</div></td>

									<td width="10%" height="18"
										background="${pageContext.request.contextPath}/static/imgpage/tab_14.gif"
										class="STYLE1"><div align="center" class="STYLE2 STYLE1">类型名称</div></td>
								
									<td width="10%" height="18"
										background="${pageContext.request.contextPath}/static/imgpage/tab_14.gif"
										class="STYLE1"><div align="center" class="STYLE2 STYLE1">是否有上级</div></td>

									
									<td width="7%" height="18"
										background="${pageContext.request.contextPath}/static/imgpage/tab_14.gif"
										class="STYLE1"><div align="center" class="STYLE2">配置</div></td>

									<td width="7%" height="18"
										background="${pageContext.request.contextPath}/static/imgpage/tab_14.gif"
										class="STYLE1"><div align="center" class="STYLE2">编辑向导</div></td>

									<td width="7%" height="18"
										background="${pageContext.request.contextPath}/static/imgpage/tab_14.gif"
										class="STYLE1"><div align="center" class="STYLE2">删除</div></td>
								</tr>

								<c:forEach items="${tagList}" var="column"><!-- 该items="{jobtypeList}"--->
									<tr class="row">
										<!-- xxxxxxxxxxxxxxxxxxx对应 选择 xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
										<td height="18" bgcolor="#FFFFFF"><div align="center"
												class="STYLE1">
												<input name="checkbox" type="checkbox"  class="choose"
													value="${column.tid}" /><!-- 该{column.jtid}中的jtid--->
											</div></td>

										<!-- xxxxxxxxxxxxxxxxxxx对应 类型名称 xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
										<td height="18" bgcolor="#FFFFFF"><div align="center"
												class="STYLE2 STYLE1">${column.tname}</div></td>

										<!-- xxxxxxxxxxxxxxxxxxx对应 是否有上级 xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
										<td height="18" bgcolor="#FFFFFF"><div align="center"
												class="STYLE2 STYLE1">
											<c:if test="${column.bTTid!=null}">有</c:if>
											<c:if test="${column.bTTid==null}">否</c:if>
										</div></td>

										<!-- xxxxxxxxxxxxxxxxxxx对应 配置 xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
										<td height="18" bgcolor="#FFFFFF"><div align="center">
												<img src="${pageContext.request.contextPath}/static/imgpage/037.gif"
													width="9" height="9" /><span class="STYLE1"> [</span><a
													href="#">配置向导</a><span class="STYLE1">]</span>
											</div></td>

										<!-- xxxxxxxxxxxxxxxxxxx对应 编辑向导 xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
										<td height="18" bgcolor="#FFFFFF"><div align="center">
												<img src="${pageContext.request.contextPath}/static/imgpage/037.gif"
													width="9" height="9" /><span class="STYLE1"> [</span>
											<a href="${pageContext.request.contextPath}/tag/doupdate?tid=${column.tid}">编辑</a><span class="STYLE1">]</span>
											</div></td>

										<!-- xxxxxxxxxxxxxxxxxxx对应 删除 xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
										<td height="18" bgcolor="#FFFFFF"><div align="center">
												<span class="STYLE2"><img
													src="${pageContext.request.contextPath}/static/imgpage/010.gif"
													width="9" height="9" /> </span><span class="STYLE1">[</span><a
													 href="${pageContext.request.contextPath}/tag/delete?tid=${column.tid}">删除</a><span class="STYLE1">]</span>
											</div></td>
									</tr>
								</c:forEach>
							</table></td>
						<td width="9"
							background="${pageContext.request.contextPath}/static/imgpage/tab_16.gif">&nbsp;</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td height="29"><table width="100%" border="0" cellspacing="0"
					cellpadding="0">
					<tr>
						<td width="15" height="29"><img
							src="${pageContext.request.contextPath}/static/imgpage/tab_20.gif"
							width="15" height="29" /></td>
						<td
							background="${pageContext.request.contextPath}/static/imgpage/tab_21.gif"><table
								width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>

	<!-- xxxxxxxxxxxxxxxxxxx对应底部    共2条纪录，当前第1/1页，每页10条纪录 xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
									<td width="25%" height="29" nowrap="nowrap"><span
										class="STYLE1">共${pageInfo.total}条纪录，当前第${pageInfo.pageNum}/${pageInfo.pages}页，每页${pageInfo.pageSize}条纪录</span></td>

	<!-- xxxxxxxxxxxxxxxxxxx对应底部     请选择:10/50/100页  xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
									<td width="75%" valign="top" class="STYLE1"><div
											align="right">
											<table width="502" height="20" border="0" cellpadding="0"
												cellspacing="0">
												<tr>
													<td width="152" height="22" valign="middle">请选择:<select
														pageindex="${pageInfo.pageNum}"
														url="${pageContext.request.contextPath}/tag/queryAll"
														id="changePageSize"><option value="10">10</option>
															<option value="30">30</option>
														<option value="50" selected="selected">50</option></select>


	<!-- xxxxxxxxxxxxxxxxxxx对应底部   首页  上一页  下一页  末页  xxxxxxxxxxxxxxxxxxxxxxxxxxxxx-->
				  <td width="62" height="22" valign="middle"><div align="right"><a  href="#" id="first"><img src="${pageContext.request.contextPath}/static/imgpage/first.gif" width="37" height="15" /></a></div></td>
                  <td width="50" height="22" valign="middle"><div align="right"><a href="#" id="last"><img src="${pageContext.request.contextPath}/static/imgpage/back.gif" width="43" height="15" /></a></div></td>
                  <td width="54" height="22" valign="middle"><div align="right"><a href="#" id="next"><img src="${pageContext.request.contextPath}/static/imgpage/next.gif" width="43" height="15" /></a></div></td>
                  <td width="49" height="22" valign="middle"><div align="right"><a href="#" id="end"><img src="${pageContext.request.contextPath}/static/imgpage/last.gif" width="37" height="15" /></a></div></td>
													<td width="59" height="22" valign="middle"><div align="right">转到第</div></td>
                  <td width="25" height="22" valign="middle"><span class="STYLE7">
                    <input name="textfield" type="text" id="page" class="STYLE1" style="height:10px; width:25px;" size="5" />
                  </span></td>
                  <td width="23" height="22" valign="middle">页</td>
                  <td width="30" height="22" valign="middle"><img id="go" src="${pageContext.request.contextPath}/static/imgpage/go.gif" width="37" height="15" /></td>
                </tr>
											</table>
										</div></td>
								</tr>
							</table></td>
						<td width="14"><img
							src="${pageContext.request.contextPath}/static/imgpage/tab_22.gif"
							width="14" height="29" /></td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
