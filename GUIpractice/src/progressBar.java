import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public  class progressBar {
    JFrame frame = new JFrame("BAR");
    JProgressBar Bar= new JProgressBar(0,100);
    progressBar(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        Bar.setValue(0);
        Bar.setBounds(0,0,500,50);
        Bar.setStringPainted(true);
        Bar.setBackground(Color.ORANGE);
        Bar.setForeground(Color.darkGray);
        Bar.setFont(new Font("MV Boli",Font.BOLD,40));



        frame.add(Bar);
        frame.setVisible(true);
        fill();




    }
    public void fill(){
        int count=100;
        while(count>0){
            Bar.setValue(count);
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count-=1;
        }
        Bar.setString("DONE");
    }

}
