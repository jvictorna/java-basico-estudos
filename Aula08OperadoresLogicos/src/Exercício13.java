
public class Exercício13 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        /* Exercício 13 — Verificação de turno
Declare as seguintes variáveis:

Hora de início do turno: 7
Hora atual: 11
Quartos limpos até agora: 8
Meta de quartos para o turno: 15

Usando operadores relacionais, lógicos e ternário, calcule e imprima:

Se o turno já começou
Se a meta foi atingida
O percentual de progresso da meta com uma casa decimal usando printf
Se o turno está no prazo — considere no prazo se a hora atual for menor 
que 14h E o percentual de progresso for maior que 40% */
        
        int hrIni, hrAtual, qtsLimp, metaQts; 
        
        hrIni = 7;
        hrAtual = 11; 
        qtsLimp = 8;
        metaQts = 15; 
        
        boolean turnoIni = (hrIni >= 7) && (hrAtual <= 14);
        System.out.println("O turno iniciou? " + (turnoIni ? "SIM" : "NÃO" ));
        
        boolean meta = (qtsLimp >= metaQts); 
        System.out.println("A meta já foi atingida? " + (meta ? "SIM" : "NÃO"));
        
        float percMeta = ((float)qtsLimp / metaQts) * 100; 
        
        boolean prazo = (hrAtual <= 14) && (percMeta > 40); 
        System.out.printf("Atualmente são %dh com %.1f%% de progresso - turno %s%n" , hrAtual, percMeta, (prazo? "NO PRAZO" : "ATRASADO"));
        
        
    }
    
}
