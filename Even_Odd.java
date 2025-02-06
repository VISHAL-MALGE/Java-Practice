import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){


        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Printing Even Numbers : ");
        for (int i=0; i<arr.length; i++){

            if (arr[i] % 2 == 0){
                System.out.print( arr[i] + " ");
                evenCount++;
            }
        }
        System.out.println("\nCount : " + evenCount);


        System.out.print("\nPrinting Odd Numbers : ");
        for (int i=0; i<arr.length; i++){

            if (arr[i] % 2 == 1){
                System.out.print( arr[i] + " ");
                oddCount++;
            }
        }
        System.out.println("\nCount : " + oddCount);


    }

}
