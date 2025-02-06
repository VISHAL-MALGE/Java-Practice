import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args){


        int arr[] = {1, 1, 2, 3, 3, 4, 4, 5, 6};

        HashSet<Integer> d = new HashSet<>(arr.length);

        System.out.print("Original Array : ");
        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.print("\nDuplicate Found : ");

        for (int i=0; i<arr.length; i++){
            d.add(arr[i]);

            for (int j = i + 1; j< arr.length; j++){

                if (arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }

        }

        System.out.println("\nDuplicates Removed :  "  + d + " ");




    }
}
