import java.util.Scanner; // package -> classe Scanner do pacote java.util (leitura de dados do teclado)

public class App {
    // metodo main -> ponto de entrada do programa -> String[] args |recebe argumentos passados na linha de comando (terminal)|
    public static void main(String[] args) throws Exception {
        // cria novo objeto Scanner que recebe um valor do teclado
        Scanner scanner = new Scanner(System.in);
        // System.out.println -> imprime o argumento passado na tela
        System.out.println("Digite seu nome");
        //  le a proxima palavra digitada (ate o proximo espaco) e guarda em 'nome'
        // .nextLine() -> le a linha inteira
        String nome = scanner.next();
        System.out.println("Olá " + nome);
        // cria novo objeto scannerInt da classe Scanner que recebe argumento
        Scanner scannerInt = new Scanner(System.in);
        // le a proxima linha, transformando o valor em inteiro e atribuindo ele a numero
        int numero = scannerInt.nextInt();
        System.out.println("numero: " + numero);

    }
}
