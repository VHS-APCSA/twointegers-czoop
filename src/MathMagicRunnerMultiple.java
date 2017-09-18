import java.util.Scanner;
public class MathMagicRunnerMultiple{
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first Int: ");
		int number1 = input.nextInt();
		System.out.println("Enter the second Int: ");
		int number2 = input.nextInt();
		
		MathMagic mathMagic = new MathMagic(number1, number2);
		System.out.println("The number " + mathMagic.getNum2() + " is a multiple of "
							+ mathMagic.getNum1() + ": " + mathMagic.isMultiple());
	}
}
