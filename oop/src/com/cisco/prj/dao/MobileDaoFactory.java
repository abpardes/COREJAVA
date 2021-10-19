package com.cisco.prj.dao;

import java.util.ResourceBundle;

public class MobileDaoFactory {
	private static String DAO = "";
	
	static {
		ResourceBundle res = ResourceBundle.getBundle("config");
		DAO = res.getString("MOBILE_DAO").trim();
	}
	
	public static MobileDao getMobileDao() {
//		return new MobileDaoMongoImpl();
		try {
			return (MobileDao) Class.forName(DAO).newInstance();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
