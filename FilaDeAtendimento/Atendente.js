const Pessoa = require("./Pessoa");

class Atendente extends Pessoa {

    constructor(nome, cpf, dataDeNascimento, idade, matricula) {

        super(nome, cpf, dataDeNascimento, idade);

        this.matricula = matricula;

    }
    matricula() {
        if (this.matricula != null) {
            return "Matricula" + string(Atendente.matricula++);
        }
        else{
            return "Matricula não declarada";
        }
    }
    atendimentos(){
        console.log("\nAtender Clientes");
        console.log("Cliente: ", this.nome, this.tipo, this.senha);
    }

}
module.exports = Atendente;