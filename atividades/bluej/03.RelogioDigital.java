// criacao da classe RelogioDigital
public class RelogioDigital {
    // criacao dos atributos inteiros privados (encapsulados)
    private int hora;
    private int minuto;
    // construtor
    public RelogioDigital(){
        // inicializacao dos atributos
        hora = 0;
        minuto = 0;
    }
    // metodo que faz os minutos avancarem (1 unidade por vez)
    public void tick(){
        // incrementa o minuto em uma unidade
        minuto++;
        // caso o minuto atual seja 60... (passou uma hora)
        if (minuto == 60){
            // minuto volta a zero
            minuto = 0;
            // hora aumenta em uma unidade
            hora++;
        }
    }
    // metodo que apresenta a hora atual
    public String MostrarHora(){
        // caso a hora e minuto sejam menores que 10, eh feita a formatacao para apresenta-los com um segundo digito (0)
        if (hora < 10 && minuto < 10){
            return "0"+hora+":"+"0"+minuto;
        }
        // caso so a hora tenha essa condicao, ela eh apresentada com um zero antes
        else if (hora < 10) {
            return "0"+hora+":"+minuto;
        }
        // caso so o minuto tenha essa condicao, ele eh apresentado com um zero antes
        else if (minuto < 10) {
            return hora+":"+"0"+minuto;
        }
        // nenhum tendo essa condicao, hora e minuto sao apresentado da forma que esta no atributo
        else return hora+":"+minuto;
    }
    
}
