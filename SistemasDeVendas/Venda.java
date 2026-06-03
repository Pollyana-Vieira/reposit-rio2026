import java.util.ArrayList;
import java.util.List;

public class Venda {
    private String codigo;
    private Cliente cliente;
    private List<ItemDeVenda> itens;
    private static final List<Venda> historicoVendas = new ArrayList<>();

    public Venda(String codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemDeVenda> getItens() {
        return new ArrayList<>(itens);
    }

    public boolean adicionarItem(Produto produto, int quantidade) {
        if (produto == null || quantidade <= 0) {
            return false;
        }
        itens.add(new ItemDeVenda(produto, quantidade));
        return true;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemDeVenda item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public boolean realizarVenda() {
        if (cliente == null || itens.isEmpty()) {
            return false;
        }
        historicoVendas.add(this);
        return true;
    }

    public static List<Venda> listarVendas() {
        return new ArrayList<>(historicoVendas);
    }

    public static List<Venda> historicoPorCliente(String cpf) {
        List<Venda> resultado = new ArrayList<>();
        if (cpf == null || cpf.isBlank()) {
            return resultado;
        }
        String chave = cpf.trim();
        for (Venda venda : historicoVendas) {
            if (venda.cliente != null && chave.equals(venda.cliente.getCpf())) {
                resultado.add(venda);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return String.format("Venda[codigo=%s, cliente=%s, total=%.2f, itens=%d]",
                codigo, cliente != null ? cliente.getNome() : "<sem cliente>", calcularTotal(), itens.size());
    }
}
