public class ContaPoupanca extends Conta {

    public ContaPoupanca(Banco banco, Cliente cliente) {
        super(banco, cliente, "Conta Poupança");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===> Extrato Conta Poupança <===");
        imprimirInformacoes();
    }
}
