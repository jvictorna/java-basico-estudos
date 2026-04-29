
package aula07operadores;


public class Exercicio02 {
    public static void main(String[] args) throws Exception {
       System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
       
       /* Exercício 2 — Classe Math
De 38 quartos, 14 precisam de limpeza hoje. Calcule e imprima:

Quantos quartos cada camareira recebe arredondando para cima (ninguém fica sem quarto para limpar)
Quantos quartos cada camareira recebe arredondando para baixo (distribuição conservadora) */
       
     // Considerarei o exercício anterior e usarei 3 camareiras disponíveis //
     
     int qtsujos, camar;
  
     qtsujos = 23;
     camar = 3;
     
int totalqtmais = (int) Math.ceil((double) qtsujos / camar);
int totalqtmenos = (int) Math.floor((double) qtsujos / camar);

     
System.out.println("Arredondando para cima: cada camareira limpa " + totalqtmais + " quartos");
System.out.println("Arredondando para baixo: cada camareira limpa " + totalqtmenos + " quartos");
}
}
