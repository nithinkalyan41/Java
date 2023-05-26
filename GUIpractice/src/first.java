import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
public class first {
    public static void main(String[] args) {
//        Firstframe nithin = new Firstframe();
        ImageIcon image = new ImageIcon("upload.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,5);

        JLabel label = new JLabel();
        label.setText("HEY!!! HOPE YOUR DOING WELL");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(100,150,200));
        label.setFont(new Font("MV Boli",Font.BOLD,50));
        label.setIconTextGap(10);
        label.setBackground(new Color(105,25,142));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,250,250);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setTitle("GO AHEAD");
        frame.add(label);
//        frame.setLayout(null);
//           frame.pack();
    }
}