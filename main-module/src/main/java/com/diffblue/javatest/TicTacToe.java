package com.diffblue.javatest;

public class TicTacToe {
  /**
   * Checks if either player has won a tic-tac-toe game.
   * Inputs represent cells on the board:
   *   1: player X field
   *   2: player O field
   *   0: empty position
   * Return values:
   *  -1: not a valid board state
   *   0: neither player has won
   *   1: player X has won
   *   2: player O has won
   */
  byte checkTicTacToePosition(byte[] a) {
    // First check number of cells
    if (a.length != 9) {
      return -1;
    }

    // Next check number of moves each player made
    byte diff = 0;
    for (byte i = 0; i < 9; i++) {
      if (a[i] == 1) {
        diff++;
      } else if (a[i] == 2) {
        diff--;
      } else if (a[i] != 0) {
        return -1;
      }
    }

    // Fail if one player has made too many moves compared to the other
    if (diff > 1 || diff < -1) {
      return -1;
    }

    // Otherwise we know we have a valid board state

    // Check if a row and column has won
    for (byte i = 0; i < 3; i++) {
      if (a[i] == a[3 + i] && a[i] == a[6 + i]) {
        if (a[i] == 1) {
          return 1;
        } else if (a[i] == 2) {
          return 2;
        }
      }

      if (a[3 * i] == a[3 * i + 1] && a[3 * i] == a[3 * i + 2]) {
        if (a[3 * i] == 1) {
          return 1;
        } else if (a[3 * i] == 2) {
          return 2;
        }
      }
    }

    // Check if the top-left bottom-right diagonal has won
    if (a[0] == a[4] && a[0] == a[8]) {
      if (a[0] == 1) {
        return 1;
      } else if (a[0] == 2) {
        return 2;
      }
    }

    // Check if the top-right bottom-left diagonal has won
    if (a[2] == a[4] && a[2] == a[6]) {
      if (a[2] == 1) {
        return 1;
      } else if (a[2] == 2) {
        return 2;
      }
    }

    // Neither player has won yet
    return 0;
  }

  /**
   * Checks if either player has won a tic-tac-toe game.
   * Inputs a, b, c are rows on the board, each is an array of 3 chars
   *   'x', 'X''     : player X field
   *   '0', 'o', 'O' : player O field
   *   ' ': empty position
   * Return values:
   *   'E': not a valid board state
   *   '-': neither player has won
   *   'X': player X has won
   *   'O': player O has won
   */
  public char checkTicTacToePosition(char[] a, char[] b, char[] c) {
    if (a.length != 3 || b.length != 3 || c.length != 3) {
      return 'E';
    }
    byte[] bytes = new byte[9];
    for (int i = 0; i < 9; i++) {
      bytes[i] = ticTacToeCharToByte(i < 3 ? a[i] : i < 6 ? b[i - 3] : c[i - 6]);
    }
    switch (checkTicTacToePosition(bytes)) {
      case 0:
        // Neither player has won yet
        return '-';
      case 1:
        // Player X has won
        return 'X';
      case 2:
        // Player O has won
        return 'O';
      default:
        // Board is not in valid state
        return 'E';
    }
  }

  /**
   * Convert char representaion of board state to byte representation.
   */
  static byte ticTacToeCharToByte(char c) {
    switch (c) {
      case 'X':
      case 'x':
        return 1;
      case 'O':
      case 'o':
      case '0':
        return 2;
      case ' ':
        return 0;
      default:
        throw new NumberFormatException();
    }
  }
}
