public class CalculoMET {
    public static void main(String[] args) {
        double met = 5.0; // Exemplo de MET para uma atividade aeróbica de baixo impacto
        double pesoCorporal = 80.0; // Peso corporal em kg
        double tempoAtividade = 1.5; // Tempo da atividade em horas

        double gastoEnergetico = calcularGastoEnergetico(met, pesoCorporal, tempoAtividade);
        System.out.println("Gasto energético: " + gastoEnergetico + " kcal");
    }

    public static double calcularGastoEnergetico(double met, double peso, double tempo) {
        return met * peso * tempo;
    }
}
