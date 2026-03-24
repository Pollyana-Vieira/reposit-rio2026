class Cliente {
    private String nome;
    private String CPF;
    private String dataDeNascimento;
    private String numeroDeConta;
    private String senha;
    private double saldo;
    private boolean bloqueada;
    private int tentativas;

    // get
    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getDataDeNascimento() {
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

    // set
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

    public boolean setDataDeNascimento(String dataDeNascimento) {
        // validar se a data de nascimento existe
        if(){
            
        }
        this.dataDeNascimento = dataDeNascimento;
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