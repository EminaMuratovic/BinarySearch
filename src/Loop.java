public class Loop {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Enter the number: ");
		int num = TextIO.getInt();
		if (BinarySearchLoop(array, num, 0, array.length - 1) == -1)
			System.out.println("Number " + num + " does not exist in this array!");
		else
			System.out.println("The number is on the " + BinarySearchLoop(array, num, 0, array.length - 1) + ". index in the array!");
	}

	public static int BinarySearchLoop(int[] array, int num, int start, int end) {
		int mid = (end + start) / 2;
		if(start >= end)
			return -1;
		if(array[mid] == num)
			return mid;
		if(array[mid] < num) 
			return BinarySearchLoop(array, num, mid + 1, end);
		else
			return BinarySearchLoop(array, num, start, mid);
	
	}
}
