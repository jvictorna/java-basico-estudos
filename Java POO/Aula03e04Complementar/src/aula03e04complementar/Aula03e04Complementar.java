
package aula03e04complementar;

public class Aula03e04Complementar {


    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
       
        
 /* Exercício complementar — Aulas 03 e 04
  Visibilidade, Getters, Setters com validação e Construtor
  
  Aplique os conceitos de encapsulamento na classe Quarto,
  adicionando validação nos métodos setter para garantir que
  apenas valores operacionalmente válidos sejam aceitos.
  
  Requisitos:
  1. O atributo status deve ser privado e aceitar apenas valores de 1 a 9
  2. O atributo andar deve ser privado e aceitar apenas 0, 1, 2 ou 3
  3. O atributo tamanho deve ser privado e aceitar apenas P, M, G ou GG
  4. O construtor deve inicializar o quarto sempre com status 1 (Disponível)
  5. O método mostrarEstado() deve exibir o nome do status, não o número */
 
 
 Quarto qt105 = new Quarto(1, "P");
 qt105.setStatus(2);
 qt105.mostrarEstado();
 
 Quarto qt308 = new Quarto(3, "G");
 qt308.setStatus(4);
 qt308.mostrarEstado();
        
    }
    
}
