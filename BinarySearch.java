import java.util.Scanner ;

class BinarySearch
{
  public static void main(String args[]) {

    int first, last, mid, item, length, count, array[];
   
    //user input part

    Scanner input =  new Scanner(System.in);
    System.out.println("Enter the number of elements : ");
    length = input.nextInt();
    array = new int[length];

    System.out.println("Enter the " + length + " elements in ascending order:");
    
    for(count = 0; count < length; count++)
      array[count] = input.nextInt();
 
    System.out.println("Enter the element to be searched :");
    item = input.nextInt();

    System.out.println("Input Array is : ");

    for(count = 0; count < length; count++)
      System.out.print(array[count] + " ");

    //Algorithm for binary search

    first = 0;
    last = length - 1;
    mid = (first + last)/2 ;

    while(first <= last) {

      if(item == array[mid]) {  
	System.out.println("Item is found at position " + (mid + 1));
	break ;
      }
      else if( item < array[mid] )
        last = mid - 1;
      else
	first = mid + 1;

       mid = (first + last)/2 ;
     }
    
    if ( first > last )
      System.out.println("Item is not present in the list " );
 	
  }
}
