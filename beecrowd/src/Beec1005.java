import java.util.Scanner;

public class Beec1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a =  input.nextDouble();
        double b = input.nextDouble();

        double c = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", c);
    }
}
