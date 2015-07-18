import java.util.Scanner ;

public class InsertionSort {
	
	public static void main(String args[]) {
		int arr1 [], size; 
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the size of array : ");
		size = input.nextInt();
		arr1 = new int[size];

		System.out.println("Enter the elements of array : ");
		for(int count = 0; count < size; count++) {
			arr1[count] = input.nextInt();
		}

       		int[] arr2 = InsertionSort(arr1);
       
		for(int i:arr2){
            		System.out.print(i);
            		System.out.print(", ");
        	}
	}
	
	//Function that takes an array as input and sorts using insertion sort and returns the sorted array as output
	
	public static int [] InsertionSort(int array[]) {
		
		int temp ;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i+1 ; j > 0; j--) {
				if(array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array [j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}
}
