package com.diffblue.javatest;

public class StringStuff {

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