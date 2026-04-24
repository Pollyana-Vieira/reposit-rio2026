import java.util.ArrayList;

public class Biblioteca{

    static ArrayList<Livro>  listadeLivros = new ArrayList<>();

    void adicionar(Livro livro){
     
        listadeLivros.add(livro);
    }

    void listar(){
        System.out.println("=== LIVROS DA BIBLIOTECA ===");
        for(Livro livros : listadeLivros){
          livros.exibir();
        }
    }

    Livro buscarporLivro(String nome){

        for(Livro livros : listadeLivros){

           if(livros.nome.equalsIgnoreCase(nome)){

              System.out.println("Nome: " + livros.getNome());
              System.out.println("Autor: " + livros.getAutor());
              System.out.println("Ano: " + livros.getAno());
              
            }
        }
    }   System.out.println("Livro não encontrado");
    

}
