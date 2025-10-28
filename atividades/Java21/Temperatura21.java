// diretorio em que o arquivo esta
package atividades;
// classe predefinida que recebe informacoes do teclado
import java.util.Scanner;

// classe para transformar valores de temperaturas
public class Temperatura21 {

    // metodo para converter de Celsius para Fahrenheit
    private static void toFahrenheit (double temperatura){
        // conversao e resultado (a divisao deve conter um float para nao dar divisao inteira)
        double fahrenheit = ((temperatura * (9/5.0)) + 32);
        System.out.println("Temperatura em °F: "+fahrenheit);

    }

    //metodo para converter de Fahrenheit para Celsius
    private static void toCelsius (double temperatura){
        // conversao e resultado (a fracao deve ser colocada com um float para nao dar divisao inteira) 
        double celsius = ((temperatura - 32) * (5/9.0));
        System.out.println("Temperatura em °C: "+celsius);

    }

    // metodo principal do programa
    public static void main(String[] args){
        
        // criacao de novo objeto Scanner que recebe informacoes do teclado
        Scanner scanner = new Scanner(System.in);
        // informacoes para o usuario
        System.out.println("Para qual escala deseja converter? (F para Fahrenheit / C para Celsius)");
        // atributo que recebe o tipo de escala para qual a temperatura sera convertida
        String escala = scanner.next();

        System.out.println("Insira o valor da temperatura que deseja converter:");
        // atributo que recebe valor da temperatura 
        double temperaturaConversao = scanner.nextDouble();

        // condicionais (o metodo equals eh necessario para comparar strings, ja que java as compara naturalmente por referencia, nao valor)
        if (escala.equals("F") || escala.equals("f")){
            // caso o usuario queira converter para Fahrenheit, o respectivo metodo eh chamado
            toFahrenheit(temperaturaConversao);
        }

        else if (escala.equals("C") || escala.equals("c")){
            // caso o usuario queira converter para Celsius, o respectivo metodo eh chamado
            toCelsius(temperaturaConversao);
        }
    }
}

