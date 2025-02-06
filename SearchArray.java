/**

         If the array is unsorted, use linear search.
         If the array is sorted, use binary search.
         If you just want the easiest way, use Arrays.binarySearch().

 */



import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args){


//        linear search
        int arr[] = {2,1,3,7,8,9,4,5};

        int target = 7;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == target){
                System.out.println("Element found at Index :  " + i );
                break;
            }

        }





    }
}
