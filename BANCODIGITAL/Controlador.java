import java.util.Scanner;
class Controlador {

    public static void criarConta(){
        Scanner sc = new Scanner(System.in);
        
        Nome n = new nome;
        CPF c = new CPF;
        Data d = new dataDeNascimento;

        //cabeçalho
        System.out.println("-------SEJA BEM-VINDO---------");
        System.out.println("====BANCO DIGITAL====");

        //coletar os dados
        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        n.setNome();



        System.out.println("Digite seu CPF: ");
        String CPF = sc.nextLine();
        c.setCPF();
        

        System.out.println("Digite sua data de nascimento: ");
        String data = sc.nextLine();
        d.setDataDeNascimento();
        




     }

}
