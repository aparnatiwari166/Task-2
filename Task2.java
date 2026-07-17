import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();

  // 1. Sum of all elemnts
        int arr[]= new int[size];//
        int sum=0;//

      System.out.println("Enter the elements");//
        for(int i = 0; i<size; i++){ //
            System.out.print("Element" + (i + 1) + ":");//
            arr[i]= sc.nextInt();//
            sum += arr[i];//  
    }//
     System.out.println("The sum of all elements in the array is" + sum);//
}//
}//

// 2. Reverse the array
      String[] fruits = new String[size];

      System.out.println("Enter the elements");//
        for(int i = 0; i<size; i++){ //
            System.out.print("Element " + (i + 1) + ":");//
            fruits[i]= sc.nextLine();//
        }//
       
       System.out.println("Original Array" + Arrays.toString(fruits));//

       System.out.print("Reversed Array");//
        for (int i = fruits.length - 1; i >= 0; i--) {//
            System.out.print(fruits[i]);//

            if (i > 0) {//
                System.out.print(",");//
            }//
        }//


    // 3. Sort an array in descending order//
        int arr[]= new int[size];//

        System.out.println("Enter the elemnts");//
        for(int i = 0; i<size; i++){//
            arr[i]= sc.nextInt(); //
        }//
         
         Arrays.sort(array);//
         System.out.print("Array sorted in descending order");//
        for (int i = arr.length - 1; i >= 0; i--) {//
            System.out.print(arr[i]);//

            if (i > 0) {//
            System.out.print(", ");//
        }//
        }//


    // 4. Largest in the array
    int arr[]= new int[size];//

    System.out.println("Enter the elemnts");//
    for (int i = 0; i < n; i++) {//
     System.out.print("Element" + (i + 1) + ":");//
            arr[i] = sc.nextInt();//
        }//

       int largest = arr[0]; //
        for (int i = 1; i < n; i++) {//
            if (arr[i] > largest) { //
              largest = arr[i]; //
            }//
        }//
        

