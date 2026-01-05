public class Circulo extends Figura2D{
    
    private double raio, pi = 3.1415;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    public double calcularArea(){
        return pi*raio*raio;
    }

    public String toString(){
        return "O circulo eh " + getCor() + " e tem area igual a " + calcularArea();
    }
}
