// criacao da classe 
public class Interruptores {
    // criacao dos atributos (privados -> encapsulados)
    private boolean interruptor1;
    private boolean interruptor2;
    // construtor
    public Interruptores(){
        // inicializacao dos atributos
        interruptor1 = false;
        interruptor2 = false;
    }
    // metodo que modifica o estado do interruptor 1 e nao retorna nada (void)
    public void ligarDesligar1(){
        interruptor1 = !interruptor1;
    }
    // metodo que modifica o estado do interruptor 2 e nao retorna nada (void)
    public void ligarDesligar2(){
        interruptor2 = !interruptor2;
    }
    // metodo que retorna o ou-exclusivo do estado dos interruptores
    public boolean lampada(){
        return (interruptor1 || interruptor2) && !(interruptor1 && interruptor2);
    }
}
