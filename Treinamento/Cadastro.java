import java.util.ArrayList;
import java.util.List;

public class Cadastro{

    List<String> lista = new ArrayList<>(); //isso tem que ser fora do método

    public void cadastrar(String nome){

        // List<String> lista = new ArrayList<>(); //jeito errado(está dentro do método)

        lista.add(nome);

    }
    public void exibir(){

        System.out.println(lista);
    }
}