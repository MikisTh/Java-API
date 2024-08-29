public class TMB {
    public static void main(String[] args) {
        // Dados de entrada
        double peso = 70; // em kg
        double altura = 175; // em cm
        int idade = 25; // em anos
        String genero = "masculino"; // "masculino" ou "feminino"

        // Cálculo da TMB
        double tmb;
        if (genero.equalsIgnoreCase("masculino")) {
            tmb = 66 + (13.7 * peso) + (5 * altura) - (6.8 * idade);
        } else {
            tmb = 655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade);
        }

        // Exibir resultado
        System.out.println("A Taxa Metabólica Basal (TMB) é: " + tmb + " calorias/dia");
    }
}
