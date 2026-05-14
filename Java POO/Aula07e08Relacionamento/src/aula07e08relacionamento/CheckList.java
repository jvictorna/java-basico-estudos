
package aula07e08relacionamento;

public class CheckList {
    private boolean frigobar;
    private boolean arCondicionado;
    private boolean televisao;
    private boolean cama;
    private boolean enxoval;
    private boolean toalha;
    private boolean banheiro;
    private boolean lixo;

    public boolean isFrigobar() {
        return frigobar;
    }

    public void setFrigobar(boolean frigobar) {
        this.frigobar = frigobar;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isTelevisao() {
        return televisao;
    }

    public void setTelevisao(boolean televisao) {
        this.televisao = televisao;
    }

    public boolean isCama() {
        return cama;
    }

    public void setCama(boolean cama) {
        this.cama = cama;
    }

    public boolean isEnxoval() {
        return enxoval;
    }

    public void setEnxoval(boolean enxoval) {
        this.enxoval = enxoval;
    }

    public boolean isToalha() {
        return toalha;
    }

    public void setToalha(boolean toalha) {
        this.toalha = toalha;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    public boolean isLixo() {
        return lixo;
    }

    public void setLixo(boolean lixo) {
        this.lixo = lixo;
    }
    
    public CheckList(boolean frg, boolean ar, boolean tv,
                     boolean cam, boolean enx, boolean toa,
                     boolean ban, boolean lxo) {
        this.frigobar = frg;
        this.arCondicionado = ar;
        this.televisao = tv;
        this.cama = cam;
        this.enxoval = enx;
        this.toalha = toa;
        this.banheiro = ban;
        this.lixo = lxo;
}
    
    public void exibirResultado() {
        System.out.println("Frigobar: " + (frigobar ? "OK" : "DEFEITO"));
        System.out.println("Ar condicionado: " + (arCondicionado ? "OK" : "DEFEITO"));
        System.out.println("Televisão: " + (televisao ? "OK" : "DEFEITO"));
        System.out.println("Cama: " + (cama ? "ARRUMADA" : "DESARRUMADA"));
        System.out.println("Enxoval: " + (enxoval ? "TROCADO" : "PENDENTE"));
        System.out.println("Toalhas: " + (toalha ? "TROCADAS" : "PENDENTE"));
        System.out.println("Banheiro: " + (banheiro ? "HIGIENIZADO" : "PENDENTE"));
        System.out.println("Lixo: " + (lixo ? "RETIRADO" : "PENDENTE"));
    }
    
    public boolean temDefeito() {
        return !frigobar || !arCondicionado || !televisao;
    }
    
    public boolean algumaPendencia() {
        return !cama || !enxoval || !toalha || !banheiro || !lixo;
    }
    
}
