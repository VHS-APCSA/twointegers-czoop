public class MathMagic {
	private int num1;
	private int num2;
	
	/**
	 * The constructor function for the MathMagic Object
	 * @param num1 The first number to input
	 * @param num2 The second number to input
	 */
	
	public MathMagic(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public MathMagic() {
		this.num1 = 1;
		this.num2 = 2;
	}
	
	//////////////////////////
	
	/**
	 * Problem 2.15
	 * @return Returns the product, sum, difference, and quotient of the two numbers
	 */
	
	public String artihmetic() {
		String mathInfo = "";
		mathInfo = mathInfo + num1 + " + " + num2 + " = " + (num1 + num2) + "\n" ;
		mathInfo = mathInfo + num1 + " - " + num2 + " = " + (num1 - num2) + "\n" ;
		mathInfo = mathInfo + num2 + " - " + num1 + " = " + (num2 - num1) + "\n" ;
		mathInfo = mathInfo + num1 + " x " + num2 + " = " + (num1 * num2) + "\n" ;
		mathInfo = mathInfo + num1 + " / " + num2 + " = " + (num1 / num2) + "\n" ;
		mathInfo = mathInfo + num2 + " / " + num1 + " = " + (num2 / num1) + "\n" ;
		mathInfo = mathInfo + num1 + " % " + num2 + " = " + (num1 % num2) + "\n" ;
		mathInfo = mathInfo + num2 + " % " + num1 + " = " + (num2 % num1) + "\n" ;
		
		return mathInfo;
	}
	

	/**
	 * Problem 2.16
	 * @return Returns the larger of the two numbers or NaN if they are the same
	 */
	
	public int compareNumbers() {
		if (this.num1 > this.num2) {
			return this.num1;
		}
		else if (this.num1 < this.num2) {
			return this.num2;
		}
		else {
			return (0/0);
		}
	}
	
	/**
	 * Problem 2.25
	 * @param num The number you wish to see if it's even
	 * @return True if the number is even, false if the number is odd
	 */
	
	public boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Problem 2.26
	 * @return True if num2 is a multiple of num1, false if not
	 */
	
	public boolean isMultiple() {
		if (this.num1 % this.num2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//////////////////////////
	
	public int getNum1() {
		return this.num1;
	}
	
	public int getNum2() {
		return this.num2;
	}
	
	//////////////////////////
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
