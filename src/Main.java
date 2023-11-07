import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean isIdadeValida = false;

    int idade = 0;

    while (!isIdadeValida){
      System.out.print("Informe sua idade: ");
      idade = scanner.nextInt();
      try {
        if (idade <= 0 || idade > 100){
          throw new InvalidParameterException("Idade inválida!");
        }
        System.out.printf("Você tem %d anos de idade.", idade);
        isIdadeValida = true;
      } catch (InvalidParameterException e){
        System.out.println(e.getMessage());
      }
    }
  }
}