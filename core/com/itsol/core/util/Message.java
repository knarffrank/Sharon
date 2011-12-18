package com.itsol.core.util;

import org.apache.struts.util.MessageResources;

public class Message {
	private static MessageResources messages =
		  MessageResources.getMessageResources( "com/itsol/back/resource/AppResource");
	public static String get(String key){
		return messages.getMessage(key);
	}
}
