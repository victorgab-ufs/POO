package Aviao40;

import java.util.Scanner;

public class Aviao {
    
    private Scanner scanner = new Scanner (System.in);
    private int capacidade;
    private boolean[] assentos;

    public Aviao(){
        this.capacidade = 40;
        this.assentos = new boolean[this.capacidade];
    }

    public void mostrarLugares(){
        lugaresClasse(0, 9);
    }

    private boolean disponibilidade(int tipo){

        int inicio, fim;

        if (tipo == 1){
            inicio = 0;
            fim = 11;
        }

        else {
            inicio = 12;
            fim = 39;
        }
        
        for (int i = inicio; i <= fim; i++){
            
                if (this.assentos[i] == false)
                    return true;
            }

            return false;
    }

    public void lugaresClasse(int inicio, int fim){
        System.out.println("Lugares disponíveis:\n");
            
        for (int i = 1; i <= 4; i++){

            for (int j = inicio; j <= fim; j++){
                
                int indice = i + (4*j) - 1;
                System.out.printf("%s", this.assentos[indice] == false 
                                                ? indice + 1 + " " 
                                                : indice + 1 + "X ");
            }
            System.out.println();
        }
    }

    public void escolherLugar(){

        int escolha = 0;
        while (true){  
            System.out.println("Digite 0 para economica e 1 para primeira classe (outro numero para encerrar)");
            escolha = scanner.nextInt();

            if (escolha == 1){
                
                if (!disponibilidade(1))
                    System.out.println("Nao ha vagas na classe selecionada");
                
                else {
                    lugaresClasse(0, 2);
                    escolhaFinal(1);
                }
                    
            }
                
            else if (escolha == 0){
                
                if (!disponibilidade(0))
                    System.out.println("Nao ha vagas na classe selecionada");
                
                else{
                    lugaresClasse(3, 9);
                    escolhaFinal(0);
                }     
            }

            else { 
                System.exit(0);
            }
        }
    }

    private void escolhaFinal(int classe){

        System.out.println("Qual lugar deseja?");
        int poltrona = scanner.nextInt();

        if (classe == 1 && poltrona >= 1 && poltrona <= 12 && this.assentos[poltrona-1] == false)
            this.assentos[poltrona-1] = !this.assentos[poltrona-1];

        else if (classe == 0 && poltrona >= 13 && poltrona <= 40 && this.assentos[poltrona-1] == false)
            this.assentos[poltrona-1] = !this.assentos[poltrona-1];
        
        else
            System.out.println("Poltrona invalida");
    }
}


