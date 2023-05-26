import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkBox extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JButton button;


    checkBox(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());




        checkBox= new JCheckBox();
        checkBox.setText("MAKE SURE U CHECKED the box");
        checkBox.setFont(new Font("Consolos",Font.BOLD,30));



        button = new JButton("submit");
        button.addActionListener(this);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button){

                    System.out.println(checkBox.isSelected());

            }
    }
}
