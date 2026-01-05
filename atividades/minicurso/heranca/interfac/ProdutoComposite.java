package interfac;

import java.util.ArrayList;
import java.util.List;

public class ProdutoComposite {

    String nome;
    List<IProduto> produtos;

    public ProdutoComposite(String nome){

        this.nome = nome;
        this.produtos = new ArrayList<IProduto>();
    }

    public void addProduto(IProduto produto){

        this.produtos.add(produto);
    }

    public double getPreco(){
        
        double soma = 0;

        for (var i : this.produtos){

            soma += i.getPreco();
        }
        
        return soma;
    }

}
