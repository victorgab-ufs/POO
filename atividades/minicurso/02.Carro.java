// criacao da classe Carro
public class Carro {

    // definicao dos atibutos
    private String modelo;
    private int ano;
    private double velocidade;

    // construtor ("molde" para a criacao dos objetos)
    public Carro (String modelo, int ano){
        // this -> especifico para cada objeto criado
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
    }
    // metodo que aumenta a velocidade de um objeto carro
    public void acelerar(double valor){
        this.velocidade += valor;
    }
    // metodo que diminue a velocidade de um objeto carro (nao pode ser menor que 0)
    public void frear(double valor){
        this.velocidade -= valor;
      
        if (this.velocidade < 0){
            this.velocidade = 0;
        }
    }
    // metodo que da como retorno a velocidade atual do objeto
    public double consultarVelocidade(){
        return this.velocidade;
    }
}

/* Classe main para a classe carro

public class MainCarro {
    // metodo principal
    public static void main(String[] args){
        
        // criacao de novo objeto da classe carro
        Carro carro1 = new Carro("gol", 2020);
        
        // chamada do metodo acelerar com valor 50
        carro1.acelerar(50);
        
        // chamada do metodo frear com valor 20
        carro1.frear(20);
        
        // impressao do valor atual da velocidade
        System.out.println(carro1.consultarVelocidade());

        // chamada do metodo frear com valor 100
        carro1.frear(100);  

        // impressao do valor atual da velocidade
        System.out.println(carro1.consultarVelocidade());
        
    }
} */
