package exercicio01;

public class ContaCorrente extends Conta implements Operavel{

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor;
  }

  @Override
  protected double obterSaldoAtual() {
    return super.saldo;
  }
}
