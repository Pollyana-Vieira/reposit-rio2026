import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Lanchonete {

    HashMap<String, Produto> cardapio = new HashMap<>();
    Queue<Pedido> fila = new LinkedList<>();
    Stack<Pedido> historico = new Stack<>();

    public void adicionarAoCardapio(){

        cardapio.put("X01", new Produto("X01","X-Burgue", 18.50, "Lanche") );
        cardapio.put("X02", new Produto("X02", "Suco de Laranja", 8.00, "Bebida") );
        cardapio.put( "X03", new Produto("X03", "Batata Frita", 20.00, "Lanche") );
        cardapio.put("X04", new Produto("X04", "Coca-Cola", 10.00, "Bebida") );


    }
    public void buscarProduto(String codigo){

        Produto produto = cardapio.getCodigo();

        if(Produto != null){
          produto.exibir();
        }else{
            System.out.println("Produto inexistente!");
        }
        
    }
    public void fazerPedido(Pedido pedido){

        fila.add(pedido);
    }
    public void atenderProximo(){

        if(!fila.isEmpty()){
            System.out.println("Tem pedidos na fila!" );
        }else{
            System.out.println("Nenhum pedido na fila!");
        } return;

        Pedido pedido = fila.peek();
        pedido.exibirPedido();
        historico.push(pedido);

    }
    public void verUltimoPedido(){

        if(historico.isEmpty()){
            System.out.println("Nenhum pedido atendido ainda!");
        }

        Pedido pedido = historico.peek();
        pedido.exibirPedido();
        
    }

}
