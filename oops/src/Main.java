import capsule.*;
import poly.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
//        palindrome n = new palindrome();
////        n.setid(125);
////        n.setname("nithin");
////        System.out.println(n.getid());
////        System.out.println(n.getname());
//
//         if(n.ispal("TOTVGHV"))
//             System.out.println("true");
//         else
//             System.out.println("false");

        int n = 5;
        for(int i=1,c=0;i<=n;i++,c++){
            for(int j=0;j<=n;j++){
                if(i==j || i==j-(n-i-c))
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
//class  arop {
//    arop() {
//        System.out.println("default constructor");
//    }
//
//    arop(int a) {
//        this();
//        System.out.println("the given value" + a);
//    }
//
//    arop(int a, int b) {
//        this(a);
//        System.out.println("add a,b " + (a + b));
//    }
//
//    arop(int a, int b, int c) {
//        this(a, b);
//        System.out.println("the product " + (a * b * c));
//
//    }

