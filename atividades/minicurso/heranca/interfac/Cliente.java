package interfac;

public class Cliente {

    private String nome;
    
    private FormaDePagamento carteira;
    
    public Cliente(String nome, FormaDePagamento tipo){

        this.carteira = tipo;
        this.nome = nome;
    }

    public void comprar(double valor){
        System.out.printf("%s está realizando um pagamento\n", this.nome);
        this.carteira.pagar(valor);
    }

    public String getNome(){
        return this.nome;
    }
}
