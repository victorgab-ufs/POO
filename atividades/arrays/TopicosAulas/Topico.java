public class Topico {
    
    private String data, titulo, assunto;
    
    public Topico(String data, String titulo, String assunto){

        this.data = data;
        this.titulo = titulo;
        this.assunto = assunto;
    }

    public String toString(){
        return String.format("%s - %s -> %s", this.data, this.titulo, this.assunto);
    }

}
