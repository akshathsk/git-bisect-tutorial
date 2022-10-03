package org.uiuc;

public class Main {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("Sum = " + add(a, b));
    System.out.println("Difference = " + subtract(a, b));
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }
}