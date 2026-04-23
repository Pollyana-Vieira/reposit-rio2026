import java.util.ArrayList;

public class Pedido {

    String nomeDoCliente;
    String pedido;

    ArrayList<Produto> p = new ArrayList<>();

    public Pedido(String nomeDoCliente, String pedido) {

        this.nomeDoCliente = nomeDoCliente;
        this.p = new ArrayList<>();
    }

    public void adicionarItem(Produto p) {

        p.add(produto);
    }

    public double calcularTotal(){
      
        double total = 0;

        for (Produto produto : p){
            total += produto.getPreco();

        }

        if(total > 50.00){

         double valorDesconto;
         double porcentual = 10.0;
         valorDesconto = total *(porcentual/100);
         total -= porcentual; 

        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("===== Pedido de: + nomeDoCliente + ======");

        for (Produto produto : p) {
            produto.exibirPedido();
        }
        System.out.println("Total: R$ %2f%n" + calcularTotal())
    }

}
