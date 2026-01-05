public class MainT {
    
    public static void main(String[] args){
    
        ListaTopicos lista1 = new ListaTopicos();
        
        lista1.adicionarTopico("28/11", "Repeticao", "for, while");
        lista1.adicionarTopico("30/11", "Condicionais", "if, else, switch-case");
        lista1.adicionarTopico("21/01", "Jogo", "Formacao das equipes");
        lista1.listarTopicos();
    }
}
