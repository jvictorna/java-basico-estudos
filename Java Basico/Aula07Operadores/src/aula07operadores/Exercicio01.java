
package aula07operadores;


public class Exercicio01 {
    public static void main(String[] args) throws Exception {
       System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
       
              /* Exercício 1 — Operadores aritméticos básicos
A pousada tem 38 quartos e 3 camareiras disponíveis hoje. Calcule e imprima:

Quantos quartos cada camareira vai limpar (divisão inteira)
Quantos quartos sobram após a divisão igualitária (resto) */
              
              int quarto, camar,qtlimpo, rtquarto; 
              quarto = 38;
              camar = 3;
              qtlimpo = quarto / camar;
              rtquarto = quarto % camar;
              System.out.println("Cada camareira irá limpar " + qtlimpo);
              System.out.println("Irá sobrar o total de " + rtquarto + " quartos");
              
              
    }
    
}
