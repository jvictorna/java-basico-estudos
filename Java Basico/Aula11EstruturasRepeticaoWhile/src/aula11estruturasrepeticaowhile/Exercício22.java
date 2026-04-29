
package aula11estruturasrepeticaowhile;

public class Exercício22 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
   /* Exercício 22 — while com break e continue
Simule uma varredura de quartos em busca de manutenção urgente. 
Declare um vetor de status com 5 quartos:

Quarto 1: status 1
Quarto 2: status 3
Quarto 3: status 8
Quarto 4: status 2
Quarto 5: status 1

Use while para percorrer os quartos e:

Se o status for 1 — use continue para pular e ir para o próximo
Se o status for 8 — imprima "ALERTA: Manutenção urgente no quarto X!" e use break para interromper a varredura
Para qualquer outro status — imprima o número do quarto e seu status */ 
   
   int[] statusQuartos = new int[5];
   int cont;
   
  statusQuartos[0] = 1;
  statusQuartos[1] = 3;
  statusQuartos[2] = 8;
  statusQuartos[3] = 2;
  statusQuartos[4] = 1; 
   
  cont = 0;
   
   while (cont < 5) {
       if (statusQuartos[cont] == 1) { 
           cont++; 
           continue;  
       } 
       if (statusQuartos[cont] == 8){
            System.out.println("ALERTA: Manutenção urgente no quarto " + (cont + 1) + "!"); 
            break; 
       }
    System.out.println("Quarto " + (cont + 1) + " - status " + statusQuartos[cont]);
    cont++;
   }
   
   }
    }
