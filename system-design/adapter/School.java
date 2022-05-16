package adapter;

public class School {

	public static void main(String[] args) {
		Pen p = new PenAdapter();
		Assignment aw = new Assignment();
		aw.setp(p);
		aw.writeAssignment("I am bit tired of writing assignment");
	}

}
