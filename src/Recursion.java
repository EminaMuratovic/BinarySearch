
public class Recursion {
	public static void main(String[] args) {
		array(10);
		System.out.println();
		System.out.println(power(2, 5));
		System.out.println();
		System.out.println(sum(5));
	}
	
	/**
	 * prints numbers from given number to zero
	 * @param n int given number
	 */
	public static void array(int n) {
		if(n == 0){
			System.out.println(n);
			return;
		}
		else {
			System.out.println(n);
			n--;
			array(n);
			
		}
	}
	
	/**
	 * Grades the number by its exponent
	 * @param base int the number
	 * @param exponent int exponent
	 * @return graduation
	 */
	public static int power(int base, int exponent) {
		if(exponent == 1)
			return base * 1;
		return base * power(base, exponent - 1);
	}
	
	/**
	 * Adds in sum from the given number to zero
	 * @param num int given number
	 * @return sum
	 */
	public static int sum(int num) {
		if(num == 0)
			return num;
		return num + sum(num-1);
	}
}
