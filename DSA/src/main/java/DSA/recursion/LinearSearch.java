package DSA.recursion;

import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = linear(a,0,n-1,target);
        System.out.println(ans);
    }
    static int linear(int a[],int s,int n,int target){
        if(a[s]==target){
            return s;
        }
        return linear(a,++s,n,target);
    }

}
