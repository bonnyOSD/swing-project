import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class Multidemo1 extends JFrame {
        private Container c;
        private JButton b;
        private JTextField jt;
        private JTextArea ja;
        private JLabel lb1,lb2;
        private ImageIcon img;
        private Font f;
        private Cursor cor;

        Multidemo1(){
            c=this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.PINK);

            img=new ImageIcon(getClass().getResource("image 5.jpg"));

            lb1=new JLabel(img);
            lb1.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
            c.add(lb1);

            lb2=new JLabel("Enter any number : ");
            f=new Font("Arial",Font.BOLD,20);

            lb2.setForeground(Color.RED);
            lb2.setFont(f);
            lb2.setBounds(20,200,250,50);
            c.add(lb2);

            jt=new JTextField();
            jt.setBounds(230,200,90,50);
            jt.setHorizontalAlignment(JTextField.CENTER);
            jt.setFont(f);
            jt.setBackground(Color.GREEN);
            c.add(jt);


            cor=new Cursor(Cursor.HAND_CURSOR);

            b=new JButton("Clear");
            b.setCursor(cor);
            b.setForeground(Color.WHITE);
            b.setBackground(Color.RED);
            b.setFont(f);
            b.setBounds(230,260,90,50);
            c.add(b);

            ja=new JTextArea();
            ja.setBounds(20,350,300,300);
            ja.setBackground(Color.GREEN);
            ja.setFont(f);
            c.add(ja);

            jt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String value = jt.getText();
                    if (value.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "you didn't put any number");

                    } else {
                        ja.setText("");
                        int num = Integer.parseInt(jt.getText());

                        for (int i = 1; i <= 10; i++) {
                            int result = num * i;
                            String r = String.valueOf(result);
                            String n = String.valueOf(num);
                            String INC = String.valueOf(i);
                            ja.append(n + "X" + INC + "=" + r + "\n");

                        }
                    }

                }

            });

            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ja.setText("");
                }
            });

        }

        public static void main(String[] args) {
            Multidemo1 frame=new Multidemo1();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(300,20,360,700);
            frame.setTitle("Multiplication Table");
        }
    }

