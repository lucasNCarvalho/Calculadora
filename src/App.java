public class App {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        ErroTratativas erroTrat = new ErroTratativas();

 
        double soma = calculadora.somar(5,3);
        double sub = calculadora.subtrair(5, 3);
        double multi = calculadora.multiplicar(5 ,3);
        double div = calculadora.dividir(5 ,0);
    
        

        try {
            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + sub);
            System.out.println("Multiplicação: "+ multi);
            System.out.println("Divisão: " + div);

        } catch (ArithmeticException e) {
            erroTrat.tratarErro(e);
        }

    }
}
