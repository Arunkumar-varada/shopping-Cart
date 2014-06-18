package com.demo.book.shop.dao;

import java.util.List;
import com.demo.book.shop.model.Book;

public interface BookDAO {

  public boolean addBook(Book book);

  public boolean alreadyExist(Book book);

  public List searchBook(Book book, int start, int numberOfBooks);

  public int getTotalNumberOfBook(Book book);

  public boolean deleteBook(int bookId);

  public Book getBookById(String bookId);

}
