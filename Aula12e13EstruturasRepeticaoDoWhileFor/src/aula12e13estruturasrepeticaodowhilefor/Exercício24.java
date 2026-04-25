
package aula12e13estruturasrepeticaodowhilefor;

import java.util.Scanner;

public class Exercício24 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 24 — do/while aplicado ao checklist
Simule o checklist de limpeza de um quarto. Use do/while para cada item — o sistema só aceita S ou N, 
qualquer outra entrada repete a pergunta:

Frigobar OK? (S/N)
Ar condicionado OK? (S/N)
Televisão OK? (S/N)
Cama/Enxoval OK? (S/N)
Toalhas OK? (S/N)

Ao finalizar imprima:

Se todos os itens forem S → "QUARTO LIBERADO — Checklist aprovado!"
Se algum item for N → "QUARTO BLOQUEADO — Defeito identificado!" */
        
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("====================================");
        System.out.println("            CHECK LIST              ");
        System.out.println("====================================");
        
        String frigobar;
        do {
        System.out.print("[ ] Frigobar ok? (S/N).............  :");
        frigobar = teclado.next();
        } while (!frigobar.equalsIgnoreCase("S") && !frigobar.equalsIgnoreCase("N")); 
        
        String arcondicionado;
        do {        
        System.out.print("[ ] Ar Condicionado ok? (S/N)........ :");
        arcondicionado = teclado.next();
        } while (!arcondicionado.equalsIgnoreCase("S") && !arcondicionado.equalsIgnoreCase("N"));
        
        String televisao;
        do {
        System.out.print("[ ] Televisão ok? (S/N).............. :");
        televisao = teclado.next();
        } while (!televisao.equalsIgnoreCase("S") && !televisao.equalsIgnoreCase("N"));
        
        String enxoval;
        do {
        System.out.print("[ ] Enxoval ok? (S/N)................ :");
        enxoval = teclado.next();
        } while (!enxoval.equalsIgnoreCase("S") && !enxoval.equalsIgnoreCase("N"));
        
        String toalhas;
        do {
        System.out.print("[ ] Toalhas ok? (S/N)................ :");
        toalhas = teclado.next();
        } while (!toalhas.equalsIgnoreCase("S") && !toalhas.equalsIgnoreCase("N"));
        
        if ( frigobar.equalsIgnoreCase("N") || arcondicionado.equalsIgnoreCase("N") ||
             televisao.equalsIgnoreCase("N") || enxoval.equalsIgnoreCase("N") || 
             toalhas.equalsIgnoreCase("N") ) { 
               System.out.println("QUARTO BLOQUEADO - Defeito detectado "); }
        else { System.out.println("QUARTO LIBERADO - Check-list aprovado "); }
        
    } 
}
