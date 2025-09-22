public class Problem12 {
    public static void main(String[] args) {
        double distance = 24 * 1.6;
        int time = 1 + 40 * 60 + 35;

        double speed = distance / time * 100;

        System.out.println("Average speed in kilometers per hour is " + speed);
    }
}
