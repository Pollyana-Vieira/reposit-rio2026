import java.util.ArrayList;

public class Biblioteca{

    static ArrayList<String, Object>  Listadelivros = new ArrayList<>();
    static Map<String, Integer> livros = new HashMap<>();

    Listadelivros.add("Punk 57", "Penelope Douglas", 2019);
    Listadelivros.add("Incipit", "Leonor Carvalho", 2024);
    Listadelivros.add("O Príncipe Cruel", "Holly Black", 2018);
    Listadelivros.add("O Rei Perverso", "Holly Black", 2020);

    public static void buscarporLivro(String nome){

        if(livros.containsKey(nome)){

           Map<String, Object> buscarLivro = Listadelivros.get();

           livros.get(nome);

           System.out.println("Nome: " + Listadelivros.get(nome));
           System.out.println("Autor: " + Listadelivros.get(autor));
           System.out.println("Ano: " + Listadelivros.get(ano));
           System.out.println("Livro não encontrado");

        }

        public staic void listarLivros(String nome, String autor, int ano){

            System.out.println(Listadelivros);
        }
    }

}