package com.demo.book.shop.model;

import java.io.Serializable;

public class User implements Serializable {

  private static final long serialVersionUID = 1L;
  String                    userID;
  String                    firstName;
  String                    lastName;
  String                    middleName;
  String                    emailID;
  long                      phone;
  String                    loginId;
  String                    userName;
  String                    password;
  String                    role;

  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @param userName
   *          the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * @return the userID
   */
  public String getUserID() {
    return userID;
  }

  /**
   * @param userID
   *          the userID to set
   */
  public void setUserID(String userID) {
    this.userID = userID;
  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName
   *          the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName
   *          the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the middleName
   */
  public String getMiddleName() {
    return middleName;
  }

  /**
   * @param middleName
   *          the middleName to set
   */
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * @return the emailID
   */
  public String getEmailID() {
    return emailID;
  }

  /**
   * @param emailID
   *          the emailID to set
   */
  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }

  /**
   * @return the phone
   */
  public long getPhone() {
    return phone;
  }

  /**
   * @param phone
   *          the phone to set
   */
  public void setPhone(long phone) {
    this.phone = phone;
  }

  /**
   * @return the loginId
   */
  public String getLoginId() {
    return loginId;
  }

  /**
   * @param loginId
   *          the loginId to set
   */
  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password
   *          the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the role
   */
  public String getRole() {
    return role;
  }

  /**
   * @param role
   *          the role to set
   */
  public void setRole(String role) {
    this.role = role;
  }

  /**
   * @param firstName
   * @param lastName
   * @param middleName
   * @param emailID
   * @param phone
   * @param loginId
   * @param userName
   * @param password
   * @param role
   */
  public User(String firstName, String lastName, String middleName, String emailID, long phone, String loginId, String userName, String password, String role) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.emailID = emailID;
    this.phone = phone;
    this.loginId = loginId;
    this.userName = userName;
    this.password = password;
    this.role = role;
  }

}
