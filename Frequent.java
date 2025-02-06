public class Frequent {
    public static void main(String[] args){

        int arr[] = {1, 1, 2, 3, 3, 4, 4, 5, 6};

        int maxCount = 0,  mostFreq = -1, secondFreq = -2;

        for (int i=0; i< arr.length; i++){
            int count = 0;

            for (int j = i + 1; j< arr.length; j++){

                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if (count > maxCount){
                secondFreq = maxCount;
                maxCount = count;
                mostFreq = arr[i];

            }

            else if (arr[i] < secondFreq && arr[i] != mostFreq) {
                secondFreq = arr[i];

            }
        }

        System.out.println("Most frequent element: " + mostFreq);
        System.out.println("2nd frequent element: " + secondFreq);








    }
}
