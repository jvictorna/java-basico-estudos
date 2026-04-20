
package aula09e10estruturascondicionais;


public class Exercício16 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 16 — Condição simples e composta
Declare as seguintes variáveis:

Status de um quarto: 3 (Em Limpeza)
Hora atual: 15
Camareiras disponíveis: 1

Usando if/else, verifique e imprima:

Se o quarto pode receber check-in — só pode se status for 1
Se ainda está dentro do horário de limpeza — válido entre 8h e 17h
Se a operação está crítica — considere crítica se tiver apenas 1 camareira disponível E a hora for maior que 15h
Uma mensagem final de alerta: OPERAÇÃO NORMAL ou ALERTA — VERIFICAR OPERAÇÃO */ 
        
        int statusQT, hrAtual, camar; 
        
        statusQT = 3; 
        hrAtual = 15;
        camar = 1;
        
        if (statusQT == 1) { System.out.println("O quarto pode receber check-in"); }
        else { System.out.println("Status do quarto não permite check in"); } 
        
        if (hrAtual >= 8 && hrAtual <= 17) { System.out.println("Estamos dentro do horário de limpeza"); }
        else { System.out.println("Não estamos dentro do horário de limpeza"); }
        
        if (hrAtual > 15 && camar == 1) { System.out.println("Operação crítica"); } 
        else { System.out.println("Fora de criticidade"); }
        
        boolean mensFinal = (hrAtual >= 15) && (camar == 1); 
        
        System.out.println( mensFinal? "OPERAÇÃO NORMAL" : "ATENÇÃO - VERIFICAR OPERAÇÃO");
        
        
        
        
        
        
        
    }
    
}
