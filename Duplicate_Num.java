import java.util.HashSet;

public class Duplicate_Num {
    public static void main(String[] args){

        int[] arr = {3, 7, 1, 8, 8, 9, 10, 777, 777, 250, 8923};

        // Using Hash Set as it does not allow duplicates

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        System.out.print("Array : ");

        for (int i : arr){
            System.out.print(i + " ");

            if (!seen.add(i)){
                duplicate.add(i);
            }
        }

        System.out.println("\n Duplicate Numbers In Arrays : " + duplicate);







    }
}
