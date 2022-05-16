public class ComplexNumber {

    int real;
    int imaginary;

    public ComplexNumber(){

    }

    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber plus(ComplexNumber c2){

        int realadd = this.real + c2.real;
        int imaginaryadd = this.imaginary + c2.imaginary;

        return new ComplexNumber(realadd, imaginaryadd);
    }

    public ComplexNumber multiply(ComplexNumber c2){

        int realPart = this.real * c2.real + this.imaginary* c2.imaginary * -1;
        int imaginaryPart = this.real * c2.imaginary + this.imaginary* c2.real ;

        return new ComplexNumber(realPart , imaginaryPart);



    }

    public void print(ComplexNumber c1){
        System.out.println(c1.real+" +i"+c1.imaginary);
    }
    
}
