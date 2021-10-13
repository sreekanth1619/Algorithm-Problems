package algorithmproblems;
/**
 * Purpose  - We have to sort the element by using Bubble Sort
 * @author  - N Sreekanth
 * @version - 16.0
 * 
 */
public class BubbleSortMain {
	 public static void main(String args[]) {
	        String arr[] = { "xyz", "pqr", "abc", "qwe", "cba" };
	        BubbleSort<String> ob = new BubbleSort<String>();
	        ob.bubbleSort(arr);
	        System.out.print("Sorted array : ");
	        ob.printArray(arr);
	    }
}
