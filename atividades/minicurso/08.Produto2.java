// criacao da classe
public class Produto2 {
    
    // definicao dos atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    // construtor
    public Produto2(String nome){

        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }

    // getters e setters

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }

    // adicionar estoque -> adiciona quantidade de certo produto
    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
    }

    // remover estoque
    public void removerEstoque(int quantidade){
        this.quantidadeEstoque -= quantidade;
    }

}

/*
public class MainProduto2 {

    public static void main(String[] args) {
        
        Produto2 biscoito = new Produto2("biscoito");

        biscoito.setPreco(5);

        biscoito.adicionarEstoque(5);

        double precoBiscoito = biscoito.getPreco()*biscoito.getQuantidadeEstoque();
    
        System.out.println(precoBiscoito);
    }
    
}

*/
