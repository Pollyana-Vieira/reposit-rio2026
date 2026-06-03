public class ItemDeVenda {
    private Produto produto;
    private int quantidade;

    public ItemDeVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubtotal() {
        return produto != null ? produto.getPreco() * quantidade : 0;
    }

    @Override
    public String toString() {
        return String.format("ItemVenda[produto=%s, quantidade=%d, subtotal=%.2f]",
                produto != null ? produto.getNome() : "<sem produto>", quantidade, getSubtotal());
    }
}
