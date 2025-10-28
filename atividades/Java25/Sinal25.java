// nao eh necessario criar explicitamente uma classe (Java 25) 

// o programa se inicia em um void main()

void main(){
    
    // atributo que recebe informacao (string) e converte para inteiro 
    int numero = Integer.parseInt(IO.readln("Insira um numero: "));

    // condicionais
    if (numero > 0){
    // se o numero for maior que 0 e positivo
        IO.println("Positivo "+numero);
    }

    else if (numero < 0){
        // se o numero for menor que 0 eh negativo
        IO.println("Negativo "+numero*-1);
    }
 
    else {
        // a opcao que resta eh que ele seja igual a 0 (nulo)
        IO.println("Nulo");
    }

    
    
}

