import java.util.Scanner;

public class Voo {
    
    Scanner scanner = new Scanner(System.in);
    private boolean[] assentos;
    private int assentoEscolhido;
    
    public Voo(){
        this.assentos = new boolean[16];
    }

    private void reservaClasse1(){

        System.out.println("Qual assento deseja?");
        assentoEscolhido = scanner.nextInt();

        if (assentoEscolhido < 1 || assentoEscolhido > 4){
            System.out.println("Esse assento não pertence a classe escolhida");
        }

        else if (this.assentos[assentoEscolhido-1]){
            System.out.println("O assento esta ocupado");
        }

        else {
            this.assentos[assentoEscolhido-1] = true;
            System.out.printf("O assento %d foi reservado com sucesso\n", assentoEscolhido);
        }
    }

    private void reservaClasse2(){

         System.out.println("Qual assento deseja?");
        assentoEscolhido = scanner.nextInt();

        if (assentoEscolhido < 5 || assentoEscolhido > 16){
            System.out.println("Esse assento não pertence a classe escolhida");
        }

        else if (this.assentos[assentoEscolhido-1]){
            System.out.println("O assento esta ocupado");
        }

        else {
            this.assentos[assentoEscolhido-1] = true;
            System.out.printf("O assento %d foi reservado com sucesso\n", assentoEscolhido);
        }
    }

    private int escolha;
    
    public void escolherAssento(){

        mostrarAssentosDisponiveis();

        System.out.println("Digite 1 para assento de 1a classe ou 2 para a classe economica");
        escolha = scanner.nextInt();
        
        if (escolha == 1)
            reservaClasse1();
        
        else if (escolha == 2)
            reservaClasse2();
        
        else 
            System.out.println("Escolha inválida");
    }

    private void mostrarAssentosDisponiveis(){

        System.out.println("Assentos de 1 a 4: 1a classe / Assentos de 1 a 16: classe economica");
        for (int i = 0; i < 16; i++){
            
            if (this.assentos[i] == false)
                System.out.print(i+1 + " ");
            else
                System.out.print(i+1 + "X ");
        }
        System.out.println("");
    }

}
