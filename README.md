# ESTAGIO-RP
# Atividades Técnicas

Este repositório contém soluções em Java para uma série de atividades técnicas. Abaixo estão descritas cada uma das atividades e como o código foi implementado.

## Atividade 1: Sequência de Fibonacci

### Descrição
Dada a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), o programa deve calcular a sequência até o número informado e retornar uma mensagem avisando se o número informado pertence ou não à sequência.

### Implementação
O código em Java está implementado no arquivo `FibonacciChecker.java`.

### Como Executar
1. Compile o código:
   ```sh
   javac FibonacciChecker.java
   ```
2. Execute o código:
   ```sh
   java FibonacciChecker <numero>
   ```

---

## Atividade 2: Verificação de Letras

### Descrição
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

### Implementação
O código em Java está implementado no arquivo `LetterACounter.java`.

### Como Executar
1. Compile o código:
   ```sh
   javac LetterACounter.java
   ```
2. Execute o código:
   ```sh
   java LetterACounter <string>
   ```

---

## Atividade 3: Cálculo do Valor de Variável

### Descrição
Dado o trecho de código:

```java
int INDICE = 12, SOMA = 0, K = 1;
enquanto K < INDICE faça {
    K = K + 1;
    SOMA = SOMA + K;
}
imprimir(SOMA);
```

O código calcula o valor da variável `SOMA` ao final do processamento.

### Resultado
O valor da variável `SOMA` ao final do processamento será 91.

### Implementação
O código em Java está implementado no arquivo `CalculoSOMA.java`.

### Como Executar
1. Compile o código:
   ```sh
   javac CountIndice.java
   ```
2. Execute o código:
   ```sh
   java CountIndice
   ```

---

## Atividade 4: Completar a Lógica

### Descrição
Descubra a lógica e complete o próximo elemento da sequência:
- a) 1, 3, 5, 7, ___  
  **Próximo elemento:** 9 (a sequência é de números ímpares consecutivos)

- b) 2, 4, 8, 16, 32, 64, ____  
  **Próximo elemento:** 128 (a sequência é uma progressão geométrica multiplicada por 2)

- c) 0, 1, 4, 9, 16, 25, 36, ____  
  **Próximo elemento:** 49 (a sequência é de quadrados perfeitos: \(n^2\))

- d) 4, 16, 36, 64, ____  
  **Próximo elemento:** 100 (a sequência é de \(n^2\), mas começando de 2 e pulando 2, então \(2^2, 4^2, 6^2, 8^2, 10^2\))

- e) 1, 1, 2, 3, 5, 8, ____  
  **Próximo elemento:** 13 (sequência de Fibonacci)

- f) 2, 10, 12, 16, 17, 18, 19, ____  
  **Próximo elemento:** 200 (sequência de números que contém a letra 'd' quando escritos em inglês)

### Implementação
O código em Java está implementado no arquivo `CompletaLogica.java`.

### Como Executar
1. Compile o código:
   ```sh
   javac Sequencias.java
   ```
2. Execute o código:
   ```sh
   java Sequencias
   ```

---

## Atividade 5: Interruptores e Lâmpadas

### Descrição
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. O código simula como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada.

### Implementação
O código em Java está implementado no arquivo `InterruptoresELampadas.java`.

### Como Executar
1. Compile o código:
   ```sh
   javac Luz.java
   ```
2. Execute o código:
   ```sh
   java Luz
   ```

---

## Contato

Para mais informações, sinta-se à vontade para abrir uma issue ou enviar um pull request.
