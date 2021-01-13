package br.com.exercicios.classes;

/**
 *

 Desafio: Implemente a classe AnoBissexto, que contenha o método boolean ehBissexto(int ano).
 A ideia dessa classe é calcular se um ano é bissexto ou não.

 Um ano bissexto é aquele que tem 366 dias. Para saber se um ano é bissexto,
 devemos seguir as regras abaixo:
 - De 4 em 4 anos é ano bissexto.
 - De 100 em 100 anos não é ano bissexto.
 - De 400 em 400 anos é ano bissexto.
 - Prevalecem as últimas regras sobre as primeiras.

 Você pode ler mais sobre anos bissextos na Wikipédia.

 Pratique TDD.

 */


public class AnoBissexto {

    public boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && !(ano % 100 == 0 && !(ano % 400 == 0)));
    }
}
