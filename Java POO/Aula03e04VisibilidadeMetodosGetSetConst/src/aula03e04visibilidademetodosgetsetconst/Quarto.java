
package aula03e04visibilidademetodosgetsetconst;

public class Quarto {
    
    public String tamanho; 
    public String andar;
    public String tipo;
    private String modelo;
    private String status;
    
    public Quarto(String tmh, String and, String tp, String mdl, String stts) {
        this.tamanho = tmh;
        this.andar = and;
        this.tipo = tp;
        this.modelo = mdl;
        this.status = stts;
    }
    
    public String getTamanho() {
        return this.tamanho;
    }
    
    public void setTamanho(String tmh) {
        this.tamanho = tmh;
    }
    
    public String getAndar() {
        return this.andar;
    }
    
    public void setAndar(String and) {
        this.andar = and;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tp) {
        this.tipo = tp;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String mdl) {
        this.modelo = mdl;
    }
    
    public String getstatus() {
        return this.status;
    }
    
    public void setStatus(String stts) {
        this.status = stts;
    }
    
   public void situacao() {
       System.out.println("SOBRE O QUARTO: " );
       System.out.println("Tamanho: " + this.tamanho);
         if (this.andar.equals("0")) {
       System.out.println("Fica no Térreo");
        } else {
       System.out.println("Fica no " + this.andar + "º andar"); }
       System.out.println("É do tipo " + this.tipo +" "+ this.modelo);
       System.out.println("");
   }    
}
