package contatos;

import java.util.*;

public class MainContato {
    public static void main(String[] args){

        ListaTelefonica lista1 = new ListaTelefonica();

        Contato contato1 =  new Contato("Victor", "1234-5678");
        lista1.adicionarContato(contato1);
        
        Contato contato2 =  new Contato("Carlos", "8765-4321");
        lista1.adicionarContato(contato2);
        
        Contato contato3 =  new Contato("Alan", "4321-8765");
        lista1.adicionarContato(contato3);
        
        Contato contato4 =  new Contato("Victor", "5298-0217");
        lista1.adicionarContato(contato4);

        lista1.editarContato(contato2, "0000-0000");
        lista1.removerContato(contato3);
        String numeroEncontrado = lista1.encontrarNumero("Victor");

        System.out.println(contato2.getNumero());
        System.out.println(contato3.getNumero());
        System.out.println(numeroEncontrado);
    }
}
