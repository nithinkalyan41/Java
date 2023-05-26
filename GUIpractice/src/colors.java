import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colors extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    colors(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("COLOR PICKER");
        label = new JLabel("I AM TOO LAZY");

        button.addActionListener(this);

        label.setBackground(Color.BLACK);
        label.setFont(new Font("MV BOli",Font.BOLD,100));


        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button){
                JColorChooser colorChooser = new JColorChooser();
                Color color = JColorChooser.showDialog(null,"pick a color",Color.BLACK);
                label.setForeground(color);
            }
    }
}
