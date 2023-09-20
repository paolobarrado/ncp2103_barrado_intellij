import javax.swing.*;
import java.lang.Object;
public class MachineProblem22{

    public static void main(String[] args)
    {
        String[] options = new String[2];
        options[0] = "Sides";
        options[1] = "Angles";
        JOptionPane.showMessageDialog(null, "Triangle type detector");
        int option = JOptionPane.showOptionDialog(null,
                "Choose what you want to determine", "Triangle",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, null);
        if (option == JOptionPane.YES_OPTION){
            JTextField input1 = new JTextField();
            JTextField input2 = new JTextField();
            JTextField input3 = new JTextField();
            Object[] message = {
                    "Sides 1", input1,
                    "Sides 2", input2,
                    "Sides 3", input3
            };
            int inputs = JOptionPane.showConfirmDialog(null,
                    message, "computation", JOptionPane.OK_CANCEL_OPTION);

            float Side1 = Float.parseFloat(input1.getText());
            float Side2 = Float.parseFloat(input2.getText());
            float Side3 = Float.parseFloat(input3.getText());
            float Sides = Side1 + Side2;
            if (Sides > Side3){
                if (Side1 == Side2 && Side2 == Side3 && Side3 == Side1){
                    JOptionPane.showMessageDialog(null,
                            "side 1 : " + Side1 + "\nside 2 : " + Side2 + "\nside 3 : "
                                    + Side3 + "\n-------------" + "\nTriangle : Equilateral");
                }
                else if (Side1 == Side2 || Side2 == Side3 || Side3 == Side1){
                    JOptionPane.showMessageDialog(null,
                            "side 1 : " + Side1 + "\nside 2 : " + Side2 + "\nside 3 : "
                                    + Side3 + "\n-------------" + "\nTriangle : Isosceles");
                }
                else{
                    JOptionPane.showMessageDialog(null,
                            "side 1 : " + Side1 + "\nside 2 : " + Side2 + "\nside 3 : "
                                    + Side3 + "\n-------------" + "\nTriangle : Scalene");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "side 1 : " + Side1 +
                        "\nside 2 : " + Side2 + "\nside 3 : " + Side3 + "\n-------------"
                        + "\nTriangle : Invalid");
            }
        }
        else{
            JTextField input1 = new JTextField();
            JTextField input2 = new JTextField();
            JTextField input3 = new JTextField();
            Object[] message = {
                    "Angle 1", input1,
                    "Angle 2", input2,
                    "Angle 3", input3,
            };
            int inputs2 = JOptionPane.showConfirmDialog(null, message,
                    "computation", JOptionPane.OK_CANCEL_OPTION);
            float Angle1 = Float.parseFloat(input1.getText());
            float Angle2 = Float.parseFloat(input2.getText());
            float Angle3 = Float.parseFloat(input3.getText());
            float angleSum = Angle1 + Angle2 + Angle3;
            if (angleSum == 180){
                if (Angle1 < 90 && Angle2 < 90 && Angle3 < 90){
                    JOptionPane.showMessageDialog(null,
                            "angle 1 : " + Angle1 + "\nangle 2 : "
                                    + Angle2 + "\nangle 3 : " + Angle3 +
                                    "\n-------------" + "\nTriangle : Acute Triangle");
                }
                else if (Angle1 == 90 || Angle2 == 90 || Angle3 == 90){
                    JOptionPane.showMessageDialog(null, "angle 1 : "
                            + Angle1 + "\nangle 2 : " + Angle2 + "\nangle 3 : " + Angle3 +
                            "\n-------------" + "\nTriangle : Right Triangle");
                }
                else{
                    JOptionPane.showMessageDialog(null, "angle 1 : "
                            + Angle1 + "\nangle 2 : " + Angle2 + "\nangle 3 : " + Angle3 +
                            "\n-------------" + "\nTriangle : Obtuse Triangle");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "angle 1 : "
                        + Angle1 + "\nangle 2 : " + Angle2 + "\nangle 3 : " + Angle3 +
                        "\n-------------" + "\nTriangle : Invalid Triangle");
            }
        }
    }
}