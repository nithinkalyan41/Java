

class me extends Thread{

    public void run(){
        int i=1000;
        while(i>0) {
            System.out.println("HEY its me");
            i--;
        }
    }
}
class you extends Thread{

    public void run(){
        int i =500;
        while(i>0) {
            System.out.println("HEY ITS NOT ME");
            i--;
        }
    }
}
class sheep implements  Runnable{

    public void run(){
        int i=100;
        while(i>0) {
            System.out.println("I AM MR.THREE 3333333333");
            i--;
        }
    }
}
class dog implements Runnable{

    public void run(){
        int i=1000;
        while(i>0) {
            System.out.println("I am MR.FOUR 44444444444");
            i--;
        }
    }
}
//class hari extends Thread{
//    public hari(String name){
//        super(name);
//    }
//    public void run(){
//        int i =20;
//        while(i<0){
//            System.out.println("EVARA MEERANTA");
//        }
//    }
//
//}
public class Main {
    public static void main(String[] args) {
        me in = new me();
        you out = new you();
        in.start();
        out.start();
        sheep ramesh = new sheep();
        dog venu = new dog();
        Thread farm = new Thread(ramesh);
        Thread farm2 = new Thread(venu);
        farm.start();
        farm2.start();
//        hari bot = new hari("MR.HK");
//
//        System.out.println("THE Address of thread " +bot.getId());
//        System.out.println("THE NAME Of the thread " +bot.getName());
//        bot.start();

    }
}