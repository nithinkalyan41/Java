import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon icon = new ImageIcon("upload.png");
   //     icon.setImage(50,50);
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(100,400,250,200);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,300,200);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setText("Clone it");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Cosmic sans", Font.BOLD,25));
        button.setIconTextGap(-3);
        button.setForeground(Color.DARK_GRAY);
        button.setBackground(Color.ORANGE);
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,700);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.setIconImage(icon.getImage());
        this.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("cloned");
            label.setVisible(true);
        }
    }
}
