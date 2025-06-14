package submissoes;

import java.util.Scanner;

public class leite {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    if (c - d >= a && c - d <= b) {
      System.out.print("S");
    } else {
      System.out.print("N");
    }
  }
}
