import java.util.Scanner;

class Telas {
    
    public static final Scanner sc = new Scanner(System.in);

    public static void limparTela(){
        for(int i = 0; i < 50; i ++){
            System.out.println();
        }
    }

    public static void menuPrincipal() {
        limparTela();

        System.out.println("====Menu Principal====");
        System.out.println("----BANCO DIGITAL ----");
        System.out.println("1-Criar Conta");
        System.out.println("2-Acessar conta");
        System.out.println("3-Sair");
        System.out.println("Opção selecionada: ");
        System.out.println("========================");

    }

    public static void menuConta() {
        limparTela();

        System.out.println("====Menu Conta====");
        System.out.println("---- SUA CONTA ----");
        System.out.println("Seja bem-vindo!");
        System.out.println();
        System.out.println("1-Depositar");
        System.out.println("2-Sacar");
        System.out.println("3-Transferir");
        System.out.println("4-Extrato");
        System.out.println("5-Sair");
        System.out.println("Escolha uma opção: ");
        System.out.println("======================");
    }

    public static String lerTexto(String label){
        System.out.println(label + ":");
        return sc.nextLine().trim();
    }

    public static double lerValor(String label){
        System.out.println(label + ": R$");
        try{
            return Double.parseDouble(sc.nextLine().trim().replace( ",", "." ));//replace serve para trocar um caractere por outro,nesse caso está substituindo a "," por um "." 

            
        } catch (NumberFormatException e) {
            return -1;
            
        }
        
    }

    public static int lerOpcao(){
        
        try{
            int opcao = Integer.parseInt(sc.nextLine().trim());
            return opcao;

        }catch (NumberFormatException e){
            return -1;
        }
        
    }

    public static void mensagem(String texto) {
        limparTela();

        System.out.println("\n" + texto);
        System.out.println("\n Pressione qualquer tecla para voltar ao ínicio");
        sc.nextLine();
    }

    public static String erro(String texto) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\n erro " + texto);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\n Pression");
        return sc.nextLine();
    }
}