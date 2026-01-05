import java.util.Scanner;

public class Primo {
    
    public static String primo(int numero){

        if (numero <= 1)
            return "nao eh primo";
        
        for (int i = 2; i < numero; i++){

            if (numero % i == 0)
                return "nao eh primo";
        }
        return "eh primo";
    }
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(primo(scanner.nextInt()));
        scanner.close();  
    }
}
