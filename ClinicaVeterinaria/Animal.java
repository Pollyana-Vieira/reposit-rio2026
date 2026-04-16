import java.util.*;

public class Animal {

    private String nome;
    private String especie;
    private String tutor;
    private int idade;
    private boolean urgente;

    public Animal(String nome, String especie, String tutor, int idade, boolean urgente) {

        this.nome = nome;
        this.especie = especie;
        this.tutor = tutor;
        this.idade = idade;
        this.urgente = urgente;

    }

   // public String getNome(){
       // return nome;
   // }
    //public String getEspecie(){
        //return especie;
    //}
    //public String getTutor(){
        //return tutor;
    //}
    //public int getIdade(){
       // return idade;
    //}

    
    @Override
    public String toString(String nome, String especie, String tutor, int idade, boolean urgente){
        return  +nome "-" "Espécie" + especie, "Tutor" + tutor, "Idade" + idade, "Urgente" + urgente;
    }

}