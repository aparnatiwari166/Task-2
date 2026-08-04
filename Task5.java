// STUDENT  MANAGEMENT  SYSTEM

 class Student {
    int studentId;
    String studentName;
    String course;
    int marks;

    Student(int studentId, String studentName, String course, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
    }

    boolean isPassed() {
        return marks >= 40;
    }


public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student(100, "Aparna", "B.Tech CSE", 80);
        Student s2 = new Student(200, "Aditya", "Electronics", 70);
        Student s3 = new Student(300, "Ninkun", "BCA", 85);

        Student[] students = {s1, s2, s3};

        System.out.println("Student Details ");
        for (Student s : students) {
            s.displayDetails();
            if (s.isPassed()) {
                System.out.println("Result : Passed");
            } else {
                System.out.println("Result : Failed");
            }
        }

        Student topper = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }
        System.out.println(" Highest Scorer");
        System.out.println("Student Name : " + topper.studentName);
        System.out.println("Student ID   : " + topper.studentId);
        System.out.println("Course       : " + topper.course);
        System.out.println("Marks        : " + topper.marks);
    }
}


// BANK  ACCOUNT  SYSTEM

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(1001, "Aparna", 10000);
        BankAccount acc2 = new BankAccount(1002, "Aditya", 50000);

        acc1.deposit(2000);
        acc1.withdraw(3000);

        acc2.deposit(1500);
        acc2.withdraw(7000); 

        System.out.println("Final Account Details:");
        acc1.displayBalance();
        acc2.displayBalance();

        System.out.println("Total Bank Accounts Created: " + BankAccount.totalAccounts);
    }
}
 }
 