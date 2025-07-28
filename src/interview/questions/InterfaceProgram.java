package interview.questions;

interface Notifier {

	void send(String message);

}

class EmailNotification implements Notifier {

	@Override
	public void send(String message) {
		System.out.println(message);
	}
}

class SMSNotification implements Notifier {

	@Override
	public void send(String message)

	{
		System.out.println(message);
	}
}

class Otp implements Notifier {

	public void send(String otp) {
		System.out.println(otp);
	}

}

public class InterfaceProgram {

	public static void main(String[] args) {

		Notifier notifier;

		notifier = new EmailNotification();
		notifier.send("Your interview is schedule on Monday");

		notifier = new SMSNotification();
		notifier.send("your otp is 12345");

		notifier = new Otp();
		notifier.send("123456");

	}

}
