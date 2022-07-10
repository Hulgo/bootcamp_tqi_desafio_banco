import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;

    protected List<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome) {
        this.nome = nome;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarClientes(){
        System.out.println("Lista de Clientes: ");
        for (Conta conta: contas){
            System.out.println("Cliente: " + conta.cliente.getNome() +
                    ", Agência: " + conta.agencia +
                    ", Conta: " + conta.numero +
                    ", Tipo: " + conta.tipo + ".");
        }
    }
}
