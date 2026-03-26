import java.util.Scanner;

class Controlador {

    public static void criarConta() {
        Scanner sc = new Scanner(System.in);

       Cliente c1 = new Cliente();

        // cabeçalho
        System.out.println("\n=====CADASTRO=====");
        System.out.println("-------SEJA BEM-VINDO---------");
        System.out.println("====BANCO DIGITAL====");

        // coletar os dados
        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        c1.setNome(nome);

        System.out.println("Digite seu CPF: ");
        String CPF = sc.nextLine();
        c1.setCPF(CPF);

        System.out.println("Digite sua data de nascimento: ");
        String data = sc.nextLine();
        c1.setDataDeNascimento(data);



    }
    
    public static void EnviarParaCentralBancaria(){

        System.out.println("Em breve...");

        System.out.println("Nome");
        sc.nextLine();
        getNome();


    }

}
