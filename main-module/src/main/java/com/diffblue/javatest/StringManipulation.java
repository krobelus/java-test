package com.diffblue.javatest;

import java.io.PrintStream;
import java.util.Locale;

public class StringManipulation {

  /**
   * Checks if a class's name matches the this class.
   */
  public static Boolean checkClassName(Class testClass) {
    StringManipulation stringManipulation = new StringManipulation();
    Class expectedClass = stringManipulation.getClass();
    if (testClass.getName().equals(expectedClass.getName())) {
      return true;
    }
    return false;
  }

  /**
   * Checks if a class's name matches the this class,
   * then returns the simple name of the class, otherwise returns "".
   */
  public static String classGetSimpleName(Class testClass) {
    StringManipulation stringManipulation = new StringManipulation();
    Class expectedClass = stringManipulation.getClass();
    if (testClass.getName().equals(expectedClass.getName())) {
      return testClass.getSimpleName();
    }
    return "";
  }

  /**
   * Parses an integer from a string, limiting it to a maximum of 10.
   */
  public static int parseIntegerWithLimit(String string) {
    int integer = Integer.parseInt(string);
    if (integer > 10) {
      return 10;
    }
    return integer;
  }

  /**
   * Calls the toString method on different objects,
   * depending on the integer passed.
   * - 1 uses an Integer
   * - 2 uses a String
   * - 3 or higher uses a StringBuilder
   */
  public static String objectToString(int integer) {
    Object object;
    if (integer == 1) {
      object = new Integer(1);
    } else if (integer == 2) {
      object = new String("2");
    } else {
      object = new StringBuilder("3");
    }
    return object.toString();
  }

  /**
   * Converts an object to a string with an "Object:" prefix.
   */
  public static String objectToString(Object obj) {
    StringBuilder sb = new StringBuilder();
    sb.append("Object:");
    sb.append(obj);
    return sb.toString();
  }

  /**
   * Prints a string to a the system using a print stream.
   */
  public static void printStreamString(String string) {
    PrintStream stream = new PrintStream(System.out);
    stream.println(string);
  }

  /**
   * Returns a new string with the input string twice, separated by "=".
   */
  public static String duplicateString(String string) {
    StringBuilder builder = new StringBuilder();
    builder.append(string);
    builder.append("=");
    builder.append(string);
    return builder.toString();
  }

  /**
   * Returns a new string buffer with the input string twice, separated by "=".
   */
  public static StringBuffer duplicateStringToStringBuffer(String string) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(string);
    buffer.append("=");
    buffer.append(string);
    return buffer;
  }

  /**
   * Returns a new string builder with the input string twice, separated by "=".
   */
  public static StringBuilder duplicateStringToStringBuilder(String string) {
    StringBuilder builder = new StringBuilder();
    builder.append(string);
    builder.append("=");
    builder.append(string);
    return builder;
  }

  /**
   * Appends an question mark to the end of a string builder string.
   */
  public static StringBuilder convertToQuestion(StringBuilder builder) {
    builder.append("?");
    return builder;
  }

  /**
   * Converts a double to a string and prepends a "$" character.
   */
  public static String convertToCurrency(double number) {
    StringBuilder builder = new StringBuilder();
    builder.append("$");
    builder.append(number);
    return builder.toString();
  }

  /**
   * Converts a float to a string and prepends a "$" character.
   */
  public static String convertToCurrency(float number) {
    StringBuilder builder = new StringBuilder();
    builder.append("$");
    builder.append(number);
    return builder.toString();
  }

  /**
   * Converts an integer to a string and prepends a "$" character.
   */
  public static String convertToCurrency(int number) {
    StringBuilder builder = new StringBuilder();
    builder.append("$");
    builder.append(number);
    return builder.toString();
  }

  /**
   * Converts a long to a string and prepends a "$" character.
   */
  public static String convertToCurrency(long number) {
    StringBuilder builder = new StringBuilder();
    builder.append("$");
    builder.append(number);
    return builder.toString();
  }

  /**
   * Returns an empty string.
   */
  public static String emptyString() {
    StringBuilder builder = new StringBuilder();
    return builder.toString();
  }

  /**
   * Checks if a string builder has length 2.
   */
  public static boolean checkStringBuilderLength(StringBuilder builder) {
    if (builder.length() == 2) {
      return true;
    }
    return false;
  }

  /**
   * Checks if a string is equal to "abc" using charAt.
   */
  public static boolean stringEqualsWithCharAt(String string) {
    if (string.length() != 3) {
      return false;
    }

    if (string.charAt(0) != 'a') {
      return false;
    }
    if (string.charAt(1) != 'b') {
      return false;
    }
    if (string.charAt(2) != 'c') {
      return false;
    }
    return true;
  }

  /**
   * Checks if a string contains "test".
   */
  public static boolean stringContainsTest(String string) {
    if (string.contains("test")) {
      return true;
    }
    return false;
  }

  /**
   * Checks if a string ends with "test" (but it must not be just "test").
   */
  public static boolean stringEndsWithTest(String string) {
    if (string.length() > 4) {
      if (string.endsWith("test")) {
        return true;
      }
    }
    return false;
  }

  /**
   * Checks if a string equals "test".
   */
  public static boolean stringEqualsExample(String string) {
    Object expected = new String("test");
    return string.equals(expected);
  }

  /**
   * Checks if a string equals "TEST" ignoring case.
   */
  static boolean stringEqualsIgnoreCaseExample(String string) {
    return string.equalsIgnoreCase("TEST");
  }

  /**
   * Returns a greeting message formatted with the US locale
   */
  public static String stringFormatLocaleExample(String name) {
    assert (name.length() > 0);
    return String.format(Locale.US, "Hello %s !", name);
  }

  /**
   * Checks if a string's hash code matches the hash code of "test".
   */
  public static Boolean checkHashCode(String string) {
    String comparison = "test";
    return string.hashCode() == comparison.hashCode();
  }

  /**
   * Checks if "substring" is at the start or elsewhere in a string.
   * Returns:
   *  - 0 if at the start
   *  - 1 if elsewhere
   *  - -1 if not present in the string
   */
  public static int checkPositionOfSubstring(String string) {
    int index = string.indexOf("substring");
    if (index == 0) {
      return 0;
    }
    if (index > 0) {
      return 1;
    }
    return -1;
  }

  /**
   * Checks if a string has length 2 or 4 and returns that
   * otherwise returns the string length plus 1.
   */
  public static int adjustedStringLength(String string) {
    if (string.length() == 2) {
      return 2;
    }
    if (string.length() == 4) {
      return 4;
    }
    return string.length() + 1;
  }

  /**
   * Checks if a string starts with "substring".
   */
  public static Boolean checkStartsWithSubstring(String string) {
    if (string.startsWith("substring")) {
      return true;
    }
    return false;
  }

  /**
   * Returns a substring of length 10 if a string is greater than length 10,
   * otherwise returns the original string.
   */
  public static String truncateString(String string) {
    if (string.length() > 10) {
      return string.substring(1, 11);
    }
    return string;
  }

  /**
   * Converts a string to a char array, expecting at least 2 characters.
   */
  public static char[] stringToCharArray(String string) {
    assert (string.length() >= 2);
    return string.toCharArray();
  }

  /**
   * Checks a string matches "abc".
   * Returns:
   * - 0 if a string is exactly equal to "abc"
   * - 1 if the string is case insensitive equal to "abc"
   * - 2 otherwise
   */
  static int checkStringMatchesAbc(String string) {
    if (string.equals("abc")) {
      return 0;
    }

    String lowercased = string.toLowerCase();
    if (lowercased.equals("abc")) {
      return 1;
    }

    return 2;
  }

  /**
   * Trims a string if there are exactly 3 whitespace characters.
   */
  public static String trimString(String original) {
    String trimmed = original.trim();
    if (trimmed.length() == original.length() - 3) {
      return trimmed;
    }
    return original;
  }

  /**
   * Validates a string starts with "<html>" and ends with "</html>"
   * using indexOf and lastIndexOf.
   */
  public static int validateHtmlWithIndexOf(String html) {
    int startIndex = html.indexOf('<');

    if (startIndex == -1) {
      return 0;
    }

    if (!html.startsWith("<html>", startIndex)) {
      return 0;
    }

    int endIndex = html.lastIndexOf('<');

    if (endIndex == -1) {
      return 0;
    }

    if (html.startsWith("</html>", endIndex)) {
      return 1;
    }
    return 0;
  }

  /**
   * Validates a string starts with "<html>" and ends with "</html>"
   * using trim, startsWith and endsWith.
   */
  public static int validateHtmlWithStartsWith(String html) {
    String t = html.trim();

    if (!t.startsWith("<html>")) {
      return 0;
    }

    if (!t.endsWith("</html>")) {
      return 0;
    }

    return 1;
  }
}
