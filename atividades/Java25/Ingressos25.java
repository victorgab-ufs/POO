// nao eh necessario criar explicitamente uma classe (Java 25) e utilizar o public static main
// o programa eh iniciado por um void main(){}
void main(){

    // atributo que recebe a idade
    // Integer.parseInt -> converte a string para inteiro
    // IO.readln -> recebe informacao do teclado (proxima linha) (a instrucao para o usuario pode ser colocada dentro dos paranteses)
    int idade = Integer.parseInt((IO.readln("Digite a idade: ")));

    // atributo que recebe o valor do ingresso sem desconto
    // Double.parseDouble -> converte a string para double
    // IO.readln -> recebe informacao do teclado (proxima linha) (a instrucao para o usuario pode ser colocada dentro dos paranteses)
    double ingresso = Double.parseDouble(IO.readln("Insira o valor do ingresso: "));

    // condicionais
    if (idade >= 60 || idade <= 18){
        // para menores e idosos, o ingresso tem 50% de desconto
        ingresso *= 0.5;
        // IO.println -> imprime informacao na tela com quebra de linha no final
        IO.println("Preco com desconto: "+ingresso);
    }

    else {
        // nos demais casos, ha um desconto de 10%
        // (ingresso = ingresso * 0.9)
        ingresso *= 0.9;
        // IO.println -> imprime informacao na tela com quebra de linha no final
        IO.println("Preco com desconto: "+ingresso);
    }
}
    

