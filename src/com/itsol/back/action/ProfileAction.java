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

import com.itsol.back.model.Profile;
import com.itsol.back.service.ProfileService;
import com.itsol.back.service.RoleService;
import com.itsol.core.action.BaseAction;
import com.itsol.exception.ProfileExistException;

public class ProfileAction extends BaseAction{
	private ProfileService profileService;
	private RoleService roleService;
	
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
		Profile profile = (Profile) form;
		profile.setRole(roleService.findById(profile.getRoleId()));
		ActionErrors actionErrors = new ActionErrors();
		try{
			profileService.save(profile);
		}catch(ProfileExistException p){
			actionErrors.add("Profile", new ActionMessage("Profile-Already-Exist"));
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
	public ProfileService getProfileService() {
		return profileService;
	}
	public void setProfileService(ProfileService profileService) {
		this.profileService = profileService;
	}
	
	public RoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
}
