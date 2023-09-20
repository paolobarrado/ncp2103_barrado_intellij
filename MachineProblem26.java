import javax.swing.*;
public class MachineProblem26
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "HEP-HEP HOORAY!");
        JTextField input1 = new JTextField();
        Object[] message = {
                "Enter a number : ", input1,
        };
        int input = JOptionPane.showConfirmDialog(null,
                message, "HEP-HEP HOORAY!", JOptionPane.OK_CANCEL_OPTION);
        int num = Integer.parseInt(input1.getText());
        if (num % 3 == 0 && num % 5 ==0)
        {
            JOptionPane.showMessageDialog(null, "Number : " + num + "\nHep-Hep Hooray!");
        }
        else if (num % 5 == 0)
        {
            JOptionPane.showMessageDialog(null, "Number : " + num + "\nHooray!");
        }
        else if (num % 3 == 0)
        {
            JOptionPane.showMessageDialog(null, "Number : " + num + "\nHep-Hep");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Number : " + num + "\nOh no!");
        }
    }
}
