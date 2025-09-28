public class Problem12 {
    public static void main(String[] args) {
        double distanceKm = 24 * 1.6;

        int seconds = 3600 + 40 * 60 + 35;
        double hours = seconds / 3600.0;

        double speed = distanceKm / hours;

        System.out.println("Average speed in kilometers per hour is " + speed);
    }
}
