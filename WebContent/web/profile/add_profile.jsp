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
<h2><bean:message key="Profile-Title"/></h2>
<body>
	<html:form action="/profile.do">
			<table width="10%" border="0">
				<tr>
					<td><bean:message key="Profile-First-Name" />:</td>
					<td><html:text name="profileForm" property="firstName" /></td>
				</tr>
				<tr>
					<td><bean:message key="Profile-Last-Name" />:</td>
					<td><html:text name="profileForm" property="lastName" /></td>
				</tr>
				<tr>
					<td><bean:message key="Profile-Email" />:</td>
					<td><html:text name="profileForm" property="email" /></td>
				</tr>
				<tr>
					<td><bean:message key="Profile-Role" />:</td>
					<td>
						<html:select name="profileForm" property="roleId">
							<html:option value="0">Select Role</html:option>
							
							<logic:iterate id="Role" name="Roles">
								<html:option value='${Role.id}'>
									<bean:write name="Role" property="name"/>
								</html:option>
							</logic:iterate>
						</html:select>
					
					</td>
					
				</tr>
				
				<tr>
					<td><bean:message key="Profile-Password" />:</td>
					<td><html:password property="password" /></td>
				</tr>
				<tr>
					<td><bean:message key="Profile-Password-Retype" />:</td>
					<td><html:password property="retypePassword" /></td>
				</tr>
				<tr>
					<td><html:submit property="method">add</html:submit></td>
				</tr>	
			</table>
		</html:form>
		<html:errors/>
</body>
</html>