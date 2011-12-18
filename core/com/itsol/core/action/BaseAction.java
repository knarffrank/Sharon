package com.itsol.core.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.springframework.web.struts.DispatchActionSupport;

public class BaseAction extends DispatchActionSupport{
	protected void addMessage(HttpServletRequest req, String str){
		ActionMessages messages = new ActionMessages();
		ActionMessage msg = new ActionMessage(str);
		messages.add("msg",msg);
		saveMessages(req, messages);
	}
	protected void addErrorMessage(HttpServletRequest req, String str){
		ActionErrors e = new ActionErrors();
		e.add(str,new ActionMessage(str));
		super.saveErrors(req, e);
	}
}
