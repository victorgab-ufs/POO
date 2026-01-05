public class Esfera extends Figura3D{
    
    private double raio;
    private double pi = 3.1415;

    public Esfera(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    public double calcularVolume(){
        return (4.0/3.0)*(pi*raio*raio*raio);
    }

    public String toString(){
        return "A esfera eh " + getCor() + " e tem volume igual a " + calcularVolume();
    }
}
