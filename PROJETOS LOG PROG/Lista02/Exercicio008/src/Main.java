import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner n1 = new Scanner(System.in);
        double result = n1.nextDouble();

        if(result % 2 == 0){

            System.out.print("O número " +result+ " é um número par.");

        }

        else if (result % 2 == 1){

            System.out.print("O número " +result+ " é ímpar");

        }
    }
}