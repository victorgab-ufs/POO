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
    // metodos
    // void -> vazio ("nao ha retorno")
    public void clienteAtual (String cpfCliente){
        // recebe o cpf do cliente em formato de string
        cpf = cpfCliente;
    }
    // metodo que recebe valor do usuario e o adiciona ao saldo total
    public String depositar(double valorDepositado) {
        // so aceita valores positivos
        if (valorDepositado > 0) {
            // adicao do valor ao saldo
            saldo += valorDepositado;
            // mensagem de confirmacao (retorno)
            return "Valor depositado com sucesso!";
        }
        else {
            // mensagem de erro (valor menor que 0 inserido) (retorno)
            return "Insira valor válido";
        }
    }
    // metodo que recebe valor e remove esse valor do saldo
    public String sacar(double valorRetirado){
        // se o valor for maior que o saldo nao ha como retirar
        if (valorRetirado > saldo){
            // mensagem que informa impossibilidade de sacar (retorno)
            return "Saldo insuficiente";
        }
        // para valores que podem ser retirados...
        else if (valorRetirado > 0) {
            // retira valor do saldo
            saldo -= valorRetirado;
            // menasgem que confirma o saque (retorno)
            return "Valor resgatado com sucesso!";
        }
        
        // valores menores que 0 nao podem ser retirados
        else {
            return "Insira valor válido";
        }
    }
    // metodo que mostra o saldo atual (retorna String)
    public String mostrarSaldo(){
        // retorno
        return "Saldo atual: R$"+saldo;
    }
    
}
