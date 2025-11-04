// criacao da classe Produto
public class Produto {

    // definicao dos atributos
    private String nome;
    private double precoUnitario;
    private int quantidade;

    // construtor (molde para a criacao de novos objetos da classe)
    public Produto (String nome, double precoUnitario, int quantidade) {
        // this -> especificidades de cada objeto
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }
    // metodo que calcula o valor total de determinado objeto em estoque
    public double calcularValorTotal() {
        return precoUnitario * quantidade;
    }
    // metodo que aplica deconto a determinado objeto da classe Produto
    public void aplicarDesconto(double percentual){
        this.precoUnitario = precoUnitario*(100-percentual)/100;
    }
}

/* classe main para interacao com a classe Produto
public class MainProduto {
    // metodo principal
    public static void main(String[] args){
        
        // criacao de novo objeto da classe Produto
        Produto cuscuz = new Produto("cuscuz", 2.5, 5);
        // calculo do valor total desse produto em estoque
        double valorTotal = cuscuz.calcularValorTotal();
        // impressao do valor total
        System.out.println(valorTotal);
        // aplicacao de desconto
        cuscuz.aplicarDesconto(10);
        
    }    
}

*/
