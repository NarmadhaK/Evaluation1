package com.bluemaple.service;



import com.bluemaple.dto.GetSetLogin;
import com.bluemaple.dto.GetSetMovie;
import com.bluemaple.dto.GetSetRegister;

public interface Serviceinterface {

	public GetSetLogin getLog(GetSetLogin log);

	public GetSetRegister getReg(GetSetRegister reg);

	public GetSetMovie getMov(GetSetMovie mov);

}
