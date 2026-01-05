public class DocenteDedExc extends Docente{
    
    private double salarioFixo;
    
    public DocenteDedExc(String nome, int dia, int mes, int ano, long cpf){
        super(nome, dia, mes, ano, cpf);
    }

    public void setSalarioFixo(double salario){
        this.salarioFixo = salario;
    }

    public double calcularPagamento(){
        return salarioFixo;
    }
}
