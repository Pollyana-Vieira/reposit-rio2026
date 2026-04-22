import java.util.Stack;

public class Pilha{

    public static void main(String[]args){

        Stack<String> livros = new Stack<>();

        livros.push("Corrupt");
        livros.push("Hideaway");
        livros.push("Kill Switch");
        livros.push("Conclave");
        livros.push("Nightfall");
        livros.push("Fire Night");

     

        System.out.println(livros.peek());
         System.out.println(livros);
        
    
        
       

    }
}