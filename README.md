# Análise de Matriz em Java

Projeto desenvolvido em Java para praticar conceitos fundamentais de programação através da manipulação de matrizes quadradas.

## Sobre o projeto

O programa recebe uma matriz de ordem definida pelo usuário, realiza a leitura dos seus elementos e apresenta informações como a diagonal principal e a quantidade de números negativos encontrados.

## Funcionalidades

* Definição da ordem da matriz pelo usuário
* Validação da entrada (matriz entre 1 e 10)
* Leitura dos elementos da matriz
* Exibição da diagonal principal
* Contagem de números negativos presentes na matriz

## Conceitos praticados

* Lógica de programação
* Estruturas condicionais (`if/else`)
* Estruturas de repetição (`for` e `while`)
* Matrizes bidimensionais
* Entrada de dados utilizando `Scanner`
* Manipulação de dados em Java

## Tecnologias utilizadas

* Java
* JDK 25
* Visual Studio Code

## Como executar o projeto

Clone o repositório:

```bash
git clone git@github.com:devsamuelgoulart-hue/Java-Estudos.git
```

Compile o programa:

```bash
javac JavaEstudos/DiagonalNegativa.java
```

Execute:

```bash
java -cp . JavaEstudos.DiagonalNegativa
```

## Exemplo de execução

Entrada:

```text
Qual a ordem da matriz? 3

Elemento [0,0]: 1
Elemento [0,1]: 2
Elemento [0,2]: -3
Elemento [1,0]: 4
Elemento [1,1]: 5
Elemento [1,2]: 6
Elemento [2,0]: -7
Elemento [2,1]: 8
Elemento [2,2]: 9
```

Saída:

```text
DIAGONAL PRINCIPAL:
1 5 9

QUANTIDADE DE NEGATIVOS = 2
```

## Autor

Samuel Goulart

Estudante de Engenharia da Computação, desenvolvendo conhecimentos em programação e desenvolvimento de software.

