# Falhas identificadas no projeto

## 1. Fonte de verdade duplicada

O projeto define um contexto de tarefas em `src/app/context/contexto-tarefas.tsx`, mas o componente principal de lista `src/app/components/shared/lista-atividades.tsx` não utiliza esse contexto.

- `ListaAtividades` mantém seu próprio estado local (`const [atividades, setAtividades] = useState<TypeTarefa[]>([])`).
- O componente carrega e salva dados diretamente no `localStorage` através de `getAtividades()`, `adicionarAtividade()`, `marcarComoConcluida()` e `removerAtividade()`.

Por que isso é problema:
- o estado fica espalhado em dois lugares diferentes;
- se outro componente usar o mesmo contexto, pode mostrar dados diferentes;
- torna a manutenção mais difícil e favorece bugs de sincronização.

## 2. Leitura de `localStorage` sem proteção

A função `getAtividades()` em `src/lib/api/local-storage.ts` faz:

```ts
const atividades = localStorage.getItem("atividades");
return atividades ? JSON.parse(atividades) : [];
```

Problema:
- `JSON.parse()` lança exceção se o conteúdo do `localStorage` não for JSON válido.
- isso pode acontecer se o usuário editar manualmente o storage, se o valor estiver corrompido ou se houver dados de versão antiga.

Consequência:
- o app pode quebrar no cliente;
- a página pode falhar ao carregar;
- não há fallback seguro.

## 3. Persistência e validação frágeis

O formulário em `ListaAtividades` valida apenas se `texto` não está vazio:

```ts
if (!valoresFormulario.texto.trim()) {
  setErrors({ ...errors, texto: true });
  return;
}
```

Problemas:
- não há verificação de tamanho máximo ou de conteúdo inválido;
- não há tratamento de erro ao gravar no `localStorage`;
- `setItem` pode falhar em casos extremos (storage cheio ou bloqueado);
- `JSON.parse` e `JSON.stringify` não estão protegidos por `try/catch`.

Consequência:
- o usuário pode tentar salvar uma tarefa e a aplicação travar;
- erros de armazenamento não são tratados nem exibidos.

## Falhas adicionais que também devem ser documentadas

- `src/lib/api/local-storage.ts` corrigido anteriormente para atualizar a propriedade `texto` (antes usava `text`).
- Botões de ação na tabela (`editar`, `remover`) não possuem `aria-label`, prejudicando acessibilidade.
- O arquivo `src/lib/helpers/helpers.ts` exporta `Helloworld`, que parece não ser usado.
- Não existem testes automatizados no repositório para fluxo de tarefas.

## Recomendações de correção prioritária

1. Centralizar o estado de tarefas em uma única fonte (preferencialmente o contexto).
2. Proteger `localStorage` com `try/catch` em `getAtividades()` e em `saveAtividades()`.
3. Melhorar a validação do formulário (`trim`, tamanho máximo, dados inválidos).
4. Adicionar `aria-label` em botões de ação.
5. Remover ou justificar código não usado.
6. Adicionar testes para CRUD de tarefas.
