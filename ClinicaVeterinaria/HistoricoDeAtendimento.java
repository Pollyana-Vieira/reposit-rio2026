package clinicaveterinaria;

import java.util.*;

public class HistoricoDeAtendimento{

    public static void Atendidos(String nome, int quantidade){

        Stack<String, Integer> Pilha = new Stack<>();

        //add lista de atendidos
        pilha.add("Belinha");
        pilha.add("Mel");
        pilha.add("Spayk");
        pilha.add("Kira");

        //ver topo
        System.out.println(pilha.peek());

        //remover
        System.out.println(pilha.remove());

        //tamanho
        System.out.println(pilha.size());
    }
}