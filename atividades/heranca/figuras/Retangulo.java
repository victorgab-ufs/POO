public class Retangulo extends Figura2D{
    
    private double base, altura;

    public Retangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base*altura;
    }

    public String toString(){
        return "O retangulo eh " + getCor() + " e tem area igual a " + calcularArea();
    }
}
