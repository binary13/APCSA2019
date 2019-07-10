public class Fraction {

    // Class variables
    private int numerator;
    private int denominator;

    // Constructors
    public Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    public Fraction(int num) {
        numerator = num;
        denominator = 1;
    }

    public Fraction(int whole, int numer, int denom) {
        this.numerator = whole*denom+numer;
        this.denominator = denom;
    }

    // Accessor methods
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Double toDecimal() {
        return numerator / (denominator + 0.0);
    }

    public Fraction times(Fraction other) {
        return new Fraction((this.numerator * other.numerator), (this.denominator * other.denominator));
    }

    public Fraction reduce() {
        int numer = this.numerator;
        int denom = this.denominator;

        for (int i = 2; i <= this.denominator/2; i++) {
            if (numer % i == 0 && denom % i == 0) {
                numer = numer / i;
                denom = denom / i;
            }
        }
        return new Fraction(numer, denom);
    }

    public Fraction reciprocal() {
        return new Fraction(this.denominator, this.numerator);
    }

    public Fraction divide(Fraction other) {
        return this.times(other.reciprocal());
    }

    public Fraction plus(Fraction other) {
        Fraction left = new Fraction(this.numerator * other.denominator, this.denominator * other.denominator);
        Fraction right = new Fraction(other.numerator * this.denominator, other.denominator*this.denominator);

        return new Fraction(left.numerator+right.numerator, left.denominator).reduce();
    }

    public Fraction minus(Fraction other) {
        Fraction left = new Fraction(this.numerator * other.denominator, this.denominator * other.denominator);
        Fraction right = new Fraction(other.numerator * this.denominator, other.denominator*this.denominator);

        return new Fraction(left.numerator-right.numerator, left.denominator).reduce();
    }

    public boolean lessThan(Fraction other) {
        return (this.numerator * other.denominator) < (other.numerator * this.denominator);
    }

    public boolean greaterThan(Fraction other) {
        return (this.numerator * other.denominator) > (other.numerator * this.denominator);
    }

    public boolean equals(Fraction other) {
        return (this.numerator * other.denominator) == (other.numerator * this.denominator);
    }

    public int compareTo(Fraction other) {
        return this.numerator*other.denominator - other.numerator*this.denominator;
    }
}
