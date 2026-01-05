public class Prisma extends Figura3D{
    
    private double areaBase, altura;
    
    public Prisma(String cor, double areaBase, double altura){
        super(cor);
        this.areaBase = areaBase;
        this.altura = altura;
    }

    public double calcularVolume(){
        return areaBase*altura;
    }

    public String toString(){
        return "O prisma eh " + getCor() + " e tem volume igual a " + calcularVolume();
    }
}
