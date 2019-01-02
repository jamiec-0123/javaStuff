package arrays;

public class Arrays {

	public static void main(String[] args) {
		int[] numberInArray;
		numberInArray = new int[10];
		for(int i = 0;i != 9; i++) 
		{
			numberInArray[i] = i+1;
			System.out.println(numberInArray[i]);
		}
		String[] arrayOfNames = new String[] {"Joey","Izzeble","Jamie"};
		System.out.println("The first name in the array is "+arrayOfNames[0]);
		System.out.println("The last name in the array is "+arrayOfNames[2]);
	}

}
