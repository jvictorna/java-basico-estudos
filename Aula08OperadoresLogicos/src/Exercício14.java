
public class Exercício14 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 14 — Classificação de quartos
Declare o status de 4 quartos:

Quarto 102: status 2 (Sujo)
Quarto 207: status 4 (Ocupado)
Quarto 305: status 8 (Manutenção Urgente)
Quarto 110: status 1 (Disponível)

Usando operadores relacionais, lógicos e ternário, calcule e imprima:

Quantos quartos precisam de limpeza — considere status 2 (Sujo) e 5 (Arrumação Pendente)
Se há alguma emergência ativa — status 8 em qualquer quarto
Se a pousada pode receber novos hóspedes — precisa ter pelo menos 1 quarto disponível (status 1) E 
nenhuma emergência ativa
Uma mensagem final de situação geral: OPERAÇÃO NORMAL ou REQUER ATENÇÃO */ 
        
        int statusQ102, statusQ207, statusQ305, statusQ110; 
        
        statusQ102 = 2; 
        statusQ207 = 4; 
        statusQ305 = 8; 
        statusQ110 = 1; 
        
       int sujoQ102 = (statusQ102 == 2 || statusQ102 == 5)? 1 : 0;
       int sujoQ207 = (statusQ207 == 2 || statusQ207 == 5)? 1 : 0; 
       int sujoQ305 = (statusQ305 == 2 || statusQ305 == 5)? 1 : 0;
       int sujoQ110 = (statusQ110 == 2 || statusQ110 == 5)? 1 : 0; 
       
       int totalSujos = sujoQ102 + sujoQ207 + sujoQ305 + sujoQ110;
           System.out.println("Total de quartos para limpeza: " + totalSujos);
           
       boolean emergAtiva = (statusQ102 == 8) || (statusQ207 == 8) ||
                            (statusQ305 == 8) || (statusQ110 == 8);
           System.out.println("Existe alguma emergência ativa na pousada?" + (emergAtiva? " SIM" : " NÃO"));
           
       boolean podeReceber = (statusQ102 == 8) || (statusQ207 == 8) ||
                             (statusQ305 == 8) || (statusQ305 == 8) 
                             && !emergAtiva; 
           System.out.println("A pousada pode receber novos hóspedes?" + (podeReceber? " SIM" : " NÃO"));
           
       boolean situacaoAtual = !emergAtiva && podeReceber;
           System.out.println("Como está a situação da pousada?" + (situacaoAtual? " OPERAÇÃO NORMAL" : " REQUER ATENÇÃO") );
           
           
        
        
       
                           
                            
    }
}
