package com.itsol.back.model;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.itsol.core.model.BaseModel;

public class Profile extends BaseModel{
	private String firstName;
	private String lastName;
	private String password;
	private String retypePassword;
	private Role role;
	private String email;
	//-- Unmapped Variables --
	private String roleId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRetypePassword() {
		return retypePassword;
	}
	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	//-- Validation --
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors actionErrors = new ActionErrors();

		if (!password.equals(retypePassword)) {
			actionErrors.add("password", new ActionMessage("Profile-Password-Not-Match"));
		}
		if("".equals(firstName) || "".equals(lastName) || "".equals(roleId) || "".equals(email)){
			actionErrors.add("Profile", new ActionMessage("Profile-All-Fields-Required"));
		}
		return actionErrors;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		password = "";
		retypePassword = "";
	}
}
