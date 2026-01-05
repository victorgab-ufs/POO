public class Ponto3D extends Ponto2D{
    
    private double x, y, z;

    public Ponto3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double getZ(){
        return z;
    }

    public void setZ(double novoZ){
        this.z = novoZ;
    }

    // O cálculo de distância a origem deve ser modificado para inclusão da coordenada z
    public double distanciaOrigem(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double distancia(Ponto3D p3){
        double deltaX = x - p3.getX();
        double deltaY = y - p3.getY();
        double deltaZ = z - p3.getZ();
        return Math.sqrt(deltaX*deltaX+deltaY*deltaY+deltaZ*deltaZ);
    }
}
