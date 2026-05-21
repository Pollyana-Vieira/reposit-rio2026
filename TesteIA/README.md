# Solução para Beecrowd - Soma dos Pares Consecutivos

## Descrição do problema

O programa deve ler uma sequência de valores inteiros até encontrar o valor `0`, que encerra a leitura.
Para cada valor lido `X` diferente de zero, o programa deve imprimir a soma dos 5 números pares consecutivos a partir de `X`.

- Se `X` for par, a sequência começa em `X`.
- Se `X` for ímpar, a sequência começa em `X + 1`.
- A sequência contém 5 valores pares consecutivos.

## Exemplos

Entrada:
```
4
11
0
```

Saída:
```
40
80
```

Explicação:
- Para `4`: soma = 4 + 6 + 8 + 10 + 12 = 40
- Para `11`: soma = 12 + 14 + 16 + 18 + 20 = 80

## O que foi necessário fazer

1. Criar a classe `Main` para compatibilidade com o Beecrowd.
2. Ler várias linhas de entrada usando `BufferedReader` até `EOF` ou até encontrar `0`.
3. Ignorar linhas vazias ou entradas inválidas.
4. Para cada número lido:
   - verificar se é `0` e encerrar o processamento.
   - calcular o primeiro número par da sequência.
   - somar os 5 números pares consecutivos.
5. Imprimir cada resultado em uma linha separada.

## Detalhes importantes

- A solução deve tratar corretamente números negativos e pares/ímpares.
- O programa deve parar imediatamente ao encontrar `0`, sem processar outros valores.
- A saída deve estar no formato exato esperado pelo Beecrowd: um valor por linha.

## Código usado

O arquivo principal é `SomadeParesConsecutivos.java`, que contém a implementação da lógica acima.
