import javax.swing.*;
import java.text.DecimalFormat;
public class MachineProblem23
{
    public static void main(String[] args){
        DecimalFormat df2 = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null,"Mabuhay Miles");
        JTextField input1 = new JTextField();
        JTextField input2 = new JTextField();
        JTextField input3 = new JTextField();
        Object[] message = {
                "Enter the driving distance : ", input1,
                "Enter KM per gallon : ", input2,
                "Enter price per gallon : ", input3
        };
        int calculate = JOptionPane.showConfirmDialog(null,
                message, "Mabuhay Miles", JOptionPane.OK_CANCEL_OPTION);
        float drivingDistance = Float.parseFloat(input1.getText());
        float KmPerGallon = Float.parseFloat(input2.getText());
        float pricePerGallon = Float.parseFloat(input3.getText());

        float gasDistance = drivingDistance / KmPerGallon;
        float gasPrice = gasDistance * pricePerGallon;
        JOptionPane.showMessageDialog(null, "Driving Distance : "
                + drivingDistance + "\nKilometer per Gallon : " + KmPerGallon +
                "\nPrice Per Gallon : " + pricePerGallon + "\n___________________"
                + "\nThe cost of driving is P" + df2.format(gasPrice));
    }
}
