
import java.util.Scanner;


public class Exercício15 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 15 — Simulação completa com Scanner e Math
Esse exercício simula o início do dia na pousada. Use Scanner para o usuário digitar:

Quantos quartos estão sujos hoje
Quantas camareiras estão disponíveis
A hora atual

Com os valores digitados, calcule e imprima:

Se está dentro do horário de limpeza (8h às 17h)
Quantos quartos cada camareira vai limpar — arredondando para cima com Math.ceil
Se a distribuição é viável — máximo 10 quartos por camareira
O percentual de quartos sujos em relação aos 38 totais com uma casa decimal
Uma mensagem final: o turno pode ser iniciado ou não pode ser iniciado — só pode se 
estiver dentro do horário E a distribuição for viável */
    
    int sujos, camar, hrAtual, ttQuartos; 
    
    ttQuartos = 38;
    
    Scanner teclado = new Scanner (System.in);
    
        System.out.print("Digite quantos quartos temos sujos hoje: " ); 
        sujos = teclado.nextInt();
        System.out.print("Digite quantas camareiras estão trabalhando hoje: ");
        camar = teclado.nextInt(); 
        System.out.print("Digite a hora atual: ");
        hrAtual = teclado.nextInt(); 
        
    boolean hrFunc = (hrAtual >= 8) && (hrAtual <= 17);
        System.out.println("Esta dentro do horário de operação? " + (hrFunc? " SIM" : " NÃO"));
    
    int sujosPorCamar = (int) Math.ceil((double) sujos / camar);
        System.out.println("Cada camareira irá limpar: " + sujosPorCamar);
    
    boolean distViav = (sujosPorCamar <= 10);
        System.out.println("A distribuição será viável? " + (distViav? " SIM, SERÁ VIÁVEL" : " NÃO SERÁ VIÁVEL"));
    
    float percSujos = ((float) sujos / ttQuartos) * 100;
        System.out.printf("Temos o total de %d quartos sujos, o que equivale ao percentual de %.1f%% com relação ao total de quartos %n" , sujos, percSujos);
    
    boolean turnoIniNaoIni = (hrFunc) && (distViav); 
        System.out.println("Dada as condições atuais, o turno poderá ser iniciado? " + (turnoIniNaoIni? " SIM" : " NÃO"));
        
    }
    
}
