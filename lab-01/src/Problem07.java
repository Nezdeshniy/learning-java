public class Problem07 {
    public static void main(String[] args) {
        double sequence = 1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11;

        double result1 = 4 * sequence;
        double result2 = 4 * (sequence + 1.0/13);

        System.out.println("4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = " + result1);
        System.out.println("4 × (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = " + result2);
    }
}
