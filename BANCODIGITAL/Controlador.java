import java.util.Scanner;
class Controlador {

    public static void criarConta(){
        Scanner sc = new Scanner(System.in);
        
        //cabeçalho
        System.out.println("-------SEJA BEM-VINDO---------");
        System.out.println("====BANCO DIGITAL====");

        //coletar os dados
        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        if(){
           System.out.println("Nome inválido!Digite novamente!");
        }
        else{
            System.out.println("Nome cadastrado com sucesso!");
        }
        System.out.println("Digite seu CPF: ");
        String CPF = sc.nextLine();
        if(){
            System.out.println("CPF inválido!Digite novamente!");
        }
        else{}

        System.out.println("Digite sua data de nascimento: ");
        String data = sc.nextLine();
        if(){
           System.out.println("Data de nascimento inválida!Digite novamente!");
        }




     }

}
