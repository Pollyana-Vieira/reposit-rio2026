public class Conta {
    private double saldo;
    private String numeroConta;

    // Getters e Setters
    public double getSaldo() {
        return this.saldo;
    }

    /* Usado pela CentralBancaria (Aula 06) para sincronizar o saldo. */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    // Operações
    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }

        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > this.saldo)
            return false;

        this.saldo -= valor;
        return true;
    }

    public String descricao() {
        return "Conta";
    }
}    
