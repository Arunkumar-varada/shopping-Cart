package com.demo.book.shop.model;

import java.util.Set;

public class Order {
  private String orderId;
  private String address;
  private String street;
  private String city;
  private String state;
  private String zip;
  private String cardNo;
  private String expDate;
  private double totalAmount;
  private int totalItem;
  private String userId;
  private String orderDate;
  private int orderItemId;
  private Set orderItemList;
  private String status;
  /**
   * @return the orderId
   */
  public String getOrderId() {
    return orderId;
  }
  /**
   * @param orderId the orderId to set
   */
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }
  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }
  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }
  /**
   * @return the street
   */
  public String getStreet() {
    return street;
  }
  /**
   * @param street the street to set
   */
  public void setStreet(String street) {
    this.street = street;
  }
  /**
   * @return the city
   */
  public String getCity() {
    return city;
  }
  /**
   * @param city the city to set
   */
  public void setCity(String city) {
    this.city = city;
  }
  /**
   * @return the state
   */
  public String getState() {
    return state;
  }
  /**
   * @param state the state to set
   */
  public void setState(String state) {
    this.state = state;
  }
  /**
   * @return the zip
   */
  public String getZip() {
    return zip;
  }
  /**
   * @param zip the zip to set
   */
  public void setZip(String zip) {
    this.zip = zip;
  }
  /**
   * @return the cardNo
   */
  public String getCardNo() {
    return cardNo;
  }
  /**
   * @param cardNo the cardNo to set
   */
  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }
  /**
   * @return the expDate
   */
  public String getExpDate() {
    return expDate;
  }
  /**
   * @param expDate the expDate to set
   */
  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }
  /**
   * @return the totalAmount
   */
  public double getTotalAmount() {
    return totalAmount;
  }
  /**
   * @param totalAmount the totalAmount to set
   */
  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }
  /**
   * @return the totalItem
   */
  public int getTotalItem() {
    return totalItem;
  }
  /**
   * @param totalItem the totalItem to set
   */
  public void setTotalItem(int totalItem) {
    this.totalItem = totalItem;
  }
  /**
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }
  /**
   * @param userId the userId to set
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }
  /**
   * @return the orderDate
   */
  public String getOrderDate() {
    return orderDate;
  }
  /**
   * @param orderDate the orderDate to set
   */
  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }
  /**
   * @return the orderItemId
   */
  public int getOrderItemId() {
    return orderItemId;
  }
  /**
   * @param orderItemId the orderItemId to set
   */
  public void setOrderItemId(int orderItemId) {
    this.orderItemId = orderItemId;
  }
  /**
   * @return the orderItemList
   */
  public Set getOrderItemList() {
    return orderItemList;
  }
  /**
   * @param orderItemList the orderItemList to set
   */
  public void setOrderItemList(Set orderItemList) {
    this.orderItemList = orderItemList;
  }
  /**
   * @return the status
   */
  public String getStatus() {
    return status;
  }
  /**
   * @param status the status to set
   */
  public void setStatus(String status) {
    this.status = status;
  }
  /**
   * @param orderId
   * @param address
   * @param street
   * @param city
   * @param state
   * @param zip
   * @param cardNo
   * @param expDate
   * @param totalAmount
   * @param totalItem
   * @param userId
   * @param orderDate
   * @param orderItemId
   * @param orderItemList
   * @param status
   */
  public Order(String orderId, String address, String street, String city, String state, String zip, String cardNo, String expDate, double totalAmount, int totalItem, String userId,
      String orderDate, int orderItemId, Set orderItemList, String status) {
    this.orderId = orderId;
    this.address = address;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.cardNo = cardNo;
    this.expDate = expDate;
    this.totalAmount = totalAmount;
    this.totalItem = totalItem;
    this.userId = userId;
    this.orderDate = orderDate;
    this.orderItemId = orderItemId;
    this.orderItemList = orderItemList;
    this.status = status;
  }
  
  

}
