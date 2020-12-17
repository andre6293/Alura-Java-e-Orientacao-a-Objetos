# Notas

## protected
A palavra chave protected torna uma variável privada para a parte externa da classe, porém visível para as classes que extendam, que herdam, a classe mãe (ou super classe).

## super x this
Quando uma classe herda características e atributos de uma classe mãe (ou super classe) é possível substituir o termo "this" por "super" para indicar que a definição de um atributo esta definida na super classe.

## sobrecarga (overload)
Ocorre quando se cria dois métodos com o mesmo nome que variam a quantidade ou tipo de parâmetros de entrada. Ambos os métodos poderao ser usados.

## contrutores
Classes que herdam de uma super classes NÃO herdam os construtores.

## Anotaçao @Override
Usa-se quando você quer sobrescrever um método de uma super classe. Não é obrigatório, mas é uma boa prática para evitar erros de digitação.

## Classe abstrata
E uma classe que só é usada como super classe. Não é possível criar um objeto somente com a super classe.

## Método abstrato em uma super classe
Só se pode fazer métodos abstratos em classes abstratas. Ao criar uma classe filha será OBRIGATÓRIO implementar o método abstrato da classe mãe.

## Heranças múltiplas
Não é possível fazer no java, porém em linguagens como Python e C++ sim. Situações em que a herança múltipla seja necessária, deve-se solucionar com interfaces.

## Uso de interface x extensão de classes
Para o uso de interface deve-se usar a palavra chave implements em vez de extends (usada somente para classes filhas).

Notas:
As interfaces não podem ter métodos concretos, nisso elas se diferem das classes abstratas que podem sim ter esse tipo de método.

---
Andre Pinto
