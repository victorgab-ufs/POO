// PARTE 2 (FINAL) DE ATIVIDADE INSPIRADA NO JOGO PONG

// criacao da classe Raquetes
public class Raquetes {

    // definicao dos atributos
    private double yRaquete1;
    private double yRaquete2;
    private double tamanhoRaquetes;
    private double tempoRaquete1;
    private double tempoRaquete2;
    private double velocidadeRaquete1;
    private double velocidadeRaquete2;
    private int sentido1;
    private int sentido2;
    // construtor
    public Raquetes(){
        // inicializacao dos atributos
        yRaquete1 = 50;
        yRaquete2 = 50;
        tamanhoRaquetes = 20;
        tempoRaquete1 = 0;
        tempoRaquete2 = 0;
        velocidadeRaquete1 = 20;
        velocidadeRaquete2 = 20;
        sentido1 = 1;
        sentido2 = 1;
    }
    // metodo que recebe o tempo e o sentido da raquete
    public void posicaoRaquete1 (double tempoRaquete1, int sentido1){
        // condicional que verifica se a raquete esta dentro dos limites do jogo a
        if (yRaquete1 <= 90 && yRaquete1 >= 10) {
            // se o sentido for positivo, a "altura" da raquete aumenta 
            if (sentido1 == 1){
                yRaquete1 += velocidadeRaquete1 * tempoRaquete1;
            }
            // se o sentido for negativo, a "altura" da raquete diminui
            else if (sentido1 == -1) {
                yRaquete1 -= velocidadeRaquete1 * tempoRaquete1;
            }
        }
    }
    // mesma situacao que a citada nas linhas 29-42, porem levando em consideracao a raquete 2
    public void posicaoRaquete2 (double tempoRaquete2, int sentido){
    
        if (yRaquete2 <= 90 && yRaquete2 >= 10) {
            
            if (sentido2 == 1){
                yRaquete2 += velocidadeRaquete2 * tempoRaquete2;
            }
            
            else if (sentido2 == -1) {
                yRaquete2 -= velocidadeRaquete2 * tempoRaquete2;
            }
        }
    }
}
