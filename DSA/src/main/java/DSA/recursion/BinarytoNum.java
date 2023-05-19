package DSA.recursion;

import java.util.Scanner;

public class BinarytoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        int i=0;
        while(n>0){
            ans += (int) ((n%10)*(pow(2,i)));
            i++;
            n=n/10;
        }
        System.out.println(ans);
    }
    static int pow(int b,int p){
        int ans = 1;
        for(int i=1;i<=p;i++){
            ans*=b;
        }
        return ans;
    }
}
