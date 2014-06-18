package com.demo.book.shop.delegate;

import java.util.List;

import com.demo.book.shop.dao.BookDAO;
import com.demo.book.shop.factory.DAOFactory;
import com.demo.book.shop.model.Book;

public class BookDelegate {
  private static BookDAO bookDAO = null;

  static
  {
    bookDAO = DAOFactory.getBookDAO();
  }

  public static boolean addBook(Book book)
  {
    return bookDAO.addBook(book);
  }

  public static boolean alreadyExist(Book book) {
    return bookDAO.alreadyExist(book);
  }

  public static List searchBook(Book book, int start, int numberOfBooks) {
    return bookDAO.searchBook(book, start, numberOfBooks);
  }

  public static int getTotalNumberOfBooks(Book book) {
    return bookDAO.getTotalNumberOfBook(book);
  }

  public static boolean deleteBook(int bookId) {
    return bookDAO.deleteBook(bookId);
  }

  public static Book getBookById(String bookId) {
    return bookDAO.getBookById(bookId);
  }
}
