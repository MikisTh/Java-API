public class BalancoNitrogenado {
    public static void main(String[] args) {
        // Exemplo de dados
        double ingestaoProteina = 100.0; // em gramas
        double excrecaoUrina = 15.0; // em gramas
        double excrecaoFezes = 5.0; // em gramas
        double excrecaoPele = 2.0; // em gramas

        // Cálculo do balanço nitrogenado
        double nitrogenioIngerido = ingestaoProteina * 0.16; // 1g de proteína contém aproximadamente 0.16g de nitrogênio
        double nitrogenioExcretado = excrecaoUrina + excrecaoFezes + excrecaoPele;
        double balancoNitrogenado = nitrogenioIngerido - nitrogenioExcretado;

        // Exibição do resultado
        System.out.println("Balanço Nitrogenado: " + balancoNitrogenado + " g/dia");
    }
}
