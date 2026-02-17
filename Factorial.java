import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial is: "+fact);
        sc.close();
    }
}

// Using factorial

// public class Factorial {
//     static int fact = 1;
//     public static void main(String[] args) {
//         System.out.println(printFactorial(5));
//     }
//     // public static void printFactorial(int n) {
//     //     if (n==0) {
//     //         System.out.println(fact);
//     //         return;
//     //     }
//     //     fact *= n;
//     //     printFactorial(n-1);
//     // }
//     public static int printFactorial(int n) {
//         if (n==0) return 1;
//         return n*printFactorial(n-1);
//     }
// }

