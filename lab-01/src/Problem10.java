public class Problem10 {
    public static void main(String[] args) {
        double distanceMiles = 14 / 1.6;
        int seconds = 45 * 60 + 30;
        double hours = seconds / 3600.0;

        double speed = distanceMiles / hours;

        System.out.println("Average speed in miles per hour is " + speed);
    }
}
