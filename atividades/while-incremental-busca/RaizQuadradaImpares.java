import java.util.Scanner;

public class RaizQuadradaImpares {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int raiz = 0, impares = 1;

        while (numero - impares >= 0) {
            
            numero -= impares;
            impares += 2;
            raiz++;
        } 

        scanner.close();
        System.out.println(raiz);
    }
}
