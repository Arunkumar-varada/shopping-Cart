package com.demo.book.shop.dao;

import java.util.List;
import com.demo.book.shop.model.Order;


public interface OrderDAO {
  public String placeOrder(Order orderTo, String ip);

  public List getOrderByUserId(String userId);

  public List getAllOrderInfo();

  public void updateStatus(String orderId, String status);

  public Order getOrderByOrderId(String orderId);
}
