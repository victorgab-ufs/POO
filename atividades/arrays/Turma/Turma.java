import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private String disciplina;
    private String nomeTurma;
    private String codigoDisciplina;
    private String horario;
    private String docente;

    private List<Aluno> alunosTurma = new ArrayList<>();

    public Turma(String disciplina, String nomeTurma, String codigoDisciplina, String horario, String docente){

        this.disciplina = disciplina;
        this.nomeTurma = nomeTurma;
        this.codigoDisciplina = codigoDisciplina;
        this.horario = horario;
        this.docente = docente;      
        
        this.alunosTurma = new ArrayList<>();
    }

    public void adicionarAluno(String nome, String matricula){

        Aluno aluno = new Aluno(nome, matricula);

        this.alunosTurma.add(aluno);
    }

    public void listarAlunos(){
        System.out.println("Informacoes da turma\n----------------------");
        System.out.println("Codigo da disciplina: " + this.codigoDisciplina);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Turma: " + this.nomeTurma);
        System.out.println("Horario: " + this.horario);
        System.out.println("Docente: " + this.docente);
        
        System.out.println("Alunos da turma\n-------------------------");
        for (Aluno aluno : alunosTurma){
            System.out.println(aluno.getMatricula() + " - " +aluno.getNome());
        }
    }

    
    


}
