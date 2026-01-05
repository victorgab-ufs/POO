// questao 14

import java.util.Scanner;

public class Leibniz {

    public static double leibniz (int termos){

        double acumulador = 0.0;

        for (int i = 1; i <= termos; i++){

            if (i % 2 == 0)
                acumulador -= 1.0 / ((2 * i) - 1);

            else
                acumulador += 1.0 / ((2 * i) - 1);
        }
        return acumulador * 4;
    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int numTermos = scanner.nextInt();

        scanner.close();
        System.out.println(leibniz(numTermos));
    }
}

// VERSAO UTILIZANDO RECURSAO (O 4 SERIA MULTIPLICADO NA FUNCAO PRINCIPAL)
/*      if (termos == 1)
            return 1;

        if (termos % 2 == 0)
            return leibniz(termos-1) - (1.0/(2*termos-1));

        else    
            return leibniz(termos-1) + (1.0/(2*termos-1));
*/