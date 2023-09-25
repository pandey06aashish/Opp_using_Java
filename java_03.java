// Let us learn conduction...

//Q. Write a program to check if the two numbers a and b are equal.

// import java.util.*;
// public class java_03 {
//     public static void main(String[]argus){
//     Scanner sc =new Scanner(System.in);
//     System.out.println("Enter First Number:");
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//      if(a==b){
//       System.out.println("The Two Numbee A and B are Equal.");
//      }
//      else{
//         System.out.println("The Two Number A and B are Not Equal.");
//      }
//     }
// }

//Q. Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5
// units.

// import java.util.*;
// class triangle{
//     public int perimeter(int a,int b,int c){
//        return a+b+c;
//     }
// }
// public class java_03{
//     public static void main(String[]argus){
//         triangle tr1= new triangle();
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter The First Side Of triangle:");
//         int side1=sc.nextInt();
//         System.out.println("Enter The Secound side Of triangle");
//         int side2=sc.nextInt();
//         System.out.println("Enter The Third Side Of triangle:");
//         int side3=sc.nextInt();
//        int Solution=tr1.perimeter(side1,side2,side3);
//        System.out.println("The Perimeter of triangle is:"+Solution);
//     }
// } 

// Q.Write a program to add 8 to the number 2345 and then divide it by 3. Now, the
// modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
// Display the final result.

// public class java_03{
//     public static void main(String[]argu){
//         int number=2345;
//         number+=8;
//         number/=3;
//         number%=5;
//         number *=5;
//         System.out.println("The Result :"+number);
//     }
// }

// Q.Write a program to print the power of 7 raised to 5...

// public class java_03{
//     public static void main(String[]argu){
//        int base = 7;
//         int exponent = 5;
//         int result = 1;

//         // Calculate the power
//         for (int i = 0; i < exponent; i++) {
//             result *= base;
//         }

//         System.out.println("7^5 = " + result);
//     }
// }

// Q.Write a program in java to find the product of 2 numbers using main
// within a class...

// import java.util.*;
// public class java_03{
//     public static void main(String[]argus){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter The First Number:");
//     int num1=sc.nextInt();
//     System.out.println("Enter Secound Number:");
//     int num2=sc.nextInt();
//     int product=num1*num2;
//     System.out.println("Product of Two Number is :"+product);
//     }
// }

// Q.Modify the above program using main outside the class and creating
// one function also...

// import java.util.*;

// public class java_03{
// public static double product_of_num(int a, int b){
//       return a*b;
//     }
//     public static void main(String[]argus){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter The First Number:");
//         int num1=sc.nextInt();
//         System.out.println("Enter The Secound Number:");
//         int num2=sc.nextInt();
//         double result=product_of_num(num1,num2);
//         System.out.println("The Product Of Two Number Is :"+result);


//     }
// }