package com.demo.book.shop.dao;

import com.demo.book.shop.model.User;

public interface UserDAO {

  public User verifyUser(String username, String password);

  public User changePassword(User user, String password);

  public String searchPassword(String userName, String emailID);

  public boolean registerUser(User uesr);

  public boolean alreadyExistUserName(String userName);

  public boolean updateUserInfo(String userId, String emailID, long phone);

  public User getUserInfoByUserId(String userId);

}
