
package aula07operadores;


public class Exercicio05 {
    public static void main(String[] args) throws Exception {
    System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
    
    /* Exercício 5 — Classe Math com pesos por tamanho
Considere que cada tamanho de quarto tem um peso de limpeza:

P = 1 ponto / M = 2 pontos / G = 3 pontos / GG = 4 pontos

A pousada tem 8 quartos P, 18 M, 2 G e 10 GG. Calcule e imprima:

Total de pontos de trabalho do dia se todos os quartos estiverem sujos
Média de pontos por camareira com 3 camareiras — arredondando para cima com Math.ceil
Média de pontos por camareira com 3 camareiras — arredondando para baixo com Math.floor */
    
    int P, M, G, GG, qtP, qtM, qtG, qtGG, camar;
    
    camar = 3;
    P = 1;
    M = 2;
    G = 3;
    GG = 4; 
    qtP = 8; 
    qtM = 18;
    qtG = 2;
    qtGG = 10;
    
    int ttQt = qtP + qtM + qtG + qtGG;
    int ttPts = (P * qtP) + (M * qtM) + (G * qtG) + (GG * qtGG);
   
    int med1 = (int) Math.ceil((double) ttPts / camar);
    int med2 = (int) Math.floor((double) ttPts / camar);
    
    System.out.println("A média de pontos por camareira será " + med1 + " arredondando para cima.");
    System.out.println("A média de pontos por camareira será " + med2 + " arredondando para baixo.");
        
    }
}
