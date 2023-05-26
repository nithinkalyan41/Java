import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class filechooser extends JFrame implements ActionListener {
    JButton button;
    filechooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        button = new JButton("select file");
        button.addActionListener(this);
        this.add(button);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser filechose = new JFileChooser();
            filechose.setCurrentDirectory(new File("."));
            int response = filechose.showOpenDialog(null);
            int fun = filechose.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(filechose.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
