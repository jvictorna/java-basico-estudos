
package aula10e11heranca;

public class Aula10e11Heranca {


    public static void main(String[] args) {
 /*
 * Exercício — Aulas 10 e 11
 * Herança
 *
 * Evolua o exercício anterior aplicando herança entre classes,
 * representando a estrutura real de quartos da pousada.
 *
 * Requisitos:
 * 1. Transformar a classe Quarto em abstrata — não pode ser
 *    instanciada diretamente
 * 2. Adicionar à classe Quarto os atributos: capacidade (int)
 *    e varanda (boolean)
 * 3. Adicionar à classe Quarto um método abstrato:
 *    executarChecklist() — declarado mas não implementado
 * 4. Criar a classe QuartoComum que herda de Quarto:
 *    — herança de implementação — sem atributos extras
 *    — implementa executarChecklist() com itens padrão
 * 5. Criar a classe QuartoLuxo que herda de Quarto:
 *    — herança para diferença — adiciona hidromassagem (boolean)
 *    — implementa executarChecklist() incluindo higienizarBanheira()
 * 6. No main, instanciar pelo menos um QuartoComum e um QuartoLuxo,
 *    executar o checklist de cada um e exibir o estado final
 */
 
    QuartoComum quarto105 = new QuartoComum(1, "M", 2, true);
    quarto105.mostrarEstado();
    quarto105.executarChecklist();
    
    System.out.println("----------------------------------------------------");
    
    QuartoLuxo quarto208 = new QuartoLuxo(2, "G", 2, true, true);
    quarto208.mostrarEstado();
    quarto208.executarChecklist();
   
    System.out.println("----------------------------------------------------");
    
    QuartoLuxo quarto305 = new QuartoLuxo(3, "G", 2, false, true);
    quarto305.mostrarEstado();
    quarto305.executarChecklist();
    
    System.out.println("----------------------------------------------------");
    
    QuartoComum quarto02 = new QuartoComum(0, "P", 3, false);
    quarto02.mostrarEstado();
    quarto02.executarChecklist();
    
    
    
    }
    
}
