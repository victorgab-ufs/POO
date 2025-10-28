// diretorio em que esta o arquivo
package atividades;
// classe predefinida Scanner
import java.util.Scanner;

// classe para calcular preco de ingressos para Java 21
public class Ingressos21 {

    // metodo principal do programa
    public static void main(String[] args){

        // criacao de novo objeto (new) Scanner que recebe informacoes do teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a idade:");
        // atributo que guarda a idade
        int idade = scanner.nextInt();

        System.out.println("Informe o preco do ingresso:");
        // atributo que recebe o valor do ingresso sem desconto
        double ingresso = scanner.nextDouble();

        // condicionais
        if (idade >= 60 || idade <= 18){
            // para menores e idosos, o ingresso tem 50% de desconto
            ingresso *= 0.5;
            System.out.println("Preco com desconto: "+ingresso);
        }

        else {
            // nos demais casos, ha um desconto de 10%
            // (ingresso = ingresso * 0.9)
            ingresso *= 0.9;
            System.out.println("Preco com desconto: R$ "+ingresso);
        }
    }
    
}
