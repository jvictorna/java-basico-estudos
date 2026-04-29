
package aula14e15vetoresmetodos;

public class Exercício29 {
    
    static int totalQuartos() { 
        return 38;
    }
    
    static int totalPorAndar(int inicio, int fim) {
        return fim - inicio; 
    }
    
    static float taxaOcupacao(int ocupados, int total) {
        return((float) ocupados / total) * 100;
    }
    
    static String statusDescricao(int status) {
                switch (status) {
                    case 1: return "CHECK-OUT REALIZADO - Aguardando limpeza (II) ";
                    case 2: return "ARRUMAÇÃO PENDENTE - Hóspede solicitou arrumação (I)";
                    case 3: return " LIMPEZA INICIADA - Aguardando conclusão";
                    case 4: return "LIMPEZA FINALIZADA - Iniciar check-list";
                    case 5: return "CHECK-IN REALIZADO - Quarto ocupado";
                    case 6: return "REVISÃO GERAR NECESSÁRIA - Aguardando limpeza (III)";
                    case 7: return "BLOQUEADO PARA MANUTENÇÃO - Aguardando conclusão do técnico";
                    case 8: return "MANUTENÇÃO CONCLUÍDA - Liberar quarto";
                    case 0: return "SESSÃO ENCERRADA";
                    default: return "OPÇÃO INVÁLIDA";
                 
        }           
    }
     
            
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 29 — Métodos com retorno
Crie quatro métodos estáticos com retorno e chame todos dentro do main:

totalQuartos() — retorna o número total de quartos como int
totalPorAndar(int inicio, int fim) — recebe o índice inicial e final e retorna a quantidade de quartos daquele andar
taxaOcupacao(int ocupados, int total) — recebe os valores e retorna o percentual como float
statusDescricao(int status) — recebe um número de 1 a 9 e retorna a descrição do status como String */
        
        int total = totalQuartos();
        System.out.println("O total de quartos na pousada é de" + total);
        
        int terreo = totalPorAndar(0, 4); 
        System.out.println("Total de quartos no térreo é de " + terreo);
        
        int primeiro = totalPorAndar(4, 16);
        System.out.println("Total de quartos no primeiro andar é de " + primeiro);
        
        int segundo = totalPorAndar(16, 27); 
        System.out.println("Total de quartos no segundo andar é de " + segundo);
        
        int terceiro = totalPorAndar(27, 38); 
        System.out.println("Total de quartos no terceiro andar é de " + terceiro);
        
        float ocupados = taxaOcupacao(29, 38);
        System.out.printf("A taxa de ocupacação é de %.1f%%%n " , ocupados); 
        
        String descricao = statusDescricao(3); 
        System.out.println(descricao);
        
        
        
        
    }
    
}
