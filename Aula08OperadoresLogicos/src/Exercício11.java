
public class Exercício11 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 11 — Operadores relacionais e lógicos
Declare as variáveis de status de 3 quartos:

Quarto 101: status 3 (Em Limpeza)
Quarto 205: status 7 (Em Manutenção)
Quarto 308: status 1 (Disponível)

Usando operadores relacionais e lógicos, calcule e imprima:

Se o quarto 101 pode receber check-in — só pode se estiver Disponível (1)
Se o quarto 205 precisa de atenção urgente — precisa se estiver Em Manutenção (7) OU Manutenção Urgente (8)
Se algum quarto está disponível para receber hóspedes hoje
Se todos os quartos estão em situação normal — ou seja, nenhum em Manutenção ou Manutenção Urgente */
   
       
        int statusQ101, statusQ205, statusQ308;
        
        statusQ101 = 3;
        statusQ205 = 7; 
        statusQ308 = 1; 
        
        boolean podeCheckin = (statusQ101 == 1); 
        System.out.println("Quarto 101 pode receber check-in? " + (podeCheckin ? "SIM" : "NÃO"));
        
        boolean manutUrg = (statusQ205 == 7) || (statusQ205 == 8);
        System.out.println("Quarto 205 precisa de manutenção urgente? " + (manutUrg ? "SIM" : "NÃO"));
        
        boolean quartoDisp = (statusQ101 == 1) || (statusQ205 == 1) || (statusQ308 == 1); 
        System.out.println("Temos algum quarto disponível? " + (quartoDisp ? "SIM" : "NÃO"));
        
        boolean sitQuartos = !(statusQ101 == 7 || statusQ101 == 8) && 
                             !(statusQ205 == 7 || statusQ205 == 8) && 
                             !(statusQ308 == 7 || statusQ308 == 8);
        System.out.println("Todos os quartos estão normais? " + (sitQuartos ? "SIM" : "NÃO"));
       
        
       
       
        
    }
    
}
