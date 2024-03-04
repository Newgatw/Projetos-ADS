import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mm, plg;

        System.out.print("Insira uma quantidade de milímetros: ");
        Scanner scan = new Scanner(System.in);
        mm = scan.nextDouble();
        plg = mm/25.4;

        System.out.println("Seu valor de "+mm+" milímetros é equivalente a "+plg+" polegadas.");

    }
}