// questao 2

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInteiros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        int[] array = new int[quantidade];

        for (int i = 0; i < quantidade; i++){
            array[i] = scanner.nextInt();
        }

        scanner.close();    
        System.out.println(Arrays.toString(array));
    }
}
