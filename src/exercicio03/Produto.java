package exercicio03;

public class Produto implements Tributavel{

  double valor = 20.00;
  double valorImposto = valor*.22;

  @Override
  public double calcularValorComImposto() {
    return valor+valorImposto;
  }
}
