package submissoes;

import java.util.Scanner;

public class fila {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ultimoMaior = 0;
    int soma = 0;
    int[] fila = new int[n];
    for (int i = 0; i < fila.length; i++) {
      fila[i] = sc.nextInt();
    }
    for (int i = fila.length - 1; i >= 0; i--) {
      if (fila[i] <= ultimoMaior) {
        soma++;
      } else {
        ultimoMaior = fila[i];
      }
    }
    System.out.println(soma);
  }
}
