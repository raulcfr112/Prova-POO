package ex2;

public class ContaPoupanca extends Conta{

    private double taxaDeRendimento;

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
        this.taxaDeRendimento = 0.1;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() < valor){
            throw new IllegalArgumentException();
        }
        setSaldo(getSaldo() - valor);
    }

    @Override
    public void transferir(Conta destinatario, double valor) {
        this.sacar(valor);
        destinatario.depositar(valor);
    }

    public double getSaldo(int quantidadeDeDias) {
        double rendimentoDiario = taxaDeRendimento / 30;

        this.depositar(getSaldo() * (rendimentoDiario * quantidadeDeDias));
        return getSaldo();
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }
}
