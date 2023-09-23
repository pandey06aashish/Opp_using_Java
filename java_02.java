// // Let Learn About Class And Object....

// import java.util.*;
// class student{
//     String name;
//     int age;
// }

// public class java_02 {
//     public static void main(String[] argus){
//     Scanner sc=new Scanner(System.in);
//      student s1=new student();
//     System.out.println("Enter The Name Of Student");
//     s1.name=sc.nextLine();
//     System.out.println("Enter The Age Of Student");
//     s1.age=sc.nextInt();
//     }
// }

// Print "Welcome to My Website" using class and mwthod ....

// class wel {
//     static String welcome() {
//         return "Welcome To My Website";
//     }
// }

// public class java_02 {
//     public static void main(String[] args) {
//         wel print_wel = new wel();
        
//         System.out.println(print_wel.welcome());
//     }
// }


// Q Return the add,sub,mul,div of two number uisng method...

// import java.util.*;

// class calculator{
//   public int add(int a, int b){
//   return a+b;
//     }
//     public int sub(int a, int b){
//         return a-b;
//     }
//     public int mul(int a , int b){
//         return a *b;
//     }
//     public float div(int a,int b){
//         return a/b; 
//     }
// }
// public class java_02{
//     public static void main(String[] argus){
//      calculator operation=new calculator();
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter First Number :");
//      int a=sc.nextInt();
//     System.out.println("Enter Secound Number:");
//     int b =sc.nextInt();
//     int add=operation.add(a, b);
//     int sub=operation.sub(a, b);
//     int mul=operation.mul(a,b);
//     float div=operation.div(a, b);
//     System.out.println(add);
//     System.out.println(sub);
//     System.out.println(mul);
//     System.out.println(div);

//     }
// }

// Q. Length and breadth of a rectangle are 5 and 7 respectively.Write a program to calculate the area and perimeter of the rectangle...

// import java.util.*;
// class rectangle{
//     public int area(int length,int breadth){
//         return length+breadth;
//     }
//     public int perimeter(int length,int breadth){
//         return 2*(length + breadth);
//     }
// }
// public class java_02{
//     public static void main(String[]argus){
//     rectangle r1=new rectangle();
//     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter The Lenght of Rectangle:");
//     int lenght=sc.nextInt();
//     System.out.print("Enter The Breath of Rectangle:");
//     int breath= sc.nextInt();
//     int are=r1.area(lenght,breath);
//     int per=r1.perimeter(lenght, breath);
//     System.out.println("Area of rectangle:"+are);
//     System.out.println("Perimeter Of rectangle:"+per);
//     }
// }
