
package aula07operadores;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 8 — Classe Math aplicada ao tempo de limpeza
A pousada tem os seguintes tempos médios de limpeza por tamanho de quarto:

P = 20min / M = 35min / G = 50min / GG = 65min

Hoje todos os quartos estão sujos (8P, 18M, 2G, 10GG). 
Declare variáveis para cada tempo e quantidade, calcule e imprima:

Tempo total de limpeza em minutos se fosse uma camareira só
Quantas horas completas isso representa (usando Math.floor)
Quantos minutos sobram após as horas completas (usando o operador %)
Tempo médio por camareira com 3 camareiras, arredondado para cima com Math.ceil */
        
    int tempoP, tempoM, tempoG, tempoGG, quantP, quantM, quantG, quantGG; 
    
    tempoP = 20; 
    tempoM = 35;
    tempoG = 50;
    tempoGG = 65;
    
    quantP = 8; 
    quantM = 18; 
    quantG = 2; 
    quantGG = 10;
    
    int totalMin = (tempoP * quantP) + (tempoM * quantM) + (tempoG * quantG) + (tempoGG * quantGG); 
    int totalHor = (int) Math.floor((double) totalMin / 60); 
    int restMin = totalMin % 60;
    int tempoMedMin = (int) Math.ceil((double) totalMin / 3);
    int tempoMedHor = (int) Math.ceil((double) tempoMedMin / 60); 
    
    System.out.println("O tempo que 1 camareira levará para limpar todos os quartos equivale a " + totalMin + " minutos"); 
    System.out.println("Esse tempo equivale ao total de " + totalHor + " horas e " + restMin + " minutos");
    System.out.println("Hoje temos 03 camareiras, cada uma levará cerca de " + tempoMedMin + " minutos em média para finalizar a limpeza");  
    System.out.println("Esse tempo equivale a " + tempoMedHor + " horas em média");
    
    
    
    
        
    }
    
}
