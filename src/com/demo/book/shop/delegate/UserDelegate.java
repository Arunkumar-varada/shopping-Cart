package com.demo.book.shop.delegate;

import com.demo.book.shop.dao.UserDAO;
import com.demo.book.shop.factory.DAOFactory;
import com.demo.book.shop.model.User;

public class UserDelegate {
  public static UserDAO userDAO = null;
  static
  {
    userDAO = DAOFactory.getUserDAO();
  }

  public static User verifyUser(String username, String password) {
    return userDAO.verifyUser(username, password);
  }

  public static User changePassword(User user, String password) {
    return userDAO.changePassword(user, password);
  }

  public static String searchPassword(String userName, String emailID) {
    return userDAO.searchPassword(userName, emailID);
  }

  public static boolean registeruser(User user) {
    return userDAO.registerUser(user);
  }

  public static boolean alreadyExist(String userName) {
    return userDAO.alreadyExistUserName(userName);
  }

  public static boolean updateUserInfo(String userId, String emailID, long phone) {
    return userDAO.updateUserInfo(userId, emailID, phone);
  }

  public static User getUserInfoById(String userId) {
    return userDAO.getUserInfoByUserId(userId);
  }
}
