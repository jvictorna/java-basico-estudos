
package aula07operadores;

public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
       
        /* Exercício 7 — Operadores aritméticos + tipos primitivos
A pousada precisa calcular a taxa de ocupação do dia. Declare as variáveis necessárias e calcule:

Total de quartos ocupados: 23 dos 38
Percentual de ocupação em float com uma casa decimal
Percentual de quartos disponíveis
Imprima os dois percentuais formatados com System.out.printf usando %.1f */
   
       int totalQuartos, totalOcup; 
       
       totalQuartos = 38;
       totalOcup = 23; 
      
      int totalDisp = totalQuartos - totalOcup; 
      
      float percOcup = ((float) totalOcup / totalQuartos) * 100;
      float percDisp = ((float) totalDisp / totalQuartos) * 100; 
      
        System.out.printf("O total de quartos ocupados é %d com taxa de %.1f%%%n" , totalOcup, percOcup);
        System.out.printf("O total de quartos disponíveis é %d com taxa de %.1f%%%n " , totalDisp, percDisp);
      
      
      
        
    }
    
}
