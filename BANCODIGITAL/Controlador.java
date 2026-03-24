import java.util.Scanner;

class Controlador {

    public static void criarConta() {
        Scanner sc = new Scanner(System.in);

        Pessoa a1 = new nome();
        Pessoa a2 = new CPF();
        Pessoa a3 = new dataDeNascimento();

        // cabeçalho
        System.out.println("-------SEJA BEM-VINDO---------");
        System.out.println("====BANCO DIGITAL====");

        // coletar os dados
        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        a1.setNome();

        System.out.println("Digite seu CPF: ");
        String CPF = sc.nextLine();
        a2.setCPF();

        System.out.println("Digite sua data de nascimento: ");
        String data = sc.nextLine();
        a3.setDataDeNascimento();

    }

}
