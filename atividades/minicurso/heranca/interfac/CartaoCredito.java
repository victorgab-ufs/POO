package interfac;
public class CartaoCredito implements FormaDePagamento {    

    public void pagar(double valor){
        System.out.printf("Pagamento de R$%.2f realizado com cartao de credito\n", valor);
    }
}
