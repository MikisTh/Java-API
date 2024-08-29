public class FerroSerico {
    public static void main(String[] args) {
        // Valores de exemplo
        double concentracaoFerro = 150; // em microgramas por decilitro (µg/dL)
        double volumeAmostra = 10; // em mililitros (mL)

        // Cálculo do ferro sérico
        double ferroSerico = calcularFerroSerico(concentracaoFerro, volumeAmostra);

        // Exibir o resultado
        System.out.println("O ferro sérico é: " + ferroSerico + " µg");
    }

    public static double calcularFerroSerico(double concentracao, double volume) {
        return concentracao * volume;
    }
}