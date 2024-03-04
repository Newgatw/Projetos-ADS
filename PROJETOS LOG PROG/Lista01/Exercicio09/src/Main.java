import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, mi;

        System.out.print("Insira uma distância em quilômetros: ");
        Scanner scan = new Scanner(System.in);
        km = scan.nextDouble();
        mi = km*0.621371;

        System.out.println("A distância de "+km+" quilômetros equivale a "+mi+" milhas");
    }
}