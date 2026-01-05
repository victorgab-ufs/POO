public class Terceirizado{
    
    private String nome, dependencia;
    private int dia, mes, ano;
    private long cpf;

    public Terceirizado(String nome, int dia, int mes, int ano, long cpf){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.cpf = cpf;
    }

    public void setDependencia(String dependencia){
        this.dependencia = dependencia;
    }

     public String getDependencia(){
        return dependencia;
    }
}
