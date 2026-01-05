// questao 15.1
package votacao;

import java.util.*;

public class MainVotacao {
    
    public static void main(String[] args){
        
        List<Candidato> lista = new ArrayList<>();

        lista.add(new Candidato("Victor"));
        lista.add(new Candidato("Leo"));

        UrnaEleitoral urna = new UrnaEleitoral(lista);

        urna.votacao(1);
        urna.votacao(0);
        urna.votacao(1);
        urna.votacao(2);
        urna.votacao(0);
        urna.votacao(3);

        urna.apurar();
    }
}
