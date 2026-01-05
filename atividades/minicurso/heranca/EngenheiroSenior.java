// importando classe random
import java.util.Random;

// Math.random gera numero no intervalo -> [0.0, 1.0) -> ja vem importado
// OU 
// random.nextDouble/float/int() -> precisa criar novo objeto da classe Random

// criacao da classe filha (EngenheiroSenior) que possui os metodos da classe mae (Funcionario)
// lembrando que os metodos abstract devem ser implementados aqui
public class EngenheiroSenior extends Funcionario{

    private double salario;

    Random random = new Random();
    
    public double gerarSalario(){
        this.salario = random.nextDouble(100) + 50;
        return this.salario;
    }
}