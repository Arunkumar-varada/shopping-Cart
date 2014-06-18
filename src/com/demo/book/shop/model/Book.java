package com.demo.book.shop.model;

public class Book {
  private int    bookId;
  private String bookName;
  private String authorName;
  private String publication;
  private String edition;
  private double cost;
  private int    selectedNumberOfBooks;

  /**
   * @return the bookId
   */
  public int getBookId() {
    return bookId;
  }

  /**
   * @param bookId
   *          the bookId to set
   */
  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  /**
   * @return the bookName
   */
  public String getBookName() {
    return bookName;
  }

  /**
   * @param bookName
   *          the bookName to set
   */
  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  /**
   * @return the authorName
   */
  public String getAuthorName() {
    return authorName;
  }

  /**
   * @param authorName
   *          the authorName to set
   */
  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  /**
   * @return the publication
   */
  public String getPublication() {
    return publication;
  }

  /**
   * @param publication
   *          the publication to set
   */
  public void setPublication(String publication) {
    this.publication = publication;
  }

  /**
   * @return the edition
   */
  public String getEdition() {
    return edition;
  }

  /**
   * @param edition
   *          the edition to set
   */
  public void setEdition(String edition) {
    this.edition = edition;
  }

  /**
   * @return the cost
   */
  public double getCost() {
    return cost;
  }

  /**
   * @param cost
   *          the cost to set
   */
  public void setCost(double cost) {
    this.cost = cost;
  }

  /**
   * @return the selectedNumberOfBooks
   */
  public int getSelectedNumberOfBooks() {
    return selectedNumberOfBooks;
  }

  /**
   * @param selectedNumberOfBooks
   *          the selectedNumberOfBooks to set
   */
  public void setSelectedNumberOfBooks(int selectedNumberOfBooks) {
    this.selectedNumberOfBooks = selectedNumberOfBooks;
  }

  /**
   * @param bookName
   * @param authorName
   * @param publication
   * @param edition
   * @param cost
   */
  public Book(String bookName, String authorName, String publication, String edition, double cost) {
    this.bookName = bookName;
    this.authorName = authorName;
    this.publication = publication;
    this.edition = edition;
    this.cost = cost;
  }

}
