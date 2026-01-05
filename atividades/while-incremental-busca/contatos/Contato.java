package contatos;

public class Contato {
    
    private String nome, numero;

    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String novoNumero){
        this.numero = novoNumero;
    }
}
