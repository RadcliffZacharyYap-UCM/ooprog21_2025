import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog("Enter your name:");

            if (name == null) {
                break; 
            }

            int confirm = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?");

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello! " + name);
                break; 
            } else if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continue; 
            } else if (confirm == JOptionPane.CLOSED_OPTION) {
                break; 
            }
        }
    }
}
