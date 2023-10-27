package exercicio04;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean isIdadeValida = false;

    while (isIdadeValida != true){
      System.out.print("Informe sua idade: ");
      Integer idade = scanner.nextInt();
      try {
        validarIdade(idade);
        System.out.printf("Olá, você tem %d anos de idade.%n", idade);
        isIdadeValida = true;
      } catch (IllegalArgumentException e){
        System.out.println("Você informou uma idade inválida.");
        isIdadeValida = false;
      }
    }
  }

  private static void validarIdade(int idade) {
    if (idade <= 0 || idade > 100){
      throw new IllegalArgumentException("Idade inválida.");
    }
  }
}
