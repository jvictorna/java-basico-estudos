
package aula09e10estruturascondicionais;

public class Exercicio19 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 19 — if/else if + switch combinados
Simule uma verificação de quarto no turno da manhã. Declare:

Número do quarto: 208
Status atual: 7 (Em Manutenção)
Hora da verificação: 9

Usando if/else if verifique e imprima:

A classificação do horário: INÍCIO DE TURNO (6h-9h), MEIO DE TURNO (10h-14h), 
FIM DE TURNO (15h-18h) ou FORA DO HORÁRIO
Se o quarto está bloqueado para hóspedes — considere bloqueado se status for 7 ou 8

Usando switch/case imprima:

A ação recomendada para o status atual — use os 9 status do sistema de governança
Uma mensagem final combinando horário e status: se está bloqueado E no início de 
turno → "PRIORIDADE ALTA — resolver antes do meio dia", caso contrário → "MONITORAR — verificar evolução" */ 
        
        int numQt, statusQt, hrVer; 
        
        numQt = 208;
        statusQt = 7;
        hrVer = 9; 
        
        boolean bloqueado = (statusQt == 7 || statusQt == 8);
        boolean inicioTurno = (hrVer >= 6 && hrVer <= 9);
        
        if (hrVer >= 6 && hrVer <= 9) { 
            System.out.println("INÍCIO DE TURNO"); 
        } else if (hrVer >= 10 && hrVer <= 14) { 
            System.out.println("MEIO DE TURNO"); 
        } else if (hrVer >= 15 && hrVer <= 18) { 
            System.out.println("FIM DE TURNO"); 
        } else System.out.println("FORA DO HORÁRIO");
        
        if (statusQt == 7 || statusQt == 8) { System.out.println("O quarto está bloqueado para novas entradas");} 
        else { System.out.println("Quarto liberado para novos hóspedes");} 
        
        switch (statusQt) { 
            case 1: 
                System.out.println("Check-out realizado - sujar quarto");
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
                System.out.println("Manutenção urgente");
                break;
            default: 
                System.out.println("Opção inválida");    }     
        
       if (bloqueado && inicioTurno) { System.out.println("PRIORIDADE ALTA - Resolver antes de 12h"); }
       else { System.out.println("MONITORAR - Verificar evolução"); }
        }
    }
    

