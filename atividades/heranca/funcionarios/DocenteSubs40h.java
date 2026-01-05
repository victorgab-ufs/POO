public class DocenteSubs40h extends DocenteSubst{
    
    private static int cargaHoraria = 40;

    public DocenteSubs40h(String nome, int dia, int mes, int ano, long cpf){
        super(nome, dia, mes, ano, cpf);
    }

    public double calcularPagamento(){
        return salarioHora*cargaHoraria;
    }
}
