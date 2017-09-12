package com.diffblue.javatest;

import com.diffblue.javatest.exceptions.DivideByZeroException;
import com.diffblue.javatest.exceptions.ChildException;

public class Exceptions {

  public static int divideByZeroException(final int x) throws DivideByZeroException {
    if (x == 0) {
      throw new DivideByZeroException();
    }
    return 1 / x;
  }

  public static void nullPointerException() {
    throw new NullPointerException();
  }

  public static boolean catchException(final int x) {
    try {
      Exception exception = new Exception();
      if (x > 10) {
        throw exception;
      }
    }
    catch(Exception exception) {
      return true;
    }

    return false;
  }

  public static boolean catchParentException(String args[]) {
    try {
      ChildException b = new ChildException();
      throw b;
    }
    catch(Exception exc) {
      return true;
    }
  }
}
