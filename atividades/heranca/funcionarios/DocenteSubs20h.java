public class DocenteSubs20h extends DocenteSubst{
    
    private static int cargaHoraria = 20;

    public DocenteSubs20h(String nome, int dia, int mes, int ano, long cpf){
        super(nome, dia, mes, ano, cpf);
    }

    public double calcularPagamento(){
        return salarioHora*cargaHoraria;
    }
}
