import java.util.ArrayList;
import java.util.Arrays;

class Palindrome_Check {
    public static void main(String[] args){



        int[] arr = {'m', 'o', 'c'};

        boolean isPali = true;
        int n = arr.length;

        for(int i = 0; i < n / 2; i++){
            if (arr[i] != arr[n - i - 1]){
                isPali = false;
                break;
            }
        }

        if (isPali){
            System.out.println("Its Palindrome");
        }
        else
            System.out.println("Its Not Palindrome");









//        String str = "0";
//        String reverse = "";  // should be empty string
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            reverse += str.charAt(i);
//        }
//
//        if (str.equals(reverse)){
//            System.out.println("Its Palindrome");
//        }
//        else
//            System.out.println("Its Not Palindrome");


    }
}
