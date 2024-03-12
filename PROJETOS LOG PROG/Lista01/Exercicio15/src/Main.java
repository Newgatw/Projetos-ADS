import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r,h;

        System.out.print("Para calcularmos o volume de um cilindro, primeiro, insira o valor de seu raio: ");
        r = scan.nextDouble();
        System.out.print("Agora, insira o valor de sua altura: ");
        h = scan.nextDouble();

        System.out.println("O volume de um cilindro de raio "+r+" e altura "+h+" é: "+(Math.PI*Math.pow(r,2)*h));

    }
}