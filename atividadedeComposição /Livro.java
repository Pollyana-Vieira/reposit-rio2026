public class Livro{

    String nome;
    String autor;
    Int ano;

    Livro(Strig nome, String autor, Int ano){
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;

    }

    void exibir(){
        Sytem.out.println("Nome: " + this.nome);
        Sytem.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        
    }

}
