const readline = require("readline");

//instanciamento do obj

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

async function main() {

    let nome = await rl.question("Digite seu nome: ");
    let idade = await rl.question("Digite sua idade: ");
    let cidade = await rl.question("Digite sua cidade: ");

    console.log("\nDados informados");
    console.log("Nome: ", nome);
    console.log("Idade: ", idade);
    console.log("Cidade: ", cidade);
    

}

rl.close();