// Output In java...
// Their Are Three Way to print..
// print - Symply print the Output
// println - println is used print next sentence in next line.. 
// "\n"- Same as a println..

// public class java_01{
//     public static void main(String argus[]){
//     System.out.println("Hiii Aashish");    //println and "\n" is used print next sentence in next line.. 
//     System.out.print("Hiii Aashish \n"); 
//     System.out.print("Hiii Aashish "); 
//     }
// }

// Q Print The Pattern..
// *
// **
// ***
// ****

// public class java_01{
//     public static void main(String[] argu){
//         System.out.print("*\n**\n***\n****");
//     }
// }


// Data Types
// Primitive - byte,short,char,boolean,int,long,float,double..

// public class java_01{
//     public static void main(String[]argu){
//         int a=20;
//         int b=30;
//         int sum=a +b;
//         System.out.println(sum);
//         int sub=b-a;
//         System.out.println(sub);
//         int mul=a*b;
//         System.out.println(mul);

//     }
// }

// Input in Java ..

// Function To take input--
// next()-Used to Take Only One Word as Input..
// nextLine()-used to take String Input..
// nextInt()-used to take integer Input..
// nextFloat()-used to take decimal Integer Input..
// nextDouble()-used to take big integer..

// import java.util.*;
// public class java_01{
// public static void main(String[]argu){ 
// System.out.println("Enter Your Name");
// Scanner sc=new Scanner(System.in);
// String name=sc.nextLine();
// System.out.println(name);
// }
// }


// Q Take Two Variable 'a'&'b'And Print Their Sum..

import java.util.*;
public class java_01{
    public static void main(String[]argu){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a=sc.nextInt();
        System.out.print("Enter Secound Number:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.print("Sum Of Two Number is:");
        System.out.println(c);
    }
}