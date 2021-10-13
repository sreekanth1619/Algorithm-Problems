package algorithmproblems;
/**
 * Purpose  - Binary Search the Word from Word List.
 * @author  - N sreekanth
 * @version - 16.0
 * 
 */
public class BinarySearchMain {
	public static void main(String[] args) {
        String[] arr = { "contribute", "geeks", "sreekanth", "practice" };
        String x = "sreekanth";
        BinarySearch<String> bs = new BinarySearch<String>();
        int result = bs.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
