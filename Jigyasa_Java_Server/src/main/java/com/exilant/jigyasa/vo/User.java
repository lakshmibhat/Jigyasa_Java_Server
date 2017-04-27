/*******************************************************
  * Copyright (C) 2004-2017 Exilant Technologies PVT LTD.
  * Email at <{glimpze@exilant.com}>
  *
  * This file is part of Jigyasa_Java_Server
  *
  * Jigyasa_Java_Server can not be copied and/or distributed without the express
  * permission of Exilant Technologies PVT Ltd (WWW.Exilant.com)
  * 27-Apr-2017
  * User.java
  *
  *******************************************************/

package com.exilant.jigyasa.vo;

/**
 * @author lakshmi.bhat
 *
 */
public class User {
private String userName;
private String password;


public User() {}

public User(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
/**
 * @return the userName
 */
public String getUserName() {
	return userName;
}
/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [userName=" + userName + ", password=" + password + "]";
}


}
