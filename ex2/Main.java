package ex2;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Internet Banking");


        ContaCorrente cc1 = new ContaCorrente("Raul",500);
        ContaCorrente cc2 = new ContaCorrente("Kleber",300);
        ContaPoupanca cp1 = new ContaPoupanca("Carlos",50);
        ContaPoupanca cp2 = new ContaPoupanca("Ana",400);

        banco.adicionarContasAoBanco(cc1);
        banco.adicionarContasAoBanco(cc2);
        banco.adicionarContasAoBanco(cp1);
        banco.adicionarContasAoBanco(cp2);

        cc1.sacar(500);
        cc2.sacar(200);
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
        System.out.println();

        cc1.depositar(500);
        cc2.depositar(500);
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
        System.out.println();

        cc1.transferir(cc2,200);
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
        System.out.println();

        System.out.println(cp2.getSaldo());
        cp2.sacar(100);
        System.out.println(cp2.getSaldo());
        cp2.depositar(200);
        System.out.println(cp2.getSaldo());
        cp2.transferir(cp1,50);
        System.out.println(cp1.getSaldo());
        System.out.println(cp2.getSaldo());
        System.out.println();

        System.out.println(cp1.getSaldo());
        System.out.println(cp1.getSaldo(30));
        System.out.println(cp2.getSaldo());
        System.out.println(cp2.getSaldo(50));
    }
}
