
package aula07e08relacionamento;

public class Aula07e08Relacionamento {

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
 /*
 * Exercício — Aula 07
 * Relacionamento entre Classes
 *
 * Evolua o exercício da aula anterior adicionando uma segunda
 * classe que se relaciona com a classe Quarto, representando
 * o checklist de inspeção do sistema de governança.
 *
 * Requisitos:
 * 1. Manter a interface OperacoesQuarto da aula anterior
 * 2. Criar a classe Checklist com atributos boolean para
 *    frigobar, arCondicionado e televisao
 * 3. A classe Quarto deve TER um objeto Checklist — ou seja,
 *    Checklist é um atributo de Quarto
 * 4. Criar um método em Checklist que exibe o resultado
 *    da inspeção — indicando quais itens estão OK e quais
 *    apresentam defeito
 * 5. Se algum item apresentar defeito, o status do quarto
 *    deve mudar automaticamente para 7 (Em Manutenção)
 * 6. No main, instanciar pelo menos dois quartos com
 *    checklists diferentes — um sem defeitos e outro com
 *    pelo menos um defeito detectado
 */
       
 CheckList cl1 = new CheckList(true, true, true, true, true, true, true, true);
 Quarto quarto105 = new Quarto(1, "P", cl1);
 quarto105.inspecao();
 quarto105.mostrarEstado();
 
        System.out.println("----------------------------");
 
 CheckList cl2 = new CheckList(true, false, true, true, true, true, true, true);
 Quarto quarto208 = new Quarto(2, "M", cl2);
 quarto208.inspecao();
 quarto208.mostrarEstado();
        
    }
    
}
