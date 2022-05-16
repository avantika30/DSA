package facade;

public class FacadeDemoClient {

	public static void main(String[] args) {
		ShapeMaker s = new ShapeMaker();
		s.drawCircle();
		s.drawRectangle();
		s.drawSquare();
	}

}
