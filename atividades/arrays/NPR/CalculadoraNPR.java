public class CalculadoraNPR {

    private Pilha pilha; 
    private String[] expressao;

    public CalculadoraNPR() {
        this.expressao = new String[100];
        this.pilha = new Pilha(100);
    }

    private void formatarExpressao(String expressao){
        this.expressao = expressao.split(" ");
    }

    public double calcularExpressao(String expressao) {
        
        formatarExpressao(expressao);

        for (String x : this.expressao){

            if (x.equals("+")){
                somar();
            }

            else if (x.equals("-")){
                subtrair();
            }

            else if (x.equals("*")){
                multiplicar();
            }

            else if (x.equals("+")){
                dividir();
            }

            else {
                double numero = Double.parseDouble(x);
                this.pilha.empilhar(numero);
            }
        }
        
        return this.pilha.desempilhar();
    }

    public void somar() {
        double num2 = this.pilha.desempilhar();
        double num1 = this.pilha.desempilhar();
        
        double resultado = num1 + num2;
        this.pilha.empilhar(resultado);
    }

    public void subtrair() {
        double num2 = this.pilha.desempilhar();
        double num1 = this.pilha.desempilhar();
        
        double resultado = num1 - num2;
        this.pilha.empilhar(resultado);
    }

    public void multiplicar() {
        double num2 = this.pilha.desempilhar();
        double num1 = this.pilha.desempilhar();
        
        double resultado = num1 * num2;
        this.pilha.empilhar(resultado);
    }

    public void dividir() {
        double num2 = this.pilha.desempilhar();
        double num1 = this.pilha.desempilhar();
        
        double resultado = num1 / num2;
        this.pilha.empilhar(resultado);
    }
}