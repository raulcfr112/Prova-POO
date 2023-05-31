package ex1;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cpf) {
        super(nome, cpf, 6000);
    }

    @Override
    public double getPisoSalarial() {
        return 6000;
    }
}
