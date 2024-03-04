import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double m1, m2, resultado;
        System.out.println("Insira a primeira nota: ");
        Scanner scan = new Scanner(System.in);
        m1 = scan.nextDouble();

        System.out.println("Insira a segunda nota: ");
        Scanner scan2 = new Scanner(System.in);
        m2 = scan2.nextDouble();

        resultado = (m1+m2) /2;


        System.out.print("A média entre as notas "+m1+" e "+m2+" é igual a:\n" +resultado);

    }
}