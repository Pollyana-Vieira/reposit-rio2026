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
         setNome(String nome);

        System.out.println("Digite seu CPF: ");
        String CPF = sc.nextLine();
        setCPF(String CPF);
        

        System.out.println("Digite sua data de nascimento: ");
        String data = sc.nextLine();
        setDataDeNascimento(String dataDeNascimento);
        




     }

}
