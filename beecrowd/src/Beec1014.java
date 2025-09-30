import java.util.Scanner;

public class Beec1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanceKm =  sc.nextInt();
        double fuelSpent = sc.nextDouble();

        double consumption = distanceKm / fuelSpent;

        System.out.printf("%.3f km/l%n",  consumption);
    }
}
