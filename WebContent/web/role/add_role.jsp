<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ecommerce Admin</title>
</head>
<h2><bean:message key="Role-Title" /></h2>
<body>
	<html:form action="/role.do">
			<table width="10%" border="0">
				<tr>
					<td><bean:message key="Role-Name" />:</td>
					<td><html:text name="roleForm" property="name"/></td>
				</tr>
				<tr>
					<td><bean:message key="Role-Description" />:</td>
					<td><html:text name="roleForm" property="desc" /></td>
				</tr>
				<tr>
					<td><html:submit property="method">add</html:submit></td>
				</tr>
			</table>
		</html:form>
</body>
</html>