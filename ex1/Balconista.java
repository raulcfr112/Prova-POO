package ex1;

public class Balconista extends Funcionario{
    public Balconista(String nome, String cpf) {
        super(nome, cpf, 2000);
    }

    @Override
    public double getPisoSalarial() {
        return 2000;
    }
}
