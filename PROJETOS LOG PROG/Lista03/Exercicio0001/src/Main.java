import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Insira um número: ");
        n = scan.nextInt();

        System.out.println("Tabuada do "+n+":");


        for (int tabu=0; tabu<11; tabu++){

            System.out.println(n+"x"+tabu+"= "+(n*tabu));


        }
    }
}