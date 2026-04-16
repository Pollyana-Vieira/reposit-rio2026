import java.util.ArrayDeque;
import java.util.Queue;

public class FilaDeEspera {

  public static void Atendidos(String nome, int quantidade) {
    Queue<String> fila = new ArrayDeque<>();

    // adicionar clientes

    fila.add("primeiro paciente");
    fila.add("Segundo paciente");
    fila.add("Terceiro paciente");
    fila.add("Quarto paciente");

    // vendo a fila sem remover

  }

  public void verFilaDeEspera(String fila) {

    if (!fila.isEmpty()) {
      System.out.println(fila.peek()); // peek() é para ver o topo da fila sem remover.
    } else {
      System.out.println("A fila está vazia");
    }
  }

  public void removerPacienteAtendido(String fila) {

    if (!fila.isEmpty()) { // Empty é vazio
      System.out.println(fila.poll()); // remove() é usado para remover o elemento em fila.
    } else {
      System.out.println("A fila está vazia");
    }
  }
  

}