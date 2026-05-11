
package aula03e04complementar;

public class Quarto {
    
    private int status;
    private int andar;
    private String tamanho;
    
    public Quarto(int and, String tmh) {
        this.status = 1; 
        this.setAndar(and);
        this.setTamanho(tmh);                         
    }
    
    public String getTamanho() {
        return this.tamanho;
    }
    
    public int getAndar() {
        return this.andar;
    }
    
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        if (status >= 1 && status <= 9) {
            this.status = status;
        } else {
            System.out.println("Status inválido!");
        }
    }
    
    public void setAndar (int andar) {
        if (andar >= 0 && andar <= 3) {
            this.andar = andar;
            System.out.println("O quarto fica no " + andar + "º andar");
        } else {
            System.out.println("Andar inválido!");
        }
    }
    
    public void setTamanho (String tamanho) {
       switch (tamanho) {
           
           case "P": 
               this.tamanho = tamanho;
               System.out.println("Tamanho P");
           break;
           case "M": 
               this.tamanho = tamanho;
               System.out.println("Tamanho M");
           break;
           case "G": 
               this.tamanho = tamanho;
               System.out.println("Tamanho G");
           break;
           case "GG": 
               this.tamanho = tamanho;
               System.out.println("Tamanho GG");
           break;
           default: 
               System.out.println("Tamanho inválido!");
            
       }
    }
    
    void mostrarEstado(){
        switch (this.status) {
            case 1: System.out.println("Disponível");
            break;
            case 2: System.out.println("Sujo");
            break;
            case 3: System.out.println("Em Limpeza");
            break;
            case 4: System.out.println("Ocupado");
            break;
            case 5: System.out.println("Arrumação Pendente");
            break;
            case 6: System.out.println("Revisão de Longa Data");
            break;
            case 7: System.out.println("Em Manutenção");
            break;
            case 8: System.out.println("Manutenção Urgente");
            break; 
            case 9: System.out.println("Revisão Pós Manutenção");
            break;
            default: System.out.println("Opção inválida!");
        }
    }
    
    
}
