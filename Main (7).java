//..................Factorial of a number...........................

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
         int n = sc.nextInt();
        Factorial(n);
    } 
    static void Factorial(int num){
        int fac = 1, i;
        if (num >= 0) {
            for (i = 1; i <= num; i++) {
                fac = fac * i;
            }
        System.out.print("Factorial : "+fac);
        }
        else
            System.out.println("Fact of negative number doesn't exist.");
     }
}

//..........................Factorial of number using recursion......................
// import java.util.Scanner;
// public class Main{
//     static int fac=1;
//     public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//          int num = sc.nextInt();
//          Main ob=new Main();
//          ob.CalFactorial(num);
//          System.out.print("Factorial : "+fac);
//     }

//     static void CalFactorial(int n){
//         if(n>=1){
//             fac=fac*n;
//             CalFactorial(n-1);
//         }
//     }
// }
