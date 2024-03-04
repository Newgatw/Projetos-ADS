import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kmh, ms;
        System.out.print("Insira uma quantidade de km/h: ");
        Scanner scan = new Scanner(System.in);
        kmh = scan.nextDouble();
        ms = kmh/3.6;

        System.out.println("A velocidade de "+kmh+" km/h é equivalente a " +ms+ " m/s.");

    }
}