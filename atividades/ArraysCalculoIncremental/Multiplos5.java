// questao 1

import java.util.Scanner;

public class Multiplos5 {
    public static void main(String[] args) {
        
        int inicio, fim;
        Scanner scanner = new Scanner(System.in);

        inicio = scanner.nextInt();
        fim = scanner.nextInt();

        for (int i = inicio + 1; i < fim; i++)
            if (i % 5 == 0)
                System.out.println(i);
        
        scanner.close();
    }
}