package DSA.recursion;



public class BinarySearch {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = binarySearch(a,target,0,n-1);
        System.out.println(ans);
    }
    static int binarySearch(int a[],int target,int s,int e){
        if(s>e) return -1;
        int mid = s+(e-s)/2;
        if(a[mid]==target){
            return mid;
        }
        if(target<=a[mid]){
            return binarySearch(a,target,s,mid-1);
        }

            return binarySearch(a,target,mid+1,e);

    }
}
