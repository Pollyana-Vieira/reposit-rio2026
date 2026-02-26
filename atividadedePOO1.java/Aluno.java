public class Aluno{
    
    String nome;
    int idade;
    double media;
      
    Aluno(String nome,int idade, double media){

        this.nome = nome;
        this.idade = idade;
        this.media = media;

    }
     
    String calcularMedia(){
        if(media >= 7.0){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }

    }
     
    void exibir(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Média: " + this.media);
        System.out.println("Resultado: " + calcularMedia());
    }
}