package Book;

import java.util.Scanner;

public class Book {
     int bno;
     String bname;
     float price;
    Scanner sc = new Scanner(System.in);

    public Book() {
        this.bno = isnum();
        System.out.println("Enter the name of the Book:");
        this.bname = sc.next();
        System.out.println("Enter price of the Book:");
        this.price = isPrice();
    }
    public void display(){
        System.out.println(this);
    }
    public int isnum(){
        boolean truth = true;
        int bno = 0;
        System.out.println("Enter book number:");
        while(truth){
            try{
                bno = sc.nextInt();
                truth = false;
            }catch(Exception e){
                System.out.println("Enter the numerical values");
                sc.next();
            }
        }
        return bno;
    }
    public float isPrice(){

        boolean truth = true;
        float price = 0;
        while(truth){
            try {
                price = sc.nextFloat();
                truth = false;
            }catch (Exception e){
                System.out.println("Enter numerical values only");
                sc.next();
            }

        }
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bno=" + bno +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                '}';
    }
}
