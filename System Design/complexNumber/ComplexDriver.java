public class ComplexDriver {

    public static void main(String[] args) {
        
        ComplexNumber c1 = new ComplexNumber(5, 4);
        ComplexNumber c2 = new ComplexNumber(72, 2);

        ComplexNumber c3 = c1.plus(c2);
        ComplexNumber c4 = c1.multiply(c2);

        c1.print(c3);
        c1.print(c4);

    }
    
}
