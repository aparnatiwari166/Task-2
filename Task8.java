Without Synchronized

//class Movie {
 //   int availableTickets = 1;

 //   void bookTicket(String customerName) {
   //     if (availableTickets > 0) {
    //        System.out.println(customerName );

    //        try {
    //            Thread.sleep(100);
     //       } catch (InterruptedException e) {
     //           e.printStackTrace();
     //       }

     //     availableTickets--;
      //      System.out.println(customerName + " successfully booked the ticket.");
      //  } else {
     //       System.out.println(customerName + "No tickets available" );
      //  }
  //  }
//}

// class Customer extends Thread {
 //   Movie movie;
   // String customerName;

  //  Customer(Movie movie, String customerName) {
  //      this.movie = movie;
 //       this.customerName = customerName;
 //   }

 //   public void run() {
 //       movie.bookTicket(customerName);
 //   }
//}

//public class Task8 {
  //  public static void main(String[] args) throws InterruptedException {

   //     Movie movie = new Movie();

   //     Customer customer1 = new Customer(movie, "Customer-1");
  //      Customer customer2 = new Customer(movie, "Customer-2");

  //      customer1.start();
  //      customer2.start();

  //      System.out.println( movie.availableTickets);
  //  }
//}


With Synchronized

//class Movie {
//    int availableTickets = 1;

 //   synchronized void bookTicket(String customerName) {
  //      if (availableTickets > 0) {
  //          System.out.println(customerName );

   //         try {
    //            Thread.sleep(100);
    //        } catch (InterruptedException e) {
    //            e.printStackTrace();
    //        }

    //        availableTickets--;

      //      System.out.println(customerName + " successfully booked the ticket.");
     //   } else {
     //       System.out.println(customerName +" No tickets available");
     //   }
 //   }
//}

//class Customer extends Thread {
 //   Movie movie;
  //  String customerName;

 //   Customer(Movie movie, String customerName) {
 //       this.movie = movie;
  //      this.customerName = customerName;
  //  }

 //   public void run() {
 //       movie.bookTicket(customerName);
 //   }
//}

//public class Task8 {
  //  public static void main(String[] args) throws InterruptedException {

   //     Movie movie = new Movie();

   //     Customer customer1 = new Customer(movie, "Customer-1");
   //     Customer customer2 = new Customer(movie, "Customer-2");

   //     customer1.start();
   //     customer2.start();

    //    System.out.println( movie.availableTickets);
   // }
//





    

