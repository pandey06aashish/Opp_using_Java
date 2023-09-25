// Let Learn string...


// public class java_05 {
//     public static void main(String[]argus){

//         // How to create string object...
//         String s1="Aahish Pandey";
//         String s2=new String("Amit Pandey");
//         System.out.println(s1);
//         System.out.println(s2);

//     //  String Concatenation...
//     String a1=s1.concat("Vinod Pandey");
//     String a2="Amit".concat("Vinod Pandey");
//     String a3= s1 + s2;
//     String a4=" Pankaj "+" Aashish ";
//     System.out.println(a1);
//     System.out.println(a2);
//     System.out.println(a3);
//     System.out.println(a4);

//     // Find Length of String....
//     System.out.println(a1.length());
       
//     // charAt();
//     for(int i=0;i<s1.length();i++){
//         System.out.println(s1.charAt(i));
//     }
//     // CompareTo()
//     if(a1.compareTo(a2)==0){
//         System.out.println("String are equail.");
//     }
//     else{
//         System.out.println("String are not equal");
//     }

//     // Secound method
//     if(a1==a2){
//         System.out.println("String are equail.");
//     }
//     else{
//         System.out.println("String are not equal");
//     } 
    
//     // Substring...
//     String name=a1.substring(5, 10);
//     System.out.println(name);
//     }
// }

// inner Class..

// class outer{
//     int age;
//     void print_name(){
//         System.out.println("Aashish");
//     }
//     class inner{
//      void print_b_name(){
//     System.out.println("Amit");
//      }
//     }
// }
// public class java_05{
//     public static void main(String[]argus){
//         outer o1 =new outer();
//         o1.print_name();
//         outer.inner o2=o1.new inner();
//        o2.print_b_name();
//     } 
// }

// Input.....

// import java.util.*;
// public class java_05{
// public static void main(String[]argus){
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter Number");
// int a=sc.nextInt();
// System.out.println("Enter Sentence");
// String b=sc.nextLine();
// System.out.println("Enter Float Value");
// float c=sc.nextFloat();
// System.out.println("Enter Double Value");
// double d=sc.nextDouble();
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);
//     }
// }

// Switch Conduction....

import java.util.*;
public class java_05{
    public static void main(String[]argus){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Day Name in form of Number 1-7");
    int day=sc.nextInt();
    switch(day){
        case 1: System.out.println("Sunday");
        break;
        case 2:System.out.println("Monday");
        break;
        case 3: System.out.println("Tuesday");
        break;
        case 4:System.out.println("Wednesday");
        break;
        case 5:System.out.println("Thrusday");
        break;
        case 6: System.out.println("Friday");
        break;
        case 7:System.out.println("Saturday");
        break;
        default: System.out.println("Incorrect Number");
    }
    }
}