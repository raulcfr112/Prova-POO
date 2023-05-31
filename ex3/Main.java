package ex3;

public class Main {
    public static void main(String[] args) {

        Continente c1 = new Continente("America");
        Continente c2 = new Continente("Europa");

        Pais p1 = new Pais("BRA","Brasil",50);
        Pais p2 = new Pais("MEX","Mexico",45);
        Pais p3 = new Pais("EUA","Estados Unidos",60);
        Pais p4 = new Pais("CAN","Canada",20);
        Pais p5 = new Pais("GERM","Alemanha",70);

        c1.adicionarPaises(p1);
        c1.adicionarPaises(p2);
        c1.adicionarPaises(p3);
        c1.adicionarPaises(p4);

        c2.adicionarPaises(p5);

        p2.adicionarVizinhos(p3);
        p3.adicionarVizinhos(p2);
        p3.adicionarVizinhos(p4);
        p4.adicionarVizinhos(p3);

        p1.setPopulacao(5);
        p2.setPopulacao(10);
        p3.setPopulacao(30);
        p4.setPopulacao(60);
        p5.setPopulacao(90);

        System.out.println(p1.densidadePopulacional());
        System.out.println();

        System.out.println(p5.equals(p2));
        System.out.println(p5.equals(p5));
        System.out.println();

        System.out.println(p1.isVizinho(p2));
        System.out.println(p3.isVizinho(p4));
        System.out.println();


        System.out.println(p1.vizinhosComuns(p2));
        System.out.println(p2.vizinhosComuns(p4).get(0).getNome());

        System.out.println(c1.dimensaoTotal());
        System.out.println(c1.populacaoTotal());
        System.out.println();
        System.out.println(c2.populacaoTotal());
        System.out.println(c2.dimensaoTotal());
        System.out.println();

        System.out.println(c1.menorDimensao().getNome());
        System.out.println(c1.maiorDimensao().getNome());
        System.out.println(c1.menorPopulacao().getNome());
        System.out.println(c1.maiorPopulacao().getNome());
        System.out.println();

        System.out.println(c2.menorDimensao().getNome());
        System.out.println(c2.maiorDimensao().getNome());
        System.out.println(c2.menorPopulacao().getNome());
        System.out.println(c2.maiorPopulacao().getNome());

    }
}
