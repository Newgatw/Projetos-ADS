import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double c,f;

        System.out.print("Insira uma temperatura em graus Celsius: ");
        Scanner scan = new Scanner(System.in);
        c = scan.nextDouble();
        f = (c*1.8)+32;

        System.out.println(+c+" graus Celsius equivalem a "+f+" graus Fahrenheit.");


    }
}