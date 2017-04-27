package com.diffblue.javatest;

public class Calc {
  static int div(int a, int b) {
    return a / b;
  }

  static int calc(String str)
  {
    int index;
    index = str.indexOf("-");
    if (index != -1) {
      return calc(str.substring(0,index - 1)) - calc(str.substring(index + 1));
    }

    index = str.indexOf("+");
    if (index != -1) {
      return calc(str.substring(0,index - 1)) + calc(str.substring(index + 1));
    }

    index = str.indexOf("*");
    if (index != -1) {
      return calc(str.substring(0,index - 1)) * calc(str.substring(index + 1));
    }

    index = str.indexOf("/");
    if (index != -1) {
      return calc(str.substring(0,index - 1)) / calc(str.substring(index + 1));
    }

    return Integer.parseInt(str);
  }
}
