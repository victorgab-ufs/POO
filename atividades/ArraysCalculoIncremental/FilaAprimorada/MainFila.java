package FilaAprimorada;

public class MainFila {
    
    public static void main(String[] args){

        Fila fila1 = new Fila(10);

        System.out.println(fila1.vazia()); 

        fila1.enfilerar(0);
        fila1.enfilerar(1);
        fila1.enfilerar(2);
        fila1.enfilerar(3);
        fila1.enfilerar(4);
        fila1.enfilerar(5);
        fila1.enfilerar(6);
        fila1.enfilerar(7);
        fila1.enfilerar(8);
        fila1.enfilerar(9);
        fila1.enfilerar(10);

        System.out.println(fila1.vazia());

        System.out.println(fila1.tamanho());

        System.out.println(fila1.primeiro());

        fila1.desenfilerar();
        fila1.desenfilerar();

        System.out.println(fila1.tamanho());

        System.out.println(fila1.primeiro());

    }
}
