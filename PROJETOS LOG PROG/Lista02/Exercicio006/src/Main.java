import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Selecione a opção desejada: ");
        Scanner op = new Scanner(System.in);
        int opIn = op.nextInt();

        if (opIn == 5) {

            System.out.println("Você selecionou a opção 5.");

        }

        else if (opIn == 6){

            System.out.println("Você selecionou a opção 6.");

        }

        else if (opIn == 7){

            System.out.println("Você selecionou a opção 7.");

        }

        else if (opIn == 8){

            System.out.println("Você selecionou a opção 8.");

        }

        else if (opIn == 9){

            System.out.println("Você selecionou a opção 9.");

        }

        else {

            System.out.println("Você não selecionou uma opção válida. Por favor, selecione uma opção disponível.");
        }
    }
}