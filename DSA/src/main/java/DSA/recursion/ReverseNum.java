package DSA.recursion;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rev(n,0));
    }
    static int rev(int n,int ans){
        if(n==0){
            return ans;
        }
        return rev(n/10,(ans*10)+(n%10));
    }
}
