package com.bluemaple.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.DAO.Daoclass;
import com.bluemaple.dto.GetSetLogin;
import com.bluemaple.dto.GetSetMovie;
import com.bluemaple.dto.GetSetRegister;

@Service
public  class Servicej implements Serviceinterface {
	
	@Autowired
	private Daoclass dao;

	public GetSetRegister getReg(GetSetRegister reg)
	{
		return dao.getReg(reg);
	}
	public GetSetLogin getLog(GetSetLogin log)
	{
		return dao.getLog(log);
	}
	public GetSetMovie getMov(GetSetMovie mov)
	{
		return dao.getMov(mov);
	}
	
}
