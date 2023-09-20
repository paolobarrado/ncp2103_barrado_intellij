import javax.swing.*;
import javax.swing.JOptionPane;
import java.lang.Object;
import java.text.DecimalFormat;

public class MachineProblem21
{
    public static void main(String[] args)
    {
        DecimalFormat df2 = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Welcome XYZ Restaurant");
        JTextField inputBill = new JTextField();
        JTextField inputTip = new JTextField();
        Object[] message = {
                "Bill:", inputBill,
                "Tip(%)", inputTip
        };
        int option = JOptionPane.showConfirmDialog(null,
                message, "XYZ Resyaurant", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION){
            float billBeforeTip = Float.parseFloat(inputBill.getText());
            float tipRate = Float.parseFloat(inputTip.getText());
            float totalTip = billBeforeTip * (tipRate / 100);
            float totalBill = totalTip + billBeforeTip;
            JOptionPane.showMessageDialog(null, "Bill Before Tip : " + df2.format(billBeforeTip) +
                    "\nTip Rate (%) : " + df2.format(tipRate) + "\n\nTip Amount : " + df2.format(totalTip) +
                    "\nTotal Bill : " + df2.format(totalBill));
        }
    }
}
