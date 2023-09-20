import javax.swing.*;

public class MachineProblem25
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Telco Prefixes");
        JTextField input1 = new JTextField();
        Object[] message = {
                "Enter your Number : ", input1,
        };
        int input = JOptionPane.showConfirmDialog(null, message,
                "Telco Prefixes", JOptionPane.OK_CANCEL_OPTION);
        String telcoNum = (input1.getText());
        if (telcoNum.length() != 11) {
            JOptionPane.showMessageDialog(null,
                    "Invalid number, Please enter an 11-digit number");
            return;
        }
        String num = telcoNum.substring(0, 4);
        switch (num)
        {
            case "0907":
            case "0909":
            case "0910":
            case "0912":
            case "0930":
                JOptionPane.showMessageDialog(null,
                        "The number : " + telcoNum + " is TNT");
                break;

            case "0922":
            case "0923":
            case "0924":
            case "0941":
            case "0931":
                JOptionPane.showMessageDialog(null,
                        "The number : " + telcoNum + " is SUN");
                break;

            case "0817":
            case "0904":
            case "0917":
            case "0966":
            case "0997":
                JOptionPane.showMessageDialog(null,
                        "The number : " + telcoNum + " is Globe");
                break;

            case "0908":
            case "0919":
            case "0920":
            case "0921":
            case "0928":
                JOptionPane.showMessageDialog(null,
                        "The number : " + telcoNum + " is Smart");
                break;

            case "0905":
            case "0906":
            case "0915":
            case "0916":
            case "0926":
                JOptionPane.showMessageDialog(null,
                        "The number : " + telcoNum + " is Globe/TM");
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "The Number you've entered cannot be determined");
        }
    }
}
