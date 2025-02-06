public class Small_Array {
    public static void main(String[] args){

        int[] arr = {8, 3, 6, 2, 10};

        int small = arr[0];
        int secondSmall = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++){

            if (arr[i] < small){
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];

            }
        }

        System.out.print("the small in array : " + small);
        if (secondSmall == Integer.MAX_VALUE){

        }








    }
}
