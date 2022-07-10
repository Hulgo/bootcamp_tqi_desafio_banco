public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Banco banco;
    protected Cliente cliente;

    protected String tipo;

    public Conta(Banco banco, Cliente cliente, String tipo) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.banco = banco;
        banco.contas.add(this);
        this.cliente = cliente;
        this.tipo = tipo;
        this.saldo = 0.00;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoes() {
        System.out.println(String.format("Agência: %d;", this.agencia));
        System.out.println(String.format("Conta: %d;", this.numero));
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Saldo: %.2f;", this.saldo));
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
