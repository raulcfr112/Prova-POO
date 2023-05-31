package ex2;

public class ContaCorrente extends Conta{

    private double limite;

    public ContaCorrente(String titular, double saldo ) {
        super(titular, saldo);
        this.limite = 300;
    }

    @Override
    public void sacar(double valor) {
        if ((getSaldo() + limite) < valor){
            throw new IllegalArgumentException();
        }
        setSaldo(getSaldo() - valor);
    }

    @Override
    public void transferir(Conta destinatario, double valor) {
        this.sacar(valor);
        destinatario.depositar(valor);
    }

    public double getLimite() {
        return limite;
    }
}
