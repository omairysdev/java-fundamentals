import java.util.Arrays;


public class ArrayCop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		System.arraycopy(array, 2, array, 1, 2);
		System.out.println(array[1]);
		System.out.println(array[4]);
		System.out.println(Arrays.toString(array));

	}

}