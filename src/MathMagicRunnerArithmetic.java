import java.util.Scanner;
public class MathMagicRunnerArithmetic {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first Int: ");
		int number1 = input.nextInt();
		System.out.println("Enter the second Int: ");
		int number2 = input.nextInt();
		
		MathMagic mathMagic = new MathMagic(number1, number2);
		System.out.println(mathMagic.artihmetic());
	}
}
