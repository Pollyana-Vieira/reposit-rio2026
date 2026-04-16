import java.util.*;

public class HistoricoDeAtendimento {

    public static void atendidos(String nome) {

        Stack<String> pilha = new Stack<>();

        // add lista de atendidos
        pilha.push("Belinha");
        pilha.push("Mel");
        pilha.push("Spayk");
        pilha.push("Kira");

        // ver topo
        System.out.println("Topo da pilha: " + pilha.peek());

    }
    //remover
        public static void removerPacienteAtendido(String pilha){

            if(!pilha.isEmpty()){ //Empty é vazio
              System.out.println("Removido:" + pilha.pop()); 
            }
           else{
              System.out.println("A pilha está vazia");
            }
        

}
