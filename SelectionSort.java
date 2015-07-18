import java.util.Scanner ;

public class SelectionSort {
 
    public static int[] SelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
      
            int smallerNumber = arr[min]; 
            arr[min] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
	int arr1 [], size; 
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the size of array : ");
	size = input.nextInt();
	arr1 = new int[size];

	System.out.println("Enter the elements of array : ");
	for(int count = 0; count < size; count++) {
		arr1[count] = input.nextInt();
	}

       	int[] arr2 = SelectionSort(arr1);
       
	for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
