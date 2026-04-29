
package aula07operadores;


public class Exercicio03 {
    public static void main(String[] args) throws Exception {
       System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
    
       /* Exercício 3 — Math.random
 Simule uma situação de teste: gere aleatoriamente um número de quarto entre 1 e 38 
 (representando a posição no vetor) e imprima qual posição foi sorteada.*/
       
       double ale = Math.random();       
       int quarto = (int) (1 + ale * (38 - 1));
       
        System.out.println("O quarto que será limpo agora é o " + quarto);
}
}