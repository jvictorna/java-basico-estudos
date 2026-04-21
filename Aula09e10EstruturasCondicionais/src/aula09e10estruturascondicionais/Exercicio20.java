
package aula09e10estruturascondicionais;

import java.util.Scanner;

public class Exercicio20 { 
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 20 — Simulação completa com Scanner
Esse exercício simula uma consulta real ao sistema. Use Scanner para o usuário digitar:

Número do quarto (entre 1 e 38)
Status atual do quarto (entre 1 e 9)
Hora atual

Com os valores digitados, usando if/else, switch/case e operadores lógicos, calcule e imprima:

Se o número do quarto é válido — entre 1 e 38
A descrição do status usando switch/case
Se o quarto pode receber check-in agora — precisa estar Disponível (1) E dentro do horário (8h-22h)
Se requer atenção imediata — status 7 ou 8
Uma mensagem final de situação: QUARTO LIBERADO, QUARTO OCUPADO, QUARTO BLOQUEADO ou QUARTO INDISPONÍVEL — 
use if/else if para determinar qual se aplica baseado no status */ 
        
        Scanner teclado = new Scanner (System.in); 
        
        int quarto, status, hrAtual; 
        
        System.out.print("Digite o número do quarto (1-38): ");
        quarto = teclado.nextInt(); 
        System.out.print("Indique qual o status do quarto (1-9): ");
        status = teclado.nextInt();
        System.out.print("Registre o horário atual: ");
        hrAtual = teclado.nextInt(); 
        
        boolean podeCheckin = (status == 1) && (hrAtual >= 8 && hrAtual <= 22);
        boolean atencao = (status == 7 || status == 8); 
        
        if (quarto < 1 || quarto > 38) { System.out.println("ATENÇÃO: O quarto digitado não é válido"); }
        
        
        switch (status) { 
            case 1: 
                System.out.println("Quarto disponível - aguardando check-in");
                break;
            case 2: 
                System.out.println("Iniciar limpeza do quarto");
                break;
            case 3: 
                System.out.println("Finalizar limpeza e iniciar check-list");
                break;
            case 4:
                System.out.println("Quarto ocupado - não incomodar");
                break;
            case 5: 
                System.out.println("Hóspede solicitou arrumação - aguardando camareira");
                break;
            case 6: 
                System.out.println("Quarto precisa de revisão de longa data");
                break; 
            case 7: 
                System.out.println("Bloquear o quarto para manutenção");
                break; 
            case 8:
                System.out.println("Acionar equipe imediatamente");
                break;
            case 9: 
                System.out.println("Revisão pós manutenção");
                break;
            default: 
                System.out.println("Opção inválida");    }   
        
        System.out.println("O quarto está liberado para CheckIn? " + (podeCheckin ? "QUARTO LIBERADO" : "QUARTO NÃO LIBERADO"));
        System.out.println("O quarto precisa de atenção imediata? " + (atencao ? "SIM" : "NÃO" ));
        
      if (status == 1 && podeCheckin) { 
                System.out.println("QUARTO LIBERADO");
      } else if (status == 4 || status == 5) { 
                System.out.println("QUARTO OCUPADO");
      } else if (status == 7 || status == 8 || status == 9) { 
                System.out.println("QUARTO BLOQUEADO");
      } else { 
    System.out.println("QUARTO INDISPONÍVEL");     }
      
        }      
    }
