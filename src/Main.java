public class Main {

    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Hulgo");
        Cliente cliente2 = new Cliente("José");
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        cc.imprimirExtrato();

        cp.imprimirExtrato();

        cc.depositar(100);

        cp.depositar(120);

        cc.imprimirExtrato();

        cp.imprimirExtrato();

        cp.transferir(35, cc);

        cc.imprimirExtrato();

        cp.imprimirExtrato();
    }

}
