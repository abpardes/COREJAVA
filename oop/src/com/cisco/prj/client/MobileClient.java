package com.cisco.prj.client;

import com.cisco.prj.dao.MobileDao;
import com.cisco.prj.dao.MobileDaoFactory;
import com.cisco.prj.entity.Mobile;

public class MobileClient {

	public static void main(String[] args) {
//		MobileDao mobileDao = new MobileDaoMongoImpl();
		MobileDao mobileDao = MobileDaoFactory.getMobileDao();
		Mobile m = new Mobile();
		mobileDao.addMobile(m);
	}

}

