import java.util.ArrayList;
import java.util.List;

public class ListaTopicos {
    
    private List<Topico> listaTopicos;

    public ListaTopicos(){
        this.listaTopicos = new ArrayList<>();
    }

    public void adicionarTopico(String data, String titulo, String assunto){

        Topico topico = new Topico(data, titulo, assunto);
        this.listaTopicos.add(topico);
    }

    public void listarTopicos(){

        System.out.println("Lista de Topicos");

        for (Topico t : this.listaTopicos){
            System.out.println(t.toString());
        }
    }
}
