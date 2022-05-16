package complexnumber;

public class MainCode {

	public static void main(String[] args) {
		ComplexNumber c = new ComplexNumber();
		c.real = 4;
		c.imaginary = 5;

		ComplexNumber c1 = new ComplexNumber();
		c1.real = 1;
		c1.imaginary = 2;

		c.multiply(c1);
		c.print();

		System.out.println(c);

		System.out.println(ComplexNumber.getcount());

	}

}
