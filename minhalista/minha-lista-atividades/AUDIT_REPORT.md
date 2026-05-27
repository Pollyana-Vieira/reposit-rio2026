# Auditoria rápida do projeto

Data: 2026-05-26

Resumo
- Revisão de código focada em arquivos em `src/` para identificar erros, falhas arquiteturais e melhorias de qualidade.

Principais achados

1) Estado duplicado / inconsistência de fonte da verdade
- Observação: Existe um `ContextoTarefasProvider` em `src/app/context/contexto-tarefas.tsx`, porém o componente principal `src/app/components/shared/lista-atividades.tsx` não o utiliza — em vez disso manipula estado local e `localStorage` diretamente.
- Risco: divergência entre estados, comportamento inesperado ao usar o contexto + componentes que usam `localStorage` diretamente.
- Recomendação: centralizar gerenciamento de tarefas no `ContextoTarefasProvider` (incluindo persistência em `localStorage`) e fazer os componentes consumirem o contexto, ou remover o provider se não for necessário.

2) Atualização de atividade (bug já consertado)
- Observação: A função `atualizarAtividade` em `src/lib/api/local-storage.ts` atualizava a propriedade errada (`text` em vez de `texto`) — isso impedia gravação correta. Foi corrigido.
- Recomendação: manter testes simples para fluxos CRUD para evitar regressões.

3) Falta de tratamento ao parsear `localStorage`
- Observação: `getAtividades()` faz `JSON.parse()` sem `try/catch`.
- Risco: entradas inválidas no `localStorage` podem quebrar a aplicação no cliente.
- Recomendação: envolver em `try/catch` e, em caso de erro, limpar/relatar o dado e retornar lista vazia.

4) Uso direto de `Date.now()` como `id`
- Observação: gera `id` numérico com `Date.now()` em `adicionarAtividade`.
- Risco: risco baixo de colisão se duas tarefas forem criadas no mesmo ms, auditabilidade limitada.
- Recomendação: usar `crypto.randomUUID()` (navegadores modernos) ou um gerador de UUID para ids estáveis/únicos.

5) Acessibilidade do botão de edição
- Observação: o botão de editar (`<Button startIcon={<Edit />}>`) não possui texto nem `aria-label` visível.
- Risco: leitores de tela podem não anunciar a ação adequadamente.
- Recomendação: adicionar `aria-label="Editar tarefa"` ou incluir texto oculto para acessibilidade.

6) Possível incompatibilidade entre versões (verificar)
- Observação: `package.json` declara `next: 15.0.2` e `react: ^18.3.1`.
- Risco: versões major divergentes podem gerar incompatibilidades; verificar compatibilidade oficial do Next com a versão do React utilizada.
- Recomendação: ajustar dependências conforme docs do Next.js e executar `npm install`/`npm run build` para confirmar que não há warnings.

7) Falta de tratamento de erros e validações adicionais
- Observação: validação mínima no formulário (somente campo obrigatório). Falta tratamento de exceções em funções de persistência.
- Recomendação: adicionar validação mais robusta, mensagens de erro ao usuário e captura/log de exceções.

8) Código morto / funções não usadas
- Observação: `src/lib/helpers/helpers.ts` exporta `Helloworld` que aparentemente não é usado.
- Recomendação: remover código não utilizado ou adicionar testes/uso justificável.

9) Ausência de testes automatizados
- Observação: não há testes no repositório.
- Recomendação: adicionar testes unitários para funções de armazenamento e componentes (React Testing Library / Vitest / Jest) e testes E2E básicos.

10) Local/client boundary
- Observação: vários arquivos estão marcados com `"use client"` (por ex. `page.tsx`, `lista-atividades.tsx`, `local-storage.ts`). Tudo que acessa `localStorage` deve rodar no cliente.
- Risco: chamar APIs de cliente em componentes de servidor pode quebrar a renderização.
- Recomendação: garantir que somente componentes cliente acessem `localStorage` e considerar mover persistência para o contexto cliente.

Ações sugeridas (prioridade)
- Alta: Centralizar estado (contexto) e tratar JSON.parse com try/catch; adicionar `aria-label` aos botões importantes.
- Média: Substituir `Date.now()` por UUID; remover código não usado; ajustar dependências se necessário.
- Baixa: Adicionar testes automatizados, melhorar validações de formulário e logs de erro.

Se quiser, eu posso:
- Implementar automaticamente as correções prioritárias (ex.: try/catch em `getAtividades`, usar `crypto.randomUUID()`, adicionar aria-labels), e abrir um PR.
- Rodar a aplicação aqui e testar interativamente após as mudanças.


---
Arquivo gerado automaticamente pelo assistente.
