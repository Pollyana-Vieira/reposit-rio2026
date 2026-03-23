import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Opcao;

        do {

            Telas.menuPrincipal();
            Opcao = Telas.lerOpcao();

            switch (Opcao) {

                case 1:
                    System.out.println("1-Criar Conta");
                    Telas.menuPrincipal();
                    break;
                case 2:
                    System.out.println("2-Acessar conta");
                    Telas.menuConta();
                    break;

                case 3:
                    System.out.println("Saindo do Sistema...");
                    break;

                default:
                    Telas.erro("Opção inválida!Escolha novamente");
                    break;
            }

        } while (Opcao != 3);
        sc.close();
    }
}