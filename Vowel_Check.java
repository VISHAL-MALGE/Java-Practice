/*

        - Create an array of vowels.
        - Loop through each character in the string.
        - Compare the character with the vowels array.
        - If a match is found, print the vowel.
        - If no match is found after the loop, print "No vowels."


*/



import java.util.Scanner;

public class Vowel_Check {
    public static void main(String[] args){


//        System.out.print("Enter The String : ");     // input string
//        Scanner sc = new Scanner(System.in);
//
//        String s = sc.nextLine();   //saving input string to variable s
//
//        s = s.toLowerCase();    // converting input string to lowerCase
//
//        boolean hasVowel = false;   // initial declare false for no vowel
//
//        char[] vowels = {'a' , 'e' , 'i' , 'o' , 'u'};    // array set of vowels
//
//        for (char i : s.toCharArray()){     // enhance for-loop to iterate input string convert to char
//
//            for (char j : vowels){    // iterating vowels array
//                if (i == j){    //
//                    System.out.println("Vowels : " + i);
//                    hasVowel = true;
//                    break;
//                }
//            }
//        }
//
//
//
//        if(!hasVowel){
//            System.out.println("No Vowels Found :(");
//        }


        System.out.print("Enter The Serial Number : ");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        

         s = s.toLowerCase();

        boolean hasVowel = false;

        char[] vowels = {'a' , 'e' , 'i' , 'o' , 'u'};


        System.out.print("Vowels Found : ");
        for (char i : vowels){

            for (char j : s.toCharArray()){
                if (i == j){
                    System.out.print(i + " ");
                    hasVowel = true;
                    break;
            }
        }

        }
        if (!hasVowel){
            System.out.println("Not Found ");
        }


    }
}




