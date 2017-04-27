/*******************************************************
  * Copyright (C) 2004-2017 Exilant Technologies PVT LTD.
  * Email at <{glimpze@exilant.com}>
  *
  * This file is part of Jigyasa_Java_Server
  *
  * Jigyasa_Java_Server can not be copied and/or distributed without the express
  * permission of Exilant Technologies PVT Ltd (WWW.Exilant.com)
  * 27-Apr-2017
  * LoginServiceImpl.java
  *
  *******************************************************/

package com.exilant.jigyasa.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exilant.jigyasa.repository.LoginRepository;
import com.exilant.jigyasa.service.LoginService;
import com.exilant.jigyasa.vo.Employee;

/**
 * @author lakshmi.bhat
 *
 */
@Service
public class LoginServiceImpl implements LoginService{

	static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);	
	
	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public Employee loginService(String userName) {
		Employee employee = loginRepository.getUserDetails(userName);
		return employee;
	}

}
