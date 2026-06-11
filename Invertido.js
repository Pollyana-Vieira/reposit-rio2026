async function main(){

    let cidade = "Goiânia"; //ainâioG
    let cidadeInvertido = "";
    
    for(let i = cidade.length -1; i >= 0; i --){

        nomeInvertido += cidade[i]; //+= anexa o texto ao final da String existente
    }
    console.log(nomeInvertido)
}
main();