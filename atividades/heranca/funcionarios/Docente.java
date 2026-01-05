public abstract class Docente extends FuncionarioUFS{
    
    private int posicaoLista;
    private String[] disciplinas;

    public Docente(String nome, int dia, int mes, int ano, long cpf){
        super(nome, dia, mes, ano, cpf);
        this.disciplinas = new String[10];
        this.posicaoLista = 0;
    }

    public abstract double calcularPagamento();
        
    public void addDisciplina(String disciplina){
        disciplinas[posicaoLista++] = disciplina;
    }

    public void removerDisciplina(String disciplina){
        
        for (int i = 0; i < 10; i++){
            
            if (disciplinas[i].equals(disciplina)){

                for (int j = i; j < 9; j++){
                    disciplinas[j] = disciplinas[j+1];
                }
                posicaoLista--;
                return;
            }
        }
        posicaoLista--;
        return;
    }

    public void listarDisciplinas(){
        
        if (posicaoLista > 0){
            for (int i = 0; i < posicaoLista; i++){
                System.out.println(disciplinas[i]);
            }
        }

        else {
            System.out.println("O Docente nao possui disciplinas");
        }
    }
}
