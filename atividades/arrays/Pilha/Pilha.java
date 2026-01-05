public class Pilha {
    
    private int[] elementos;
    private int capacidadeMaxima, topo;
    
    public Pilha(int capacidadeMaxima){
        
        this.capacidadeMaxima = capacidadeMaxima;
        this.elementos = new int[capacidadeMaxima];
        this.topo = -1;
    }

    private boolean estaCheia(){
        return this.topo == this.capacidadeMaxima - 1;
    }

    private boolean estaVazia(){
        return this.topo == -1;
    }

    public void empilhar(int elemento){

        if (estaCheia()){
            System.out.println("A pilha está cheia");
        }

        else {
            this.elementos[++this.topo] = elemento;
            System.out.printf("%d adicionado ao topo\n", elemento);
        }
    }

    public int desempilhar(){
        
        if (estaVazia()){
            System.out.println("A pilha esta vazia");
            return 0;
        } else {
            System.out.printf("%d removido do topo", this.elementos[this.topo]);
            this.elementos[this.topo--] = 0;
        }
        
    }
    
    public void mostrarPilha(){
        for(int e : elementos){
            System.out.println(e);
        }
    }

}
