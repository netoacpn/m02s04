package exercicio05.superherois;

import exercicio05.superherois.cli.Display;
import exercicio05.superherois.exception.OpcaoInvalidaException;
import exercicio05.superherois.model.Heroi;
import exercicio05.superherois.model.Opcao;
import exercicio05.superherois.model.Personagem;
import exercicio05.superherois.model.Vilao;
import exercicio05.superherois.repository.PersonagemRepository;

import java.util.List;

public class Aplicacao {

  private Display display = new Display();
  private PersonagemRepository personagemRepo = new PersonagemRepository();
  public void executar() {

    Opcao opcao = null;

    do {
      display.exibirMenu();
      int codigo = display.obterOpcao();
      try {
        opcao = Opcao.converter(codigo);
        processar(opcao);
      } catch (OpcaoInvalidaException e){
        display.exibirMensagem(e.getMessage());
      }

    } while (opcao != Opcao.SAIR);
  }

  private void processar(Opcao opcao) {
    if (opcao == Opcao.SAIR)
      return;
    if (opcao == Opcao.CADASTRAR_HEROI){
      Heroi heroi = display.obterDadosHeroi();
      personagemRepo.inserir(heroi);
    } else if (opcao == Opcao.CADASTRAR_VILAO){
      Vilao vilao = display.obterDadosVilao();
      personagemRepo.inserir(vilao);
    } else if (opcao == Opcao.LISTAR) {
      List<Personagem> personagens = personagemRepo.listar();
      display.listar(personagens);
      
    }
  }
}
