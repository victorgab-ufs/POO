public class Tetraedro extends Figura3D {
    
    private double aresta;
    private double raiz2 = Math.pow(2, 0.5);

    public Tetraedro(String cor, double aresta){
        super(cor);
        this.aresta = aresta;
    }

    public double calcularVolume(){
        double cuboAresta = Math.pow(aresta, 3);
        return cuboAresta*raiz2/12.0;
    }

    public String toString(){
        return "O tetraedro eh " + getCor() + " e tem volume igual a " + calcularVolume();
    }
}

