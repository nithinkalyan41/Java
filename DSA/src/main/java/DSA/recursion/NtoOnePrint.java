package DSA.recursion;

import java.util.Scanner;

public class NtoOnePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        printer(n);
    }
    static void printer(long n){
        if(n==0){
            System.out.print(n+" ");
            return;

        }
        System.out.print(n + " ");
            printer(n - 1);


    }
}
