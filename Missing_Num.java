public class Missing_Num {
    public static void main(String[] args){


        int[] arr = {1, 2, 3, 4};

        int n = arr.length + 1;
        int expectSum = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];

        }






















//        int n = arr.length + 1;
//        int expect = n * (n + 1) / 2;   // to Calculate Tottal Sum Of the elements
//
//        int missingNum;
//        int sum = 0;
//
//        System.out.print("Array List :  ");
//
//        for (int i=0; i< arr.length; i++){
//            sum += arr[i];
//            System.out.print(arr[i] + " ");
//        }
//
//        missingNum = expect - sum;
//        System.out.println("\nThe Missing Number is : " + missingNum);

    }

}
