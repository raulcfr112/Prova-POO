package ex1;

public class Main{
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Raul","123");
        Vendedor v1 = new Vendedor("Kleber","123");
        Balconista b1 = new Balconista("Carlos","123");

        System.out.println(g1.getSalario());
        System.out.println(v1.getSalario());
        System.out.println(b1.getSalario());
        System.out.println();

        g1.setSalario(6001);
        v1.setSalario(3001);
        b1.setSalario(2001);
        System.out.println(g1.getSalario());
        System.out.println(v1.getSalario());
        System.out.println(b1.getSalario());
    }
}
