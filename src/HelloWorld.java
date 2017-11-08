import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");

		System.out.println("Please enter your name: ");
		Scanner in = new Scanner(System.in);
		String userName = in.nextLine();

		if (!userName.isEmpty()) {
			HelloUser newUser = new HelloUser(userName);
			newUser.greetUser();
		} else {
			System.out.println("Please enter no empty value!");
		}
	}

}
