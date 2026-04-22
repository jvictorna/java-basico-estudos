
package aula11estruturasrepeticaowhile;

public class Exercício21 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
   /* Exercício 21 — while básico
Simule a abertura do turno de limpeza. 
Declare um contador começando em 1 e use while para imprimir a situação de cada quarto de 1 a 38:
        
Verificando quarto 1...
Verificando quarto 2...
...
Verificando quarto 38...
Verificação concluída! */ 
   
   int cont; 
   
   cont = 1; 
   
   while (cont <= 38) { 
       System.out.println("Verificando quarto " + cont + "...");
       cont++;   }
       System.out.println("Verificação concluída!");
   
    }  
}
