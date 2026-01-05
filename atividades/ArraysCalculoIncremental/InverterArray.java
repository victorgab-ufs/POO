import java.util.Scanner;

public class InverterArray {
    
    public static void main(String[] args){

        int qtd;
        double elemento;
        Scanner scanner = new Scanner(System.in);

        qtd = scanner.nextInt();
        double[] numeros = new double[qtd];

        for (int i = qtd - 1; i >= 0; i--){
            elemento = scanner.nextDouble();
            numeros[i] = elemento;
        }

        for (double num : numeros){
            System.out.println(num);
        }
        scanner.close();
    }
}
