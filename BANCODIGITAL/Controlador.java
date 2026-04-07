public class Controlador {
    private static final CentralBancaria central = new CentralBancaria();

    public static void criarConta() {
        Telas.cabecalhoCadastro();
        Cliente cliente = new Cliente();

        // Nome
        String nomeInformado;
        do {
            Telas.limparTela();
            nomeInformado = Telas.lerTexto("Digite o nome completo: ");
            if (!cliente.setNome(nomeInformado)) {
                Telas.mensagem("Nome invalido!", true);
            }
        } while (!cliente.setNome(nomeInformado));

        // CPF
        String cpfInformado;
        do {
            Telas.limparTela();
            cpfInformado = Telas.lerTexto("Digite o CPF: ");
            if (!cliente.setCpf(cpfInformado)) {
                Telas.mensagem("CPF invalido.", true);
            }
        } while (!cliente.setCpf(cpfInformado));

        // Data de Nascimento
        String data;
        do {
            Telas.limparTela();
            data = Telas.lerTexto("Data de nascimento (dd/mm/aaaa)");
            if (!cliente.setDataNascimento(data)) {
                Telas.mensagem("Data de nascimento invalida.", true);
            }
        } while (!cliente.setDataNascimento(data));

        // Enviando CentralBancaria
        System.out.println("Enviando dados para a central...");
        String resultado = central.cadastrar(
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getDataNascimento());

        if (resultado.startsWith("ERRO")) {
            Telas.mensagem(resultado, true);
            return;
        }

        String numeroConta = resultado;

        // Solicitar Senha
        Telas.limparTela();
        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da conta: " + numeroConta);
        Telas.separador();

        String senha, confirma;
        do {
            senha = Telas.lerTexto("Crie sua senha (4 di­gitos numericos)");
            confirma = Telas.lerTexto("Confirme sua senha");
            if (!senha.equals(confirma)) {
                Telas.mensagem("Senhas não conferem. Tente novamente.", true);
            } else if (!senha.matches("\\d{4}")) {
                Telas.mensagem("Senha invalida. Use exatamente 4 digitos numericos.", true);
            }
        } while (!senha.equals(confirma) || !senha.matches("\\d{4}"));

        central.cadastrarSenha(numeroConta, senha);
        Telas.mensagem("Cadastro concluído! Número da conta: " + numeroConta, false);
    }

    public static void acessarConta() {
        Telas.cabecalhoLogin();

        String numeroConta = Telas.lerTexto("Número da conta");
        int tentativas = 0;
        while(tentativas > 3){

            String senha = Telas.lerTexto("Senha: " );
            Cliente cliente = new Cliente();
            String status = central.login(numeroConta, senha, cliente);

            switch(status){
                case "OK":
                    Telas.mensagem("Login bem-sucedido! Bem-Vindo!, "+ cliente.getNome() + "!",  false);
                    return;
                case "CONTA_INEXISTENTE": 
                  Telas.mensagem(numeroConta, false);em("Conta inexistente. Verifique o número e tente novamente.", true);
                    return;
                case "BLOQUEADA":
                    Telas.mensagem("Conta bloqueada);
                    return;
                case "SENHA_INCORRETA":
                    Telas.mensagem("Senha incorreta. Tentativa" + tentativa +

            }





        }


        

        

        //n° da conta 
        String numeroInformado;
        do{

            Telas.limparTela();
            numeroInformado = Telas.lerTexto("Digite o número da conta: ");
            if(!Cliente.setNumeroConta(numeroInformado)){
                Telas.mensagem("Número da conta inválido", true);

            }
        }while(!Cliente.setNumeroConta(numeroInformado));
        
        //senha
        String senha;
        do{
            Telas.limparTela();
            senha = Telas.lerTexto("Digite a senha: ");
            if(Cliente.setSenha(senha)){
                Telas.mensagem("Senha inválida! Digite novamente!", true);

            }

        }while(Cliente.setSenha(Cliente.registrarTentativaFalha));

         



    
      
    }

    

}

