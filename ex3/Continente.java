package ex3;

import java.util.ArrayList;

public class Continente {
    private String nome;
    private ArrayList<Pais> paises = new ArrayList<>();

    public Continente(String nome) {
        this.nome = nome;
    }

    public void adicionarPaises(Pais pais){
        paises.add(pais);
    }

    public double dimensaoTotal(){
        double dimensaoTotal = 0;

        for (int i = 0; i < paises.size(); i++) {
            dimensaoTotal += paises.get(i).getDimensao();
        }
        return dimensaoTotal;
    }

    public double populacaoTotal(){
        double populacaoTotal = 0;

        for (int i = 0; i < paises.size(); i++) {
            populacaoTotal += paises.get(i).getPopulacao();
        }
        return populacaoTotal;
    }

    public Pais maiorPopulacao(){
        Pais maiorPopulacao = paises.get(0);

        for (int i = 0; i < paises.size(); i++) {
            if (paises.get(i).getPopulacao() > maiorPopulacao.getPopulacao()){
                maiorPopulacao = paises.get(i);
            }
        }
        return maiorPopulacao;
    }

    public Pais menorPopulacao(){
        Pais menorPopulacao = paises.get(0);

        for (int i = 0; i < paises.size(); i++) {
            if (paises.get(i).getPopulacao() < menorPopulacao.getPopulacao()){
                menorPopulacao = paises.get(i);
            }
        }
        return menorPopulacao;
    }

    public Pais maiorDimensao(){
        Pais maiorDimensao = paises.get(0);

        for (int i = 0; i < paises.size(); i++) {
            if (paises.get(i).getDimensao() > maiorDimensao.getDimensao()){
                maiorDimensao = paises.get(i);
            }
        }
        return maiorDimensao;
    }

    public Pais menorDimensao(){
        Pais menorDimensao = paises.get(0);

        for (int i = 0; i < paises.size(); i++) {
            if (paises.get(i).getDimensao() < menorDimensao.getDimensao()){
                menorDimensao = paises.get(i);
            }
        }
        return menorDimensao;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }
}
