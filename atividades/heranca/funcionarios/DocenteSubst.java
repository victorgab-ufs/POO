public abstract class DocenteSubst extends Docente{
    
    protected double salarioHora;

    public DocenteSubst(String nome, int dia, int mes, int ano, long cpf){
        super(nome, dia, mes, ano, cpf);
    }

    public void setSalarioHora(double salario){
        this.salarioHora = salario;
    }

    public abstract double calcularPagamento();
}
