import java.util.Scanner;

public class Positivos {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int positivos = 0;

        while (numero != 0){
            if (numero > 0)
                positivos++;
            numero = scanner.nextInt();
        }

        System.out.println(positivos);
        scanner.close();
    }
}
