/*******************************************************
  * Copyright (C) 2004-2017 Exilant Technologies PVT LTD.
  * Email at <{glimpze@exilant.com}>
  *
  * This file is part of Jigyasa_Java_Server
  *
  * Jigyasa_Java_Server can not be copied and/or distributed without the express
  * permission of Exilant Technologies PVT Ltd (WWW.Exilant.com)
  * 27-Apr-2017
  * LoginControllerImpl.java
  *
  *******************************************************/

package com.exilant.jigyasa.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exilant.jigyasa.controller.LoginController;
import com.exilant.jigyasa.service.LoginService;
import com.exilant.jigyasa.vo.Employee;
import com.exilant.jigyasa.vo.User;

/**
 * @author lakshmi.bhat
 *
 */
@RestController
@CrossOrigin
public class LoginControllerImpl implements LoginController {

	@Autowired
	LoginService loginService;

	@Override
	@RequestMapping(value = "/Login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> login(@RequestBody User user) throws Exception {
		Employee validEmployee = loginService.loginService(user.getUserName());
		System.out.println("*********" +validEmployee+ "*********");

		if (validEmployee == null) {
			return ResponseEntity.badRequest().body("No Employee found with UserName: " + user.getUserName());
		}
		return new ResponseEntity<Employee>(validEmployee, HttpStatus.OK);
	}
}
