package exercicio05.superherois.cli;

import exercicio05.superherois.model.Heroi;
import exercicio05.superherois.model.Personagem;
import exercicio05.superherois.model.Vilao;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Display {
  public void exibirMenu(){
    System.out.println("---------- MENU ----------");
    System.out.println("1 - Cadastrar Herói");
    System.out.println();
    System.out.println("2 - Cadastrar Vilão");
    System.out.println();
    System.out.println("3 - Listar");
    System.out.println();
    System.out.println("4 - Sair");
    System.out.println();
  }

  public int obterOpcao() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a opção desejada: ");
    try {
      int op = scanner.nextInt();
      return op;
    } catch (InputMismatchException e){
      return -1;
    }
  }

  public void exibirMensagem(String message) {
    System.out.println();
    System.out.println("-->" + message);
    System.out.println();
  }

  public Heroi obterDadosHeroi() {
    System.out.println("Informe o nome: ");
    Scanner scanner = new Scanner(System.in);
    String nome = scanner.nextLine();
    System.out.println("Informe o superpoder: ");
    String superpoder = scanner.nextLine();
    System.out.println("Informe o nome na vida real: ");
    String nomeVidaReal = scanner.nextLine();
    System.out.println();
    return new Heroi(nome, superpoder, nomeVidaReal);
  }

  public Vilao obterDadosVilao() {
    System.out.println("Informe o nome: ");
    Scanner scanner = new Scanner(System.in);
    String nome = scanner.nextLine();
    System.out.println("Informe o superpoder: ");
    String superpoder = scanner.nextLine();
    System.out.println("Informe o tempo de prisão: ");
    Integer tempoDePrisao = scanner.nextInt();
    System.out.println();
    return new Vilao(nome, superpoder, tempoDePrisao);
  }

  public void listar(List<Personagem> personagens) {
    Collections.sort(personagens);
    System.out.println("Listando...");
    personagens.forEach(personagem -> System.out.println(personagem));
    System.out.println();
  }
}
