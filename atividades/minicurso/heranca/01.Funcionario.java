// criacao da classe funcionario
public class Funcionario {
    // definicao dos atributos
    private String nome, matricula, funcao;
    private double salario;
    // construtor (molde para criacao dos objetos com nome e matricula)
    public Funcionario(String nome, String matricula){
        // this -> especifico do objeto criado
        this.nome = nome;
        this.matricula = matricula;
    }
    // metodo para receber nome
    public String getNome(){
        return nome;
    } 
    // metodo para apresentar o nome
    public void setNome(String nome){
        this.nome = nome;
    }
    // metodo para apresentar matricula
    public String getMatricula(){
        return this.matricula;
    }
    // metodo para receber matricula
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    // metodo para apresentar funcao
    public String getFuncao(){
        return this.funcao;
    }
    // metodo para receber funcao
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    // metodo para apresentar salario
    public double getSalario(){
        return this.salario;
    }
    // metodo para receber salario
    public void setSalario(double salario){
        if (salario > 0){
            this.salario = salario;
        }

        else {
            System.out.println("Salario invalido");
        }
    }
    
}
/* metodo para interacao com a classe Funcionario
public class MainFuncionario{

    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("victor", "22222222");

        String nome1 = funcionario1.getNome();
        System.out.println(nome1);

        String matricula1 = funcionario1.getMatricula();
        System.out.println(matricula1);

        funcionario1.setSalario(650);
        funcionario1.setFuncao("assessor");

        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.getFuncao());

    }
}
*/
