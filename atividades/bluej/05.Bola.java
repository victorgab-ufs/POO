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
    // metodo que tem como parametros as poiscoes horizontal e vertical da bola e a posicao (vertical) da raquete (imaginemos que podem ser obtidas atraves da game engine) 
    private void colisaoRaquetes(double xAtual, double yAtual, double posicaoRaquete){
        // se a posicao horizontal da bola for maior que 100 (extremo a direita) ou menor que 0 (extremo a esquerda)...
        // e nesse momento a altura da bola coincidir com a altura da raquete (levando em consideracao o tamanho da raquete)...
        if ((xAtual >= 100 || xAtual <= 0) && (yAtual <= posicaoRaquete+10 || yAtual >= posicaoRaquete-10)){
            // havendo a colisao, a velocidade horizontal se torna seu oposto
            velocidadex = -velocidadex;
        }
    }
    // metodo que tem como parametro a posicao horizontal da bola e verifica se algum dos jogadores pontuou
    private void pontuacao(double xPontuacao){
        // se a posicao da bola passar de 100 isso indica que passou do limite a direita (jogador 1/esquerda pontuou)
        if (xPontuacao > 100){
            // mensagem que indica pontuacao
            System.out.println("Jogador 1 pontuou");
            // metodo estagioInicial eh chamado
            estagioInicial();
        }
        // se a posicao da bola passar de 0 isso indica que passou do limite a esquerda (jogador 2/direita pontuou)
        if (xPontuacao < 0){
            // mensagem que indica pontuacao
            System.out.print("Jogador 2 pontuou");
            // metodo estagio inicial eh chamado
            estagioInicial();
        }
    }
    // metodo sem valor de retorno que nao tem parametro
    private void estagioInicial(){
        // todos os valores sao redefinados para os valores no momento de inicializacao dos atributos
        tempo = 0;
        velocidadex = 50;
        velocidadey = 0;
        posicaox = 50;
        posicaoy = 50;
    }
}
