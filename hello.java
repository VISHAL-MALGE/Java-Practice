import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) throws IOException {


/*        int i = 1, k;
        int res = i++;

        k = i++ + ++i;

        System.out.println(" K : " + k);

        System.out.println(" I : " +i);

        // tertionary operator its a 1 line if statement 
        k = ( i > res) ? i : k ;




                // i=i+1; //1
                // i++; //post increment
                //++i;
//		    System.out.println(i++); //1
//		    System.out.println(i);

//		  System.out.println(++i); //1
//		    System.out.println(i);

                // k=i++ + ++i;
                // 1 (2)+ (2+1)=4
                //k=4, i=3

                // k=i++ + i++;
                //1 (2)+2 (3)
                // k=1+2=3 , i=3


                k=++i + ++i;
                //2 (2)+3(3)
                //k=2+3=5 , i=3

                System.out.println("k="+k);
                System.out.println("i="+i);


        int a, b,c, l;
        a=10;
        b=5;
        l=(a>b)?a:b;

        System.out.println("The largest of "+a+" and "+b+" is "+l);

        //largest of 3 numbers
        c=7;
        l=(a>b && a>c)?a:(b>a && b>c)?b:c;

        System.out.println("The largest of " +a+" ,"+b+" and "+c+" is "+l);

        //Largest of 4 numbers and 5 numbers
        int d=9;
        l=(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;

        System.out.println("The largest of " +a+" ,"+b+" , "+c+" and  "+d+" is "+l);

        int e=90;
        l=(a>b && a>c && a>d && a>e)?a:
                (b>a && b>c && b>d &&b>e)?b:
                        (c>a && c>b && c>d && c>e)?c:
                                (d>a && d>b && d>c && d>e)?d:e;

        System.out.println("The largest of "+a+" , "+b+" , "+c+" , "+d+" and "+e+" is "+l);







//        Scanner sc = new Scanner(System.in);


//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//
//        String name = r.readLine();
//
//        int age = Integer.parseInt(r.readLine());




//        System.out.print("Enter ID  : ");
//        int id = sc.nextInt();
//        sc.next();
//
//        System.out.print("Enter The Name  : ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter Fees : ");
//        float fees = sc.nextFloat();
//
//
//        System.out.println("ID : " + id);
//        System.out.println("Name : " + name);
//        System.out.println("Fees : " + fees);

 */


        int arr[]  = {5,4,3,2,1};

        boolean isSort = true;

        for (int i = 0; i<arr.length - 1; i++){

            if (arr[i] > arr[i + 1]){
                isSort = false;
            }

            for (int j = 0; j < arr.length - i - 1; j++){

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }

        }


        System.out.print("\nSorted :  ");
        for (int j : arr){
            System.out.print( j + " ");
        }



        if (isSort){
            System.out.println("The Array Sorted");
        }
        else
            System.out.println("Not Sorted");



/*        if(units>0 && units<=100){ //99
            amount = units*2.00f ; //99*2
        }
//101 100*2+1*3=200+3=203  //205 =100*2+(units-100)*3
        else if(units>100 && units<=300){
            amount=100*2+(units-100)*3;
        }else{  //350  = 100*2+200*3+(units-300)*5
            amount=100*2+200*3+(units-300)*5;

            amount = amount+(2.5/100)*amount;
        }

        
 */







    }

}



