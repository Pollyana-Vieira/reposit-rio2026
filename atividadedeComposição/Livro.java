public class Livro{

    String nome;
    String autor;
    int ano;

    Livro(String nome, String autor, int ano){
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;

    }

    public String getNome(){
        return nome;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }

    void exibir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        
    }

}
