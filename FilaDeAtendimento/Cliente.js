cost Pessoa = require("./Pessoa");

class Cliente extends Pessoa(){

    static tipoComum = 1;
    static tipoPrioritario = 1;

    constructor(nome, cpf, tipo, senha){
        super(nome, cpf);

        this.tipo = tipo;
        this.senha = senha;
    }

    let tipoComum = A001;
    let tipoPrioritario = P001;

    console.log("\nDados do Cliente");
    console.log("Nome", nome);
    console.log("Idade", idade);
    console.log("Data de nascimento", DataDeNascimento);
    console.log("CPF", cpf);
    console.log("Gênero", genero);
    console.log("Tipo", tipoComum, tipoPrioritario);




    
    
}