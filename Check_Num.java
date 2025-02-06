public class Check_Num {
    public static void main(String[] args){


        int arr[] = {1, 2, 3, 4, 5};

        int target = 3;
        boolean isFound = false;

        for (int i : arr){
            if (i == target){
                isFound = true;
                break;
            }

        }

        if (isFound){
            System.out.println("Element is Found");
        }
        else
            System.out.println("Element is Not Found");






    }
}
