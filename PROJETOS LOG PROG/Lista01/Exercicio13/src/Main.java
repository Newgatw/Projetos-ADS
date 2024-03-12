import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double raio;

        System.out.print("Insira a distância do raio: ");
        raio = scan.nextDouble();

        System.out.println("O valor da área de um circulo de raio "+raio+" é: "+(Math.PI*Math.pow(raio,2)));

    }
}