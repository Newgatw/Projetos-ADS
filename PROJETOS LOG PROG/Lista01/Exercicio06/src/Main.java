import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kmh, ms;
        System.out.print("Insira uma quantidade de m/s: ");
        Scanner scan = new Scanner(System.in);
        ms = scan.nextDouble();
        kmh = ms*3.6;

        System.out.println("A velocidade de "+ms+" m/s é equivalente a " +kmh+ " km/h.");

    }
}