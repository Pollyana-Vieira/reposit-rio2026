import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;

    private static final List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome.trim();
        }
    }

    public void setCpf(String cpf) {
        if (cpf != null) {
            this.cpf = cpf.trim();
        }
    }

    public static boolean cadastrar(String nome, String cpf) {
        if (nome == null || nome.trim().isEmpty() || cpf == null || cpf.trim().isEmpty()) {
            return false;
        }

        if (buscarPorCpf(cpf) != null) {
            return false;
        }

        clientes.add(new Cliente(nome.trim(), cpf.trim()));
        return true;
    }

    public static List<Cliente> listar() {
        return new ArrayList<>(clientes);
    }

    public static Cliente buscarPorCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            return null;
        }

        String chave = cpf.trim();
        for (Cliente cliente : clientes) {
            if (cliente.cpf.equalsIgnoreCase(chave)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Cliente[cpf=%s, nome=%s]", cpf, nome);
    }
}
