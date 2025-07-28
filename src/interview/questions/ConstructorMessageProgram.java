package interview.questions;

public class ConstructorMessageProgram {

	String msg;

	public ConstructorMessageProgram() {
		this("Hello from default constructor");
		System.out.println("Inside no-arg constructor");
	}

	public ConstructorMessageProgram(String msg) {
		this.msg = msg;
		System.out.println("Inside parameterized constructor: " + msg);
	}

	public static void main(String[] args) {
		ConstructorMessageProgram m1 = new ConstructorMessageProgram();
		ConstructorMessageProgram m2 = new ConstructorMessageProgram("Custom message here");
	}

}
