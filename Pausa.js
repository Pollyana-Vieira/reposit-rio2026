function esperar(as){
    return new Promise((resolve) => setTimeout(resolve,as));

}
async function exempDeEsperar(){
    console.log("1 - começo");

    await esperar(2000); //para aqui por 2 segundos

    console.log("2 - depois de 2 segundos");
    console.log(3 - fim);


}
exempDeEsperar();
console.log("Isso aparece ANTES ou DEPOIS da contagem de tempo?");

