import java.util.Scanner;

public class Beec1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int hours = input.nextInt();
        double perHour = input.nextDouble();

        double salary = hours * perHour;

        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
