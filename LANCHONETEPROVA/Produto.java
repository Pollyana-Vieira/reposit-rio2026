public class Produto {

    String codigo;
    String nomeDoProduto;
    double preco;
    String categoria;

    public Produto(String codigo, String nomeDoProduto, double preco, String categoria) {

        this.codigo = codigo;
        this.nomeDoProduto = nomeDoProduto;
        this.preco = preco;
        this.categoria = categoria;
    }

    // GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void exibir(String codigo, String nomeDoProduto, String categoria, double preco) {
        System.out.println("[%s] - %s - %s - R$ %.2f%n" codigo, nomeDoProduto,categoria, preco );
    }

}
