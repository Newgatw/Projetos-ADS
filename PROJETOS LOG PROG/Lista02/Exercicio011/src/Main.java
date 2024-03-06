import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Insira um número de 1 a 7: ");
        num = scan.nextInt();
        if (num > 0 && num < 8){

            switch (num) {

                case 1:
                    System.out.println("O número selecionado corresponde a domingo.");
                    break;

                case 2:
                    System.out.println("O número selecionado corresponde a segunda-feira.");
                    break;

                case 3:
                    System.out.println("O número selecionado corresponde a terça-feira.");
                    break;

                case 4:
                    System.out.println("O número selecionado corresponde a quarta-feira.");
                    break;

                case 5:
                    System.out.println("O número selecionado corresponde a quinta-feira.");
                    break;

                case 6:
                    System.out.println("O número selecionado corresponde a sexta-feira.");
                    break;

                default:
                    System.out.println("O número selecionado corresponde a sábado.");


            }

        }
        else

            System.out.println("Número inválido!");

    }
}