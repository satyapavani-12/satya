package com.whatsupp.service;

import com.whatsupp.dao.WhatsuppDAO;
import com.whatsupp.dao.WhatsuppDAOInterface;
import com.whatsupp.entity.WhatsuppEmployee;

public class WhatsuppService implements WhatsuppServiceInterface
{
	private WhatsuppService() {}

	public static WhatsuppServiceInterface createServiceObject() {
		// TODO Auto-generated method stub
		return new  WhatsuppService();
	}

	public int createProfile(WhatsuppEmployee wt)
	{
		WhatsuppDAOInterface wd=WhatsuppDAO.createDaoObject();
		return wd.createProfileDAO(wt);
	}

}
