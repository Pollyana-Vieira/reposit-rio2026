// Essa é a Classe filha que representa um pagamento com cartão
class Cartao extends Pagamento { //extends significa que essa classe herda tudo da classe pagamento

    // Sobrescrevendo o método da classe pai
    @Override //aqui está sobrescrevendo um método da classe pai/base(classe pagamento) 
    public void processarPagamento(double valor) { //método da classe base
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão.");
    }
}
