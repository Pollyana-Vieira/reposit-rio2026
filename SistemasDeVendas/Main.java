import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = lerInteiro("Escolha uma opção: ");
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    cadastrarCliente();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    realizarVenda();
                    break;
                case 6:
                    listarVendas();
                    break;
                case 7:
                    historicoPorCliente();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE VENDAS ===");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Cadastrar cliente");
        System.out.println("4 - Listar clientes");
        System.out.println("5 - Realizar venda");
        System.out.println("6 - Listar vendas");
        System.out.println("7 - Histórico por cliente");
        System.out.println("0 - Sair");
    }

    private static void cadastrarProduto() {
        System.out.println("\n--- Cadastro de Produto ---");
        String nome = lerTexto("Nome do produto: ");
        String codigo = lerTexto("Código do produto: ");
        double preco = lerDouble("Preço do produto: ");
        int estoque = lerInteiro("Estoque inicial: ");

        if (Sistema.cadastrarProduto(nome, codigo, preco, estoque)) {
            System.out.println("Produto cadastrado com sucesso.");
        } else {
            System.out.println("Falha ao cadastrar produto. Verifique os dados ou código duplicado.");
        }
    }

    private static void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");
        List<Produto> produtos = Sistema.listarProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    private static void cadastrarCliente() {
        System.out.println("\n--- Cadastro de Cliente ---");
        String nome = lerTexto("Nome do cliente: ");
        String cpf = lerTexto("CPF do cliente: ");

        if (Sistema.cadastrarCliente(nome, cpf)) {
            System.out.println("Cliente cadastrado com sucesso.");
        } else {
            System.out.println("Falha ao cadastrar cliente. Verifique os dados ou CPF já cadastrado.");
        }
    }

    private static void listarClientes() {
        System.out.println("\n--- Lista de Clientes ---");
        List<Cliente> clientes = Sistema.listarClientes();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private static void realizarVenda() {
        System.out.println("\n--- Realizar Venda ---");
        String cpf = lerTexto("CPF do cliente: ");
        Cliente cliente = Sistema.buscarCliente(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado. Será cadastrado um novo cliente.");
            String nome = lerTexto("Nome do cliente: ");
            if (!Sistema.cadastrarCliente(nome, cpf)) {
                System.out.println("Não foi possível cadastrar o cliente. Venda cancelada.");
                return;
            }
            cliente = Sistema.buscarCliente(cpf);
        }

        String codigoVenda = lerTexto("Código da venda: ");
        Venda venda = new Venda(codigoVenda, cliente);

        while (true) {
            String codigoProduto = lerTexto("Código do produto (ENTER para finalizar): ");
            if (codigoProduto.isEmpty()) {
                break;
            }
            Produto produto = Produto.buscarPorCodigo(codigoProduto);
            if (produto == null) {
                System.out.println("Produto não encontrado.");
                continue;
            }
            int quantidade = lerInteiro("Quantidade: ");
            if (quantidade <= 0) {
                System.out.println("Quantidade inválida.");
                continue;
            }
            if (produto.getEstoque() < quantidade) {
                System.out.println("Estoque insuficiente. Disponível: " + produto.getEstoque());
                continue;
            }
            venda.adicionarItem(produto, quantidade);
            Produto.atualizarEstoque(produto.getCodigo(), produto.getEstoque() - quantidade);
            System.out.println("Item adicionado: " + produto.getNome() + " x" + quantidade);
        }

        if (venda.getItens().isEmpty()) {
            System.out.println("Nenhum item adicionado. Venda cancelada.");
            return;
        }

        if (venda.realizarVenda()) {
            System.out.println("Venda realizada com sucesso. Total: R$ " + String.format("%.2f", venda.calcularTotal()));
        } else {
            System.out.println("Falha ao registrar a venda.");
        }
    }

    private static void listarVendas() {
        System.out.println("\n--- Lista de Vendas ---");
        List<Venda> vendas = Sistema.listarVendas();
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
            return;
        }
        for (Venda venda : vendas) {
            System.out.println(venda);
            for (ItemDeVenda item : venda.getItens()) {
                System.out.println("  " + item);
            }
        }
    }

    private static void historicoPorCliente() {
        System.out.println("\n--- Histórico por Cliente ---");
        String cpf = lerTexto("CPF do cliente: ");
        List<Venda> vendas = Sistema.historicoPorCliente(cpf);
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda encontrada para este cliente.");
            return;
        }
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }

    private static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                String linha = lerTexto(mensagem);
                return Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
            }
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) {
            try {
                String linha = lerTexto(mensagem);
                return Double.parseDouble(linha.replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número decimal válido.");
            }
        }
    }
}
