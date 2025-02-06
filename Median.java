public class Median {
    public static void main(String[] args){


        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i : arr){
            System.out.print(i + " ");
        }
            
        System.out.print("\nSorted Array : ");

        for (int i = 0; i< arr.length - 1; i++){

            for (int j = 0; j < arr.length - i - 1;  j++){

                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1 ] = temp;
                }
            }
        }

        for (int s : arr){
            System.out.print(s + " ");
        }

        int mid = arr.length / 2;

//      print first half
        System.out.print("\nFirst Half : ");
        for (int i = 0; i<mid; i++) {
            System.out.print(arr[i] + " ");
        }

//      print second half
        System.out.print("\nSecond Half : ");
        for (int i = mid; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Finding the middle element
        if (arr.length % 2 == 0){

            System.out.println("\nMiddle Element is : " + arr[mid - 1] + " " + arr[mid]);
        }
        else
            System.out.println("\nMiddle Element is : " + arr[mid] + " ");
















//        for (int i = 0; i < arr.length - 1; i++){
//
//            for (int j = 0; j < arr.length - i - 1; j++){
//
//                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//
//        }
//
//
//        for (int i : arr){
//            System.out.print(i + " ");
//        }




    }
}
