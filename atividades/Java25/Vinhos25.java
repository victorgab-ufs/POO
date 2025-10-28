// Nao eh necessario criar um classe explicitamente (Java 25)

// O programa inicia com um void main()
void main(){

    // atributo que recebe a quantidade de garrafas compradas
    int quantidade = Integer.parseInt(IO.readln("Insira a quantidade de garrafas compradas: "));
    
    // atributo que recebe o preco individual de cada garrafa
    double preco = Double.parseDouble(IO.readln("Insira o preco individual das garrafas: "));
    
    // (quantidade / 3 * 2) -> calcula a quantidade de garrafas que sao pagas nos trios fechados
    // (quantidade % 3) -> adiciona ao total garrafas que nao formam trio (caso todas formem, quantidade % 3 == 0)
    // uma vez que foi calculada a quantidade de garrafas que sarao pagas, eh so multiplicar esse valor pelo preco individual
    double precoDesconto =((quantidade / 3 * 2) + (quantidade % 3)) * preco;
    IO.println("Preco apos desconto: R$ "+precoDesconto);
   
}

