import java.util.Scanner;

public class Mesada {

  public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {
      int entrada = leitor.nextInt();
      int mesada = 50;
      int sum = mesada * entrada;

      if (entrada == 1) {
        System.out.println(mesada);
      } else if (entrada > 1) {
        System.out.println(sum);
      }
    }

  }

}