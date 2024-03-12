import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r,h;
        Scanner scan = new Scanner(System.in);

        System.out.print("-----Vamos calcular o volume de um cone-----\nPrimeiro, insira o valor de seu raio: ");
        r = scan.nextDouble();
        System.out.print("A seguir, insira o valor de sua altura: ");
        h = scan.nextDouble();

        System.out.println("Pronto! O volume de um cone de raio "+r+" e altura "+h+" é:"+(Math.PI*Math.pow(r,2)*h/3));

    }
}