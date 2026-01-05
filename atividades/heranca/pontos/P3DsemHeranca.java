public class P3DsemHeranca {
    
    private Ponto2D ponto2d;
    private double z;

    public P3DsemHeranca(double x, double y, double z){
        this.ponto2d = new Ponto2D(x, y);
        this.z = z;
    }

    public double getX(){
        return ponto2d.getX();
    }

    public double getY(){
        return ponto2d.getY();
    }

    public double getZ(){
        return z;
    }

    public void setX(double x){
        ponto2d.setX(x);
    }

    public void setY(double y){
        ponto2d.setY(y);
    }

    public void setZ(double z){
        this.z = z;
    }

    public double distanciaOrigem(){
        double x = ponto2d.getX();
        double y = ponto2d.getY();
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double distancia(P3DsemHeranca p3s){
        double deltaX = ponto2d.getX() - p3s.getX();
        double deltaY = ponto2d.getY() - p3s.getY();
        double deltaZ = p3s.getZ() - z; 
        return Math.sqrt(deltaX*deltaX+deltaY*deltaY+deltaZ*deltaZ);
    }
}
