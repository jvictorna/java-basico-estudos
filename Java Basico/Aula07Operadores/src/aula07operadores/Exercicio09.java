
package aula07operadores;

public class Exercicio09 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 9 — Combinação geral
Simule um dia completo na pousada usando Math.random:

Gere aleatoriamente quantos quartos de cada tamanho estão sujos hoje (P: 0-8, M: 0-18, G: 0-2, GG: 0-10)
Calcule o total de quartos sujos
Calcule o total de pontos de trabalho usando os pesos (P=1, M=2, G=3, GG=4)
Gere aleatoriamente o número de camareiras disponíveis (2-4)
Calcule e imprima a distribuição de pontos por camareira arredondando para cima */
        
        int ptP, ptM, ptG, ptGG;
        
        ptP = 1;
        ptM = 2;
        ptG = 3;
        ptGG = 4;
        
        double aleP = Math.random();
        int quartoP = (int) (0 + aleP * (8 - 0));
        double aleM = Math.random();
        int quartoM = (int) (0 + aleM * (18 - 0));
        double aleG = Math.random();
        int quartoG = (int) (0 + aleG * (2 - 0));
        double aleGG = Math.random();
        int quartoGG = (int) (0 + aleGG * (10 - 0));
        
        int totalQtSujos = quartoP + quartoM + quartoG + quartoGG;
        
        int ttPtsP = quartoP * ptP;
        int ttPtsM = quartoM * ptM;
        int ttPtsG = quartoG * ptG;
        int ttPtsGG = quartoGG * ptGG; 
        
        int ttPtsTrab = ttPtsP + ttPtsM + ttPtsG + ttPtsGG;
        
        double aleCamar = Math.random();
        int camar = (int) (2 + aleCamar * (4 - 2));
        
        int ttPtsDistrib = (int) Math.ceil((double) ttPtsTrab / camar);
        
        System.out.println("=============================");
        System.out.println("          GOVERNANÇA         ");
        System.out.println("=============================");
        System.out.println("Quartos para limpeza hoje:");
        System.out.println("Quartos P: " + quartoP);
        System.out.println("Quartos M: " + quartoM);
        System.out.println("Quartos G: " + quartoG);
        System.out.println("Quartos GG: " + quartoGG);
        System.out.println("Hoje temos " + camar + " camareiras disponíveis");
        System.out.println("O total de quartos sujos hoje é " + totalQtSujos );
        System.out.println("Cada camareira terá o total de " + ttPtsDistrib + " pontos de trabalho");
    }
}
