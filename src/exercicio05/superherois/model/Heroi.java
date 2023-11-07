package exercicio05.superherois.model;

public class Heroi extends Personagem {
  private String nomeVidaReal;

  public Heroi(String nome, String superpoder, String nomeVidaReal) {
    this.setNome(nome);
    this.setSuperpoder(superpoder);
    this.nomeVidaReal = nomeVidaReal;
  }

  @Override
  public String toString() {
    return String.format("Herói (%s - %s - %s).", getNome(), getSuperpoder(),getNomeVidaReal());
  }

  public String getNomeVidaReal() {
    return nomeVidaReal;
  }

  public void setNomeVidaReal(String nomeVidaReal) {
    this.nomeVidaReal = nomeVidaReal;
  }
}
