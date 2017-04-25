package com.diffblue.javatest;

public class Calc {
  static int div(int a, int b) {
    return a / b;
  }

  static int calc(String str)
  {
    if (str.contains("-")) {
      String[] arr = str.split("-", 1);
      return calc(arr[0]) - calc(arr[1]);
    }

    if (str.contains("+")) {
      String[] arr = str.split("+", 1);
      return calc(arr[0]) + calc(arr[1]);
    }

    if (str.contains("*")) {
      String[] arr = str.split("*", 1);
      return calc(arr[0]) * calc(arr[1]);
    }

    if (str.contains("/")) {
      String[] arr = str.split("/", 1);
      return calc(arr[0]) / calc(arr[1]);
    }

    return new Integer(str);
  }
}
