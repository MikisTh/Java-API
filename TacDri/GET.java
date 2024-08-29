public class GastoEnergeticoTotal {

    public static void main(String[] args) {
        // Dados de entrada
        String genero = "feminino"; // "masculino" ou "feminino"
        int idade = 30; // idade em anos
        double peso = 65; // peso em kg
        double altura = 165; // altura em cm
        String nivelAtividade = "moderadamente ativo"; // nível de atividade física

        // Cálculo da TMB usando a fórmula de Harris-Benedict
        double tmb;
        if (genero.equalsIgnoreCase("masculino")) {
            tmb = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * idade);
        } else {
            tmb = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * idade);
        }

        // Fatores de atividade física
        double fatorAtividade;
        switch (nivelAtividade.toLowerCase()) {
            case "sedentário":
                fatorAtividade = 1.2;
                break;
            case "levemente ativo":
                fatorAtividade = 1.375;
                break;
            case "moderadamente ativo":
                fatorAtividade = 1.55;
                break;
            case "muito ativo":
                fatorAtividade = 1.725;
                break;
            case "extremamente ativo":
                fatorAtividade = 1.9;
                break;
            default:
                fatorAtividade = 1.0; // caso padrão
        }

        // Cálculo do GET
        double get = tmb * fatorAtividade;

        // Exibição do resultado
        System.out.printf("O Gasto Energético Total (GET) é: %.2f calorias por dia.%n", get);
    }
}
