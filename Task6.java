 // 1. Camera , MusicPlayer and Smartphone

 // interface Camera{
  //   void clickPhoto();
   //  void makeVideo();
// }

 // interface MusicPlayer{
 //   void playMusic();
 //   void stopMusic();
 // }

 // class Smartphone implements Camera , MusicPlayer{

 //   public void clickPhoto() {
 //       System.out.println("Clicking a photo");
 //   }

 //   public void makeVideo() {
 //       System.out.println("Making a video");
  //  }

 //   public void playMusic() {
  //      System.out.println("Playing music");
 //   }

  //  public void stopMusic() {
  //      System.out.println("Music stopped");
 //   }
 // }

 // public class Task6 {
  //  public static void main(String[] args) {

  //      Smartphone s = new Smartphone();

  //      s.clickPhoto();
  //      s.makeVideo();
  //      s.playMusic();
  //      s.stopMusic();
 //   }
 // }


// 2. Shopping Store

 // class Product{
  //  private int ProductId;
 //   private String ProductName;
 //   private double Price;
  //  private int Quantity;

  //  Product(int ProductId, String ProductName, double Price, int Quantity){
  //      this.ProductId = ProductId;
   //     this.ProductName = ProductName;

  //      if( Price >=0){
  //          this.Price = Price;
  // }
    //   if(Quantity >=0){
    //        this.Quantity = Quantity;
 //      }

   //   double  CalculateTotal(){
  //      return Price*Quantity;
  //    }

  //    void display(){
   //     System.out.println("Product Id : " + ProductId);
   //     System.out.println("Product Name : " + ProductName);
  //      System.out.println("Price : " + Price );
 //       System.out.println("Quantity : " + Quantity);

    //    System.out.println("Total Cost : " + CalculateTotal());
  // }
// }

 // public class Task6 {

 //   public static void main(String[] args) {

  //      Product p1 = new Product(100, "Iphone", 80000, 2);
  //      Product p2 = new Product(200, "Ipad", 10000, 4);
   //     Product p3 = new Product(300, "Laptop", 100000, 1);
   //     Product p4 = new Product(400, "Macbook", 200000, 1);
        

   //     p1.display();
   //     System.out.println();

 //       p2.display();
 //       System.out.println();

  //      p3.display();
  //      System.out.println();

   //      p4.display();
   //     System.out.println();
         
   //     double TotalBill = p1.CalculateTotal() + p2.CalculateTotal() + p3.CalculateTotal() + p4.CalculateTotal();

   //     System.out.println("Total Bill Amount = " + TotalBill);
 //   }
    
 //   }

 // }
