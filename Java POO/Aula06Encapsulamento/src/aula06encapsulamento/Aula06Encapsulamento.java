
package aula06encapsulamento;

public class Aula06Encapsulamento {

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /*
 * Exercício — Aula 06
 * Encapsulamento com Interface
 *
 * Aplique o conceito de encapsulamento na classe Quarto,
 * criando uma interface que define o contrato das operações
 * disponíveis e implementando-a na classe.
 *
 * Requisitos:
 * 1. Criar a interface OperacoesQuarto com os métodos abstratos
 * 2. A classe Quarto deve implementar a interface
 * 3. Todos os atributos devem ser privados
 * 4. Os métodos da interface devem estar implementados na classe
 * 5. O main deve interagir apenas através da interface — sem acessar
 *    atributos diretamente
 */

         Quarto qt105 = new Quarto(1, "P");
 qt105.definirStatus(2);
 qt105.mostrarEstado();
 
 Quarto qt308 = new Quarto(3, "G");
 qt308.definirStatus(8);
 qt308.mostrarEstado();

    }
    
}
