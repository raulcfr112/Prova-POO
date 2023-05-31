package ex4;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("raul");
        Pessoa p2 = new Pessoa("carlos");
        Pessoa p3 = new Pessoa("kleber",p2,p1);
        Pessoa p4 = new Pessoa("sofia",p2,p3);
        Pessoa p5 = new Pessoa("ana",p1,p3);
        Pessoa p6 = new Pessoa("joao",p3,p4);

        System.out.println(p5.equals(p6));
        System.out.println(p5.equals(p5));
        System.out.println();

        System.out.println(p1.isIrma(p2));
        System.out.println(p4.isIrma(p3));
        System.out.println();

        System.out.println(p1.isAntecessora(p2));
        System.out.println(p6.isAntecessora(p3));

    }
}
