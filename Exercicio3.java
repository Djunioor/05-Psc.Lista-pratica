import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notasA = new double[2];
        double[] notasP = new double[3];
        double[] peso = new double[3];
        double soma, calculo, media, mediaPon;
        int selecione;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            selecione = input.nextInt();
            switch (selecione) {
                case 1:
                    System.out.println("Digite duas notas para calcular a média aritmética:");
                    soma = 0;
                    for(int i = 0; i < notasA.length; i++) {
                        System.out.print("Digite a " + (i + 1) + "ª nota: ");
                        notasA[i] = input.nextDouble();
                        soma += notasA[i];
                    }
                    media = soma / notasA.length;
                    System.out.println("A média aritmética é: " + media);
                    break;

                case 2:
                    System.out.println("Digite três notas e seus respectivos pesos para calcular a média ponderada:");
                    calculo = 0;
                    for (int i = 0; i < notasP.length; i++) {
                        System.out.print("Digite a " + (i + 1) + "ª nota: ");
                        notasP[i] = input.nextDouble();
                        System.out.print("Digite o peso da " + (i + 1) + "ª nota: ");
                        peso[i] = input.nextDouble();
                        calculo += notasP[i] * peso[i];
                    }
                    mediaPon = calculo / notasP.length;
                    System.out.println("A média ponderada é: " + mediaPon);
                    break;

                case 3:
                    System.out.println("Você saiu do programa!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, digite 1, 2 ou 3.");
                    break;
            }
        } while (selecione != 3);

        input.close();
    }
}
