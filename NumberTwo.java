import javax.swing.*;

public class NumberTwo
{
    public static void main(String[] args)
    {
        int sum = 0, product = 1, countThree = 0, countFive = 0, evenNum = 1;
        JOptionPane.showMessageDialog(null,"Number Two");
        JTextField input1 = new JTextField();
        Object[] message = {
                "Enter Number : ", input1,
        };
        while (true){
            int options = JOptionPane.showConfirmDialog(null,
                    message, "Number 2", JOptionPane.OK_CANCEL_OPTION);
            int inputAmount = Integer.parseInt(input1.getText());
            if (options == JOptionPane.OK_OPTION)
            {
                if (inputAmount == 0)
                {
                    JOptionPane.showMessageDialog(null,
                            "Sum of all numbers greater than 10 = " + sum +
                            "\nProduct of all numbers less than 5 = " + product +
                            "\nNumber of numbers divisible by 3 = " + countThree +
                            "\nNumber of numbers divisible by 5 = " + countFive +
                            "\nThrice the product of all even numbers = " + evenNum * 3);
                    break;
                }
                if (inputAmount % 2 == 0)
                {
                    evenNum = evenNum * inputAmount;
                }
                if (inputAmount % 3 == 0)
                {
                    ++countThree;
                }
                if (inputAmount % 5 == 0)
                {
                    ++countFive;
                }
                if (inputAmount > 10)
                {
                    sum = sum + inputAmount;
                }
                if (inputAmount < 5)
                {
                    product = product * inputAmount;
                }
            }
            else
            {
                break;
            }
        }
    }
}
