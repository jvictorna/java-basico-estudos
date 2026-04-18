
public class Exercício12 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 12 — Combinação geral
Simule uma verificação de turno na pousada. Declare:

Total de quartos sujos: 12
Total de camareiras disponíveis: 2
Hora atual: 14 (formato 24h)

Usando operadores ternário, relacionais e lógicos, calcule e imprima:

Se ainda está dentro do horário de limpeza — considere horário válido entre 8h e 17h
Se a distribuição de quartos por camareira é viável — considere viável até 10 quartos por camareira
Uma mensagem final combinando as duas condições: só libera o turno se estiver dentro do horário E a 
distribuição for viável */
        
        int ttQtSujos, ttCamar, hrAtual; 
        
        ttQtSujos = 12;
        ttCamar = 2;
        hrAtual = 14; 
        
        System.out.println("Temos o total de " + ttQtSujos + " quartos sujos e " + ttCamar + " camareiras disponíveis");
        
        boolean podeLimp = (hrAtual >= 8) && (hrAtual <= 17);
        System.out.println("Está dentro do horário de limpeza? " + (podeLimp ? "SIM" : "NÃO"));
        
        int distQts = ttQtSujos / ttCamar; 
        boolean distViav = (distQts >= 0) && (distQts <= 10);
        System.out.println("A distribuição de quartos por camareira é viável? " + (distViav ? "SIM" : "NÃO"));
     
        boolean liberarTurno = podeLimp && distViav; 
        System.out.println("De acordo com as condições apresentadas o início do turno " + (liberarTurno ? "pode ser iniciado" : "não pode ser iniciado"));
       
 
    }
    
}
