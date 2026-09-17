1. Prime Number Calculation Using Thread

//class PrimeThread extends Thread {

  //  private int start;
 //   private int end;
 //   private int count = 0;

   // PrimeThread(int start, int end) {
   //     this.start = start;
   //     this.end = end;
   // }

   // boolean isPrime(int n) {
  //      if (n < 2) {
   //         return false;
   //     }

   //     for (int i = 2; i <= n; i++) {
   //         if (n % i == 0) {
    //            return false;
    //        }
     //   }

    //    return true;
 //   }

  //  public void run() {
  //      System.out.println( Thread.currentThread().getName() + start + " to " + end );

   //     System.out.print("Prime numbers: ");

   //     for (int i = start; i <= end; i++) {
   //         if (isPrime(i)) {
    //            System.out.print(i + " ");
    //            count++;
    //        }
    //    }

   //     System.out.println();
   //     System.out.println( Thread.currentThread().getName()  + count  );
   //     System.out.println();
   // }

 //   public int getCount() {
  //      return count;
  //  }
//}

 //public class PrimeNumbers {
//    public static void main(String[] args) {

   //     PrimeThread thread1 = new PrimeThread(1, 50);
   //     PrimeThread thread2 = new PrimeThread(51, 100);

   //     thread1.setName("Thread 1");
   //     thread2.setName("Thread 2");

    //    thread1.start();
    //    thread2.start();

    //    try {
      //      thread1.join();
    //        thread2.join();
    //    } catch (InterruptedException e) {
     //       System.out.println("Thread interrupted.");
      //  }

     //   int total = thread1.getCount() + thread2.getCount();

      //  System.out.println("Total prime numbers from 1 to 100: " + total);
   // }
//}


2. Matrix Row Sum Using Runnable

//class RowSumTask implements Runnable {

 //   private int[] row;
  //  private int rowNumber;
  //  private int sum;

 //   RowSumTask(int[] row, int rowNumber) {
  //      this.row = row;
   //     this.rowNumber = rowNumber;
 //   }

  //  public void run() {
  //      sum = 0;

   //     for (int value : row) {
    //        sum += value;
   //     }

   //     System.out.println( rowNumber + sum);
  //  }

  //  public int getSum() {
  //      return sum;
  //  }
//}

//public class MatrixRowSum {
 //   public static void main(String[] args) {

   //     int[][] matrix = {
    //        {10, 20, 30, 40},
    //        {5, 15, 25, 35},
     //       {2, 4, 6, 8},
    //        {100, 200, 300, 400}
     //   };

     //   RowSumTask task1 = new RowSumTask(matrix[0], 1);
     //   RowSumTask task2 = new RowSumTask(matrix[1], 2);
     //   RowSumTask task3 = new RowSumTask(matrix[2], 3);
     //   RowSumTask task4 = new RowSumTask(matrix[3], 4);

     //   Thread thread1 = new Thread(task1);
     //   Thread thread2 = new Thread(task2);
     //   Thread thread3 = new Thread(task3);
     //   Thread thread4 = new Thread(task4);

     //   thread1.start();
     //   thread2.start();
      //  thread3.start();
      //  thread4.start();

      //  try {
      //      thread1.join();
      //      thread2.join();
      //      thread3.join();
      //      thread4.join();
     //   } catch (InterruptedException e) {
    //        e.printStackTrace();
     //   }

      //  int totalSum = task1.getSum() + task2.getSum() + task3.getSum() + task4.getSum();

      //  System.out.println("Total Sum = " + totalSum);
  //  }
//}

3. Student Average Calculator Using Runnable

 //class StudentTask implements Runnable {

  //  private int[] marks;
  //  private int studentNumber;
  //  private int total;
  //  private double average;

  //  StudentTask(int[] marks, int studentNumber) {
  //      this.marks = marks;
   //     this.studentNumber = studentNumber;
   // }

  //  public void run() {

   //     total = 0;

    //    for (int mark : marks) {
    //        total += mark;
   //     }

   //     average = (double) total / marks.length;

   //     System.out.println(studentNumber, total, average );
  //  }

 //   public int getTotal() {
 //       return total;
 //   }

 //   public double getAverage() {
 //       return average;
 //   }
//}

//public class StudentAverage {
  //  public static void main(String[] args) {

   //     int[][] marks = {
    //        {85, 90, 78, 88},
    //        {70, 65, 80, 75},
    //        {95, 92, 96, 94},
    //        {60, 72, 68, 70}
     //   };

    //    StudentTask task1 = new StudentTask(marks[0], 1);
     //   StudentTask task2 = new StudentTask(marks[1], 2);
    //    StudentTask task3 = new StudentTask(marks[2], 3);
   //     StudentTask task4 = new StudentTask(marks[3], 4);

    //    Thread thread1 = new Thread(task1);
    //    Thread thread2 = new Thread(task2);
    //    Thread thread3 = new Thread(task3);
    //    Thread thread4 = new Thread(task4);

     //   thread1.start();
     //   thread2.start();
     //   thread3.start();
     //   thread4.start();

      //  try {
      //      thread1.join();
      //      thread2.join();
       //     thread3.join();
       //     thread4.join();
       // } catch (InterruptedException e) {
       //     e.printStackTrace();
       // }

     //   int classTotal = task1.getTotal() + task2.getTotal() + task3.getTotal() + task4.getTotal();

      //  double classAverage = (double) classTotal / (4 * 4);

      //  System.out.println("Class Total = " + classTotal);
     //   System.out.println( classAverage);
   // }
//}