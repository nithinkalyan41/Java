package org.amigoscode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(50);
        l.add(40);
        l.add(30);
        l.add(50);

        int sum1 = l.stream().mapToInt(x->x).sum();
        System.out.println(sum1);
        /*for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        System.out.println(sum);
        int num =20;*/

        /*Function<Integer,Integer> incrementBy1 = num1 -> num+1;
        System.out.println(incrementBy1.apply(num));*/
    }
}