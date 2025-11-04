// criacao da classe ContaBancaria
public class ContaBancaria {

    // definicao dos atributos
    private String nome;
    private String conta;
    private double saldo;

    // construtor (recebe parametros para cada novo objeto criado)
    public ContaBancaria (String nome, String conta, double saldo){
        // this -> especifico para cada objeto criado
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }
    // metodo que adiciona algum valor ao saldo
    public void depositar(double valor){
        this.saldo += valor;
    }
    // metodo que saca algum valor do saldo
    public void sacar(double valor){
        this.saldo -= valor;
    }
    // metodo que retorna o saldo atual
    public double consultarSaldo(){
        return this.saldo;
    }
}

/* classe main para a classe ContaBancaria

public class MainConta {

    // metodo principal
    public static void main(String[] args){

        // criacao de novo objeto da classe ContaBancaria
        ContaBancaria conta1 = new ContaBancaria("victor", "1234", 100.0);

        // adicao de valor ao saldo do objeto conta1
        conta1.depositar(50.0);
        // retirada de valor do saldo do objeto conta1
        conta1.sacar(20.0);


        // impressao do valor atual de saldo na conta1
        System.out.println(conta1.consultarSaldo());

    }
} */
