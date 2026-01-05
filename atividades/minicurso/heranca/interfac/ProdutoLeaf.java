package interfac;

public class ProdutoLeaf implements IProduto{
    
    String nome;
    double preco;

    public ProdutoLeaf(String nome, double preco){

        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getNome(){
        return this.nome;
    }
}
