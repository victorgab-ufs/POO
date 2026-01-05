package interfac;

public class Main {

    public static void main(String[] args) {

        Pix novoPix = new Pix();
        
        Cliente cliente1 = new Cliente("victor", novoPix);
    
        cliente1.comprar(500);
        String nome1 = cliente1.getNome();

        
        System.out.println(nome1);

    }
    
}
