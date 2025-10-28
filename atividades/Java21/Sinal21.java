// diretorio em que o arquivo esta
package atividades;
// classe predefinada Scanner
import java.util.Scanner;
// classe para verificar sinal de um numero feita para Java 21
public class Sinal21 {
    
    // metodo principal do programa
    public static void main(String[] args){
        
        // criacao de um novo objeto Scanner chamado scanner para receber informacoes do teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um numero:");
        // atributo que recebe inteiro lido pelo scanner
        int numero = scanner.nextInt();

        // condicionais
        if (numero > 0){
            // se o numero for maior que 0 e positivo
            System.out.println("Positivo "+numero);
        }

        else if (numero < 0){
            // se o numero for menor que 0 eh negativo
            System.out.println("Negativo "+numero*-1);
        }
 
        else {
            // a opcao que resta eh que ele seja igual a 0 (nulo)
            System.out.println("Nulo");
        }

    }
    
}

