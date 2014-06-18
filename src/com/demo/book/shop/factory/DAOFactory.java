package com.demo.book.shop.factory;

import com.demo.book.shop.dao.BookDAO;
import com.demo.book.shop.dao.OrderDAO;
import com.demo.book.shop.dao.UserDAO;

public class DAOFactory {
  private static UserDAO  userDAO  = null;
  private static BookDAO  bookDAO  = null;
  private static OrderDAO orderDAO = null;

  static
  {
    UserDAO userDAO = new JDBCUserDAO();
    BookDAO bookDAO = new JDBCBookDAO();
    OrderDAO orderDAO = new JDBCOrderDAO();
  }

  public static UserDAO getUserDAO() {
    return userDAO;
  }

  public static BookDAO getBookDAO() {
    return bookDAO;
  }

  public static OrderDAO getOrderDAO() {
    return orderDAO;
  }

}
