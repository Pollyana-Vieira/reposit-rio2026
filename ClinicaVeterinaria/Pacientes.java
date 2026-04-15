import java.util.*;

public class Pacientes {

    private String nome;
    private String especie;

    public Pacientes(String nome, String especie) {

        this.nome = nome;
        this.especie = especie;

    }
    public String getNome(){
        return nome;
    }
    public String getEspecie(){
        return especie;
    }

    void ExibirDadosDoPaciente() {
        System.out.println("Nome" + nome);
        System.out.println("Espécie" + especie);

    }

}