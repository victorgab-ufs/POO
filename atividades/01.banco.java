// criacao da classe -> public class nome_da_classe {}
// public -> permite interacao direta do usuario
public class ContasBancarias { 

    // atributos -> variaveis a serem utilizadas
    // private -> nao permitem que o usuario manipule diretamente
    // String -> texto
    private String cpf;
    // double -> decimais
    private double saldo;

    // construtor (inicializacao das variaveis)
    // public nome_da_classe(){}
    public ContasBancarias(){
        // incializacao das variaveis
        cpf = "000.000.000-00";
        saldo = 0;
    }
    
    public void clienteAtual (String cpfCliente){
        cpf = cpfCliente;
    }
    
    public String depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
            return "Valor depositado com sucesso!";
        }
        else {
            return "Insira valor válido";
        }
    }
    
    public String sacar(double valorRetirado){
        if (valorRetirado > saldo){
            return "Saldo insuficiente";
        }
        
        else if (valorRetirado > 0) {
            saldo -= valorRetirado;
            return "Valor resgatado com sucesso!";
        }
        
        
        else {
            return "Insira valor válido";
        }
    }
    
    public String mostrarSaldo(){
        return "Saldo atual: R$"+saldo;
    }
    
}
