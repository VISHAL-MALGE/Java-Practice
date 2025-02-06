import java.util.HashMap;
import java.util.HashSet;

public class Num_Repeat {
    public static void main(String[] args){


        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};

        HashMap<Integer, Integer> repeat = new HashMap<>();

        // Iterate through the array and count the frequencies
        for (int i : arr){
            repeat.put(i, repeat.getOrDefault(i , 0) + 1);

        }

        // Print the frequency of each element
        for (int key : repeat.keySet()) {
            System.out.println(key + ": " + repeat.get(key));
        }

    }
}
