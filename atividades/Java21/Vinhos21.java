// diretorio em que esta localizado o arquivo
package atividades;

// classe predefinida que rece informacoes do teclado
import java.util.Scanner;

// classe que calcula o preco de vinhos em um supermercado para Java 21
public class Vinhos21 {

    // metodo principal do progrma
    public static void main(String[] args){

        // criacao de novo Scanner que recebe informacoes do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de garrafas compradas:");
        // atributo que recebe a quantidade de garrafas compradas
        int quantidade = scanner.nextInt();
       
        System.out.println("Insira o preco individual das garrafas:");
        // atributo que recebe o preco individual de cada garrafa
        double preco = scanner.nextDouble();
        
        // (quantidade / 3 * 2) -> calcula a quantidade de garrafas que sao pagas nos trios fechados
        // (quantidade % 3) -> adiciona ao total garrafas que nao formam trio (caso todas formem, quantidade % 3 == 0)
        // uma vez que foi calculada a quantidade de garrafas que sarao pagas, eh so multiplicar esse valor pelo preco individual
        double precoDesconto =((quantidade / 3 * 2) + (quantidade % 3)) * preco;
        System.out.println("Preco apos desconto: R$ "+precoDesconto);
   }
    
}
