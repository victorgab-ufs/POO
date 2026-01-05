package atividades.arrays.Pilha;

public class MainPilha {
    
    public static void main(String[] args) {
        
        Pilha pilha1 = new Pilha(2);
        
        pilha1.empilhar(5);
        pilha1.empilhar(2);
        pilha1.empilhar(3);
        
        pilha1.mostrarPilha();

    }
}
