import java.util.Scanner; // package -> classe Scanner da classe util (leitura no terminal)

public class App {
    // metodo main ->      |recebe palavras na execucao apos o nome no terminal|
    public static void main(String[] args) throws Exception {
        // cria novo objeto Scanner que recebe um valor do sistema 
        Scanner scanner = new Scanner(System.in);
        // System.out.println -> imprime o argumento passado na tela
        System.out.println("Digite seu nome");
        //  le a proxima linha e guarda texto em nome
        String nome = scanner.next();
        System.out.println("Olá " + nome);
        // cria novo objeto scannerInt da classe Scanner que recebe argumento
        Scanner scannerInt = new Scanner(System.in);
        // le a proxima linha, transformando o valor em inteiro e atribuindo ele a numero
        int numero = scannerInt.nextInt();
        System.out.println("numero: " + numero);

    }
}
