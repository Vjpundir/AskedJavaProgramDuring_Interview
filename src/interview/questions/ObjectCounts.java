package interview.questions;

public class ObjectCounts {

	static int count = 0;

	public ObjectCounts() {
		count++;
	}

	public static int getObjCount() {
		return count;
	}

	public static void main(String[] args) {

		ObjectCounts c1 = new ObjectCounts();
		ObjectCounts c2 = new ObjectCounts();
		ObjectCounts c3 = new ObjectCounts();
		ObjectCounts c5 = new ObjectCounts();

		System.out.println("How many times objected got created: " + ObjectCounts.getObjCount());
	}

}
