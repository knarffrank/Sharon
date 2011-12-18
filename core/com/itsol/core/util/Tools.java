package com.itsol.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Tools {
	public static String md5(String string){
		StringBuffer hexString = null;
		byte[] bytes = string.getBytes();
		try {
			MessageDigest alg = MessageDigest.getInstance("MD5");
			alg.reset();
			alg.update(bytes);
			byte digest[] = alg.digest();
			hexString = new StringBuffer();
		    for (int i=0;i<digest.length;i++) {
		    	String hex = Integer.toHexString(0xFF & digest[i]); 
		    	if(hex.length()==1){
		    		hexString.append('0');
		    	}		
		    	hexString.append(hex);
		     }
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hexString.toString();
	}
	public static byte[] imageToByte(String path){
		File file = new File(path);
		byte[] bFile = new byte[(int) file.length()];
        try {
        	FileInputStream fileInputStream = new FileInputStream(file);
        	fileInputStream.read(bFile);
        	fileInputStream.close();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return bFile;
	}
	
	public static String getUUID(){
		return UUID.randomUUID().toString();
	}
	public static void close(Connection conn, Statement st){
    	try {
    		if(conn != null){
			conn.close();
    		}
    		if(st != null){
    			st.close();
        	}
    		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public static List<String> outputResultSet(ResultSet rs) throws Exception{
    	List<String> list = new ArrayList<String>();
	    ResultSetMetaData metadata = rs.getMetaData();
	    int numcols = metadata.getColumnCount();
	    for (int i = 0; i < numcols; i++) {
	        list.add(metadata.getColumnLabel(i + 1));
	    }
	    return list;
    }
}
