import javax.swing.*;
import java.awt.*;

public class panel1 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("upload.png");


        JLabel label = new JLabel();
        label.setText("HELLO");
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIcon(icon);
        label.setSize(100,100);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.BOTTOM);



        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(250,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0,250,500,250);
        bluepanel.setLayout(new BorderLayout());



        JFrame frame = new JFrame();
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.setTitle("PLANES PRACTICE");
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
       // redpanel.add(label);
        bluepanel.add(label);
        //greenpanel.add(label);

    }

}