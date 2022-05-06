import java.util.*;

class GFG {
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
      	System.out.println("Enter the length of the array:");
      	int length = s.nextInt();
     		int [] array = new int[length];
      	System.out.println("Enter the elements of the array:");

      	for(int i=0; i<length; i++ ) 
		{
         			array[i] = s.nextInt();
		}

		Arrays.sort(array);

		reverse(array);
		System.out.println(Arrays.sort(array));
		System.out.println(Arrays.toString(array));
	}

	public static void reverse(int[] array)
	{
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
	}
	
}

