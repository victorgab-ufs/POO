public class Triangulo extends Figura2D{
    
    private double base, altura;

    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base*altura;
    }

    public String toString(){
        return "O triangulo eh " + getCor() + " e tem area igual a " + calcularArea();
    }
}
