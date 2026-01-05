import java.time.*;

public abstract class FuncionarioUFS {
    
    // LocalDate.now() -> data de hoje
    private static LocalDate dataAtual = LocalDate.now();
    private LocalDate dataDeNascimento;
    private long cpf;
    private String nome;
    
    public FuncionarioUFS(String nome, int dia, int mes, int ano, long cpf){
        // .of(ano, mes, dia) -> transforma em data
        this.dataDeNascimento = LocalDate.of(ano, mes, dia);
        this.cpf = cpf;
        this.nome = nome;
    }

    public int calcularIdade(){
        Period periodo = Period.between(dataDeNascimento, dataAtual);
        return periodo.getYears();
    }

    public String getNome(){
        return nome;
    }

    public abstract double calcularPagamento();

}