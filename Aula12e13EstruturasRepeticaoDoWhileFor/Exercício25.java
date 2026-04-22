
package aula12e13estruturasrepeticaodowhilefor;

public class Exercício25 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 25 — for aplicado aos quartos
Declare o vetor com os 38 números reais dos quartos e outro vetor de status. Use for para:

Inicializar todos os status como 1 (Disponível)
Exibir os quartos organizados por andar — Térreo (0-3), 1º Andar (4-15), 2º Andar (16-26), 3º Andar (27-37)
Contar e imprimir quantos quartos estão disponíveis no total */ 
        
  int[] numerosQuartos = new int [38];
  int[] statusQuartos = new int [38];
  
  numerosQuartos[0] = 2;
  numerosQuartos[1] = 3;
  numerosQuartos[2] = 4;
  numerosQuartos[3] = 5;
  numerosQuartos[4] = 101;
  numerosQuartos[5] = 102;
  numerosQuartos[6] = 103;
  numerosQuartos[7] = 104;
  numerosQuartos[8] = 105;
  numerosQuartos[9] = 106;
  numerosQuartos[10] = 107;
  numerosQuartos[11] = 108;
  numerosQuartos[12] = 109;
  numerosQuartos[13] = 110;
  numerosQuartos[14] = 111;
  numerosQuartos[15] = 112;
  numerosQuartos[16] = 201;
  numerosQuartos[17] = 202;
  numerosQuartos[18] = 203;
  numerosQuartos[19] = 204;
  numerosQuartos[20] = 205;
  numerosQuartos[21] = 206;
  numerosQuartos[22] = 207;
  numerosQuartos[23] = 208;
  numerosQuartos[24] = 209;
  numerosQuartos[25] = 210;
  numerosQuartos[26] = 211;
  numerosQuartos[27] = 301;
  numerosQuartos[28] = 302;
  numerosQuartos[29] = 303;
  numerosQuartos[30] = 304;
  numerosQuartos[31] = 305;
  numerosQuartos[32] = 306;
  numerosQuartos[33] = 307;
  numerosQuartos[34] = 308;
  numerosQuartos[35] = 309;
  numerosQuartos[36] = 310;
  numerosQuartos[37] = 311;
  
  
        System.out.println("==================================");
        System.out.println("            T E R R E O           ");
        System.out.println("==================================");
 

 for (int i = 0; i < 4; i++) {
        statusQuartos[i] = 1;
     System.out.println("Quarto " + numerosQuartos[i] + ": DISPONÍVEL");
 } 
 
        System.out.println("==================================");
        System.out.println("           1º A N D A R           ");
        System.out.println("==================================");
        
  for (int i = 4; i < 16 ; i++) {
        statusQuartos[i] = 1;
     System.out.println("Quarto " + numerosQuartos[i] + ": DISPONÍVEL");
 } 
  
        System.out.println("==================================");
        System.out.println("           2º A N D A R           ");
        System.out.println("==================================");
 
 
 for (int i = 16; i < 27 ; i++) {
        statusQuartos[i] = 1;
     System.out.println("Quarto " + numerosQuartos[i] + ": DISPONÍVEL");
 } 
 
        System.out.println("==================================");
        System.out.println("           3º A N D A R           ");
        System.out.println("==================================");
 
 for (int i = 27; i <= 37 ; i++) {
        statusQuartos[i] = 1;
     System.out.println("Quarto " + numerosQuartos[i] + ": DISPONÍVEL");
 } 
 
 int disponiveis = 0;
     for (int i = 0; i < 38; i++) {
        if (statusQuartos[i] == 1) {
        disponiveis++;
        }
     }
System.out.println("");     
System.out.println("Total de quartos disponíveis: " + disponiveis);
      
    }
    
}
