// criacao da classe agenda
public class Agenda {
    // definicao dos atributos
    private int dia, mes;
    private String descricao;
    // construtor 
    public Agenda (int dia, int mes, String descricao){

        this.dia = dia;
        this.mes = mes;
        this.descricao = descricao;

    }

    // getters (apresentam dado) e setters (modificam dado)

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return this.dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return this.mes;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    // metodos especificos

    // anotar -> criacao completa de um evento
    public void anotar(int dia, int mes, String descricao){
        
        if (validarData(dia, mes)){
            this.dia = dia;
            this.mes = mes;
            this.descricao = descricao;
        }
        
        else {
            System.out.println("Insira data valida");
        }
    }

    // exibirAnotacao -> exibe a anotacao formatada
    public void exibirAnotacao(){
        
        System.out.printf("%d / %d : %s\n", this.dia, this.mes, this.descricao);
    }

    // validarData -> valida a entrada da funcao anotar (inicialmente considerando meses como 30 dias e ano como 12 meses)
    public boolean validarData(int dia, int mes){

        if ((mes < 1 || mes > 12) || (dia < 1 || dia > 30)){
            return false;
        }

        else return true;
    }
}

/*
public class mainAgenda {
    
    public static void main(String[] args){

        Agenda agenda1 = new Agenda(4, 11, "POO");

        int diaAgenda1 = agenda1.getDia();
        System.out.println(diaAgenda1);

        int mesAgenda1 = agenda1.getMes();
        System.out.println(mesAgenda1);

        String descricaoAgenda1 = agenda1.getDescricao();
        System.out.println(descricaoAgenda1);

        agenda1.anotar(28, 7, "aniversario");
        agenda1.exibirAnotacao();
    }
}


*/
