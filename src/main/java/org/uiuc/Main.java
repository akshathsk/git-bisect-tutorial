package org.uiuc;

public class Main {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("Sum = " + add(a, b));
    System.out.println("Difference = " + subtract(a, b));
    System.out.println("Multiplication = " + multiply(a, b));
    System.out.println("Division = " + divide(a, b));
    int c = 30;
    int d = 40;
    System.out.println("Sum = " + add(c, d));
  }

  public static int add(int x, int y) {
    return x - y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static float divide(int x, int y) {
    return (float) x / y;
  }
}