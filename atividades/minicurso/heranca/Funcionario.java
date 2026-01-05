// criacao da classe funcionario
// abstract eh usado para indicar que ha metodos ainda a serem implementados pelas classes filhas
public abstract class Funcionario {
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

    // metodo para gerar salario que sera implementado nas classes filhas (so precisa ser definido, sem corpo)
    public abstract double gerarSalario();

    public String toString(){
        String str = "";
        str += this.getNome() + ", " + this.getFuncao() + ":" + Double.toString(this.getSalario());
    }
       
}