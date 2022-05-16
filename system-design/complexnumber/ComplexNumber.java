package complexnumber;

public class ComplexNumber {

	int real;
	int imaginary;
	static int count;

	public ComplexNumber() {
		count++;
	}

	public static int getcount() {
		return count;
	}

	void plus(ComplexNumber c) {
		this.real = this.real + c.real;
		this.imaginary = this.imaginary + c.imaginary;
	}

	void multiply(ComplexNumber c) {
		int real = (this.real * c.real) - (this.imaginary * c.imaginary);
		int imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
		this.real = real;
		this.imaginary = imaginary;

	}

	void print() {
		System.out.println(this.real + " i" + this.imaginary);
	}

	@Override
	public String toString() {
		return this.real + " + " + this.imaginary + "i";
	}

}
