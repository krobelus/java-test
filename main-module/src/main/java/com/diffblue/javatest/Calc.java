package com.diffblue.javatest;

public class Calc {
  static int div(int a, int b) {
    return a / b;
  }

  public static int calc(String str)
  {
    int index;

    index = str.lastIndexOf('+');
    if (index != -1) {
      return calc(str.substring(0,index)) + calc(str.substring(index + 1));
    }

    // index = str.lastIndexOf('-');
    // if (index != -1) {
    //   return calc(str.substring(0,index)) - calc(str.substring(index + 1));
    // }

    // index = str.lastIndexOf('/');
    // if (index != -1) {
    //   return calc(str.substring(0,index)) / calc(str.substring(index + 1));
    // }

    // index = str.lastIndexOf('*');
    // if (index != -1) {
    //   return calc(str.substring(0,index)) * calc(str.substring(index + 1));
    // }

    return myParseInt(str);
  }

  public static int myParseInt(String str) {
    assert(str.length() != 0);
    int result = 0;
    for (int pos = 0; pos < str.length(); pos++) {
      char chr = str.charAt(pos);
      assert(chr >= '0' && chr <= '9');
      result = 10 * result + (chr & 0xf);
    }
    return result;
  }
}
