import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int estoque;

    private static final List<Produto> produtos = new ArrayList<>();

    public Produto(String nome, String codigo, double preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public static boolean cadastrar(String nome, String codigo, double preco, int estoque) {
        if (nome == null || nome.isEmpty() || codigo == null || codigo.isEmpty() || preco < 0 || estoque < 0) {
            return false;
        }

        if (buscarPorCodigo(codigo) != null) {
            return false;
        }

        produtos.add(new Produto(nome.trim(), codigo.trim(), preco, estoque));
        return true;
    }

    public static List<Produto> listar() {
        return new ArrayList<>(produtos);
    }

    public static Produto buscarPorCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }

        String chave = codigo.trim();
        for (Produto produto : produtos) {
            if (produto.codigo.equalsIgnoreCase(chave)) {
                return produto;
            }
        }
        return null;
    }

    public static List<Produto> buscarPorNome(String nome) {
        List<Produto> resultado = new ArrayList<>();
        if (nome == null || nome.isEmpty()) {
            return resultado;
        }

        String termo = nome.trim().toLowerCase();
        for (Produto produto : produtos) {
            if (produto.nome.toLowerCase().contains(termo)) {
                resultado.add(produto);
            }
        }
        return resultado;
    }

    public static boolean remover(String codigo) {
        Produto produto = buscarPorCodigo(codigo);
        if (produto == null) {
            return false;
        }
        return produtos.remove(produto);
    }

    public static boolean atualizarEstoque(String codigo, int novoEstoque) {
        if (novoEstoque < 0) {
            return false;
        }
        Produto produto = buscarPorCodigo(codigo);
        if (produto == null) {
            return false;
        }
        produto.setEstoque(novoEstoque);
        return true;
    }

    @Override
    public String toString() {
        return String.format("Produto[codigo=%s, nome=%s, preco=%.2f, estoque=%d]",
                codigo, nome, preco, estoque);
    }
}
