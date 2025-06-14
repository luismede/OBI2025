package submissoes;

import java.util.Scanner;

public class pizzaria {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = (sc.nextInt() * 8) + (sc.nextInt() * 4) - 2;
    System.out.print(max);
  }
}