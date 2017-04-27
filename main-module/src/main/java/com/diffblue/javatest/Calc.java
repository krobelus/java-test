package com.diffblue.javatest;

public class Calc {
  static int div(int a, int b) {
    return a / b;
  }

  static int calc(String str)
  {
    int index, index2;

    // Replace parenthesized expressions with their calculated value and recurse
    index = str.lastIndexOf("(");
    if (index != -1) {
      index2 = str.indexOf(")", index);
      return calc(str.substring(0,index) + Integer.toString(calc(str.substring(index + 1, index2 - 1))) + str.substring(index + 1));
    }

    index = str.lastIndexOf('+');
    if (index != -1) {
      return calc(str.substring(0,index)) + calc(str.substring(index + 1));
    }

    index = str.lastIndexOf('-');
    if (index != -1) {
      return calc(str.substring(0,index)) - calc(str.substring(index + 1));
    }

    index = str.lastIndexOf('/');
    if (index != -1) {
      return calc(str.substring(0,index)) / calc(str.substring(index + 1));
    }

    index = str.lastIndexOf('*');
    if (index != -1) {
      return calc(str.substring(0,index)) * calc(str.substring(index + 1));
    }

    return Integer.parseInt(str);
  }
}
