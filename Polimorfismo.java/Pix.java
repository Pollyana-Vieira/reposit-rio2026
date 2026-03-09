// Classe filha que representa pagamento com PIX
class Pix extends Pagamento {

    // Sobrescrevendo o método da classe pai
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}