
package aula07operadores;

import java.util.Scanner;


public class Exercicio04 { 
        public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8")); 
       
       /* Exercício 4 — Operadores aritméticos com múltiplas camareiras
A pousada tem hoje 23 quartos sujos para limpar. Calcule e imprima:

Se houver 2 camareiras: quantos quartos cada uma limpa e quantos sobram
Se houver 3 camareiras: quantos quartos cada uma limpa e quantos sobram
Se houver 4 camareiras: quantos quartos cada uma limpa e quantos sobram */
       
     int qtsujos, qt1, qt2, qt3; 
     
     qtsujos = 23;
     qt1 = 2;
     qt2 = 3;
     qt3 = 4; 
     
     int res1 = qtsujos / qt1; 
     int rst1 = qtsujos % qt1; 
           
     int res2 = qtsujos / qt2;
     int rst2 = qtsujos % qt2;
    
     int res3 = qtsujos / qt3;
     int rst3 = qtsujos % qt3;
            
     System.out.println("Cada camareira irá limpar "+ res1 + " e restará " + rst1 + " quarto.");
     System.out.println("Cada camareira irá limpar "+ res2 + " e restará " + rst2 + " quartos.");
     System.out.println("Cada camareira irá limpar "+ res3 + " e restará "+ rst3 + " quartos."); 
    
       
       
            
        }
}
