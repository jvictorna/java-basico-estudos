
package aula14e15vetoresmetodos;

public class Exercício28 {
    
    static void cabecalhoInicio() {
        System.out.println("=========================================");
        System.out.println("          SISTEMA DE GOVERNANÇA          ");
        System.out.println("=========================================");
    }
     
    static void exibirMenu() {
        System.out.println("=========================================");
        System.out.println("           SELECIONE UMA OPÇÃO           ");
        System.out.println("=========================================");
        System.out.println("1. Checkout - ACIONAR CAMAREIRA II ");
        System.out.println("2. Arrumação pendente - ACIONAR CAMAREIRA I ");
        System.out.println("3. Limpeza iniciada - AGUARDANDO CONCLUSÃO ");
        System.out.println("4. Limpeza finalizada - INICIAR CHECK-LIST ");
        System.out.println("5. Check-in realizado - QUARTO OCUPADO ");
        System.out.println("6. Revisão geral - ACIONAR CAMAREIRA III ");
        System.out.println("7. Manutenção - BLOQUEAR QUARTO ");
        System.out.println("8. Manutenção concluída - LIBERAR QUARTO ");
        System.out.println("0. Encerrar sessão ");
        
    }
    
    static void exibirQuartosPorAndar() {
        
    int[] numerosQuartos = new int[38];
        
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

System.out.println("=========================================");
System.out.println("               T E R R E O               ");
System.out.println("=========================================");
for (int i = 0; i < 4; i++) {
    System.out.println("Quarto " + numerosQuartos[i] + " DISPONÍVEL" ); 
}

System.out.println("=========================================");
System.out.println("               1º A N D A R              ");
System.out.println("=========================================");
for (int i = 4; i < 16; i++) { 
    System.out.println("Quarto " + numerosQuartos[i] + " DISPONÍVEL ");
}

System.out.println("=========================================");
System.out.println("               2º A N D A R              ");
System.out.println("=========================================");
for (int i = 16; i < 27; i++) {
    System.out.println("Quarto " + numerosQuartos[i] + " DISPONÍVEL "); 
}

System.out.println("=========================================");
System.out.println("               3º A N D A R              ");
System.out.println("=========================================");
for (int i = 27; i <= 37; i++) {
    System.out.println("Quarto " + numerosQuartos[i] + " DISPONÍVEL ");
}
    }

    public static void main(String[] args) throws Exception {
                System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
                
/* Exercício 28 — Métodos sem retorno
Crie três métodos estáticos e chame todos dentro do main:

exibirCabecalho() — imprime o cabeçalho do sistema de governança
exibirMenu() — imprime as 8 opções do menu
exibirQuartosPorAndar() — imprime os 38 quartos organizados por andar usando for */ 
                
                cabecalhoInicio(); 
                
                exibirQuartosPorAndar();
                
                exibirMenu();
              

        
    }
    
}
