import java.util.Arrays;

public class Add_Sum_Array {
    public static void main(String[] args){

        int[] l1 = {3,4,2};

        int[] l2 = {7,1,10,3};

        int sum = 0;
        for (int i=0; i<l1.length; i++){

           sum += l1[i];

        }
        for (int i=0; i<l2.length; i++){

            sum +=  l2[i];

        }

        System.out.println("The Sum Of Array : " + sum);






    }
}
