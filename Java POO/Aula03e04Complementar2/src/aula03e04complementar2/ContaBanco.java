
package aula03e04complementar2;

public class ContaBanco {
    
    int numConta;
    String tipo;
    String dono;
    float saldo;
    boolean status;
    
    public ContaBanco() {
        saldo = 0;
        status = false;
    }
    
    public void setNumConta (int n) {
        numConta = n; 
    }
    public int getNumConta() {
        return numConta;
    }
    
    public void setTipo (String t){
        tipo = t;
    }
    public String getTipo() {
        return tipo;
    }
    
    public void setDono (String d) {
        dono = d;
    }
    public String getDono(){
        return dono;
    }
    
    public void setSaldo (float s) {
        saldo = s;
    }
    public float getSaldo() {
        return saldo;
    }
    
    public void setStatus (boolean r) {
        status = r;
    }
    public boolean getStatus(){
        return status;
    }
    
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        
        if (t.equals("CC")) {
            setSaldo(50);
        } else if (t.equals("CP")) {
        setSaldo(150); }
        
        System.out.println("====================== ATENÇÃO =====================");
        System.out.println("        CONTA ABERTA COM SUCESSO!          ");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Saldo inicial: " + getSaldo());
        System.out.println("====================================================");
    }
    
    public void fecharConta() {
        if (getStatus()) {
            if (saldo > 0) {
            System.out.println("====================== ATENÇÃO =====================");
            System.out.println("           A CONTA POSSUI SALDO POSITIVO            ");
            System.out.println("SALDO DA CONTA " + getSaldo());
            System.out.println("É NECESSÁRIO SACAR O VALOR ANTES DE ENCERRAR A CONTA");
            System.out.println("");
        } else if (saldo < 0) {
            System.out.println("====================== ATENÇÃO =====================");
            System.out.println("           A CONTA POSSUI SALDO NEGATIVO            ");
            System.out.println("DÉBITO DA CONTA " + getSaldo());
            System.out.println("É NECESSÁRIO PAGAR O DÉBITO ANTES DE ENCERRAR A CONTA");
        } else { 
            setStatus(false);
            System.out.println("====================== ATENÇÃO =====================");
            System.out.println("Conta encerrada com sucesso!"); 
            System.out.println(""); }
        } else { 
            System.out.println("====================== ATENÇÃO =====================");
            System.out.println("Conta já está encerrada!");
            System.out.println(""); }
    } 
        
    public void depositar(float v) {
        if (getStatus()) {
            setSaldo(getSaldo() + v);
            System.out.println("====================== ATENÇÃO =====================");
            System.out.println("O novo saldo da conta é: " + getSaldo());
        } else { 
            System.out.println("====================== ATENÇÃO =====================");
            System.out.println("  CONTA INATIVA: NÃO É POSSÍVEL REALIZAR DEPÓSITOS  ");
            System.out.println("      REALIZE ATIVAÇÃO DA CONTA PARA CONTINUAR");
            System.out.println("");
        }            
    }
    
    public void sacar(float v) {
        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("====================== ATENÇÃO =====================");
                System.out.println("           O SAQUE EFETUADO COM SUCESSO             ");
                System.out.println("Seu novo saldo é de: " + getSaldo());
                System.out.println("");             
            } else {
                System.out.println("====================== ATENÇÃO =====================");
                System.out.println("   SAQUE NÃO EFETUADO POIS O SALDO É INSUFICIENTE   ");
                System.out.println("  VERIFIQUE O SALDO DISPONÍVEL E TENTE NOVAMENTE    ");
                System.out.println(""); }
            } else { 
           System.out.println("====================== ATENÇÃO =====================");
           System.out.println("        NÃO FOI POSSÍVEL REALIZAR O SAQUE           ");
           System.out.println("         VERIFIQUE O STATUS DA SUA CONTA            ");
           System.out.println(""); } 
        } 
    
    public void pagarMensal() {
        float v = 0;
        if (getTipo().equals("CC")) {
            v = 12;
        } else if (getTipo().equals("CP")) {
            v = 20;
        }
        
        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("====================== ATENÇÃO =====================");
                System.out.println("      TARIFA DE MANUTENÇÃO COBRADA COM SUCESSO      ");
                System.out.println("Seu novo saldo é de: " + getSaldo());
            } else { 
                System.out.println("====================== ATENÇÃO =====================");
                System.out.println("    SALDO INSUFICIENTE PARA COBRANÇA DE TARIFA      ");
                System.out.println("Adicione saldo a sua conta para continuar utilizando os serviços");
                System.out.println("");
            } 
        } else {
            System.out.println("====================== ATENÇÃO =====================");
            System.out.println("         NÃO FOI POSSIVEL REALIZAR A COBRANÇA       ");
            System.out.println("             VERIFIQUE O STATUS DA CONTA            ");
            System.out.println("");
        }     
    }
    
}
    
    

