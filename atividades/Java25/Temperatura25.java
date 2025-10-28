// nao eh necessario criar explicitamente uma classe (Java 25)

// metodo para converter de Celsius para Fahrenheit (definido fora do metodo main)
void toFahrenheit (double temperatura){
    
    // conversao e resultado (a divisao deve conter um float para nao dar divisao inteira)
    double fahrenheit = ((temperatura * (9/5.0)) + 32);
    IO.println("Temperatura em °F: "+fahrenheit);

}

//metodo para converter de Fahrenheit para Celsius (definido fora do metodo main)
    void toCelsius (double temperatura){
        
        // conversao e resultado (a fracao deve ser colocada com um float para nao dar divisao inteira) 
        double celsius = ((temperatura - 32) * (5/9.0));
        IO.println("Temperatura em °C: "+celsius);

    }

// o programa eh iniciado com void main()
void main() {

    // atributo que recebe pra qual escala ira ocorrer a conversao
    String escala = IO.readln("Para qual escala deseja converter? (F para Fahrenheit / C para Celsius) ");

    // atributo que recebe valor da temperatura 
    double temperaturaConversao = Double.parseDouble(IO.readln("Insira o valor da temperatura que deseja converter: "));

    // condicionais (o metodo equals eh necessario para comparar strings, ja que java as compara naturalmente por referencia, nao valor)
    if (escala.equals("F") || escala.equals("f")){
        // caso o usuario queira converter para Fahrenheit, o respectivo metodo eh chamado
        toFahrenheit(temperaturaConversao);
    }

    else if (escala.equals("C") || escala.equals("c")){
        // caso o usuario queira converter para Celsius, o respectivo metodo eh chamado
        toCelsius(temperaturaConversao);
    }
    
}

