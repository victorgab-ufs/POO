// questão 8

import java.util.Scanner;

public class Positivos {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = scanner.nextInt();
        int quantidadePositivos = 0;
        double numeroLido;

        for (int i = 0; i < quantidadeNumeros; i++){
            
            numeroLido = scanner.nextDouble();
            
            if (numeroLido > 0)
                quantidadePositivos++;
        }

        scanner.close();
        System.out.println(quantidadePositivos);
    }
}