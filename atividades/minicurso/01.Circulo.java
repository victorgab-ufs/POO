// criacao da classe Circulo
public class Circulo {

    // definicao dos atributos
    private double raio;
    private double pi = 3.14;

    // construtor (molde para construção dos objetos, recebe o valor de raio)
    public Circulo (double raio2) {
        // this -> tem valor separado para cada novo objeto criado
        this.raio = raio2;
    }

    // metodo que calcula area do circulo
    public double area () {
        return pi * this.raio * this.raio;
    }

    // metodo que calcula perimetro do circulo
    public double perimetro (){
        return 2 * pi * this.raio;
    }
}

/* classe main para criacao de novos objetos do tipo circulo e obtencao dos resultados

public class Main {

    // funcao (metodo) main
    public static void main(String[] args){

        // criacao de novo objeto da classe circulo
        Circulo circulo1 = new Circulo(5.0);
        // area do circulo com o raio passado
        double areaCirculo = circulo1.area();
        // perimetro do circulo com o raio passado
        double perimetroCirculo = circulo1.perimetro();

        // saidas
        System.out.println(perimetroCirculo);
        System.out.println(areaCirculo);

    } 
    
} */
