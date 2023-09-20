import javax.swing.*;

class NumberOne {
    public static void main(String[] args)
    {
        int two = 0, three = 0, Both = 0;
        JOptionPane.showMessageDialog(null, "MP3 #1 " +
                "\nWrite a program that will accept two integer numbers from the user " +
                "\n– the numbers represent the start and end of a number line respectively " +
                "\n(e.g. start = 5; end = 10; the loop starts at 5 and ends at 10).  " +
                "The program shall determine the following:\n" +
                "Count of numbers divisible by 2\n" +
                "Count of numbers divisible by 3\n" +
                "Count of numbers divisible by both\n");
        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        Object[] message = {
                "Starting Number : ", input1,
                "End Number : ", input2,
        };
        int option = JOptionPane.showConfirmDialog(null,
                message, "Input 2 Numbers", JOptionPane.OK_CANCEL_OPTION);
        int EndNum = Integer.parseInt(input2.getText());
        if (option == JOptionPane.YES_OPTION){
            for (int StartNum = Integer.parseInt(input1.getText());
                 StartNum <= EndNum; StartNum++){
                if (StartNum % 3 == 0 && StartNum % 2 == 0){
                    ++Both;
                }
                if (StartNum % 3 == 0) {
                    ++three;
                }
                if (StartNum % 2 == 0){
                    ++two;
                }
            }
            JOptionPane.showMessageDialog(null, "Divisible by 2 & 3 : " + Both +
                    "\nDivisible by 3 : " + three + "\nDivisible by 2 : " + two);
        }
    }
}