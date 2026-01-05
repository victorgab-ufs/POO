import java.util.Scanner;

public class DiasDoMes {

    public static boolean ehBissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int mes = ler.nextInt();
        int ano = ler.nextInt();
        
        int[] diasDoMes = {31, ehBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.printf("%d dias\n", diasDoMes[mes-1]);
        ler.close();
    }
}
