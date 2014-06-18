package com.demo.book.shop.util;

import java.text.DecimalFormat;

public class DoubleFormatter {
  public static String formatDouble(String value) {
    String retVal = "";
    double d = Double.parseDouble(value);
    DecimalFormat twoDform = new DecimalFormat("0.0");
    double d1 = Double.parseDouble(twoDform.format(d));
    retVal = d1 + "0";
    return retVal;
  }
}
