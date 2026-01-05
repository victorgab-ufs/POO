// questao 10

import java.util.Scanner;

public class Primo {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int divisores = 1;

        for (int i = 2; i <= numero; i++){
            if (numero % i == 0)
                divisores++;
        }

        if (divisores == 2)
            System.out.println("Eh primo");
        else
            System.out.println("Nao eh primo");
        
        scanner.close();
    }
}
