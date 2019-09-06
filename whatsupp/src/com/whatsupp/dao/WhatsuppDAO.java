package com.whatsupp.dao;

import com.whatsupp.entity.WhatsuppEmployee;

public class WhatsuppDAO implements WhatsuppDAOInterface
{
	private WhatsuppDAO() {}
	public static WhatsuppDAOInterface createDaoObject() {
		// TODO Auto-generated method stub
		return new WhatsuppDAO();
	}
	@Override
	public int createProfileDAO(WhatsuppEmployee wt) {
		// TODO Auto-generated method stub
		return 1;
	}

}
