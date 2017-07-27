package com.diffblue.javatest;

public class Main {
  /**
   * Takes two strings, converts them to integers and divides them.
   */
  void divide(String string1, String string2) {
    int number1 = Integer.parseInt(string1);
    int number2 = Integer.parseInt(string2);
    if (number2 != 0) {
      int result = new Calc().div(number1, number2);
      System.out.println("" + result);
    } else
      System.out.println("Second argument must not be zero");
    }
  }

  /**
   * Divides two numbers recieved from the command line.
   */
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Two arguments required");
      return;
    }

    new Main().divide(args[0], args[1]);
  }
}
