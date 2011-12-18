package com.itsol.back.model;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.itsol.core.model.BaseModel;

public class Role extends BaseModel{

	private String name;
	private String desc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	//-- Validation --
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors actionErrors = new ActionErrors();

		if("".equals(name) || "".equals(desc)){
			actionErrors.add("Role", new ActionMessage("Role-All-Fields-Required"));
		}
		
		return actionErrors;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
	}
	
}
