/*******************************************************
  * Copyright (C) 2004-2017 Exilant Technologies PVT LTD.
  * Email at <{glimpze@exilant.com}>
  *
  * This file is part of Jigyasa_Java_Server
  *
  * Jigyasa_Java_Server can not be copied and/or distributed without the express
  * permission of Exilant Technologies PVT Ltd (WWW.Exilant.com)
  * 27-Apr-2017
  * MySQLLoginRepository.java
  *
  *******************************************************/

package com.exilant.jigyasa.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.exilant.jigyasa.repository.LoginRepository;
import com.exilant.jigyasa.vo.Employee;

/**
 * @author lakshmi.bhat
 *
 */
@Repository
public class MySQLLoginRepository implements LoginRepository {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee getUserDetails(String userName) {
		String sql = "SELECT * FROM Employees WHERE Email_Id = ?";
		String mailId = userName;
		Employee employee = null;
		if (!mailId.contains("@exilant.com")) {
			mailId = mailId + "@exilant.com";
		}
//		Object[] queryParameters = new Object[] {mailId};
		try {
			//queryForObject(sql, null, new Object[] { mailId });
			employee = jdbcTemplate.queryForObject(sql, new Object[] { mailId },
					(rs, rowNum) -> new Employee(rs.getInt("Employee_Id"), rs.getString("Employee_Name"), rs.getString("Email_Id"),  rs.getString("Active").charAt(0),
							rs.getInt("Role_Id"), rs.getString("Contact_No"), rs.getInt("Manager_Id"),
							rs.getString("Designation")));
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
//		return user;
		return employee;
	}

}
