import javax.swing.*;
import javax.swing.ImageIcon.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //new MyFrame();

        ImageIcon icon = new ImageIcon("upload.png");



        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));

        JPanel plane1 = new JPanel();
        JPanel plane2 = new JPanel();
        JPanel plane3 = new JPanel();
        JPanel plane4 = new JPanel();
        JPanel plane5 = new JPanel();


        JLabel label = new JLabel();
        label.setText("HELLO");
        label.setForeground(Color.green);
        label.setIcon(icon);
        label.setFont(new Font("Cosmic Sans",Font.BOLD,25));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);



        plane1.setBackground(Color.ORANGE);
        plane2.setBackground(Color.MAGENTA);
        plane3.setBackground(Color.BLACK);
        plane4.setBackground(Color.BLUE);
        plane5.setBackground(Color.GREEN);

        plane1.setPreferredSize(new Dimension(100,100));
        plane2.setPreferredSize(new Dimension(100,100));
        plane3.setPreferredSize(new Dimension(100,100));
        plane4.setPreferredSize(new Dimension(100,100));
        plane5.setPreferredSize(new Dimension(100,100));

        //------------------->SUB PLANES<-----------//
        JPanel plane6 = new JPanel();
        JPanel plane7 = new JPanel();
        JPanel plane8 = new JPanel();
        JPanel plane9 = new JPanel();
        JPanel plane10 = new JPanel();

        plane6.setBackground(Color.RED);
        plane7.setBackground(new Color(40, 50,54));
        plane8.setBackground(new Color(54,50,40));
        plane9.setBackground(new Color(150,241,100));
        plane10.setBackground(new Color(255,255,255));


        plane5.setLayout(new BorderLayout(5,5));
        plane6.setPreferredSize(new Dimension(50,50));
        plane7.setPreferredSize(new Dimension(50,50));
        plane8.setPreferredSize(new Dimension(50,50));
        plane9.setPreferredSize(new Dimension(50,50));
        plane10.setPreferredSize(new Dimension(50,50));


        //-------------->SUB PANELS<-------------------//


        frame.add(plane1,BorderLayout.NORTH);
        frame.add(plane2,BorderLayout.SOUTH);
        frame.add(plane3,BorderLayout.EAST);
        frame.add(plane4,BorderLayout.WEST);
        frame.add(plane5,BorderLayout.CENTER);
        frame.setTitle("JAVA FRAME");

        plane5.add(plane6,BorderLayout.NORTH);
        plane5.add(plane7,BorderLayout.SOUTH);
        plane5.add(plane8,BorderLayout.EAST);
        plane5.add(plane9,BorderLayout.WEST);
        plane5.add(plane10,BorderLayout.CENTER);
        plane10.setLayout(new BorderLayout());
        plane10.add(label);
    }
}
