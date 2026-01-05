package FilaAprimorada;

public class Fila {
    private int[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;
    private int CAPACIDADE = 10;

    public Fila(int capacidade) {
        this.CAPACIDADE = capacidade;
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = 0;
        this.elementos = new int[CAPACIDADE];
    }

    public boolean vazia() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int primeiro() {
        if (this.tamanho > 0)
            return this.elementos[this.inicio];
        else {
            System.out.println("Pegando o primeiro de fila vazia");
            System.exit(1);
            return 0;
        }
    }
    
    public void enfilerar(int elem) {
        
        if (tamanho == CAPACIDADE){
            
            int capacidade2 = this.CAPACIDADE + (this.CAPACIDADE/2);
            int[] novaFila = new int[capacidade2];

            for (int i = 0; i < tamanho; i++){

                int indice = (this.inicio + i) % this.CAPACIDADE;
                novaFila[i] = this.elementos[indice];
            }

            this.CAPACIDADE = capacidade2;
            this.elementos = novaFila;
            this.inicio = 0;
            this.fim = tamanho;
        }

        this.elementos[fim] = elem;
        this.fim = (this.fim+1)%this.CAPACIDADE;
        this.tamanho++;
    }

    public int desenfilerar() {
        if (tamanho > 0) {
            int primeiro = this.elementos[this.inicio];
            this.inicio = (this.inicio+1) % this.CAPACIDADE;
            this.tamanho--;
            return primeiro;
        } else {
            System.out.println("Tirando de fila vazia");
            System.exit(1);
            return 0;
        }
    }
}