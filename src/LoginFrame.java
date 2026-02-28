import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private Container c;
    private JTextField jt;
    private JButton b1,b2;
    private JLabel label1,label2;
    private JPasswordField p;
    private Font f;

    LoginFrame(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f=new Font("Arial",Font.BOLD,15);

        label1=new JLabel("Username :");
        label1.setBounds(20,10,150,40);
        label1.setFont(f);
        c.add(label1);

        jt=new JTextField();
        jt.setBounds(130,10,150,40);
        jt.setFont(f);
        c.add(jt);


        label2=new JLabel("Password :");
        label2.setBounds(20,70,150,40);
        label2.setFont(f);
        c.add(label2);

        p=new JPasswordField();
        p.setBounds(130,70,150,40);
        p.setFont(f);
        p.setEchoChar('*');
        c.add(p);

        b1=new JButton("Login");
        b1.setBounds(100,130,90,30);
        b1.setBackground(Color.GREEN);
        b1.setFont(f);
        c.add(b1);

        b2=new JButton("Clear");
        b2.setBounds(220,130,90,30);
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.setFont(f);
        c.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
                p.setText("");
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName= jt.getText();
                String password=p.getText();
                if (userName.equals("Bonny Akter") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(null,"you are successfully logined");
                    dispose();
                    NewFrameDemo frs=new NewFrameDemo();
                    frs.setBounds(100,50,400,300);
                    frs.setVisible(true);

                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                }

            }
        });



    }
    public static void main(String[] args) {
        LoginFrame frame=new LoginFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,400,300);
        frame.setTitle("LOGIN FRAME");
    }
}
