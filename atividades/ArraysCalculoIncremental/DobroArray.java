// questao 5

import java.util.Arrays;

public class DobroArray {
    
    public static int[] dobroElementos(int[] array){

        for(int i = 0; i < array.length; i++){
            array[i] *= 2;
        } 
        
        return array;
    }
    public static void main(String args[]){

        int[] numeros = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(dobroElementos(numeros)));
    }
}
