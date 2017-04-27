/*******************************************************
  * Copyright (C) 2004-2017 Exilant Technologies PVT LTD.
  * Email at <{glimpze@exilant.com}>
  *
  * This file is part of Jigyasa_Java_Server
  *
  * Jigyasa_Java_Server can not be copied and/or distributed without the express
  * permission of Exilant Technologies PVT Ltd (WWW.Exilant.com)
  * 27-Apr-2017
  * LoginRepository.java
  *
  *******************************************************/

package com.exilant.jigyasa.repository;

import com.exilant.jigyasa.vo.Employee;

/**
 * @author lakshmi.bhat
 *
 */
public interface LoginRepository {
	Employee getUserDetails(String userName);
}
