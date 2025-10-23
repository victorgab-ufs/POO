// criacao da classe RelogioDigitalMelhorado
public class RelogioDigitalMelhorado{
    // criacao dos atributos privados (encapsulados)
    private int hora;
    private int minuto;
    private int segundo;
    private int hAlarme;
    private int minAlarme;
    // consrutor
    public RelogioDigitalMelhorado(){
        // inicializacao dos atributos
        hora = 0;
        minuto = 0;
        segundo = 0;
        hAlarme = -1;
        minAlarme = -1;
    }
    // metodo que tem como parametros hora e minuto e modifica o horario atual
    public String definirHora(int horaInserida, int minutoInserido){
        // checa se hora e minuto estao no intervalo aceitavel para modifica-los (0 a 23 horas (inclusive)) / (0 a 60 minutos (inclusive))
        // caso estejam validos...
        if ((horaInserida >= 0 && horaInserida <= 23) && (minutoInserido >= 0 && minutoInserido <= 59)){
            // modifica a hora de acordo com o valor recebido no parametro
            hora = horaInserida;
            // modifica o minuto de acordo com o valor recebido no parametro
            minuto = minutoInserido;
            // inicia o novo horario com segundo == 0
            segundo = 0;
            // envia nova hora e minuto para o metodo Alarmar (verifica se eles coincidem para assim "tocar" o alarme)
            Alarmar(horaInserida, minutoInserido);
            // retorno (String) da funcao que confirma a definicao do novo horario
            return "Horário definido com sucesso";
        } // fim da condicional
        
        else{
            return "Formato de horário incompatível"; // para horarios fora do intervalo apresenta essa mensagem
        }
        
    }
    // metodo que tem como parametros hora e minuto e define esses como horario de um alarme
    public String definirAlarme(int horaAlarme, int minutoAlarme){
        // checa se hora e minuto estao no intervalo aceitavel (0 a 23 horas (inclusive)) / (0 a 60 minutos (inclusive))
        // caso estejam validos...
        if ((horaAlarme >= 0 && horaAlarme <= 23) && (minutoAlarme >= 0 && minutoAlarme <= 59)){
            // define a hora do alarme como a hora inserida no parametro
            hAlarme = horaAlarme;
            // define o minuto do alarme como o minuto inserido no parametro
            minAlarme = minutoAlarme;
            // condicionais que fazem a formatacao do horario (EH POSSIVEL USAR STRING FORMAT)
            // ambos menores que 10, coloca-se 0 antes deles
            if (horaAlarme < 10 && minutoAlarme < 10){
                return "Alarme definido para "+"0"+horaAlarme+":"+"0"+minutoAlarme;
            }
            // hora < 10, coloca-se 0 somente antes da hora
            else if (horaAlarme < 10){
                return "Alarme definido para "+"0"+horaAlarme+":"+minutoAlarme;
            }
            // minuto < 10, coloca-se 0 somente antes do minuto
            else if (minutoAlarme < 10){
                return "Alarme definido para "+horaAlarme+":"+"0"+minutoAlarme;
            }
            // nenhum < 10, sao apresentados do jeito que estao
            else{
                return "Alarme definido para "+horaAlarme+":"+minutoAlarme;
            }
        } // fim da primeira condicional (intervalo valido de horas e minutos)
        
        else {
            return "Formato de horário incompatível"; // mensagem retornada quando o horario inserido esta fora do intervalo
        }
    }

    // metodo que recebe hora e minuto, nao retorna nenhum valor e checa se hora e minuto do relogio coincidem com hora e minuto do alarme
    private void Alarmar(int horaAtual, int minutoAtual){
        // checa se hora e minuto do relogio coincidem com o do alarme (segundo esta = 0  porque representa virada de minuto ou definicao de novo horario)
        if (horaAtual == hAlarme && minutoAtual == minAlarme && segundo == 0){
            // se ha essa coincidencia, imprime alarme na tela
            System.out.println("Alarme!!!");
        }
    }
    // metodo tick que nao retorna valor e incrementa os segundos uma unidade por vez
    public void tick(){
        // incrementacao dos segundos
        segundo += 1;
        // caso o segundo seja igual a 60, passou um minuto, logo:
        if (segundo == 60){
            // segundo eh zerado
            segundo = 0;
            // minuto aumenta em uma unidade
            minuto += 1;
        }
        // se com o incremento minutos chegou a 60 (passou uma hora)
        if (minuto == 60){
            // minuto eh zerado
            minuto = 0;
            // hora aumenta em uma unidade
            hora += 1;
        }
        // se com o incremento hora chegou a 24 (finalizou o  dia)
        if (hora == 24){
            // hora eh zerada
            hora = 0;
        }
        // apos modificacao do horario a cada "tick", o metodo alarme eh chamado para testar se os horarios coincidem
        Alarmar(hora, minuto);
        
    }
    // metodo que apresenta o horario atual
    public String mostrarHorario(){
        // condicionais que formatam o horario apresentado
        // de maneira geral: formata com um zero antes aqueles com 1 algarismo so (menores de 10)
        // """""""""""""""": apresenta do jeito que estao aqueles com 2 algarismo (de 10 ate o intervaloc correspondente a cada)
        if (hora < 10 && minuto < 10 && segundo < 10){
            return "0"+hora+":"+"0"+minuto+":"+"0"+segundo;
        }
        
        else if (hora < 10 && minuto < 10){
            return "0"+hora+":"+"0"+minuto+":"+segundo;
        }
        
        else if (hora < 10 && segundo < 10){
            return "0"+hora+":"+minuto+":"+"0"+segundo;
        }
        
        else if (minuto < 10 && segundo < 10){
            return hora+":"+"0"+minuto+":"+"0"+segundo;
        }
        
        else if (hora < 10){
            return "0"+hora+":"+minuto+":"+segundo;
        }
        
        else if (minuto < 10){
            return hora+":"+"0"+minuto+":"+segundo;
        }
        
        else if (segundo < 10) {
            return hora+":"+minuto+":"+"0"+segundo;
        }
        
        else {
            return hora+":"+minuto+":"+segundo;
        }
    
    }
}
