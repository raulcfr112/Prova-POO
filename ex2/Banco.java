package ex2;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList <Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adicionarContasAoBanco(Conta conta){
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }
}
