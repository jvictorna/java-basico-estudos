
package aula14e15vetoresmetodos;

import java.util.Arrays;

public class Exercício27 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 27 — Vetores e Arrays.fill
Declare os dois vetores do sistema de governança — numerosQuartos e statusQuartos. 
Use Arrays.fill para inicializar todos os status como 1 e declare os 38 números reais dos quartos. 
Em seguida:

Use for para contar quantos quartos existem por andar
Imprima o total de cada andar e o total geral */ 
        
    int[] numerosQuartos = new int[38];
    int[] statusQuartos = new int[38];
        
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

    Arrays.fill(statusQuartos, 1);
    
System.out.println("==================================");
System.out.println("            T E R R E O           ");
System.out.println("==================================");

int contTerreo = 0;
for (int i = 0; i < 4; i++) {
    System.out.println("Quarto " + numerosQuartos[i] + " STATUS: " + statusQuartos[i] );
    contTerreo++;
}
    System.out.println("Total térreo: " +contTerreo);

   
System.out.println("==================================");
System.out.println("           1º A N D A R           ");
System.out.println("==================================");

int contPrimeiro = 0;
for (int i = 4; i < 16; i++) {
    System.out.println("Quarto " + numerosQuartos[i] + " STATUS: " + statusQuartos[i] );
    contPrimeiro++;
}
    System.out.println("Total primeiro andar: " + contPrimeiro);
    

System.out.println("==================================");
System.out.println("           2º A N D A R           ");
System.out.println("==================================");

int contSegundo = 0;
for (int i = 16; i < 27; i++) {
    System.out.println("Quarto " + numerosQuartos[i] + " STATUS: " + statusQuartos[i] );
    contSegundo++;
}
    System.out.println("Total segundo andar: " + contSegundo);


System.out.println("==================================");
System.out.println("           3º A N D A R           ");
System.out.println("==================================");

int contTerceiro = 0;
for (int i = 27; i <= 37; i++) {
    System.out.println("Quarto " + numerosQuartos[i] + " STATUS: " + statusQuartos[i] );
    contTerceiro++;
}
    System.out.println("Total terceiro andar: " +contTerceiro);

int totalQuartos = contTerreo + contPrimeiro + contSegundo + contTerceiro;
    System.out.println("O total de quartos na pousada é de " + totalQuartos);
    
  }
}