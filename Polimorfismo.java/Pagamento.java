// Classe base (superclasse/classe pai)
class Pagamento {

    //Esse será o método que será sobrescrito pelas classes filhas
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor);
    }
}