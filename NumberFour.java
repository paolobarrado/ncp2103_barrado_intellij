import javax.swing.*;
public class NumberFour {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Suppose that the tuition fee for the University of the East " +
                        "is at PHP 100000.00 this academic year and increases at 3.5% every year. " +
                    "\nIn one year, the tuition fee will be PHP 103500.00. " +
                    "\nWrite a Java program that allows a user to input the tuition " +
                        "fee and the increase rate and calculate the tuition for next N years. ");
        JTextField tuitionFeeInput = new JTextField();
        JTextField percentageInput = new JTextField();
        JTextField yearsInput = new JTextField();

        Object[] message = {
                "Tuition Fee (PHP): ", tuitionFeeInput,
                "Increase Rate (%): ", percentageInput,
                "No. of Years: ", yearsInput,
        };
        int option = JOptionPane.showConfirmDialog(null,
                message, "Tuition Fee Calculator", JOptionPane.OK_CANCEL_OPTION);
        //double tuitionFeeNum = Double.parseDouble(tuitionFeeInput.getText());
        double percentageNum = Double.parseDouble(percentageInput.getText());
        double percentageNumFinal = (percentageNum/100);
        int yearsNum = Integer.parseInt(yearsInput.getText());
        if (option == JOptionPane.OK_OPTION){
            for (double tuitionFeeNum = Double.parseDouble(tuitionFeeInput.getText()), yearsCount = 1; yearsCount <= yearsNum; yearsCount++){

                double tuitionFeeFinal = ((tuitionFeeNum * percentageNumFinal) + tuitionFeeNum);
                tuitionFeeFinal = (tuitionFeeFinal * 100)/100;
                //StringBuilder endMessage = new StringBuilder(("Est. Tuition Fee" + "\n" + Math.round(tuitionFeeFinal) + "\n"));
                System.out.println("year: " + yearsCount+ "tuition: " + tuitionFeeFinal);
            }
        }
    }
}
