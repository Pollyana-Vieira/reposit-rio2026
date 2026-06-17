const Pessoa = require("./Pessoa");

class Cliente extends Pessoa(){

    static tipoComum = 1;
    static tipoPrioritario = 1;

    constructor(nome, cpf, tipo, senha){
        super(nome, cpf);

        this.tipo = tipo; //comum ou prioritário
        this.senha = senha;
    }

    senha(){
        if(this.senha == tipoPrioritario){
           return "P" + String(Cliente.tipoPrioritario++);
        }
        else{
            return "A" + String(Cliente.tipoComum++);
        }
    }
    



    
    
}