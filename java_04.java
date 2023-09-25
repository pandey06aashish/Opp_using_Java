 // Let Revise class and object....

// main within a class..
// class Example{
//     int id=10;
//     String name;

//     public static void main(String[] argus){
//         Example E1=new Example();
//         System.out.println("Number Store in id "+E1.id);
//     }
// }


// Main outside the class...

// class student{
//     String name="Aashish Pandey";
//     int roll_no;
// }
// public class java_04{
//     public static void main(String[]argu){
//     student s1=new student();
//     System.out.println("The Name of Student is "+s1.name);
//     }
// }

// 3 Way to initialize object in java...
// 1.By Refrence Variable. 
// 2.By method.
// 3.By Constructor.

// By Refrence Variable..

// class student{
//     int roll_no;
//     String name;
// }

// public class java_04{
//     public static void main(String[] argus){
//         student s1=new student();
//         student s2=new student();
//         s1.roll_no=11;
//         s1.name="Aashish";
//         s2.roll_no=12;
//         s2.name="Amit";
//         System.out.println("The name of Student s1="+s1.name);
//         System.out.println("The Roll_no of Student s1="+s1.roll_no);
//         System.out.println("The name of Student s1="+s2.name);
//         System.out.println("The Roll_no of Student s1="+s2.roll_no);
//     }
// }

// By method...

// class student{
//     int roll_no;
//     String name;
//     void insert(int r,String n){
//         roll_no=r;
//         name=n;
//     }
//     void display(){
//         System.out.println(roll_no + name);
//     }
// }
// public class java_04{
//     public static void main(String[]argus){
//         student s1=new student();
//         student s2=new student();
//         s1.insert(12,"Aashish");
//         s2.insert(13,"Amit");
//         s1.display();
//         s2.display();
//     }
// }

// Q.Find the area of rectangle..

// class rectangle{
//     int length;
//     int breath;
//     void insert(int l,int b){
//         length=l;
//         breath=b;
//     }
//     void display(){
//         System.out.println("Area of rectangle :"+length*breath);
//     }
// }
// public class java_04{
//     public static void main(String[]argus){
//         rectangle r1 =new rectangle();
//         rectangle r2= new rectangle();
//         r1.insert(10, 10);
//         r2.insert(20, 20);
//         r1.display();
//         r2.display();;

//     }

// }

// Q. java program to demonstrate the working of a banking system Where we deposit and withdraw amount from our account create an Account class which has deposit()and withdrow() method...

// class Account{
//     int acc_no;
//     String name;
//     float amount;
//     void insert(int a_no,String n,float amo){
//         acc_no=a_no;
//         name=n;
//         amount=amo;
//     }
//     void deposit(float amo){
//         amount=amount+amo;
//         System.out.println(amo+" Amount deposite");
//     }
//     void withdraw(float amo){
//         if(amo>amount){
//             System.out.println("Insufficient Balance");
//         }else{
//             amount=amount=amo;
//             System.out.println(amo+"Withdraw Successful");
//         }
//     }
//     void check_blance(){
//   System.out.println("Balance is "+amount);
//     }
//     void display(){
//         System.out.println(acc_no+" "+name+""+amount);
//     }
// }
// public class java_04{
//     public static void main(String[]argus){
//         Account a1=new Account();
//         a1.insert(9140, " Aashish ", 100);
//         a1.display();
//         a1.withdraw(50);
//         a1.display();
//         a1.deposit(32324);
//         a1.check_blance();
//     }
// }

// java charat()method...

// import java.util.*;
// public class java_04{
//     public static void main(String[]argus){
//         Scanner sc=new Scanner(System.in);
//         char c=sc.next().charAt(0);
//         System.out.println(c);
//     }
// }

//Q. Write a program in javato find the product of  Two number using main within class.

// public class java_04{
//     public static void main(String[]argus){
//    int a=20;
//    int b=10;
//    int mul=a*b;
//    System.out.println("Produt of two number"+mul);
//     }
// }


// Q.Modify the above program using main outside the class and creating one function also..

// class calculate{
//     int product(int a ,int b){
//         return a*b;

//     }
// }
// public class java_04{
//     public static void main(String[]argus){
//  calculate c1=new calculate();
//  int result= c1.product(100, 20);
//  System.out.println("produt of two number:"+result);
// }
// }

// Modify the above program by storing information in objects throught reference vriable..

// class calculate{
//     int a;
//     int b;
//     int product(int a,int b){
//         return a*b;
//     }
// }
// public class java_04{
//     public static void main(String[]argus){
//      calculate c1= new calculate();
//      int a=c1.a=12;
//      int b=c1.b=23;
//    int result= c1.product(a,b);
//    System.out.println(result);
//     }
// }

// Q.Write  a program to calculate the area and perimeter of the rectangle using  two class (main in secound class)..

//  class rectangle {
// int length;
// int breath;
// void insert(int l,int b){
// length=l;
// breath=b;
// }
// int perimeter() {
// return 2*(length+breath);
// }
// int area(){
//     return length+breath;
// }
// }
// public class java_04{
// public static void main(String[]argus){
//     rectangle r1=new rectangle();
//     r1.insert(12, 12);
//     int area=r1.area();
//     int perimeter= r1.perimeter();
//     System.out.println("Area of rectangle "+area);
//     System.out.println("Perimeter Of rectangle "+perimeter);

// }
// }