// questao 15.2
package votacao;

public class Candidato {
    
    private String nome;
    private static int numero = 0;
    private int numeroCandidato;
    private int votos;

    public Candidato(String nome){
        numero++;
        this.nome = nome;
        this.numeroCandidato = numero;
        this.votos = 0;
    }

    public int adicionarVoto(){
        return this.votos++;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumero(){
        return this.numeroCandidato;
    }

    public int getVotos(){
        return this.votos;
    }

    public String dados(){
        return this.nome + "(Numero " + this.numeroCandidato + ") " + "teve " + this.votos + " voto(s)";  
    }
}
