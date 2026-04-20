import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

    private Queue<String> fila = new LinkedList<>();
        
    public void entrar(String nome){

        fila.add(nome);
       
    }
    public String chamar(String nome){

       return fila.poll();
       

    }
    public void exibirFila(){

        System.out.println(fila);

    }
    
}
