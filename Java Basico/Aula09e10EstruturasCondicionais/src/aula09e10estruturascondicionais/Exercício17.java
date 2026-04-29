
package aula09e10estruturascondicionais;

import java.util.Scanner;

public class Exercício17 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 17 — Condições encadeadas
Declare o status de um quarto como variável e use if/else if/else encadeado para imprimir a 
descrição completa do status e a ação recomendada:

Status 1 → "Disponível — quarto pronto para check-in"
Status 2 → "Sujo — acionar camareira"
Status 3 → "Em Limpeza — aguardar finalização"
Status 4 → "Ocupado — não perturbar"
Status 5 → "Arrumação Pendente — verificar com camareira"
Status 6 → "Revisão de Longa Data — inspecionar quarto"
Status 7 → "Em Manutenção — bloquear para hóspedes"
Status 8 → "Manutenção Urgente — acionar equipe imediatamente"
Status 9 → "Revisão Pós Manutenção — aguardar liberação"
Qualquer outro valor → "Status inválido"

Teste com pelo menos 3 status diferentes trocando o valor da variável. */ 
        
   Scanner teclado = new Scanner (System.in);
       
        int status;
        System.out.print("Selecione a opção: ");
        status = teclado.nextInt();
        
        
        if (status == 1) {
            System.out.print("DISPONÍVEL - Quarto pronto para check-in");
        } else if (status == 2) {
            System.out.print("SUJO - Acionar Camareira"); 
        } else if (status == 3) {
            System.out.print("EM LIMPEZA - Aguardar finalização"); 
        } else if (status == 4) {
            System.out.print("OCUPADO - Não perturbar");
        } else if (status == 5) {
            System.out.print("ARRUMAÇÃO PENDENTE - Verificar com camareira");
        } else if (status == 6) {
            System.out.print("REVISÃO DE LONGA DATA - Inspecionar quarto");
        } else if (status == 7) {
            System.out.print("EM MANUTENÇÃO - Bloquear para hóspedes e acionar técnico");
        } else if (status == 8) {
            System.out.print("MANUTENÇÃO URGENTE - Acionar equipe imediatamente");
        } else if (status == 9) {
            System.out.print("REVISÃO PÓS MANUTENÇÃO - Aguardar liberação");
        } else  {
            System.out.print("STATUS INVÁLIDO - Verifique a opção selecionada");}

    } 
}
