//Optimized Bubble Sort

import java.util.Scanner ;

public class BubbleSort {
	
	public static void main(String args[]) {
      
		int size, count, arr[] ;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		size = input.nextInt();
		arr = new int[size];
		
		System.out.println("Enter the elements of array : ");
		for(count = 0; count < size; count++) {
			arr[count] = input.nextInt();
		}
		
		System.out.println("Sorted Array : ");
		bubble_sort(arr);
		for(count = 0; count < size; count++)
			System.out.print(arr[count] + " ");
		
   	}

  	 public static void bubble_sort(int array[]) {
		
		int i, j, temp ;
		boolean flag = true;
		
		for(i = 0; i < array.length && flag; i++) {
			flag = false ;
			for(j = 0; j < (array.length - i - 1); j++) {
				if( array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp ;
					flag = true;
				}
			}	 		
		
		}
		
	 }
}   
