
package aula03e04complementar2;

import java.util.Scanner;

public class Aula03e04Complementar2 {
  
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício proposto da aula 05 
        Criar um sistema bancário simples
        */
     
        Scanner teclado = new Scanner(System.in);
        ContaBanco cc01 = new ContaBanco();
        int opcao;
        
        
        
        do { 
            System.out.println("============================");
            System.out.println("     SISTEMA BANCÁRIO       ");
            System.out.println("============================");
            System.out.println("1. Abrir conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Pagar mensalidade");
            System.out.println("5. Fechar conta");
            System.out.println("0. Sair");
            System.out.println("");
            System.out.println("DIGITE A OPÇÃO: ");
            opcao = teclado.nextInt();
            
        switch (opcao) {
            case 1: 
                System.out.println("Digite o tipo de conta (CC/CP): ");
                String tipo = teclado.next();
                cc01.abrirConta(tipo);
                break;
            case 2: 
                System.out.println("Digite o valor do depósito: ");
                float v = teclado.nextFloat();
                cc01.depositar(v);
                break;
            case 3: 
                System.out.println("Digite o valor do saque: ");
                float s = teclado.nextFloat();
                cc01.sacar(s);
                break;
            case 4:
                cc01.pagarMensal();
                break;
            case 5: 
                cc01.fecharConta();
                break;
            case 0: 
                System.out.println("O sistema foi encerrado");
                break;
            default:
                System.out.println("====================== ATENÇÃO =====================");
                System.out.println("         OPÇÃO INVÁLIDA — TENTE NOVAMENTE          ");
                break;
        } 
  } while  (opcao != 0); 
        
    }
 }
    

