import java.util.ArrayList;
import java.util.Deque;

public class Clinica {

    private Deque<Animal> filaDeEspera;



    private Deque<Animal>historicoDeAtendimento;

    private ArrayList<Veterinarios>veterinarios;
    
    public void cadastrarVeterinario(Veterinarios v){
        veterinarios.add(v);
    }
    public void receberAnimal(Animal a){
        filaDeEspera.foll(a);
    }
    public void atenderAnimal(){
        if(!filaDeEspera.isEmpty()){  //Empty é vazio
            Animal a = filaDeEspera.poll();

            System.out.println("Atendendo: " + a.toString()); 
            historicoDeAtendimento.push(a);
        }
        else{

            System.out.println("Nenhum animal na fila");
        }     
            
        
    }
    public void verFila(){
        System.out.println("Fila de espera:");
        for(Animal a : filaDeEspera){
            System.out.println(a.toString());
        }
    }
    public void verHistoricoDeAtendimento(){
        System.out.println("Histórico de atendimento:");
        for(Animal a : historicoDeAtendimento){
            System.out.println(a.toString());
        }
    }
    public void verVeterinarios(){
        System.out.println("Veterinários:");
        for(Animal a : veterinarios){
            System.out.println(a.toString());
        }
    }


}

