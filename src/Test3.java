import javax.swing.*;

public class Test3 {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit this program ?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        else {
            System.out.println("you have clicked no option .");
        }
    }
}
