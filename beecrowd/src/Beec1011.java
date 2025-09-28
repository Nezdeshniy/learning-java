import java.util.Scanner;

public class Beec1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius = input.nextInt();

        double volume = (4.0/3) * 3.14159 * radius * radius * radius;

        System.out.printf("VOLUME = R$ %.3f%n", volume);
    }
}
