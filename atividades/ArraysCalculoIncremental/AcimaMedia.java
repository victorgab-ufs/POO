// questao 11

import java.util.Scanner;

public class AcimaMedia {

    public static int acimaMedia(double[] numeros, double media){

        int contagem = 0;

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] > media)
                contagem++;
        }
        
        return contagem;
    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = scanner.nextInt();
        double total = 0.0;
        double[] numeros = new double[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++){
            numeros[i] = scanner.nextDouble();
            total += numeros[i];
        }

        double media = total / quantidadeNumeros;

        scanner.close();
        System.out.println(acimaMedia(numeros, media));
    }
}
