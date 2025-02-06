import java.util.Arrays;

public class Greater_Num {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 4532592, 6, 9, 240 };

/**         int large = arr[0];
        int secondlarge = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){

            if (arr[i] > large){

                secondlarge = large;
                large = arr[i];
            }

            else if (arr[i] > secondlarge && arr[i] != large) {
                secondlarge = arr[i];

            }
        }

        if (secondlarge == Integer.MIN_VALUE){
            System.out.println("No Second Large Number...");
        }
        else {
            System.out.println("The Large Number In Array : " + large);
            System.out.println("The 2nd Large Number In Array : " + secondlarge);
        }


   To Find Large Num In An Array           **/



//        int max = 0;

//        for (int i = 0; i< arr.length; i++){
//
//            max = arr[i];
//
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }

        Arrays.sort(arr);    // To sort array using function

        System.out.println("Large Num In Array : " + arr[arr.length - 1]);



































//        int largest = 0;
//        int secondlargest = 0;
//        int thirdlargest = 0;
//
//
////        int largest = Integer.MIN_VALUE;
////        int secondlargest = Integer.MIN_VALUE;
////        int thirdlargest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++){
//
//            if ( arr[i] > largest ){
//                thirdlargest = secondlargest;
//                secondlargest = largest;
//                largest = arr[i];
//            }
//
//            else if (arr[i] > secondlargest && arr[i] != largest) {
//                secondlargest = arr[i];
//
//            } else if (arr[i] > thirdlargest && arr[i] > secondlargest && arr[i] != largest) {
//                thirdlargest = arr[i];
//
//            }
//        }
//
//        System.out.println("\nLargest Number : " + largest );
//        System.out.println("2nd Largest Number : " + secondlargest );
//        System.out.println("3rd Largest Number : " + thirdlargest );









    }
}
