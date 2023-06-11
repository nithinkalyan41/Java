package DSA.math;

import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.log10;

public class CountOfDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
        System.out.println(Count(n));
        System.out.println(log(n));
    }
    static  int count(int n){
        int c = 0;
        while(n!=0){
            n=n/10;
            c++;
        }
        return c;
    }
    static int Count(int n){
        if(n==0){
            return n;
        }
        return  1+Count(n/10);
    }
    static int log(int n){
        return (int) floor(log10(n)+1);
    }

}
