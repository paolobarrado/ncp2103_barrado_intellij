import javax.swing.*;
import java.text.DecimalFormat;

public class MachineProblem278
{
    public static void main(String[] args)
    {
        DecimalFormat df2 = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Train Law Tax Calculator");
        JTextField input1 = new JTextField();
        Object[] message = {
                "Enter Monthly Salary : ", input1,
        };
        int input = JOptionPane.showConfirmDialog(null, message,
                "Train Law Tax Calculator", JOptionPane.OK_CANCEL_OPTION);
        float monthlySalary = Float.parseFloat(input1.getText());
        float annualSalary = monthlySalary * 12;
        if (annualSalary < 250000)
        {
            double tax = 0.00;
            JOptionPane.showMessageDialog(null,
                    "Monthly income : " + monthlySalary + "\nMonthly tax : " + df2.format(tax));
        }
        else if (annualSalary > 250000 && annualSalary <400000)
        {
            float num = annualSalary - 250000;
            double tax = (num * .20) / 12;
            JOptionPane.showMessageDialog(null,
                    "Monthly income : " + monthlySalary + "\nMonthly tax : " + df2.format(tax));
        }
        else if (annualSalary > 400000 && annualSalary < 800000)
        {
            float num = annualSalary - 400000;
            double tax = ((num * .25) + 30000) / 12;
            JOptionPane.showMessageDialog(null,
                    "Monthly income : " + monthlySalary + "\nMonthly tax : " + df2.format(tax));
        }
        else if (annualSalary > 800000 && annualSalary < 2000000)
        {
            float num = annualSalary - 800000;
            double tax = ((num * .30) + 130000) / 12;
            JOptionPane.showMessageDialog(null,
                    "Monthly income : " + monthlySalary + "\nMonthly tax : " + df2.format(tax));
        }
        else if (annualSalary > 2000000 && annualSalary < 8000000) {
            float num = annualSalary - 2000000;
            double tax = ((num * .32) + 490000) / 12;
            JOptionPane.showMessageDialog(null,
                    "Monthly income : " + monthlySalary + "\nMonthly tax : " + df2.format(tax));
        }
        else
        {
            float num = annualSalary - 8000000;
            double tax = ((num * .35) + 2410000) / 12;
            JOptionPane.showMessageDialog(null,
                    "Monthly income : " + monthlySalary + "\nMonthly tax : " + df2.format(tax));
        }
    }
}
