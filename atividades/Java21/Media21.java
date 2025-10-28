// diretorio em que o arquivo esta
package atividades;

// classe predefinida Scanner
import java.util.Scanner;

// classe para calcular a media entre tres numeros reais
public class Media21 {

    // metodo que possui como parametro tres numeros e nao possui retorno (apenas imprime a media na tela)
    private static void media (double numero1, double numero2, double numero3){
        // atributo que calcula a media
        double media = (numero1+numero2+numero3)/3;
        // impressao da media na tela
        System.out.println("Media = " + media);

    }
    // metodo principal do programa
    public static void main(String[] args){

        // criacao de um novo objeto Scanner chamado scanner que recebe informacoes do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira tres numeros:");
        // atributos que leem os numeros reais (double) escritos 
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();
        double numero3 = scanner.nextDouble();
        
        // chamada do metodo media
        media(numero1, numero2, numero3);
    }
    
}

