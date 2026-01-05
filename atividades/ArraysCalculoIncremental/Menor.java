// questao 12

import java.util.Scanner;

public class Menor {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = scanner.nextInt();
        double menor = scanner.nextDouble();
        
        int i = 1;
        double numeroLido;
        
        while (i < quantidadeNumeros) {
            numeroLido = scanner.nextDouble();
            menor = numeroLido < menor ? numeroLido : menor;
            i++;
        } 
        
        scanner.close();
        System.out.println(menor);
    }
}
