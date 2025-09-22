public class Problem11 {
    public static void main(String[] args) {
        int birth = 7;
        int death = 13;
        int immigrant = 45;
        int population = 312032486;
        int year = 365 * 24 * 60 * 60;

        double difference = (double) year / birth - (double) year / death + (double) year / immigrant;

        for (int i = 1; i <= 5; i++) {
            double future = population + i * difference;
            System.out.printf("Year %d: population is %.0f\n", i, future);
        }
    }
}
