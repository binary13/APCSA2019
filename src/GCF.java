public class GCF {
    // Euclid's Method - recursive gcf
    private static int gcf(int dividend, int divisor) {
        int remainder = dividend % divisor;
        if (remainder == 0) return divisor;
        else return gcf(divisor, remainder);
    }

    public static void main(String[] args) {

    }
}
