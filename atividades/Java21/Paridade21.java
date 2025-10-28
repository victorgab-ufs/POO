// diretorio  em que o arquivo esta
package atividades;
// classe predefinida scanner
import java.util.Scanner;
// classe para checar paridade de um numero feita para Java 21
public class Paridade21 {

    public Paridade21(){

    }

    // metodo principal do programa
    public static void main(String[] args) throws Exception{

        // criacao de scanner ligado ao teclado (System.in)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero:");
        // recepcao de numero digitado pelo usuario atraves do scanner
        // dado nome = nome_do_scanner.tipoLeitura(); -> nextInt le o proximo inteiro digitado
        int numero = scanner.nextInt();

        // condicionais
        if (numero % 2 == 0){
            // se o resto da divisao por 2 for 0, eh par
            System.out.println("Eh par");
        }

        else {
            // nao sendo dessa forma, eh impar
            System.out.println("Nao eh par");
        }
    }

}
