package DSA.recursion;

import java.util.Scanner;

public class CountOfZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(recur(n));
    }
    static int recur(long n){
        return helper(n,0);
    }
    static int helper(long n,int c){
        if(n==0){
            return c;
        }
        int s = (int) (n%10);
        if(s==0){
            return helper(n/10,++c);
        }
        return  helper(n/10,c);

    }
}

