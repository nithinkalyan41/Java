package org.amigoscode;

import java.util.function.Function;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;



class Main{

//        List <Integer> a= List.of(10,25,14,24,15,45,5,45,5);
//       List<Integer> ans = a.stream().map(x -> x*10).collect(Collectors.toList());
//       ans.stream().filter(x -> x>100).collect(Collectors.toList()).forEach(y-> System.out.println(y));
//        System.out.println(ans);
       /* int b[] = {10,25,14,24,15,45,5,45,5};
        Arrays.stream(b).map(x -> x*5).forEach(y -> System.out.println(y));*/
        public static void main(String[] args) {
            /*System.out.println(validPhoneNumber.test("+918495841514"));
            System.out.println(validPhoneNumber.test("+91849584154514"));
            System.out.println(validPhoneNumber.test("+9184958414"));
            System.out.println();
            System.out.println(validPhoneNumber.and(numHaving3).test("+918495841513"));
            System.out.println(validPhoneNumber.and(numHaving3).test("+91849841513"));
            System.out.println(validPhoneNumber.or(numHaving3).test("2918495841513"));
*/
            Student stu = new Student();
            stu.print();
        }
        static Predicate<String> validPhoneNumber = phoneNumber -> phoneNumber.startsWith("+91") && phoneNumber.length()==13;
        static Predicate<String> numHaving3 = phonenumber -> phonenumber.contains("3");


}