
package aula11estruturasrepeticaowhile;

import java.util.Scanner;

public class Exercício23 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
  /* Exercício 23 — while aplicado ao loop principal
Esse exercício simula o loop principal do sistema de governança. 
Use while com Scanner para:

Exibir o menu de opções
Ler a opção digitada
Imprimir uma mensagem de confirmação para cada opção usando switch/case
Repetir o menu até o usuário digitar 0

O sistema só encerra quando o usuário digitar 0 — Sair. */ 
  
  int[] numQuartos = new int[38]; 
  int cont; 
  
  numQuartos[0] = 02;
  numQuartos[1] = 03;
  numQuartos[2] = 04;
  numQuartos[3] = 101;
  numQuartos[4] = 102;
  numQuartos[5] = 103;
  numQuartos[6] = 104;
  numQuartos[7] = 105;
  numQuartos[8] = 106;
  numQuartos[9] = 107;
  numQuartos[10] = 108; 
  numQuartos[11] = 109;
  numQuartos[12] = 110;
  numQuartos[13] = 111;
  numQuartos[14] = 112; 
  
  int opcao = -1;
  
  Scanner teclado = new Scanner (System.in);
  
  cont = 0;
  
        System.out.println("=====================================");
        System.out.println("          G O V E R N A N Ç A        ");
        System.out.println("=====================================");
        while (cont < 15) {
        System.out.println("QUARTO " + numQuartos[cont] + " DISPONÍVEL ");
        cont++; }
while (opcao != 0) {
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("       SELECIONE UMA DAS OPÇÕES      ");
        System.out.println("=====================================");
        System.out.println("1. Check-out (ACIONAR CAMAREIRA)");
        System.out.println("2. Iniciar limpeza (CAMAREIRA NO QUARTO) ");
        System.out.println("3. Finalizar limpeza (INICIAR CHECK-LIST) ");
        System.out.println("4. Check-in (HÓSPEDE NOVO - NÃO INCOMODAR) ");
        System.out.println("5. Arrumação solicitada (ACIONAR CAMAREIRA) ");
        System.out.println("6. Revisão geral (ACIONAR CAMAREIRA) ");
        System.out.println("7. Bloquear para manutenção (ACIONAR TÉCNICO) ");
        System.out.println("8. Liberar quarto pós-manutenção ");
        System.out.println("0. Sair ");
        System.out.println("");
        
        System.out.print("Digite o número do quarto: ");
        int quarto = teclado.nextInt();
        System.out.print("Selecione a opção: ");
        opcao = teclado.nextInt();
              
        switch (opcao) { 
            case 1:
                System.out.println("CHECK-OUT REALIZADO - Aguardando limpeza ");
                break;
            case 2:
                System.out.println("LIMPEZA INICIADA - Aguardando conclusão ");
                break;
            case 3:
                System.out.println("LIMPEZA FINALIZADA - Iniciar Check-list ");
                break;
            case 4: 
                System.out.println("CHECK-IN REALIZADO - Quarto ocupado ");
                break;
            case 5:
                System.out.println("ARRUMAÇÃO PENDENTE - Hóspede solicitou arrumação ");
                break; 
            case 6: 
                System.out.println("REVISÃO GERAL NECESSÁRIA - Aguardando limpeza ");
                break;
            case 7: 
                System.out.println("BLOQUEADO PARA MANUTENÇÃO - Aguardando conclusão do técnico ");
                break; 
            case 8: 
                System.out.println("MANUTENÇÃO CONCLUÍDA - Liberar quarto ");
                break;
            case 0: 
                System.out.println("SESSÃO ENCERRADA ");
                break;
            default: 
                System.out.println("OPÇÃO INVÁLIDA - Verifique a opção desejada e tente  novamente ");               
        } 
}   

    } 
}
