import javax.swing.*;

public class MachineProblem24
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Change Counter");
        JTextField input1 = new JTextField();
        Object[] message = {
                "Enter Change : ", input1,
        };
        int calculate = JOptionPane.showConfirmDialog(null,
                message, "Change Counter", JOptionPane.OK_CANCEL_OPTION);
        float inputAmount = Float.parseFloat(input1.getText());
        double fiveHundreds = (inputAmount / 500); 
        double nextAmount = inputAmount - (int)fiveHundreds * 500;
        double twoHundreds = (nextAmount / 200);
        double nextAmount2 = nextAmount - (int)twoHundreds * 200;
        double oneHundreds = (nextAmount2 / 100);
        double nextAmount3 = nextAmount2 - (int)oneHundreds * 100;
        double fifty = (nextAmount3 / 50);
        double nextAmount4 = nextAmount3 - (int)fifty * 50;
        double twenty = (nextAmount4 / 20);
        double nextAmount5 = nextAmount4 - (int)twenty * 20;
        double ten = (nextAmount5 / 10);
        double nextAmount6 = nextAmount5 - (int)ten * 10;
        double five = (nextAmount6 / 5);
        double nextAmount7 = nextAmount6 - (int)five * 5;
        double one = (nextAmount7 / 1);
        double nextAmount8 = nextAmount7 - (int)one * 1;
        double tenC = (nextAmount8 / .10);
        double nextAmount9 = nextAmount8 - (int)tenC * .10;
        double fiveC = (nextAmount9 / .05);
        double nextAmount10 = nextAmount9 - (int)fiveC * .05;
        double oneC = (nextAmount10 / .01);

        JOptionPane.showMessageDialog(null, "Change : "
                + inputAmount + "\n---------------" + "\nPeso : " + "\n500 - "
                + (int)fiveHundreds + "\n200 - " + (int)twoHundreds + "\n100 - "
                + (int)oneHundreds + "\n50 - " + (int)fifty + "\n20 - "
                + (int)twenty + "\n10 - " + (int)ten + "\n5 - "
                + (int)five + "\n1 - " + (int)one + "\nCents:" + "\n10C - "
                + (int)tenC + "\n5C - " + (int)fiveC + "\n1C - " +
                Math.round(oneC));
    }
}
