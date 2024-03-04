import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, mi;

        System.out.print("Insira uma distância em milhas: ");
        Scanner scan = new Scanner(System.in);
        mi = scan.nextDouble();
        km = mi/0.621371;

        System.out.println("A distância de "+mi+" milhas equivale a "+km+" quilômetros");
    }
}