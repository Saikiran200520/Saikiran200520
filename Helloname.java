import java.util.Scanner;
class Helloname {
	public static void main(String[] args) {
		System.out.println("Please enter your name:");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println("Hello " + name);
 }
}
