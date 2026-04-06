import java.util.ArrayList;
import java.util.List;


public class Historico {

    private List<Transacao> transacoes = new ArrayList<>();

    /* Registra uma nova transação no histórico. */
    public void adicionar(Transacao transacao) {
        transacoes.add(transacao);
    }
    public List<String> listar() {
        List<String> historico = new ArrayList<>();
        if (transacoes.isEmpty()) {
            historico.add("Nenhuma movimentação registrada.");
            return historico;
        }
        for (Transacao t : transacoes) {
            historico.add(t.toString());
        }
        return historico;
    }
}
