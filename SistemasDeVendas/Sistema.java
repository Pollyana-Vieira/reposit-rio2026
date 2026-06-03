import java.util.List;

public class Sistema {
    public static boolean cadastrarProduto(String nome, String codigo, double preco, int estoque) {
        return Produto.cadastrar(nome, codigo, preco, estoque);
    }

    public static List<Produto> listarProdutos() {
        return Produto.listar();
    }

    public static boolean cadastrarCliente(String nome, String cpf) {
        return Cliente.cadastrar(nome, cpf);
    }

    public static List<Cliente> listarClientes() {
        return Cliente.listar();
    }

    public static Cliente buscarCliente(String cpf) {
        return Cliente.buscarPorCpf(cpf);
    }

    public static List<Venda> listarVendas() {
        return Venda.listarVendas();
    }

    public static List<Venda> historicoPorCliente(String cpf) {
        return Venda.historicoPorCliente(cpf);
    }
}
