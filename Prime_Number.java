public class Prime_Number {
    public static void main(String[] args){


        int[] arr = {10, 15, 2, 3, 7, 11, 6};


        System.out.print("Prime Numbers In Array : ");
        for (int k : arr){
            boolean isPrime = true;

            for (int i = 2; i < k; i++){

                if ( k % i == 0 ){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.print(k + " ");
            }

        }






















//
//        for(int k=0; k< arr.length; k++){
//
//            boolean isPrime = true;
//
//            for (int i = arr[k]; i < arr.length; i++){
//
//                if (arr[k] % i == 0){
//                    isPrime = false;
//                }
//            }
//
//
//            if (!isPrime){
//                System.out.println("Its Prime Number" + arr[k]);
//            }
//            else
//                System.out.println("Not Prime Number");
//
//
//        }














































//        int p = 20;
//
//        for (int num = 2; num<=p; num++){
//            boolean isPrime = true;
//
//            for ( int i = 2; i < num; i++){
//
//                if (num % i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime){
//                System.out.print(num + " ");
//            }
//
//        }









    }
}
