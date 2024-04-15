import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            int canal, pessoasTotal = 0, pessoas4 = 0, pessoas5= 0;
            int pessoas7 = 0, pessoas12 = 0, assistindo;
            double porcentagem4, porcentagem5;
            double porcentagem7, porcentagem12;
            
            while (true) {
                System.out.println("Digite o número do canal e o número de pessoas assistindo (ou 0 para encerrar):");
                canal = input.nextInt();
                if (canal == 0) {
                    break;
                }
    
                System.out.print("Digite o número de expectadores: ");
                assistindo = input.nextInt();
                
                switch (canal) {
                    case 4:
                        pessoas4 += assistindo;
                        break;
                    case 5:
                        pessoas5 += assistindo;
                        break;
                    case 7:
                        pessoas7 += assistindo;
                        break;
                    case 12:
                        pessoas12 += assistindo;
                        break;
                    default:
                        System.out.println("Digite um canal válido!");
                        continue;
                }
                
                pessoasTotal += assistindo;
            }
    
            if (canal == 0 && pessoasTotal == 0) {
                System.out.println("Você encerrou o programa!");
            } else if(pessoasTotal == 0) {
                System.out.println("Nenhum dado foi fornecido.");
            } else if (canal == 0){
    
                porcentagem4 = (pessoas4 * 100.0) / pessoasTotal;
                porcentagem5 = (pessoas5 * 100.0) / pessoasTotal;
                porcentagem7 = (pessoas7 * 100.0) / pessoasTotal;
                porcentagem12 = (pessoas12 * 100.0) / pessoasTotal;
    
                System.out.printf("A porcentagem de pessoas assistindo o canal 4 é: %.2f%%\n", porcentagem4);
                System.out.printf("A porcentagem de pessoas assistindo o canal 5 é: %.2f%%\n", porcentagem5);
                System.out.printf("A porcentagem de pessoas assistindo o canal 7 é: %.2f%%\n", porcentagem7);
                System.out.printf("A porcentagem de pessoas assistindo o canal 12 é: %.2f%%\n",porcentagem12);
               
    
            
            }
            input.close();
        }
    }
    
