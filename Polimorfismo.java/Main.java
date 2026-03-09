// Classe principal
public class SistemaPagamento {

    public static void main(String[] args) {

        // Criando objetos usando polimorfismo
        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Pix();

        // Chamando o mesmo método para objetos diferentes
        pagamento1.processarPagamento(150.00);
        pagamento2.processarPagamento(200.00);
    }
}