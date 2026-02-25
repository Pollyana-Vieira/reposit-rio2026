import java.util.*;

public class cadastrodealunos2 {

    static ArrayList<Map<String, Object>> alunos = new ArrayList<>();
    static Map<String, Integer> matriculadoAluno = new HashMap<>();

    // cadastrar alunos
    public static String cadastraraluno(String matricula, String nome, int idade) {

        // validação da Matrícula
        if (matricula == null || matricula.trim().isEmpty()) {// trim remove espaço no começo e no final //null algo que
                                                              // não existe

            return "Matrícula inválida";
        }

        // Verificação de Matrícula
        if (matriculadoAluno.containsKey(matricula)) {
            return "Matrícula encontrada";
        }
        // Verificar a idade
        if (idade < 0) {
            return "Idade inválida";

        }

        // Cadastrar aluno
        Map<String, Object> aluno = new HashMap<>();

        aluno.put("nome", nome);
        aluno.put("idade", idade);
        aluno.put("matricula", matricula);

        // adicionar no ArrayList
        alunos.add(aluno);

        // atualização
        matriculadoAluno.put(matricula, alunos.size() - 1);

        return "Cadastro realizado com sucesso";

    }

    // BUSCAR ALUNO
    public static void buscarMatricula(String matricula) {

        if (matriculadoAluno.containsKey(matricula)) {

            Map<String, Object> buscarAluno = alunos.get(indice);

            matriculadoAluno.get(matricula);

            System.out.println("Aluno encontrado:");
            System.out.println("Nome: " + alunos.get(nome));
            System.out.println("Idade: " + alunos.get(idade));
            System.out.println("Matrícula: " + alunos.get(matrícula));

        } else {

            System.out.println("Aluno não encontrado");

        }

    }

    // LISTAR ALUNOS
    public static void listarAlunos() {

        System.out.println("==== LISTA DE ALUNOS ====");

        for (int i = 0; i < alunos.size(); i++) {

            Map<String, Object> aluno = alunos.get(i);

            System.out.println("ALUNO: ");
            System.out.println("Matrícula: " + aluno.get("matricula"));
            System.out.println("Nome: " + aluno.get("nome"));
            System.out.println("Idade: " + aluno.get("idade"));
        }
    }

    // REMOVER ALUNO
    public static void removerAluno(String matricula) {

        Map<String, Object> aluno = alunos.get();

        int indice = matriculadoAluno.get(matricula);

        if (matriculadoAluno.containsKey(matricula)) {
            System.out.println("Matrícula removida");

        } else {
            System.out.println("Matrícula não encontrada");
        }

        int indice = matriculadoAluno.get(matricula);

        alunos.remove(indice);

        matriculadoAluno.remove(matricula);

        for (Map.Entry<String, Integer> entry : matriculadoAluno.entrySet()) {
            if (entry.getValue() > indice) {
                entry.setValue(entry.getValue() - 1);
            }
        }

        System.out.println("ALUNO REMOVIDO");
    }
    public static void main(String[]args){

       int menu
       sc.nextInt();

        switch (menu) {
            case 1:System.out.println("Cadastrar Aluno");
                    break;
            case 2:System.out.println("Buscar Aluno");  
                    break;
            case 3:System.out.println("Listar Aluno");
                    break;
            case 4:System.out.println("Remover Aluno");
                    break;
            case 5:System.out.println("Sair");
                    break;                              
            default:System.out.println("Opção inválidade!Digite novamente!");
                     break;
        
                
        }
    }

}
