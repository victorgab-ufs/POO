public class Pilha {
    
    private double[] elementos;
    private int capacidadeMaxima, topo;
    
    public Pilha(int capacidadeMaxima){
        
        this.capacidadeMaxima = capacidadeMaxima;
        this.elementos = new double[capacidadeMaxima];
        this.topo = -1;
    }

    private boolean estaCheia(){
        return this.topo == this.capacidadeMaxima - 1;
    }

    private boolean estaVazia(){
        return this.topo == -1;
    }

    public void empilhar(double elemento){

        if (estaCheia()){
            System.out.println("A pilha está cheia");
        }

        else {
            this.elementos[++this.topo] = elemento;
            System.out.printf("%f adicionado ao topo\n", elemento);
        }
    }

    public double desempilhar(){
        if (estaVazia()){
            System.out.println("Pilha vazia");
            return 0.0;
        }
        return this.elementos[this.topo--];
    }

    public int getTamanho(){
        return this.topo + 1;
    }
    
    public void mostrarPilha(){
        for(double e : elementos){
            System.out.println(e);
        }
    }

}
