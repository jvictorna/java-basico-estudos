
package aula02objetos;


public class Aula02Objetos {

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        Quarto quarto105 = new Quarto();
        
        quarto105.andar = 1;
        quarto105.tamanho = "M";
        quarto105.modelo = "com varanda lateral";
        quarto105.tipo = "casal";
        quarto105.arCondicionadoOK = true;
        quarto105.frigobarOK = true;
        quarto105.televisaoOK = false;
        
        
        quarto105.mostrarEstado();
        quarto105.realizarCheckOut();
        quarto105.bloquearManutencao();
     
    }
    
}
