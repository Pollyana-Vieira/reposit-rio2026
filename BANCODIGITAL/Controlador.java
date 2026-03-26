import java.util.Scanner;

class Controlador {

    public static void criarConta() {
        Scanner sc = new Scanner(System.in);

        // cabeçalho de cadastro
        Telas.cabecalhoCadastro();

        //instanciando o objeto
        Cliente c1 = new Cliente();


        // coletar os dados

        //nome e sua validação

        
        String nomeInformado = Telas.lerTexto("Digite seu nome completo: ");
        c1.setNome(nomeInformado);


        //cpf e sua validação
        String CPFInformado = Telas.lerTexto("Digite seu CPF: ");

        System.out.println("Digite seu CPF: ");
        String CPF = sc.nextLine();
        c1.setCPF("CPF");

        System.out.println("Digite sua data de nascimento: ");
        String data = sc.nextLine();
        c1.setDataDeNascimento("data");



    }
    
    public static void EnviarParaCentralBancaria(){

        System.out.println("Em breve...");

        System.out.println("Nome");
        sc.nextLine();
        getNome();

        System.out.println("CPF");
        sc.nextLine();
        getCPF();

        System.out.println("Data de nascimento");
        sc.nextLine();
        getDataDeNascimento();


    }

}
