class Pessoa(){
    construtor(nome, idade, dataDeNascimento, cpf)
    this.nome; 
    this.idade;
    this.dataDeNascimento; 
    this.cpf;

    exibirInformacoesDePessoa(){
        console.log(`Nome: `, this.nome);
        console.log(`Idade: `, this.idade);
        console.log(`Data de nascimento: `, this.dataDeNascimento);
        console.log(`CPF: `, this.cpf);
    }


} 
module.exports = Pessoa;