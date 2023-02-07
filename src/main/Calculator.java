public class Calculator {

    public int add(int i, int j) {
        return i + j;
    }

    public int square(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Number must be >= to 0.");
        }
        return i * i;
    }

    public double squareRoot(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Square root of negative number cannot be calculated.");
        }
        return Math.sqrt(i);
    }
}
