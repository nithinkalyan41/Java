package DSA.recursion;

public class demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c =60;
        if(a>b){
            if(a>c) {
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else if(b>c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }




    }
}
