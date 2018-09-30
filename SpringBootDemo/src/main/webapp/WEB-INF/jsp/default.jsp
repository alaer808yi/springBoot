<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE>
<html>
  <head>    
    <title>登录页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css"/>
	
	<script src="${pageContext.request.contextPath }/js/jquery-2.0.3.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/default.js" type="text/javascript"></script>
	<script type="text/javascript">var path = '<%=path%>';</script>
  </head>
  
  <body>
   <form id="userBean" method="post" action="<%=path%>/login/login">
    <table>
    <tr>
        <td>登录帐号:<input type="text" name="name" id="name"></td>
     </tr>
     <tr>
        <td>登录口令:<input type="password" name="password" id="password"></td>
     </tr>
     <tr>
        <td><input type="submit" value="登录" style="background-color:pink">  
            <input type="reset" value="重置" style="background-color:red">
        </td>    
     </tr>
    </table>
    <input type="button" id="test_button" value="TEST" style="background-color:red">
   
   
   </form>
  </body>
</html>
