
package aula07e08relacionamento;

public class Quarto implements OperacoesQuarto {
    
    private int status;
    private int andar;
    private String tamanho;
    private CheckList checklist;
    
    
    public Quarto(int and, String tmh, CheckList c1) {
        this.status = 1; 
        this.definirAndar(and);
        this.definirTamanho(tmh);
        this.checklist = c1;
                               
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
    

    @Override
    public void definirStatus(int status) {
         if (status >= 1 && status <= 9) {
            this.status = status;
        } else {
            System.out.println("Status inválido!");
        }
    }

    @Override
    public void definirAndar(int andar) {
        if (andar >= 0 && andar <= 3) {
            this.andar = andar;
            System.out.println("O quarto fica no " + andar + "º andar");
        } else {
            System.out.println("Andar inválido!");
        }
    }

    @Override
    public void definirTamanho(String tamanho) {
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

    @Override
    public void mostrarEstado() {
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

    @Override
    public void inspecao() {
        checklist.exibirResultado();
        
        if (checklist.temDefeito()) {
            this.definirStatus(7);
        } else if (checklist.algumaPendencia()) {
            this.definirStatus(5);
        } else {
            this.definirStatus(1);
        }
    }
    
}
