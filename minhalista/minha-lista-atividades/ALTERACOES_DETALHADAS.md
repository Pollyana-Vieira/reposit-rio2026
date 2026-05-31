# Alterações detalhadas

Este documento descreve, de forma detalhada, as alterações realizadas no projeto conforme solicitado.

## Arquivo modificado: Falhas.md

- Descrição geral: o arquivo `Falhas.md` foi atualizado para documentar problemas encontrados no projeto e recomendações de correção. Entre os pontos incluídos estão:
  - Estado duplicado entre o `contexto-tarefas` e o uso direto de `localStorage` pelo componente `ListaAtividades`.
  - Leitura do `localStorage` sem proteção (`try/catch`), expondo o app a quebras se o JSON estiver corrompido.
  - Validação de formulário insuficiente (apenas `trim()`), sem checagem de tamanho máximo, conteúdo inválido ou tratamento de erro ao persistir.
  - Observações extras: correção prévia em `src/lib/api/local-storage.ts` (propriedade `texto`), falta de `aria-label` em botões e código não usado em helpers.

Esses pontos já constam no conteúdo de `Falhas.md` e servem como contexto para as alterações de código descritas abaixo.

## Arquivo modificado: src/app/components/shared/lista-atividades.tsx

Função afetada: `const handleSalvar = () => { ... }`
Localização: em torno das linhas 60-90 do arquivo. As alterações relevantes estão agrupadas nas seguintes faixas (números de linha conforme o arquivo atual):

- Linhas 66-70
  - Código existente:

  ```ts
  if (texto.length > 200) {
    setErrors({ ...errors, texto: true });
    // You can improve by setting a specific message state for helperText
    return;
  }
  ```

  - O que mudou / objetivo:
    - Foi adicionada uma validação que impede que o texto da atividade exceda 200 caracteres.
    - Quando o comprimento é maior que 200, o estado `errors.texto` é marcado como `true` para exibir o erro no campo (`helperText`).
    - Há um comentário indicando que a UX pode ser melhorada definindo uma mensagem específica em um estado separado (por exemplo, `helperText` mais descritivo em vez de apenas `true`).

- Linhas 71-74
  - Código existente:

  ```ts
  if (texto.length < 2){
    alert("A atividade deve ter pelo menos 2 caracteres");
    return;
  }
  ```

  - O que mudou / objetivo:
    - Foi adicionada uma validação de tamanho mínimo: o texto da atividade deve ter pelo menos 2 caracteres.
    - Em caso de falha, o usuário recebe um `alert` com a mensagem explicativa e o salvamento é abortado.
    - Observação: o uso de `alert` é uma solução rápida; recomenda-se usar um feedback inline (ex.: `helperText`) para melhorar a experiência do usuário.

- Linhas 75-78
  - Código existente:

  ```ts
  if (/^\d+$/.test(texto)){
    alert("A atividade não pode conter apenas números");
    return;
  }
  ```

  - O que mudou / objetivo:
    - Foi adicionada uma validação para impedir que o texto contenha apenas dígitos (somente números).
    - Quando o texto for composto apenas por números, o usuário é notificado por `alert` e a operação é cancelada.

## Mudança complementar dentro do `handleSalvar`

- Normalização do texto antes das validações:
  - A variável `texto` agora é construída assim:

  ```ts
  const texto = valoresFormulario.texto.trim().replace(/\s+/g, " ");
  ```

  - Objetivo: remover espaços em branco nas extremidades, colapsar múltiplos espaços em um único espaço e garantir validações mais previsíveis.

- Fluxo de salvamento e tratamento de erro:
  - Se `valoresFormulario.id !== ""`, a função chama `atualizarAtividade(id, texto)`; caso contrário, chama `adicionarAtividade(texto)`.
  - O retorno dessas funções é guardado em `success`. Se `success` for `false`, o código registra o erro no console e mostra um `alert` com a mensagem: "Erro ao salvar atividade. Tente novamente." e interrompe o fluxo.

## Racional das alterações

- Evitar entradas inválidas que possam corromper os dados salvos (ex.: strings vazias, entradas muito longas, ou apenas números).
- Melhorar a qualidade dos dados armazenados e reduzir a chance de erros no `localStorage` e na interface.
- Fornecer sinalização de erro ao usuário (ainda que com `alerts` em algumas checagens), com intenção posterior de substituir por mensagens inline/UX melhor.

## Recomendações adicionais (próximos passos)

- Substituir `alert` por feedback inline no formulário (usar `helperText` e estados de mensagem específicos para distinguir tipo de erro).
- Centralizar o estado de tarefas no `contexto-tarefas` e remover a leitura/escrita direta de `localStorage` do componente `ListaAtividades` para eliminar a fonte de verdade duplicada.
- Proteger chamadas a `JSON.parse`/`localStorage.setItem` com `try/catch` (conforme recomendado em `Falhas.md`).
- Adicionar testes unitários para as validações do formulário e para as funções de persistência (`adicionarAtividade`, `atualizarAtividade`, etc.).

---

Arquivo gerado automaticamente em: ALTERACOES_DETALHADAS.md
