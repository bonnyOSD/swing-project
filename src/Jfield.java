import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jfield extends JFrame {
    private Container c;
    private JTextField jf1,jf2;
    private Font f;

    Jfield(){
        initcomponents();
    }
    public void initcomponents(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        f=new Font("Arial",Font.ITALIC + Font.BOLD,20);

        jf1=new JTextField("Jerin");
        jf1.setBounds(20,50,200,50);
        jf1.setFont(f);
        jf1.setBackground(Color.GRAY);
        jf1.setForeground(Color.WHITE);
        jf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(jf1);

        jf2=new JTextField();
        jf2.setText("Bonny");
        jf2.setBounds(20,120,200,50);
        jf2.setFont(f);
        c.add(jf2);

        jf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String s=jf1.getText();
               if(s.isEmpty()){
                   JOptionPane.showMessageDialog(null,"you didn't enter anything");

               }else{
                   JOptionPane.showMessageDialog(null,"jf1 = "+ s);
               }

            }
        });

        jf2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=jf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"you didn't enter anything");

                }else{
                    JOptionPane.showMessageDialog(null,"jf2uyu = "+ s);
                }

            }
        });

    }
    public static void main(String[] args) {
        Jfield frame=new Jfield();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("JTextField Demo");
    }
}
