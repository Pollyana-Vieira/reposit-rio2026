# Bug: Edição cria nova tarefa em vez de atualizar

Descrição
- Ao editar uma tarefa na interface e salvar, o projeto adiciona a alteração como uma nova tarefa em vez de substituir o texto da tarefa existente.

Como reproduzir
1. Iniciar o projeto (`npm install` e `npm run dev`).
2. Criar uma tarefa.
3. Clicar no botão de editar (ícone de lápis) em uma tarefa existente.
4. Alterar o texto e clicar em "Atualizar".

Comportamento esperado
- A tarefa selecionada deve ter seu texto substituído pelo novo texto (mesmo `id`, sem criar nova entrada).

Comportamento observado
- Uma nova tarefa é criada com o texto editado, e a tarefa original permanece.

Causa raiz
- Em `src/app/components/shared/lista-atividades.tsx` o handler de salvar (`handleSalvar`) sempre chamava `adicionarAtividade`, mesmo quando o formulário estava preenchido para edição (campo `id` diferente de 0).
- Em `src/lib/api/local-storage.ts` a função `atualizarAtividade` atualizava a propriedade `text` em vez de `texto`, portanto mesmo se chamada não alteraria corretamente o campo.

Correção aplicada
- Alterado `src/app/components/shared/lista-atividades.tsx` para chamar `atualizarAtividade(id, texto)` quando `valoresFormulario.id !== 0`, caso contrário chama `adicionarAtividade`.
- Corrigido `src/lib/api/local-storage.ts` para atualizar a propriedade correta `texto`.

Arquivos modificados
- [src/app/components/shared/lista-atividades.tsx](src/app/components/shared/lista-atividades.tsx)
- [src/lib/api/local-storage.ts](src/lib/api/local-storage.ts)

Teste pós-correção
1. Reiniciar a aplicação (`npm run dev`).
2. Criar uma tarefa, clicar em editar, modificar o texto e clicar em "Atualizar".
3. Verificar que a tarefa foi atualizada (mesmo `id`) e nenhuma nova tarefa foi criada.

Observações
- Essa correção assume que o campo do modelo é `texto` (conforme `TypeTarefa`).
- Posso abrir um PR com essa correção, ou se preferir eu executo `npm run dev` localmente aqui para testar manualmente.
