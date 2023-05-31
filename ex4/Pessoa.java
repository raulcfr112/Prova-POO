package ex4;

public class Pessoa {
    private String nome;
    private Pessoa mae;
    private Pessoa pai;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public boolean isAntecessora(Pessoa antecessora){
        if (mae != null){
            if (mae.equals(antecessora)){
                return true;
            }
            isAntecessora(antecessora);
        }
        if (pai != null){
            if (pai.equals(antecessora)){
                return true;
            }
            isAntecessora(antecessora);
        }
        return false;
    }

    public boolean isIrma(Pessoa irma){
        if (mae == null || pai == null || irma.mae == null || irma.pai == null){
            return false;
        }
        if (mae.equals(irma.mae) || pai.equals(irma.pai)){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa){
            if (nome == ((Pessoa) obj).nome && mae == ((Pessoa) obj).mae){
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getMae() {
        return mae;
    }

    public Pessoa getPai() {
        return pai;
    }
}
