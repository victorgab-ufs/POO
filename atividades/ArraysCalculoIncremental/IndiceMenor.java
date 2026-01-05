// questao 13

import java.util.Scanner;

public class IndiceMenor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);    
        int quantidadeNumeros = scanner.nextInt();
        double[] numeros = new double[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++){
            numeros[i] = scanner.nextDouble();
        }

        double menor = numeros[0];
        int indice = 0;

        for (int j = 1; j < quantidadeNumeros; j++){
            if (numeros[j] < menor){
                menor = numeros[j];
                indice = j;
            }
        }

        scanner.close();
        System.out.println(indice);
    }
}
