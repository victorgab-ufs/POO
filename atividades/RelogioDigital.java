public class RelogioDigital {
    
    private int hora;
    private int minuto;
    
    public RelogioDigital(){
        
        hora = 0;
        minuto = 0;
    }
    
    public void tick(){
        
        minuto++;
        
        if (minuto == 60){
            
            minuto = 0;
            hora++;
        }
    }
    
    public String MostrarHora(){
        
        if (hora < 10 && minuto < 10){
            return "0"+hora+":"+"0"+minuto;
        }
        
        else if (hora < 10) {
            return "0"+hora+":"+minuto;
        }
        else if (minuto < 10) {
            return hora+":"+"0"+minuto;
        }
        else return hora+":"+minuto;
    }
    
}