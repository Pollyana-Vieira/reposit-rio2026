class Pessoa(){
    construtor(nome, idade, dataDeNascimento, cpf)
    this.nome; 
    this.idade;
    this.dataDeNascimento; 
    this.cpf;
    this.genero;

    exibirInformacoesDePessoa(){
        console.log(`Nome: `, nome);
        console.log(`Idade: `, idade);
        console.log(`Data de nascimento: `, dataDeNascimento);
        console.log(`CPF: `, cpf);
    }


} 
module.exports = Pessoa;