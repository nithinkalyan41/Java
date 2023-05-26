
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radio extends JFrame implements ActionListener {

    JRadioButton pizza;
    JRadioButton burgir;
    JRadioButton hotdog;

    radio(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizza=new JRadioButton("pizza");
        burgir= new JRadioButton("Burgir");
        hotdog = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(burgir);
        group.add(hotdog);

        this.add(pizza);
        this.add(burgir);
        this.add(hotdog);
        this.pack();
        this.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==pizza){
                System.out.println("YOU ORDERED PIZZA");
            }
            else if(e.getSource()==burgir){
                System.out.println("YOU ORDERED BURGIR");
            }
            else if(e.getSource()==hotdog){
                System.out.println("YOU ORDERED HOTDOG");
            }
    }
}
