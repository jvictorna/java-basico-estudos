package aula02objetos;


public class Quarto {
    
    String tamanho;
    int andar;
    String tipo; 
    String modelo;
    boolean frigobarOK;
    boolean arCondicionadoOK;
    boolean televisaoOK; 
    
    void mostrarEstado() {
        System.out.println("O tamanho do quarto é " + this.tamanho);
        System.out.println("O quarto fica no " + this.andar + "º andar ");
        System.out.println("O modelo do quarto é " + this.modelo);
        
    }
    
    void realizarCheckIn() {
        System.out.println("O quarto está ocupado - NÃO INCOMODAR ");
    }
    
    void realizarCheckOut() {
        System.out.println("O quarto foi liberado - AGUARDANDO LIMPEZA ");
    }
    
    void iniciarLimpeza() {
        System.out.println("Limpeza iniciada pela camareira - AGUARDAR FINALIZAÇÃO ");
    }
    
    
    void bloquearManutencao() {
        if ((frigobarOK == false) || (arCondicionadoOK == false) || (televisaoOK == false)) {
            System.out.println("Foi identificado um defeito no quarto - QUARTO BLOQUEADO ");    
        } else { System.out.println("Esta tudo OK com o quarto"); }
    }
    
}
