import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double v0,a,t;

        System.out.println("Vamos calcular a velocidade de um determinado trajeto:");
        System.out.print("Primeiramente, insira a Velocidade Inicial (v0): ");
        v0 = scan.nextDouble();

        System.out.print("Agora, insira a Aceleração (a): ");
        a = scan.nextDouble();

        System.out.print("Por último, insira o Tempo (t): ");
        t = scan.nextDouble();

        System.out.println("Assim sendo, ao obtermos:\n(v)0 "+v0+", (a) "+a+", e (t) "+t+",chegamos à Velocidade Final de:\n"+(v0+a*t)+" (m/s)");
    }
}