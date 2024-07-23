
public class Main {

    public static void main(String[] args) {
        Cliente fernando = new Cliente();
        fernando.setNome("Fernando");

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        ListaCliente listaCliente = new ListaCliente();

        listaCliente.adicionarCliente(fernando);
        listaCliente.adicionarCliente(felipe);

        listaCliente.obterClientes();

        Conta cc = new ContaCorrente(fernando);
        Conta poupanca = new ContaPoupanca(fernando);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}