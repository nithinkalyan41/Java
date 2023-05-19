package DSA.recursion;

public class SumProd {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n,0));
        System.out.println(pro(n,1));
    }
    static int sum (int n,int sum){

        if(n==0){
            return sum;
        }
        sum=sum+n%10;
        return sum(n/10,sum);

    }
    static int pro(int n,int prod){
        if(n==0){
            return prod;
        }
        prod= prod*(n%10);
        return pro(n/10,prod);
    }
}
