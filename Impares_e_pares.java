//*DESAFIO 1259* _ÍMPARES E PARES_

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

       
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int valor = sc.nextInt();

            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            } 
        }

        for(int p : pares){

            System.out.println(p);
        }
        for(int i : impares){

            System.out.println(i);
        }

    }

}