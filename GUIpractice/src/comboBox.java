import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBox extends JFrame implements ActionListener {
    JComboBox CB;
    comboBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] birds = {"sparrow","eagle","parrot","vulture"};
        CB = new JComboBox(birds);
        CB.addActionListener(this);

        this.add(CB);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==CB){
            System.out.println(CB.getSelectedItem());
        }
    }
}
