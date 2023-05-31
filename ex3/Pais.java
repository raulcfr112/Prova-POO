package ex3;

import java.util.ArrayList;

public class Pais {
    private String codigo;
    private String nome;
    private double populacao;
    private double dimensao;

    private ArrayList<Pais> vizinhos = new ArrayList<>();

    public Pais(String codigo, String nome, double dimensao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public void adicionarVizinhos(Pais vizinho){
        vizinhos.add(vizinho);
    }

    public ArrayList<Pais> vizinhosComuns(Pais vizinho){
        ArrayList<Pais>vizinhosComuns = new ArrayList<>();

        for (int i = 0; i < vizinho.vizinhos.size(); i++) {
            if (isVizinho(vizinho.vizinhos.get(i))){
                vizinhosComuns.add(vizinho.vizinhos.get(i));
            }
        }
        return vizinhosComuns;
    }

    public boolean isVizinho(Pais vizinho){
        for (int i = 0; i < vizinho.vizinhos.size(); i++) {
            if (this.equals(vizinho.vizinhos.get(i))){
                return true;
            }
        }
        return false;
    }

    public double densidadePopulacional(){
        return dimensao / populacao;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pais){
            if (this.codigo.equals(((Pais) obj).codigo)){
                return true;
            }
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
}
