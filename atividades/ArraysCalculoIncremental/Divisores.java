// questão 9

import java.util.Scanner;

public class Divisores {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int divisores = 1;
        
        for (int i = 2; i <= numero; i++){
            if (numero % i == 0)
                divisores++;
        }

        scanner.close();
        System.out.println(divisores);
    }
}
