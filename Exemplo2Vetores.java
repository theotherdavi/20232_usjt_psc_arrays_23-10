public class Exemplo2Vetores {
    public static void main(String[] args) {
        // Podemos inicializar ele atribuindo valores diretamente, também:
        int[] notas = new int[] { 4, 10, 5, 8 };

        // Exibir as notas, seguindo um modelo similar ao do primeiro exemplo (arquivo
        // ExemploVetores.java)
        for (int i = 0; i < notas.length; ++i) {
            System.out.println(notas[i]);
        }

        // Fazendo uso do enhanced for
        for (int nota : notas) { // É também conhecido como o for-each
            // Lê se nota in notas, isto é, "nota" é cada um dos elementos de "notas"
            System.out.println(nota);
        }

        // Acúmulo de resultados
        int soma = 0;

        for (int nota : notas) { // É também conhecido como o for-each
            soma += nota;
            System.out.println("Soma: " + soma);
        }
    }
}
