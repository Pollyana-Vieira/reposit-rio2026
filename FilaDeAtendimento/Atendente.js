const Pessoa = require("./Pessoa");

class Atendente extends Pessoa {

    constructor(nome, cpf, dataDeNascimento, idade, matricula) {

        super(nome, cpf, dataDeNascimento, idade);

        this.matricula = 0000001;

    }
    matricula() {
        if (this.matricula != null) {
            return "Matricula" + string(Atendente.matricula++);
        }
        else{
            return "Matricula não declarada";
        }
    }

}
module.exports = Atendente;