package interfac;

public class Pix implements FormaDePagamento {

    public void pagar(double valor){
        System.out.printf("Pagamento de R$%.2f realizado via PIX\n", valor);
    }
}
