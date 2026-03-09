// Classe filha que representa pagamento com cartão
class Cartao extends Pagamento { //extends significa que essa classe herda tudo da classe pagamento

    // Sobrescrevendo o método da classe pai
    @Override //está sobrescrevendo um método da classe pai/base(classe pagamento) 
    public void processarPagamento(double valor) { //método da classe base
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão.");
    }
}
