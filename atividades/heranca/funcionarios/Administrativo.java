public class Administrativo extends FuncionarioUFS{
    
    private double salarioBase, beneficios;

    public Administrativo(String nome, int dia, int mes, int ano, long cpf){
        super(nome, dia, mes, ano, cpf);
    }

    public void setSalarioBase(double salario){
        this.salarioBase = salario;
    }

    public void setBeneficios(double beneficios){
        this.beneficios = beneficios;
    }
    
    public double calcularPagamento(){
        return salarioBase+beneficios;
    }
    
}
