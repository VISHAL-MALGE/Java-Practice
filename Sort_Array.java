import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args){


        // Bubble sort
        int[] arr = {2,1,3,7,8,9,4,5};

        // simple way to sort array
        Arrays.sort(arr);



/**        boolean isSort = true;
        boolean isarrEmpty = (arr.length == 0);

        for (int i=0; i<arr.length-1; i++){

            if (arr[i] > arr[i + 1]){
                isSort = false;
                break;     // Stop checking further if already unsorted
            }

        }

        if (isarrEmpty){
            System.out.println("the array is empty");
        }
        else if (isSort) {
            System.out.println("the array is sorted");
        }
        else
            System.out.println("The Array Is Not Sorted");


 **/




//        for (int i = 0; i< arr.length - 1; i++){
//
//            for (int j = 0; j < arr.length - i - 1;  j++){
//
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1 ] = temp;
////                    isSort = true;
//                }
//
//            }
//        }
//

        for (int i : arr){
            System.out.print(i + " ");
        }























//        for (int i=0; i < arr.length - 1; i++){
//
//            for(int j=0; j < arr.length - 1 - i; j++){
//
//                if (arr[j] > arr[ j + 1]){
//
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int i : arr){
//            System.out.print(i + " ");
//        }




    }
}
