import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Cliente {

    private static final int IDADE_MINIMA = 16;
    private static final int ANO_MINIMO = 1900;
     private static final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nome;
    private String CPF;
    private LocalDate dataDeNascimento;
    private String numeroDeConta;
    private String senha;
    private double saldo;
    private boolean bloqueada;
    private int tentativas;

    // getters

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento.format(formatador);
    }

    public String getNumeroDeConta() {
        return numeroDeConta;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getBloqueada() {
        return bloqueada;
    }

    public int getTentativas() {
        return tentativas;
    }

    // setters

     // NOME

    public boolean setNome(String nome) {
        // validar se existe nome e sobrenome {
        if (nome == null || nome.trim().split("\\+s").length < 2) {
            return false;
        }
        this.nome = nome.trim();
        return true;
    }

     // CPF

    public boolean setCPF(String CPF) {
        // validar se o CPF existe
        if (CPF == null) {
            return false;
        }
        this.CPF = CPF;
    }

     // DATA DE NASCIMENTO

    public boolean setDataDeNascimento(String data) {
        // validar se a data de nascimento existe
        if (data == null) {
            return false;
        }

       

        LocalDate hoje = LocalDate.now();// verifica a idade que a pessoa tem hj

        try {
            LocalDate dataDeNascimento = LocalDate.parse(data, formatador);// parse é o processo de converter uma String
                                                                           // ou outro formato de dados em um objeto
                                                                           // Java estruturado (ex: converter "123" para
                                                                           // int ou "2023-10-27" para LocalDate).

            if (dataDeNascimento.getYear() < ANO_MINIMO) {
                return false;
            }

            LocalDate idadeMinima = hoje.minusYears(IDADE_MINIMA);

            if (dataDeNascimento.isAfter(idadeMinima)) {
                return false;
            }

            this.dataDeNascimento = dataDeNascimento;
            return true;

        } catch (DateTimeException e) {
            return false;
        }

    }

     // NÚMERO DE CONTA

    public void setNumeroDeConta(String numeroDeConta) {
        // validar se o número de conta existe
        this.numeroDeConta = numeroDeConta;
    }

     // SENHA

    public void setSenha(String senha) {
        // verificar se a senha existe
        this.senha = senha;
    }

     //SALDO

    public void setSaldo(double saldo) {
        // verificar se o saldo existe
        this.saldo = saldo;
    }

     //BLOQUEADA

    public void setBloqueada(boolean bloqueada) {
        // verificar se a conta esta bloqueada
        this.bloqueada = bloqueada;
    }

     //TENTATIVAS

    public void setTentativas(int tentativas) {
        // verificar quantas tentativas foram
        this.tentativas = tentativas;
    }

}