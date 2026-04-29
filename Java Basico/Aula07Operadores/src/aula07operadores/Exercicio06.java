
package aula07operadores;

public class Exercicio06 { 
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 6 — Math.random aplicado ao projeto
Simule o início do dia na pousada. Gere aleatoriamente:

Um número entre 1 e 38 representando quantos quartos estão sujos hoje
Um número entre 2 e 4 representando quantas camareiras estão disponíveis

Com esses dois valores gerados, calcule e imprima quantos 
quartos cada camareira vai limpar arredondando para cima. */

   double ale1 = Math.random();       
   int quarto = (int) (1 + ale1 * (38 - 1));
   
   double ale2 = Math.random();
   int camar = (int) (2 + ale2 * (4 - 2));
   
   int qtQts = (int) Math.ceil((double) quarto / camar); 
   
   System.out.println("Hoje teremos o total de "+ quarto + " quartos para limpeza");
   System.out.println("Hoje temos o total de "+ camar + " camareiras trabalhando");
   System.out.println("Cada camareira irá limpar o total de "+ qtQts + " quartos.");
 }
    
}
