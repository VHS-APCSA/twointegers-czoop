import java.util.Scanner;
public class MathMagicRunnerIsEven{
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Int: ");
		int number = input.nextInt();
		
		MathMagic mathMagic = new MathMagic(number, 0);
		System.out.println(mathMagic.isEven(number));
	}
}
