public class Reverse_String {
    public static void main(String[] args){




        int[] arr = {1, 2, 3, 4, 5};

//        for (int i = arr.length - 1; i >= 0 ; i--){
//            System.out.print(arr[i] +  " ");
//        }

        int left = 0,  right = arr.length - 1;

        while ( left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i : arr){
            System.out.print(i + " ");
        }


//        String str = "Hello";
//
//        String reverse = "";
//
//        for (int i = str.length() - 1; i >= 0; i--){
//
//            reverse += str.charAt(i);
//
//        }
//
//        System.out.println(reverse);










    }
}
