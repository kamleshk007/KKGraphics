<%@page import="jsp.RegisterDAO" %>
<jsp:useBean id="reg" class="jsp.UserDetails"></jsp:useBean>

<jsp:setProperty property="*" name="reg"/>
<%
int status = RegisterDAO.newregistration(reg);
if(status>0){
	out.println("Successfully Register With KKgraphics..!");
}
%>
