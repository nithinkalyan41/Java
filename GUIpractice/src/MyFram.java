import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFram extends JFrame implements ActionListener {
    JButton button = new JButton("SUBMIT");
    JTextField textField = new JTextField();
    MyFram(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.setFocusable(false);
        button.addActionListener(this);
        JLabel jlabel = new JLabel("name");

        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolos",Font.BOLD,20));
        textField.setForeground(new Color(35,125,230));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.ORANGE);



        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button){
                button.setEnabled(false);
                System.out.println("WELCOME "+textField.getText());
            }
    }
}
