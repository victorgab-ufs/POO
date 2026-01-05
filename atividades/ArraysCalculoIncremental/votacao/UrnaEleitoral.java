// questao 15.3

package votacao;

import java.util.*;

public class UrnaEleitoral {

    private List<Candidato> listaCandidatos;
    private Scanner scanner;
    private int nulos = 0, brancos = 0;

    public UrnaEleitoral(List<Candidato> candidatos){
        this.listaCandidatos = candidatos;
        this.scanner = new Scanner(System.in);
        this.nulos = 0;
        this.brancos = 0;
    }

    public void votacao(int voto){

        boolean ehCandidato = false;
        if (voto == 0)
            this.brancos++;
        
        else {

            for (Candidato x : listaCandidatos){

                if (x.getNumero() == voto){
                    x.adicionarVoto();
                    ehCandidato = true;
                    break;
                }
            }

            if (!ehCandidato)
                this.nulos++;
            
        }
    }

    public void apurar(){

        int maior = (listaCandidatos.get(0)).getVotos();
        String maisVotado = (listaCandidatos.get(0)).getNome();

        for (Candidato c : listaCandidatos){
            
            System.out.println(c.dados());
            if (c.getVotos() > maior){
                maior = c.getVotos();
                maisVotado = c.getNome();
            }
        }

        System.out.printf("%s ganhou com %d voto(s)\n", maisVotado, maior);
        System.out.printf("Brancos: %d\nNulos: %d\n", brancos, nulos);
    }
}
