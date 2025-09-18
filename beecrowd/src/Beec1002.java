import java.util.Scanner;

public class Beec1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double a = 3.14159 * r * r;

        System.out.printf("A=%.4f\n", a);
    }
}
