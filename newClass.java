import java.util.Scanner;
import javax.swing.*;
import java.lang.Object;
class FirstActivity {
    public static void main(String[] args) {
        String USERNAME = "bulbulito@gmail.com";
        String PASSWORD = "titengbaliko";
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
                "Username:", username,
                "Password:", password
        };
        int option = JOptionPane.showConfirmDialog(null, message, "XYZ Resyaurant", JOptionPane.OK_CANCEL_OPTION);
        //if (option == JOptionPane.OK_OPTION){
            //JOptionPane.showMessageDialog(null, "Mamamo");
        //}
    }
}
