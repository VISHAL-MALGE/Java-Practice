/*

            Example of the Euclidean Algorithm:
            To find the GCD of 48 and 18:

            Divide 48 by 18:
            48 ÷ 18 = 2 remainder 12

            Now divide 18 by 12:
            18 ÷ 12 = 1 remainder 6

            Now divide 12 by 6:
            12 ÷ 6 = 2 remainder 0



*/






public class GCD {
    public static void main(String[] args){

        int a = 48;
        int b = 18;

        // Find GCD using Euclidean algorithm

        while( b !=0 ){      // Keep going until b becomes zero

            int remainder = a % b;     // Find the remainder when a is divided by b
            a = b;     // Replace a with b
            b = remainder;   // Replace b with the remainder

        }

         // When b becomes 0, 'a' will be the GCD
        System.out.println("The GCD Of 18 and 48 are : " + a );

    }
}
