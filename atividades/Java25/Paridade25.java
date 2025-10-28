// nao eh necessario criar uma classe explicitamente (Java 25)

// o programa se inicia em um void main()
void main() {

    // atributo que recebe numero
    int numero = Integer.parseInt(IO.readln("Insira um numero: "));

    // condicionais
    if (numero % 2 == 0){
        // se o resto da divisao por 2 for 0, eh par
        // print com quebra de linha
        IO.println("Eh par");
    }

    else {
        // nao sendo dessa forma, eh impar
        // print com quebra de linha
        IO.println("Nao eh par");
    }
    
}
