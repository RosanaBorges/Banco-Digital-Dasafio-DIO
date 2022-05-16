public class Main {

    public static void main(String[] args) {
        Cliente Rosana= new Cliente();
        Rosana.setNome("Rosana");

        Conta cc = new ContaCorrente(Rosana);
        cc.depositar(0);

        Conta cp = new ContaPoupanca(Rosana);
        cc.transferir(30, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
