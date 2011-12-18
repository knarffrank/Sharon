package com.itsol.core.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.struts.action.ActionForm;

public class BaseModel extends ActionForm implements Serializable{
	private String id;
	private int version;
	private Date dateAdded;
	
	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	
	
}
