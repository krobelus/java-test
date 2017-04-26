package com.diffblue.javatest;

import java.util.Locale;

public class StringStuff {

  public static StringBuilder stringBuilderAppendZExample(Boolean x) {
    StringBuilder sb = new StringBuilder();
    if (x)
      sb.append(x);
    else
      sb.append(x);
    return sb;
  }

  public static StringBuilder stringBuilderInitExample(int i) {
    StringBuilder sb = new StringBuilder();
    return sb;
  }

  public static int stringBuilderLengthExample(StringBuilder s) {
    if (s.length() == 0)
      return 0;
    if (s.length() == 1)
      return 1;
    return s.length() + 1;
  }

  public static int stringBuilderToStringExample(StringBuilder sb) {
    String s = sb.toString();
    if (s.equals("case1"))
      return 1;
    else
      return 2;
  }

  public static char stringCharAtExample(String s) {
    if (s.length() <= 3)
      return '0';
    if (s.charAt(1) == 'a')
      return 'A';
    else if (s.charAt(2) == 'b')
      return 'B';
    else
      return s.charAt(0);
  }

  public static int stringContainsExample(String s) {
    if (s.contains("hello"))
      return 0;
    else if (s.contains("he"))
      return 1;
    return 2;
  }

  public static int stringEndsWithExample(String s) {
    if (s.endsWith("hello")) {
      if (s.length() == 10)
        return 0;
      else
        return 1;
    }
    if (s.endsWith("hel"))
      return 2;
    else
      return 3;
  }

  public static int stringEqualsExample(String s) {
    Object x = new String("x");
    if (s.equals(x))
      return 1;
    else
      return 2;
  }

  static int stringEqualsIgnoreCaseExample(String s) {
    String a = new String(s);
    if (a.equals("ABccDe"))
      return 0;
    if (a.equalsIgnoreCase("ABccDe"))
      return 1;
    return 2;
  }

  public static String stringFormatLocaleExample(String s) {
    assert (s.length() >= 2);
    String r = String.format(Locale.US, "Hello %s !", s);
    return r;
  }

  public static Boolean stringHashCodeExample(String s) {
    String t = "hello";
    if (s.hashCode() == t.hashCode())
      return true;
    else
      return false;
  }

  public static int stringIndexOfExample(String s) {
    int i = s.indexOf("hello");
    if (i == 0)
      return 0;
    else if (i > 0)
      return 1;
    else
      return -1;
  }
}