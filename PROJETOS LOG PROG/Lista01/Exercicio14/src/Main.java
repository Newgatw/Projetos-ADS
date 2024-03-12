import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double base, altura;

        System.out.println("Para calcularmos a área do triângulo retângulo, insira os seguintes valores:");
        System.out.print("Valor da base: ");
        base = scan.nextDouble();

        System.out.print("Valor da altura: ");
        altura = scan.nextDouble();

        System.out.println("A área do triângulo retangulo de base "+base+" e altura "+altura+" é: "+(base*altura/2));

    }
}