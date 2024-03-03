import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2, result1, result2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        number1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        number2 = in.nextDouble();

        result1 = number1 + number2;
        result2 = result1 / 2;

        System.out.println("A média das notas " + number1 + " e " + number2 + " é: " + result2);

        in.close();
    }
}
