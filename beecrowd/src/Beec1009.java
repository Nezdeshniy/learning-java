import java.util.Scanner;

public class Beec1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double salary = input.nextDouble();
        double value = input.nextDouble();

        double total = salary + (value * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
