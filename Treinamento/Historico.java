import java.util.Stack;

public class Historico {

    private Stack<String> pilha = new Stack<>();

    public void adicionar(String nome){

        pilha.push(nome);


    }
    public String remover(){

        if(!pilha.isEmpty()){
            return pilha.pop();     

        }else{
           return null;
        }

        
    }
    public void exibirHistorico(){

        System.out.println(pilha);
    }

    
}
