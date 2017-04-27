/*******************************************************
  * Copyright (C) 2004-2017 Exilant Technologies PVT LTD.
  * Email at <{glimpze@exilant.com}>
  *
  * This file is part of Jigyasa_Java_Server
  *
  * Jigyasa_Java_Server can not be copied and/or distributed without the express
  * permission of Exilant Technologies PVT Ltd (WWW.Exilant.com)
  * 27-Apr-2017
  * Employee.java
  *
  *******************************************************/

package com.exilant.jigyasa.vo;

/**
 * @author lakshmi.bhat
 *
 */
public class Employee {
private int employeeId;
private String employeeName;
private String emailId;
private char active;
private int roleId;
private String contactNo;
private int managerId;
private String designation;

public Employee() {}

public Employee(int employeeId, String employeeName, String emailId, char active, int roleId, String contactNo,
		int managerId, String designation) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.emailId = emailId;
	this.active = active;
	this.roleId = roleId;
	this.contactNo = contactNo;
	this.managerId = managerId;
	this.designation = designation;
}

/**
 * @return the employeeId
 */
public int getEmployeeId() {
	return employeeId;
}

/**
 * @param employeeId the employeeId to set
 */
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

/**
 * @return the employeeName
 */
public String getEmployeeName() {
	return employeeName;
}

/**
 * @param employeeName the employeeName to set
 */
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

/**
 * @return the emailId
 */
public String getEmailId() {
	return emailId;
}

/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

/**
 * @return the active
 */
public char getActive() {
	return active;
}

/**
 * @param active the active to set
 */
public void setActive(char active) {
	this.active = active;
}

/**
 * @return the roleId
 */
public int getRoleId() {
	return roleId;
}

/**
 * @param roleId the roleId to set
 */
public void setRoleId(int roleId) {
	this.roleId = roleId;
}

/**
 * @return the contactNo
 */
public String getContactNo() {
	return contactNo;
}

/**
 * @param contactNo the contactNo to set
 */
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}

/**
 * @return the managerId
 */
public int getManagerId() {
	return managerId;
}

/**
 * @param managerId the managerId to set
 */
public void setManagerId(int managerId) {
	this.managerId = managerId;
}

/**
 * @return the designation
 */
public String getDesignation() {
	return designation;
}

/**
 * @param designation the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
			+ ", active=" + active + ", roleId=" + roleId + ", contactNo=" + contactNo + ", managerId=" + managerId
			+ ", designation=" + designation + "]";
}


}
