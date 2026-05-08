
package aula03e04visibilidademetodosgetsetconst;


public class Aula03e04VisibilidadeMetodosGetSetConst {

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
//        Quarto qt101 = new Quarto();
//        qt101.setAndar("1");
//        qt101.setModelo("com varanda lateral");
//        qt101.setStatus("disponível");
//        qt101.setTamanho("pequeno");
//        qt101.setTipo("casal"); 
//        
//        qt101.situacao(); 

Quarto qt208 = new Quarto("Grande" , "2", "casal" , "luxo com varanda frente mar" , "disponível");
Quarto qt311 = new Quarto("Extra-grande" , "3" , "quadruplo" , "sem varanda" , "disponível");
Quarto qt02 = new Quarto("Pequeno" , "0" , "triplo" , "sem varanda" , "disponível");

qt208.situacao();
qt311.situacao();
qt02.situacao();


    }
    
}
