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

import com.itsol.back.model.Role;
import com.itsol.back.service.RoleService;
import com.itsol.core.action.BaseAction;
import com.itsol.exception.RoleExistException;

public class RoleAction extends BaseAction{
	private RoleService roleService;
	
	public RoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
		Role role = (Role)form;
		ActionErrors actionErrors = new ActionErrors();
		try{
			roleService.save(role);
		}catch(RoleExistException e){
			actionErrors.add("Role", new ActionMessage("Role-Already-Exist"));
			saveErrors(req, actionErrors);
			return mapping.findForward("error");
		}
		return mapping.findForward("base-ack");
	}
	public ActionForward form(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
		return mapping.findForward("form");
	}
}
