import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Cliente {

    private static final int IDADE_MINIMA = 16;
    private static final int ANO_MINIMO = 1900;

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
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public String getNumeroDeConta() {
        return this.numeroDeConta;
    }

    public String getSenha() {
        return this.senha;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean getBloqueada() {
        return this.bloqueada;
    }

    public int getTentativas() {
        return this.tentativas;
    }

    // setters

    public boolean setNome(String nome) {
        // validar se existe nome e sobrenome   {
         if(nome == null|| nome.trim().split("\\+s").length < 2){
            return false;
        }                                            
        this.nome = nome.trim();  
        return true;                                    
    }

    public boolean setCPF(String CPF) {
        // validar se o CPF existe
        if(CPF == null){
         return false;
        }
        this.CPF = CPF;
    }

    public boolean setDataDeNascimento(String data) {
        // validar se a data de nascimento existe
        if(data == null){
            return false;
        }

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate hoje = LocalDate.now();//verifica a idade que a pessoa tem hj 

        try{
            LocalDate dataDeNascimento = LocalDate.parse(data, formatador);//parse  é o processo de converter uma String ou outro formato de dados em um objeto Java estruturado (ex: converter "123" para int ou "2023-10-27" para LocalDate).
            if(dataDeNascimento.getYear() < ANO_MINIMO){
                return false;
            }

            LocalDate idadeMinima = hoje.minusYears(IDADE_MINIMA));

            if(dataDeNascimento.isAfter(idadeMinima)){
                return false;
            }

            this.dataDeNascimento = dataDeNascimento;
            return true;

        }catch(DateTimeException e ){
            return false;
        }
        
        
    }

    public void setNumeroDeConta(String numeroDeConta) {
        // validar se o número de conta existe
        this.numeroDeConta = numeroDeConta;
    }

    public void setSenha(String senha) {
        // verificar se a senha existe
        this.senha = senha;
    }

    public void setSaldo(double saldo) {
        // verificar se o saldo existe
        this.saldo = saldo;
    }

    public void setBloqueada(boolean bloqueada) {
        // verificar se a conta esta bloqueada
        this.bloqueada = bloqueada;
    }

    public void setTentativas(int tentativas) {
        // verificar quantas tentativas foram
        this.tentativas = tentativas;
    }

}