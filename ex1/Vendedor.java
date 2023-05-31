package ex1;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, String cpf) {
        super(nome, cpf, 3000);
    }

    @Override
    public double getPisoSalarial() {
        return 3000;
    }
}
