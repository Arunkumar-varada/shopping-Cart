package com.demo.book.shop.delegate;

import java.util.List;

import com.demo.book.shop.dao.OrderDAO;
import com.demo.book.shop.factory.DAOFactory;
import com.demo.book.shop.model.Order;

public class OrderDelegate {
  public static OrderDAO orderDAO = null;
  static
  {
    orderDAO = DAOFactory.getOrderDAO();
  }

  public static String placeOrder(Order order, String ip)
  {
    return orderDAO.placeOrder(order, ip);
  }

  public static List getOrderByUserId(String userId) {
    return orderDAO.getOrderByUserId(userId);
  }

  public static List getAllOrderInfo()
  {
    return orderDAO.getAllOrderInfo();
  }

  public static void updateStatus(String orderId, String status) {
    orderDAO.updateStatus(orderId, status);
  }

  public static Order getOrderByOrderId(String orderId) {
    return orderDAO.getOrderByOrderId(orderId);
  }
}
