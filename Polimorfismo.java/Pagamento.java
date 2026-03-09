// Classe base (superclasse/classe pai)
class Pagamento {

    // Método que será sobrescrito pelas outras subclasses
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor);
    }
}