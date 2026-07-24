public class Strings{
    public static void main(String[] args){
       String menu = "Momos, Dosa, Cold Coffee, Sandwich, Burger, Pasta, Noodles, Wrap, Pizza";
 
  // 1. Display the complete menu
   //  System.out.println("Complete Menu");
    //  System.out.print(menu);


 // 2. Uppercase and lowercase
    //   System.out.println("Uppercase:" + menu.toUpperCase());
    //   System.out.println("Lowercase:" + menu.toLowerCase());


  // 3.Fries to the menu
    // menu = menu + ",Fries";
   //   System.out.println("New Menu:" + menu);


 // 4. Position of Pasta   
    // int pastaIndex = menu.indexOf("Pasta");
    //   System.out.println("The index position of Pasta is: " + pastaIndex);


// 5. Replace burger with wrap 
   // menu = menu.replace("Burger", "Wrap");
  // System.out.println("New Menu: " + menu);


// 6. Sandwich from menu
  // int startSandwich = menu.indexOf("Sandwich");
  // int endSandwich = startSandwich + "Sandwich".length();
   //  String extractedWord = menu.substring(startSandwich, endSandwich);
   //  System.out.println("Extracted Word: " + extractedWord);


// 7. First five charcters
  //  String firstFive = menu.substring(0,5);
  //  System.out.println("First 5char: " + firstFive);

 
 // 8. Split the menu into individual food items and print each item on a new line.
   // String[] foodItems = menu.split(", ");
  //  for (String item : foodItems) {
  //     System.out.println(item);
   //   }

// 9. Compare the strings "Pizza" and "pizza" using ==, equals(), and equalsIgnoreCase().
    //String str1 = "Pizza";
    // String str2 = "pizza";
        
   //  System.out.println("Using ==: " + (str1 == str2));
   //     System.out.println("Using equals(): " + str1.equals(str2));
  //    System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));


// 10. Comparing "Pizza" and "Pasta" using compareTo() 
  //  int compareResult = "Pizza".compareTo("Pasta");
   //   System.out.println("Result of Pizza compareTo Pasta: " + compareResult);


// 11. Convert the integer value 299 (Today's Special Price) into a String using String.valueOf() and display it with a proper message
    //int priceInt = 299;
    // String priceStr = String.valueOf(priceInt);
    // System.out.println("Today's Special Price: " + priceStr);


 // 12. Count and display the total number of food items available in the menu
   //   String[] foodItems = menu.split(", ");
   //  for (String item : foodItems) {
  //     System.out.println(item);
   // System.out.println("Total items available: " + foodItems.length);


// 13. Ask the user to enter the name of a food item and check whether it is available in the menu using contains().
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a food item to search: ");
     //   String userInput = sc.nextLine();
        
     //   if (menu.contains(userInput)) {
    //        System.out.println("Yes, " + userInput + " is available in the menu");
    //    } else {
      //    System.out.println("Sorry, " + userInput + " is not available");


// 14. Finally, display the updated menu after all the modifications.

   // System.out.println(menu);
    }
}    





    
