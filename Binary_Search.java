import java.utils.Scanner ;

class Binary_Search {
   
   public static void main(String args[]) {
     
      int count, length, item, position, array[];

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the size of the array :");
      length = input.nextInt();
      array = new int[length];

      System.out.println("Enter the elements of array :");
      
      for(count = 0; count < length; count++)
         array[count] = input.nextInt();

      System.out.println("Input array is : ");
     
      for(count = 0; count < length; count++)
        System.out.println(array[count]);

      System.out.println("Enter the element to be searched : ");
      item = input.nextInt();

      sort(array);
      position = binary_search(array, item);
      
   }

  //Function to perform binary search
   public int binary_search(int[] inputArr, int searchElement) {
     
      int first, last, mid ;
      
      first = 0;
      last = inputArr.length - 1;
      mid = (first + last)/2;
      
      while(first <= last) {
         if(item == inputArr[mid])
	    return mid;
	 else if(item < inputArr[mid])
	    last = mid - 1;
	 else
     	    start = mid + 1;
      }
      return -1;
         
   }

  //Function to Sort elements
  public int sort(int[] inputArray) {
  	int i, j, temp ;
		
	for(i = 0; i < array.length && flag; i++) {
		for(j = 0; j < (array.length - i - 1); j++) {
			if( array[j] > array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp ;   	
       		}  
  }

}
