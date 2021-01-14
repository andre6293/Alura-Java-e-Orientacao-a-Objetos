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
  * [PrintStream/PrintWriter x OutputStream](#printstream-printwriter-x-outputstream)
  * [Serialização](#serializa--o)
  * [Implementação de um objeto](#implementa--o-de-um-objeto)
  * [List vs Set](#list-vs-set)
  * [Collections vs Collection](#collections-vs-collection)
  * [Sets](#sets)
  * [LinkedHashSet](#linkedhashset)
  * [TreeSet](#treeset)
  * [Hashmap](#hashmap)
  * [Notas adicionais](#notas-adicionais-1)
- [Módulo 3 - Java Moderno e TDD](#m-dulo-3---java-moderno-e-tdd)
  * [Default Methods](#default-methods)
  * [Method References](#method-references)
  * [TDD](#tdd)
  * [Anotações @Before, @After, @BeforeClass e @AfterClass](#anota--es--before---after---beforeclass-e--afterclass)

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
Sempre funciona em cascata, mas há a possibilidade de usar a palavra chave transient para evitar da serialização de um determinado atributo.

### Implementação de um objeto
Em vez de declararmos a referência a uma ArrayList<Aula> (ou LinkedList<Aula>), o ideal é deixarmos mais genérico, utilizando a interface List. Não há motivo para ser super específico na inst)ncia utilizada. Declarando-se apenas como List, é possível alterar a implementação depois, como para uma LinkedList, sem problema algum de compilação.

### List vs Set
Listas são indexáveis, possuem ordem e permitem itens duplicados. Sets são mais rápidos, para tarefas como busca, adição e remoção de itens, por usarem hashset (tabela de espalhamento).

### Collections vs Collection
Collections é uma classe utilitária que possui métodos auxiliares estáticos para trabalhar com coleções e arrays. *Ex.: Collections.sort(arrayExemplo)*
Collection é a interface que é estendida pelas classes List e Set.

### Sets
Ao utilizar a classe Set além de sobrescrever o método .equals(), também é necessário reescrever o método .hashCode() por ser a forma interna de comparação para a classe Set.

### LinkedHashSet
Diferentemente do HashSet mantém a ordem de inserção, porém continua não-indexado

### TreeSet
Só funciona para classes que extendam a interface Comparable. Em caso de se estar trabalhando com uma classe que não pode ser alterada é possível inserir no contrutor do TreeSet um objeto que implementa Comparator. Dessa forma o critério de comparação pode ser criado em separado da classe na qual opera

### Hashmap
Guarda uma key e um value. Funciona similarmente aos dictionaries do Python. Usa tabela de espalhamento internamente, dessa forma consegue fazer pesquisas mais rapidamente em relação a outras listas. 

### Notas adicionais
* toda e qualquer classe herda a super-classe Object
* O método .contains() usa internamente o método .equals(). Dessa forma sobrescrevendo a implementação da segunda, altera-se o comportamento da primeira.
* Ao usar o método .cointains() em uma **List** internamente serão feitas comparações utilizando o método .equals() do generic.

---

## Módulo 3 - Java Moderno e TDD
### Default Methods
O modificador default permite que se adicione métodos a uma interface sem o risco de perder compatibilidade com versões anteriores. A implementação do método default da interface é usada caso a classe concreta não o implemente.

### Method References
Para os casos em que uma expressão lambda apenas chama um método existente, é possível referenciar esse método direto pelo nome. <br>
Ex.: em vez de:<br>
`(s1, s2) -> s1.length().compare(s2.length)`<br>
Poderia-se usar:<br>
`(s1, s2) -> String::length`

### TDD
Primeiro são implementados os testes das novas funcionalidades que serão incluídas no projeto. Em seguida desenvolve-se o código.

### Anotações @Before, @After, @BeforeClass e @AfterClass
A anotação @Before garante que antes de inicializar cada um dos testes, será executado o método anotado. Similarmente a anotação @After significa que o método anotado será executado *após* cada teste.
Métodos anotados com @BeforeClass são executados apenas uma vez, antes de todos os métodos de teste. E os métodos anotados com @AfterClass, por sua vez, são executados uma vez, após a execução do último método de teste da classe.


---
Andre Pinto