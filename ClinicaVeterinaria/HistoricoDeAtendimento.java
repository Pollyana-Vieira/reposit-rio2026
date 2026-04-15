import java.util.*;

public class HistoricoDeAtendimento{

    public static void Atendidos(String nome, int quantidade){

        Stack<String> pilha = new Stack<>();

        //add lista de atendidos
        pilha.push("Belinha");
        pilha.push("Mel");
        pilha.push("Spayk");
        pilha.push("Kira");

        //ver topo
        System.out.println(pilha.peek());

        //remover
        public void removerPacienteAtendido(String pilha){

            if(!pilha.isEmpty()){ //Empty é vazio
              System.out.println(pilha.pop()); //pop() é usado para remover o elemento em pilha.
            }
           else{
              System.out.println("A pilha está vazia");
            }
        


        }
        

       
        //tamanho
        System.out.println(pilha.size());
    }
}