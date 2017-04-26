package com.diffblue.javatest;

import java.io.PrintStream;
import java.util.Locale;

public class StringStuff {

  public static String classGetNameExample(Class c) {
    StringStuff t = new StringStuff();
    Class testClass = t.getClass();
    if (c.getName().equals(testClass.getName()))
      return c.getName();
    return "X";
  }

  public static String classGetSimpleNameExample(Class c) {
    StringStuff t = new StringStuff();
    Class testClass = t.getClass();
    if (c.getName().equals(testClass.getName()))
      return c.getSimpleName();
    return "X";
  }

  public static int integerParseIntExample(String s) {
    int i = Integer.parseInt(s);
    if (i == 4)
      return i;
    else if (i == -10)
      return i;
    else
      return i;
  }

  public static String objectToStringExample(int i) {
    Object obj;
    if (i == 1)
      obj = new Integer(1);
    else if (i == 2)
      obj = new String("2");
    else
      obj = new StringBuilder("3");
    return obj.toString();
  }

  public static void printStreamExample(String s) {
    PrintStream ps = new PrintStream(System.out);
    ps.println(s);
  }

  public static StringBuffer stringBufferAppendExample(String s) {
    StringBuffer sb = new StringBuffer();
    sb.append(s);
    sb.append("=");
    sb.append(s);
    return sb;
  }

  public static StringBuilder stringBuilderAppendExample(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append(s);
    sb.append("=");
    sb.append(s);
    return sb;
  }

  public static int stringBuilderAppend2Example(StringBuilder sb) {
    sb.append("!");
    int size = sb.toString().length();

    if (size >= 3) {
      return 3;
    } else
      return 0;
  }

  public static String stringBuilderAppend3Example(String s) {
    StringBuilder sb = new StringBuilder();
    sb.append(s);
    sb.append("=");
    sb.append(s);
    String ret = sb.toString();
    return ret;
  }

  public static String stringBuilderAppendCExample(char c) {
    StringBuilder sb = new StringBuilder();
    sb.append(c);
    sb.append('=');
    sb.append(c);
    return sb.toString();
  }

  public static String stringBuilderAppendDExample(double i) {
    StringBuilder sb = new StringBuilder();
    sb.append(i);
    sb.append("=");
    sb.append(i);
    return sb.toString();
  }

  public static String stringBuilderAppendFExample(float f) {
    StringBuilder sb = new StringBuilder();
    sb.append("XYZ");
    sb.append(f);
    return sb.toString();
  }

  public static String stringBuilderAppendIExample(int i) {
    StringBuilder sb = new StringBuilder();
    sb.append(i);
    sb.append("=");
    sb.append(i);
    return sb.toString();
  }

  public static String stringBuilderAppendJExample(long l) {
    StringBuilder sb = new StringBuilder();
    sb.append("x");
    sb.append(l);
    return sb.toString();
  }

  public static int stringBuilderAppendJ2Example(long l) {
    StringBuilder sb = new StringBuilder();
    sb.append(l);
    if (l <= 1000L)
      return 2;
    else
      return 1;
  }

  public static String stringBuilderAppendObjectExample(Object obj) {
    StringBuilder sb = new StringBuilder();
    sb.append(obj);
    sb.append("=");
    sb.append(obj);
    return sb.toString();
  }

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
  // Test name 

  public static int stringLengthExample(String s) {
    if (s.length() == 2)
      return 2;
    if (s.length() == 4)
      return 4;
    return s.length() + 1;
  }
  // Test name 

  public static int stringStartsWithExample(String s) {
    if (s.startsWith("hel")) {
      return 1;
    }
    return 2;
  }
  // Test name 

  public static int stringStartsWith2Example(String s) {
    if (s.startsWith("hello")) {
      if (s.length() == 10)
        return 0;
      else
        return 1;
    }
    if (s.startsWith("hel"))
      return 2;
    else
      return 3;
  }
  // Test name 

  public static String stringSubstringIIExample(String s) {
    if (s.length() <= 10)
      return s;
    else
      return s.substring(2, 5);
  }
  // Test name 

  public static char[] stringToCharArrayExample(String s) {
    assert (s.length() >= 2);
    return s.toCharArray();
  }
  // Test name 

  static int stringToLowerCaseExample(String s) {
    if (s.equals("abc"))
      return 0;

    String a = s.toLowerCase();
    if (a.equals("abc"))
      return 1;

    return 2;
  }
  // Test name 

  public static String stringTrimExample(String s) {
    String t = s.trim();
    if (t.length() == s.length() - 3)
      return t;
    else
      return s;
  }

  public static int checkHtml(String s) {
    int p = s.indexOf('<');
    if (s.length() > 30)
      return -1; // we want a short example

    if (p == -1)
      return 0;

    if (!s.startsWith("<html>", p))
      return 0;

    int q = s.lastIndexOf('<');

    if (q == -1)
      return 0;

    if (s.startsWith("</html>", q)) {
      assert (false);
      return 1;
    } else{
      return 0;}
  }

  public static int checkHtml2(String s) {
    if (s.length() > 30)
      return -1; // we want a short example

    String t = s.trim();

    if (!t.startsWith("<html>"))
      return 0;

    if (!t.endsWith("</html>"))
      return 0;

    return 1;
  }
}