import java.util.Scanner;

public class RaizInteira {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int quadradoInteiro = 0;

        while ((quadradoInteiro)*(quadradoInteiro) <= numero){
            quadradoInteiro++;
        }

        System.out.println(quadradoInteiro-1);
        scanner.close();
    }
}
