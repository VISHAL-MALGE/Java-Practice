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

        System.out.print("Enter The String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.toLowerCase();

        boolean hasVowel = false;

        char[] vowels = {'a' , 'e' , 'i' , 'o' , 'u'};

        for (char i : s.toCharArray()){

            for (char j : vowels){

                if (i == j){
                    System.out.println("Vowels Found  : " + i);
                    hasVowel = true;
                    break;

                }
            }
        }

        if (!hasVowel){
            System.out.println("No Vowels Found...!");
        }


    }
}




