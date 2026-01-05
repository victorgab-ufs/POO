public class MainFiguras {

    public static String mesmaCor(Figura[] figuras){

        int tamanho = figuras.length, indice = 0;

        while (indice < tamanho){

            for (int i = 0; i < tamanho; i++){
            
                if (i != indice && figuras[i].getCor().equals(figuras[indice].getCor())){
                    return "Existem figuras de mesma cor";
                }
            }
            indice++;
        }
        return "Nao existem figuras de mesma cor";
    }

    public static void areasVolumes(Figura[] figuras){

        for (Figura f : figuras){
            
            if (f instanceof Figura2D){
                Figura2D fig = (Figura2D)f;
                System.out.printf("Area: %.2f\n", fig.calcularArea());
            }

            else{
                Figura3D fig = (Figura3D)f;
                System.out.printf("Volume: %.2f\n", fig.calcularVolume());
            }
        }
    }
    public static void main(String[] args){

        Retangulo ret1 = new Retangulo("azul", 5, 10);

        Circulo cir1 = new Circulo("vermelho", 10);

        Esfera esf1 = new Esfera("verde", 10);
        
        Prisma pri1 = new Prisma("preto", 10, 5);

        Tetraedro tet1 = new Tetraedro("preto", 10);

        Triangulo tri1 = new Triangulo("branco", 10, 5);
    
        Figura[] figuras = {ret1, cir1, esf1, pri1, tet1, tri1};
    
        System.out.println(mesmaCor(figuras));
        areasVolumes(figuras);
    }
}
