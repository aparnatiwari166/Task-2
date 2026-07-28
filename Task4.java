public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

 // 1. print the primary diagonal
      //  for (int i = 0; i < matrix.length; i++) {
      //      System.out.print(matrix[i][i] + " ");
    //    }

 // 2. print the secondary diagonal
   //    for (int i = 0; i < matrix.length; i++) {
    //        System.out.print(matrix[i][matrix.length - 1 - i] + " ");
   // }

// 3. count even and odd numbers
   //     int evenCount = 0;
    //    int oddCount = 0;

    //    for (int[] row : matrix) {

     //       for (int num : row) {
      //          if (num % 2 == 0) {
                    evenCount++;
     //           } else {
       //             oddCount++;
       //         }
      //      }
      //  }
      //  System.out.println("Even numbers count: " + evenCount);
     //   System.out.println("Odd numbers count: " + oddCount);

// 4. sum of rows and sum of columns
       // int rowSum = 0;
       // int colSum = 0;
     //for (int i = 0; i < matrix.length; i++) {
        //    for (int j = 0; j < matrix[i].length; j++) {
           //     rowSum += matrix[i][j];
         //   }
      //      System.out.println("Row " + (i + 1) + " Sum = " + rowSum);
     //   }

     //   for (int j = 0; j < matrix[0].length; j++) {
      //      for (int i = 0; i < matrix.length; i++) {
      //          colSum += matrix[i][j];
       //     }
            System.out.println("Column " + (j + 1) + " Sum = " + colSum);
   //     }
    }
}
