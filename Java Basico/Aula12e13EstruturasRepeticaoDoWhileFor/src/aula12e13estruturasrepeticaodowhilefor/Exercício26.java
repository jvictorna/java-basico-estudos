
package aula12e13estruturasrepeticaodowhilefor;

import java.util.Scanner;

public class Exercício26 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 26 — Combinação do/while + for + switch
Simule uma sessão completa do sistema. Use:

for para inicializar e exibir os 38 quartos organizados por andar
do/while para manter o sistema rodando
Scanner para ler o número do quarto e a opção
for para buscar a posição do quarto digitado no vetor
switch para executar a ação e imprimir a confirmação
Se o quarto não existir → imprimir mensagem de erro
Encerrar quando o usuário digitar 0 */
        
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
for (int i = 4; i < 16; i++) {
    statusQuartos[i] = 1;
    System.out.println("Quarto " + numerosQuartos[i] + ": DISPONÍVEL");
}

System.out.println("==================================");
System.out.println("           2º A N D A R           ");
System.out.println("==================================");
for (int i = 16; i < 27; i++) {
    statusQuartos[i] = 1;
    System.out.println("Quarto " + numerosQuartos[i] + ": DISPONÍVEL");
}

System.out.println("==================================");
System.out.println("           3º A N D A R           ");
System.out.println("==================================");
for (int i = 27; i <= 37; i++) {
    statusQuartos[i] = 1;
    System.out.println("Quarto " + numerosQuartos[i] + ": DISPONÍVEL");
}

Scanner teclado = new Scanner(System.in);
int opcao = -1;

do {
    System.out.println("");
    System.out.println("=====================================");
    System.out.println("       SELECIONE UMA DAS OPÇÕES      ");
    System.out.println("=====================================");
    System.out.println("1. Check-out (ACIONAR CAMAREIRA - II)");
    System.out.println("2. Arrumação solicitada (ACIONAR CAMAREIRA - I)");
    System.out.println("3. Iniciar limpeza (CAMAREIRA NO QUARTO)");
    System.out.println("4. Finalizar limpeza (INICIAR CHECK-LIST)");
    System.out.println("5. Check-in (HÓSPEDE NOVO - NÃO INCOMODAR)");
    System.out.println("6. Revisão geral (ACIONAR CAMAREIRA - III)");
    System.out.println("7. Bloquear para manutenção (ACIONAR TÉCNICO)");
    System.out.println("8. Liberar quarto pós-manutenção");
    System.out.println("0. Sair");
    System.out.println("");

    System.out.print("Digite o número do quarto: ");
    int numQuarto = teclado.nextInt();

    
    int posicao = -1;
    for (int i = 0; i < 38; i++) {
        if (numerosQuartos[i] == numQuarto) {
            posicao = i;
        }
    }

    if (posicao == -1) {
        System.out.println("QUARTO INVÁLIDO — verifique o número e tente novamente");
    } else {
        System.out.print("Selecione a opção: ");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("CHECK-OUT REALIZADO - Aguardando limpeza (II)");
                break;
            case 2:
                System.out.println("ARRUMAÇÃO PENDENTE - Hóspede solicitou arrumação (I)");
                break;
            case 3:
                System.out.println("LIMPEZA INICIADA - Aguardando conclusão");
                break;
            case 4:
                System.out.println("LIMPEZA FINALIZADA - Iniciar check-list");
                break;
            case 5:
                System.out.println("CHECK-IN REALIZADO - Quarto ocupado");
                break;
            case 6:
                System.out.println("REVISÃO GERAL NECESSÁRIA - Aguardando limpeza (III)");
                break;
            case 7:
                System.out.println("BLOQUEADO PARA MANUTENÇÃO - Aguardando conclusão do técnico");
                break;
            case 8:
                System.out.println("MANUTENÇÃO CONCLUÍDA - Liberar quarto");
                break;
            case 0:
                System.out.println("SESSÃO ENCERRADA");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA - Verifique a opção desejada e tente novamente");
        }
    }

} while (opcao != 0); 

    }
}
       
       


