import java.util.*;

public class Main{
    public static void main(String[]args){

        Biblioteca biblioteca = new Biblioteca();

       Livro L1 = new Livro ("Punk 57", "Penelope Douglas", 2019);
       Livro L2 = new Livro ("Incipit", "Leonor Carvalho", 2024);
       Livro L3 = new Livro ("O Príncipe Cruel", "Holly Black", 2018);
       Livro L4 = new Livro("O Rei Perverso", "Holly Black", 2020);

        biblioteca.adicionar(L1);
        biblioteca.adicionar(L2);
        biblioteca.adicionar(L3);
        biblioteca.adicionar(L4);

        biblioteca.listar();


        System.out.println("=== BUSCA ===");
        System.out.println("Punk 57");
        biblioteca.buscarporLivro();
    }

        
}