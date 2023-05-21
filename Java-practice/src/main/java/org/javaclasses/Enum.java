package org.javaclasses;

class Main {
    public static void main(String[] args) {
        hello b = new hello(){
            @Override  void display(){
                System.out.println("Anonoymous");
            }
        };
        b.display();
    }

}
class hello {
     void display(){
        System.out.println("hello");
    }
}
package zen.newMode;

public class Mobile {
    protected String name = "jordi";

    protected void Ex(){
        System.out.println("method jordi");
    }


}
package zen.newMode;

public class Poco {
    public static void main(String[] args) {
        Poco2 poco2 = new Poco2();

    }
}
class Poco2 {
    Poco2(){
        Mobile m = new Mobile();
        System.out.println(m.name);
    }
}
public class hello1{
    public static void main(String args[]){
       boys num=new boys();
        girls num1 = new girls();
        num.display(); num1.display();
  }
}
class students{
    int a =40;

    void display(){
        System.out.println("the no.of students are"+40);
    }
}

class boys extends students {
    int b = 25;

    void display(){
        super.display();
        System.out.println("The boys count is" + b);
    }
}
class girls extends students{
    void display(){
            int c = 15;
        System.out.println("The girls count is"+c);
super.display();}
}




public class today {
    public static void main(String[] args)
    {
        // creating calendar object
        bike a = bike.PULSAR;
        System.out.println(a);
        a = bike.ENFIELD;
        System.out.println(a);

    }
}
enum bike{
        PULSAR,SPLENDER,R15,ENFIELD;
        }
import java.util.Calendar;
import java.util.Date;
public class today {
    public static void main(String[] args)
    {
        Date n = new Date();
        System.out.println(n);

        Calendar s = Calendar.getInstance();
        System.out.println(s.get(Calendar.YEAR));
        System.out.println(s.get(Calendar.MONTH));
        System.out.println(s.get(Calendar.DATE));


        bike a = bike.PULSAR;
        System.out.println(a);
        a = bike.ENFIELD;
        System.out.println(a);

    }
}
enum bike{
        PULSAR,SPLENDER,R15,ENFIELD;
        }

