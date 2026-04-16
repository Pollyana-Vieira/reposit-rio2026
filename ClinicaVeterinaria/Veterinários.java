import java.util.ArrayList;
import java.util.List;

public class Veterinários{

    private String nome;
    private String especialidade;
    
    public void veterinarios(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
     @Override
    public String toString(){
        return nome "-" + especialidade;
    }

    public static void Funcionários(String nomes){

        List<veterinarios> lista = new ArrayList<>();
       
        //adicionar
        lista.add(new Veterinarios("Karla", "Cirurgia"));
        lista.add(new Veterinarios("Paula", "Oftamologia"));
        lista.add(new Veterinarios("Erivaldo", "Oncologia")); //diagnóstico e tratamento de câncer;
        lista.add(new Veterinarios("Bruno", "Cardiologia"));

        

        public String toString(String nome, String especialidade){
            return funcionarios["Nome" + nome, "Especialidade" + especialidade];
        }

        
    }
   

    
}