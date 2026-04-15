import.java.ArrayDeque;
import.java.Queue;

public class FilaDeEspera{

    public static void Atendidos(String nome, int quantidade){
        List<String> Fila = new ArrayDeque<>();

        //adicionar clientes

        fila.add("primeiro paciente");
        fila.add("Segundo paciente");
        fila.add("Terceiro paciente");
        fila.add("Quarto paciente");

        //vendo a fila sem remover
        System.out.printl(fila.peek());

        //tamanho
        System.out.println(fila.size());

        //ver se está vazio
        System.out.println(fila.isEmpty());

        //removendo
        System.out.println(fila.remove());


    }
}