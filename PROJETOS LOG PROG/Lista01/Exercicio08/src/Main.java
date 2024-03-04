import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mm, plg;

        System.out.print("Insira uma quantidade de polegadas: ");
        Scanner scan = new Scanner(System.in);
        plg = scan.nextDouble();
        mm = plg*25.4;

        System.out.println("Seu valor de "+plg+" polegadas é equivalente a "+mm+" milímetros.");

    }
}