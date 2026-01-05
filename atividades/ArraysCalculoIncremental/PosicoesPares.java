// questao 4

import java.util.Scanner;

public class PosicoesPares {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int qtdNumeros = scanner.nextInt();
        double[] numeros = new double[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++){
            numeros[i] = scanner.nextDouble();
        }

        for (int j = 0; j < qtdNumeros; j += 2){
            System.out.println(numeros[j]);
        }

        scanner.close();
    }
}
