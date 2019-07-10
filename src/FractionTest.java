public class FractionTest {
    public static void main(String[] args) {
        Fraction twoThirds = new Fraction(2,3);
        Fraction threeFourths = new Fraction(3, 4);

        System.out.println("Fraction two thirds: " + twoThirds);
        System.out.println("Two thirds as a decimal: " + twoThirds.toDecimal());
        System.out.println();

        System.out.println("Fraction three fourths: " + threeFourths);
        System.out.println("Three fourths as a decimal: " + threeFourths.toDecimal());
        System.out.println();

        System.out.println("Two thirds times three fourths: " + twoThirds.times(threeFourths));
        System.out.println("Two thirds times three fourths reduced: " + twoThirds.times(threeFourths).reduce());
        System.out.println();

        System.out.println("The reciprocal of two thirds: " + twoThirds.reciprocal());
        System.out.println();

        System.out.println("Two thirds divided by three fourths: " + twoThirds.divide(threeFourths));
        System.out.println("Three fourths divided by two thirds: " + threeFourths.divide(twoThirds));
        System.out.println();

        System.out.println("Two thirds plus three fourths: " + twoThirds.plus(threeFourths) + " = 17/12");
        System.out.println();

        System.out.println("Two thirds minus three fourths: " + twoThirds.minus(threeFourths) + " = -1/12");
        System.out.println("Three fourths minus two thirds: " + threeFourths.minus(twoThirds) + " = 1/12");
        System.out.println();

        System.out.println("Two thirds is less than three fourths: " + twoThirds.lessThan(threeFourths));
        System.out.println("Two thirds is greater than three fourths: " + twoThirds.greaterThan(threeFourths));
        System.out.println("Two thirds is equal to three fourths: " + twoThirds.equals(threeFourths));
        System.out.println("One half is equal to three sixths: " + new Fraction(1,2).equals(new Fraction(3,6)));
        System.out.println();

        // Comparing
        System.out.println(threeFourths.compareTo(twoThirds));
    }
}
