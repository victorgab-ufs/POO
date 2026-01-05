// importando classe random
import java.util.Random;

// Math.random gera numero no intervalo -> [0.0, 1.0) -> ja vem importado
// OU 
// random.nextDouble/float/int() -> precisa criar novo objeto da classe Random

// criacao da classe filha (AssistenteAdministrativo) que possui os metodos da classe mae (Funcionario)
// lembrando que os metodos abstract devem ser implementados aqui
public class EngenheiroJunior extends Funcionario{

    private double salario;

    public double gerarSalario(){
       this.salario = (Math.random() * 1500) + 1000;
    }
}