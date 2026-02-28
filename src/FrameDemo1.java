import javax.swing.*;

public class FrameDemo1 extends JFrame {
    private ImageIcon icon;
    FrameDemo1(){
        initcomponents();
    }
    public void initcomponents(){

        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {
        FrameDemo1 frame= new FrameDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(200,50,400,300);
        frame.setTitle("FrameDemo");
        frame.setResizable(false);
    }
}
