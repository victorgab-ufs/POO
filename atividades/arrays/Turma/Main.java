public class Main {
    
    public static void main(String[] args){

        Turma turma1 = new Turma("POO", "T04", "COMP1234", "24T56", "Giovanny");

        turma1.adicionarAluno("Victor Gabriel", "1234567890");
        turma1.adicionarAluno("Marcos", "0987654321");
        
        turma1.listarAlunos();

        Turma turma2 = new Turma("PI", "T01", "COMP4321", "24T34", "Kalil");
        
        turma2.adicionarAluno("Breno", "7854120369");
        turma2.adicionarAluno("Carlos", "7412589630");

        turma2.listarAlunos();
    }
}
