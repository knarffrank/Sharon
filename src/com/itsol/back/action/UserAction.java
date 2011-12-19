package com.itsol.back.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.itsol.back.model.User;
import com.itsol.back.service.MerchantService;
import com.itsol.back.service.RoleService;
import com.itsol.back.service.UserService;
import com.itsol.core.action.BaseAction;
import com.itsol.exception.ProfileExistException;

public class UserAction extends BaseAction{
	private UserService userService;
	private RoleService roleService;
	private MerchantService merchantService;
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
		User user = (User) form;
		user.setRole(roleService.findById(user.getRoleId()));
		ActionErrors actionErrors = new ActionErrors();
		try{
			userService.save(user);
		}catch(ProfileExistException p){
			actionErrors.add("User", new ActionMessage("User-Already-Exist"));
			saveErrors(req, actionErrors);
			return mapping.findForward("error");
		}
		return mapping.findForward("base-ack");
	}
	public ActionForward form(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
		req.setAttribute("Roles", roleService.findAll());
		return mapping.findForward("form");
	}
	
	
	//---- Getters and Setters -----
	
	
	public RoleService getRoleService() {
		return roleService;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public MerchantService getMerchantService() {
		return merchantService;
	}
	public void setMerchantService(MerchantService merchantService) {
		this.merchantService = merchantService;
	}
	
}
