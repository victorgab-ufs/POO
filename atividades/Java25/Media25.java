// metodos devem ser criados fora do main (que eh um metodo)
String media (double numero1, double numero2, double numero3){
        
        // atributo que calcula a media
        double media = (numero1+numero2+numero3)/3;
        // impressao da media na tela (com quebra de linha no final)
        return "Media = " + media;

    }

// nao eh necessario criar explicitamente uma classe (Java 25) 
void main(){

    // leitura dos tres numeros e conversao para double
    double numero1 = Double.parseDouble(IO.readln("Numero 1: "));
    double numero2 = Double.parseDouble(IO.readln("Numero 2: "));
    double numero3 = Double.parseDouble(IO.readln("Numero 3: "));
        
    // chamada do metodo media
    IO.println(media(numero1, numero2, numero3));
    
    
}

