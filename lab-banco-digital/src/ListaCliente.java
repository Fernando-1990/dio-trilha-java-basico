import java.util.ArrayList;
import java.util.List;

public class ListaCliente {
    private List<Cliente> clienteList;

    public ListaCliente() {
        this.clienteList = new ArrayList<>();
    }

    public void obterClientes() {
        System.out.println(clienteList);
    }

    public void adicionarCliente(Cliente cliente) {
        clienteList.add(cliente);
    }
}
