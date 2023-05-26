import javax.swing.*;
import java.awt.*;

public class JLayerpane {
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        label1.setBackground(Color.MAGENTA);
        label1.setOpaque(true);
        label1.setBounds(50,50,200,200);


        JLabel label2 = new JLabel();
        label2.setBackground(Color.ORANGE);
        label2.setOpaque(true);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setBackground(Color.BLUE);
        label3.setOpaque(true);
        label3.setBounds(150,150,200,200);

        JLabel label4 = new JLabel();
        label4.setBackground(Color.RED);
        label4.setOpaque(true);
        label4.setBounds(200,200,200,200);




        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2,Integer.valueOf(5));
        layeredPane.add(label3,Integer.valueOf(4));
        layeredPane.add(label4,Integer.valueOf(3));







        JFrame frame = new JFrame("JAVA LAYEREDPANE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layeredPane);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
