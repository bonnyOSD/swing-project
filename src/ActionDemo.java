import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDemo extends JFrame {
    private Container c;
    private JTextField jt;
    private Button b;


    ActionDemo(){


        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        jt=new JTextField();
        jt.setBounds(20,40,150,50);
        c.add(jt);

        b=new Button("clear");
        b.setBounds(20,100,100,40);
        c.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
            }
        });

    }

    public static void main(String[] args) {
        ActionDemo frame=new ActionDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,50,500,400);
        frame.setTitle("ACTION DEMO");
    }
}
