import javax.swing.*;
import java.util.Random;

public class MachineProblem2910
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Ley's Play In-Between");
        Random rand = new Random();
        int int_random =  5;//rand.nextInt(13) + 1;
        int int_random2 = 5;//rand.nextInt(13) +1;
        System.out.println(int_random);
        System.out.println(int_random2);
        String[] options = new String[2];
        options[0] = "Deal";
        options[1] = "No Deal";
        String[] options2 = new String[2];
        options2[0] = "High";
        options2[1] = "Low";
        if (int_random != int_random2)
        {
            int int_random3 = 11;//rand.nextInt(13) + 1;
            System.out.println(int_random3);
            int option = JOptionPane.showOptionDialog(null, "Deal or No Deal" +
                            "\nFirst Card : " + int_random +  "\nSecond Card : " + int_random2,
                    "In-between", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, null);
            boolean gameCondition = ((int_random3 < int_random2) && (int_random3 > int_random)) ||
                    ((int_random3 > int_random2) && (int_random3 < int_random));
            if (option == JOptionPane.YES_OPTION)
            {
                if (gameCondition)
                {
                    JOptionPane.showMessageDialog(null,
                            "Your choice : Deal" + "\nThird Card : "
                            + int_random3 + "\nYou Won!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Your choice : Deal" + "\nThird Card : "
                            + int_random3 + "\nYou Lose!");
                }

            }
            else if (option == JOptionPane.NO_OPTION)
            {
                if (gameCondition)
                {
                    JOptionPane.showMessageDialog(null,
                            "Your choice : No Deal" + "\nThird Card : "
                            + int_random3 + "\nToo bad you should've won");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Your choice : No Deal" + "\nThird Card : "
                            + int_random3 + "\nGood thing you didn't made a deal!");
                }
            }
        }
        else
        {
            int int_random3 = rand.nextInt(13) + 1;
            System.out.println(int_random3);
            int option = JOptionPane.showOptionDialog(null, "High or Low" +
                            "\nFirst Card : " + int_random +  "\nSecond Card : " + int_random2,
                    "Triangle", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options2, null);
            if (option == JOptionPane.YES_OPTION)
            {
                if (int_random2 < int_random3)
                {
                    JOptionPane.showMessageDialog(null,
                            "Your choice : High"
                            + "\nThird Card : " + int_random3 + "\nYou Won!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Your choice : High"
                            + "\nThird Card : " + int_random3 + "\nYou Lose!");
                }
            }
            else if (option == JOptionPane.NO_OPTION)
            {
                if (int_random2 > int_random3)
                {
                    JOptionPane.showMessageDialog(null,
                            "Your choice : Low"
                            + "\nThird Card : " + int_random3 + "\nYou Won!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Your choice : Low"
                            + "\nThird Card : " + int_random3 + "\nYou Lose!");
                }
            }
        }
    }
}
