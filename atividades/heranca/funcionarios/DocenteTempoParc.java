public class DocenteTempoParc extends Docente{

    private double salarioHora, horasTrabalhadas;
    
    public DocenteTempoParc(String nome, int dia, int mes, int ano, long cpf){
        super(nome, dia, mes, ano, cpf);
    }

    public void setSalarioHora(double salario){
        this.salarioHora = salario;
    }

    public void setHoras(double horas){
        this.horasTrabalhadas = horas;
    }

    public double calcularPagamento(){
        return salarioHora * horasTrabalhadas;
    }
}
