# Notas

## Conteúdo
- [Módulo 1 - Linguagem Java e Orientação a Objetos](#m-dulo-1---linguagem-java-e-orienta--o-a-objetos)
  * [protected](#protected)
  * [super x this](#super-x-this)
  * [sobrecarga (overload)](#sobrecarga--overload-)
  * [contrutores](#contrutores)
  * [Anotaçao @Override](#anota-ao--override)
  * [Classe abstrata](#classe-abstrata)
  * [Método abstrato em uma super classe](#m-todo-abstrato-em-uma-super-classe)
  * [Heranças múltiplas](#heran-as-m-ltiplas)
  * [Uso de interface x extensão de classes](#uso-de-interface-x-extens-o-de-classes)
  * [Try-with-resources](#try-with-resources)
  * [Notas adicionais](#notas-adicionais)
- [Módulo 2 - Principais bibliotecas](#m-dulo-2---principais-bibliotecas)
  * [Modificador de visibilidade *"package private"*](#modificador-de-visibilidade---package-private--)
  * [Javadoc](#javadoc)
  * [java.lang.String](#javalangstring)
  * [ArrayList](#arraylist)
  * [Function Objects](#function-objects)
  * [Notas adicionais](#notas-adicionais-1)

---

## Módulo 1 - Linguagem Java e Orientação a Objetos
### protected
A palavra chave protected torna uma variável privada para a parte externa da classe, porém visível para as classes que extendam, que herdam, a classe mãe (ou super classe).

### super x this
Quando uma classe herda características e atributos de uma classe mãe (ou super classe) é possível substituir o termo *this* por *super* para indicar que a definição de um atributo esta definida na super classe.

### sobrecarga (overload)
Ocorre quando se cria dois métodos com o mesmo nome que variam a quantidade ou tipo de parâmetros de entrada. Ambos os métodos poderao ser usados.

### contrutores
Classes que herdam de uma super classes NÃO herdam os construtores.

### Anotaçao @Override
Usa-se quando você quer sobrescrever um método de uma super classe. Não é obrigatório, mas é uma boa prática para evitar erros de digitação.

### Classe abstrata
E uma classe que só é usada como super classe. Não é possível criar um objeto somente com a super classe.

### Método abstrato em uma super classe
Só se pode fazer métodos abstratos em classes abstratas. Ao criar uma classe filha será **OBRIGATÓRIO** implementar o método abstrato da classe mãe.

### Heranças múltiplas
Não é possível fazer no java, porém em linguagens como Python e C++ sim. Situações em que a herança múltipla seja necessária, deve-se solucionar com interfaces.

### Uso de interface x extensão de classes
Para o uso de interface deve-se usar a palavra chave implements em vez de extends (usada somente para classes filhas).

### Try-with-resources
O bloco *finally* é criado automaticamente e nele é chamado o método close().

### Notas adicionais
* As interfaces não podem ter métodos concretos, nisso elas diferem das classes abstratas que podem sim ter esse tipo de método.
* O polimorfismo garante baixo acomplamento.

---

## Módulo 2 - Principais bibliotecas
### Modificador de visibilidade *"package private"*
Ocorre quando não é colocada nenhuma palavra chave (private, public ou protected) antes da declaração de uma classe ou método. Na prática fica implícito que a classe/método será visível para outros arquivos que pertençam ao mesmo pacote, mas não fora dele.

### Javadoc
É possível documentar o projeto com o uso de anotações /** e @ (@author, por exemplo) e depois exportar para o uso de outros programadores.

### java.lang.String
Strings são imutáveis em Java. Existe diferença entre a criação com new e a criação com aspas duplas. Usar aspas duplas é boa prática pois a JVM pode executar várias otimizações por *baixo dos panos*.

### ArrayList
Espera um objeto em sua entrada, caso seja apontado um tipo primitivo, *por baixo dos panos*, ele será convertido a uma classe relativa a ele (wrapper). 
Por exemplo: um int será convertido em um objeto do tipo Integer. O chamado Autoboxing. O procedimento invertido se chama Unboxing.

### Function Objects
São objetos que criamos para encapsular uma função ou método. As classes anônimas facilitam a criação desses objetos.

### PrintStream/PrintWriter x OutputStream
Os OutputStreams lidam com bytes em vez de caracteres. É preferencial utilizar os Writers para escrever dados de caracteres. No caso de diferentes tipos e/ou binários é melhor utilizar OutputStream.

### Serialização
Sempre funciona em cascata, mas há a possibilidade de usar a palavra chave transient para "fugir" da serialização de um determinado atributo.

### Notas adicionais
* toda e qualquer classe herda a super-classe Object
* O método .contains() usa internamente o método .equals(). Dessa forma sobrescrevendo a implementação da segunda, altera-se o comportamento da primeira.


---
Andre Pinto
