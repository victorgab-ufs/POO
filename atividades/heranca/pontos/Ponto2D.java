public class Ponto2D {
    
    private double x, y;

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double novoX){
        this.x = novoX;
    }

    public void setY(double novoY){
        this.y = novoY;
    }

    public double distanciaOrigem(){
        return Math.sqrt(x+y);
    }

    public double distancia(Ponto2D p2){
        double deltaX = x - p2.getX();
        double deltaY = y - p2.getY();
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
}
