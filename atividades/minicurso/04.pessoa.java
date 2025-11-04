// criacao da classe Pessoa
public class Pessoa {
    // definicao dos atributos
    private String nome = "a";
    private double peso = 0.0;
    private double altura = 0.0;
    // construtor que recebe nome, peso e altura dos novos objetos criados
    public Pessoa (String nome, double peso, double altura){
        // this -> especificidades de cada objeto criado
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;

    }
    // metodo que calucla o imc de cada objeto
    public double calcularIMC(){
        return peso / (altura * altura);
    }
    
}

/* classe main para a interacao com a classe Pessoa 

public class MainP {

    // metodo principal
    public static void main(String[] args){

        // criacao de novo objeto p1 da classe Pessoa
        Pessoa p1 = new Pessoa("Leo", 75, 1.75);

        // calculo e impressao so imc do objeto p1
        double imc = p1.calcularIMC();
        System.out.println(imc);

    }
} */
