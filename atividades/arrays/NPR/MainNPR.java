public class MainNPR {
    
    public static void main(String[] args) {
        
        CalculadoraNPR c1 = new CalculadoraNPR();

        String expressao = "3 2 * 1 1 - +";
        double resultado = c1.calcularExpressao(expressao);

        System.out.println(resultado);
    }
}
