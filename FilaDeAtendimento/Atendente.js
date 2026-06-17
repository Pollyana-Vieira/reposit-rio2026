const Pessoa = require("./Pessoa");

class Atendente extends Pessoa {

    constructor(nome, cpf, dataDeNascimento, idade, matricula, historico) {

        super(nome, cpf, dataDeNascimento, idade);

        this.matricula = matricula;
        this.historico = [];

    }
    matricula() {
        if (this.matricula != null) {
            return "Matricula" + string(Atendente.matricula++);
        }
        else{
            return "Matricula não declarada";
        }
    }
    atenderCliente(){
        console.log("\nAtender Clientes");
        console.log("Cliente: ", this.nome, this.tipo, this.senha);
    }
    historicoDoAtendente(){

        console.log("Nome: ", this.nome);
        console.log("Matricula: ", this.matricula);
        console.log("Data de nascimento: ", this.dataDeNascimento);
        console.log("Idade: ", this.idade);
        console.log("CPF: ", this.cpf);

        console.log("\nLista De Atendidos");
        console.log
    }

}
module.exports = Atendente;