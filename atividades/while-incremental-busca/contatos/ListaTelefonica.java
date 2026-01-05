package contatos;

import java.util.*;

public class ListaTelefonica {
    
    private Contato[] contatos;
    private int numContato, tamanho;

    public ListaTelefonica(){
        this.tamanho = 10;
        this.contatos = new Contato[this.tamanho];
    }

    public void adicionarContato(Contato contato){

        if (!existeContato(contato.getNome())){

            if (tamanho == numContato){
                tamanho = tamanho * 3 / 2;
                contatos = Arrays.copyOf(contatos, tamanho);
            }

            contatos[numContato++] = contato;
        }

    
    }

    private boolean existeContato(String nome){
       for (Contato c : this.contatos){
            if (c.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }

    public void removerContato(Contato contato){

        for (Contato c : contatos){
            if (c == contato){
                c = null;
            }
        }
    }
    
    public void editarContato(Contato contato, String numeroNovo){
        contato.setNumero(numeroNovo);
    }

    public String encontrarNumero(String nome){
        
        for (Contato c : contatos){
            if (nome.equals(c.getNome())){
                return c.getNumero();
            }
        }

        return "nao ha contato salvo com esse nome";

    }
}
