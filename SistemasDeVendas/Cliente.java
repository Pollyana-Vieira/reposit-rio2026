
public class Cliente{

    private String nome;
    private String cpf;

    //GETTERS

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

    //SETTERS

    public boolean setNome(String nome) {
        if (nome == null // nome.trim().split("|\\s+").length < 2){
            return false;
        }
        this.nome = nome.trim();
        
    }
}

    

   

 