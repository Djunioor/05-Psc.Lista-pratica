import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maiorIndiceAcidentes = 0, menorIndiceAcidentes = 1, mediaVeiculos = 0;
        int numero, somaVeiculos = 0;
        String cidadeMaior = "", cidadeMenor = "";

        System.out.println("Informe o número de cidades:");
        numero = input.nextInt();

        String[] cidades = new String[numero];
        int[] numVeiculos = new int[numero];
        int[] numAcidentes = new int[numero];

        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.println("Informe o nome da cidade:");
            cidades[i] = input.nextLine();
            System.out.println("Informe o número de veículos de passeio:");
            numVeiculos[i] = input.nextInt();
            System.out.println("Informe o número de acidentes de trânsito com vítimas:");
            numAcidentes[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            double indiceAcidentes = (double) numAcidentes[i] / numVeiculos[i];
            if (indiceAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = indiceAcidentes;
                cidadeMaior = cidades[i];
            }
            if (indiceAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = indiceAcidentes;
                cidadeMenor = cidades[i];
            }
        }

        for (int i = 0; i < numero; i++) {
            somaVeiculos += numVeiculos[i];
        }
        mediaVeiculos = somaVeiculos / numero;

        System.out.println("Cidade com maior índice de acidentes de trânsito:");
        System.out.println("Nome da cidade: " + cidadeMaior);
        System.out.println("Índice de acidentes: " + maiorIndiceAcidentes);
        System.out.println("Cidade com menor índice de acidentes de trânsito:");
        System.out.println("Nome da cidade: " + cidadeMenor);
        System.out.println("Índice de acidentes: " + menorIndiceAcidentes);
        System.out.println("Média de veículos nas cinco cidades juntas: " + mediaVeiculos);

        input.close();
    }
}
