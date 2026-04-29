
public class Exercício10 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        /* Exercício 10 — Operador ternário
Declare as variáveis necessárias com os seguintes dados do dia:

Quartos ocupados: 29 / Total de quartos: 38

Usando apenas operador ternário, calcule e imprima:

Se a ocupação está acima ou abaixo de 50%
Se a pousada está em alta, média ou baixa temporada — considere: 
acima de 80% = alta, entre 50% e 80% = média, abaixo de 50% = baixa */
        
        int ttOcup, ttQuartos;
        
        ttOcup = 29;
        ttQuartos = 38;
        
           
        float taxaOcup = ((float) ttOcup / ttQuartos) * 100; 
        
        String ocupacao = (taxaOcup>50)?"acima de 50%":"abaixo de 50%";
        String resultado = (taxaOcup>80)?"ALTA TEMPORADA":"MÉDIA TEMPORADA";
        String temporada = (taxaOcup>80)?"ALTA":(taxaOcup>=50)?"MÉDIA":"BAIXA";
        
        System.out.printf("O total de quartos ocupados na pousada hoje é %d com taxa de ocupação em %.1f%%%n" , ttOcup, taxaOcup);
        System.out.println("Isso quer dizer que estamos em " + resultado);
        System.out.println("A ocupação esta " + ocupacao + " considerada uma taxa de ocupação " + temporada);
        
    }
}
