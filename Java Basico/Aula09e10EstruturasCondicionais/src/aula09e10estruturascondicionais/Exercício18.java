
package aula09e10estruturascondicionais;

import java.util.Scanner;

public class Exercício18 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 18 — Switch/case aplicado ao menu
Esse exercício simula o menu principal do sistema de governança.
Use Scanner para o usuário digitar uma opção e switch/case para executar a ação correspondente:

Opção 1 → "Check-out realizado — quarto marcado como Sujo"
Opção 2 → "Limpeza iniciada — quarto marcado como Em Limpeza"
Opção 3 → "Checklist finalizado — quarto marcado como Disponível"
Opção 4 → "Quarto marcado como Ocupado"
Opção 5 → "Manutenção solicitada — quarto marcado como Em Manutenção"
Opção 0 → "Encerrando o sistema..."
default → "Opção inválida — tente novamente" */ 
        
         Scanner teclado = new Scanner (System.in);

        System.out.println("=====================================");
        System.out.println("          G O V E R N A N Ç A        ");
        System.out.println("=====================================");
        System.out.println("Opção 1: Check-out");
        System.out.println("Opção 2: Em limpeza");
        System.out.println("Opção 3: Check-list finalizado");
        System.out.println("Opção 4: Check-in");
        System.out.println("Opção 5: Manutenção");
        System.out.println("Opção 0: Encerrar");
        System.out.println("=====================================");

        int status;
        System.out.print("Selecione a opção: ");
        status = teclado.nextInt();

        String res;

        switch(status) {
            case 1:
               res = "Check-out realizado - Quarto marcado como SUJO";
               break;
            case 2:
                res = "Limpeza iniciada - Quarto marcado como EM LIMPEZA";
                break;
            case 3:
                res = "Check-list finalizado - Quarto marcado como DISPONÍVEL";
                break; 
            case 4: 
                res = "Ocupado - Quarto marcado como OCUPADO"; 
                break; 
            case 5: 
                res = "Manutenção solicitada - Quarto marcado como EM MANUTENÇÃO";
                break;
            case 0: 
                res = "Sistema encerrado";
                break;
            default: 
                res = "OPÇÃO INVÁLIDA - Tente novamente";
        }
        
        System.out.println(res);
        
    }
    
}
