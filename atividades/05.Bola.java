// PARTE 1 DE ATIVIDADE INSPIRADA NO JOGO PONG

// imaginando o jogo em um quadrado 100x100

// criacao da classe bola
public class Bola {
    // definicao dos atributos
    private double tempo;
    private int tamanho;
    private double velocidadex;
    private double velocidadey;
    private double posicaox;
    private double posicaoy;
    private double posicaoRaquete;
    // construtor
    public Bola(){
        // inicializacao dos atributos
        tempo = 0;
        tamanho = 5;
        velocidadex = 50;
        velocidadey = 0;
        posicaox = 50;
        posicaoy = 50;
        posicaoRaquete = 50;
    }
    // metodo responsavel por fazer o tempo variar e o jogo "correr" (definicao basica (abstrata) sem uso de game engine)
    public void aumentarTempo(){
        // aumenta o tempo (imaginemos, por enqaunto que constantemente)
        tempo = tempo + 0.1;
        // chama o metodo posicao que atualiza as coordenadas da bola enquanto o tempo vai passando
        posicao(tempo); 
    }
    // metodo que tem o tempo como parametro e calcula a posicao atual da bola 
    private void posicao (double tempo){
        // calcula a posicao da bola na horizontal de acordo com a passagem do tempo e velocidade predefinida
        posicaox += velocidadex * tempo;
        // calcula a posicao da bola na vertical de acordo com a passagem do tempo e velocidade predefinida
        posicaoy += velocidadey * tempo;
        // chama o metodo colisaoTeto, que verifica se a bola colidiu com os extremos na posicao vertical
        colisaoTeto(posicaoy);
        // chama o metodo colisaoRaquetes, que verifica se a bola colidiu com os extremos na horizontal enquanto a raquete estava em altura equivalente a da bola
        colisaoRaquetes(posicaox, posicaoy, posicaoRaquete);
        // chama o metodo pontuacao, que verifica se a bola chegou a um dos extremos horizontais e nao tocou na raquete (fez ponto)
        pontuacao(posicaox);
    }
    // metodo que tem como parametro a altura atual e checa se a bola tocou nos extremos na posicao vertical
    private void colisaoTeto(double yAtual){
        // checa se a altura chegou (ou passou por muito pouco) em 0 ou 100 (alturas maxima e minima) 
        if (yAtual >= 100 || yAtual <= 0){
            // caso sim, colidiu, logo a velocidade vertical se torna negativa (se a bola subia, passa a descer)
            velocidadey = -velocidadey;
        }
    }
    
    private void colisaoRaquetes(double xAtual, double yAtual, double posicaoRaquete){
        if ((xAtual >= 100 || xAtual <= 0) && (yAtual <= posicaoRaquete+10 || yAtual >= posicaoRaquete-10)){
            velocidadex = -velocidadex;
        }
    }
    
    private void pontuacao(double xPontuacao){
        if (xPontuacao > 100){
            System.out.println("Jogador 2 pontuou");
            estagioInicial();
        }
        
        if (xPontuacao < 0){
            System.out.print("Jogador 1 pontuou");
            estagioInicial();
        }
    }
    
    private void estagioInicial(){
        tempo = 0;
        velocidadex = 50;
        velocidadey = 0;
        posicaox = 50;
        posicaoy = 50;
    }
}
