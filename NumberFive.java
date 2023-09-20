import javax.swing.*;
import java.util.Random;

public class NumberFive
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Ley's Play In-Between");
        Random rand = new Random();
        int int_random =  rand.nextInt(13) + 1;
        int int_random2 = rand.nextInt(13) +1;
        System.out.println(int_random);
        System.out.println(int_random2);
        String[] options = new String[2];
        options[0] = "Deal";
        options[1] = "No Deal";
        String[] options2 = new String[2];
        options2[0] = "High";
        options2[1] = "Low";
        int money = 1000;
        while (true)
        {
            JTextField input1 = new JTextField();
            Object[] message = {
                    "Place Your bet", input1,
                    "Your remaining balance is : " + money
            };
            if (money == 0)
            {

                JOptionPane.showMessageDialog(null, "Sorry you have no money left");
                break;
            }
            int inputbet = JOptionPane.showConfirmDialog(null, message,
                    "bet", JOptionPane.OK_CANCEL_OPTION);
            int bet = Integer.parseInt(input1.getText());
            if (inputbet == JOptionPane.OK_OPTION)
            {
                if (int_random != int_random2)
                {
                    int int_random3 = rand.nextInt(13) + 1;
                    System.out.println(int_random3);
                    int option = JOptionPane.showOptionDialog(null, "Deal or No Deal" +
                                    "\nFirst Card : " + int_random + "\nSecond Card : " + int_random2,
                            "In-between", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, options, null);
                    boolean gameCondition = ((int_random3 < int_random2) && (int_random3 > int_random)) ||
                            ((int_random3 > int_random2) && (int_random3 < int_random));
                    if (option == JOptionPane.YES_OPTION) {
                        if (gameCondition)
                        {
                            money = money + bet;
                            int ContinueOption = JOptionPane.showConfirmDialog(null,
                                    "Your choice : Deal" + "\nThird Card : "
                                            + int_random3 + "\nYou Won!" +
                                            "\nYour total winnings is : " + money +
                                            "\nDo you want to continue?",
                                    "Continue?", JOptionPane.YES_NO_OPTION);

                            if (ContinueOption == JOptionPane.NO_OPTION)
                            {
                                JOptionPane.showMessageDialog(null,
                                        "Thank you for playing In-between" +
                                                "\nYour total winnings is : " + money);
                                break;
                            }
                        }
                        else
                        {
                            money = money - bet;
                            int ContinueOption = JOptionPane.showConfirmDialog(null,
                                    "Your choice : Deal" + "\nThird Card : "
                                            + int_random3 + "\nYou Lose!" +
                                            "\nYour total winnings is : " + money +
                                            "\nDo you want to continue?",
                                    "Continue?", JOptionPane.YES_NO_OPTION);
                            if (ContinueOption == JOptionPane.NO_OPTION)
                            {
                                JOptionPane.showMessageDialog(null,
                                        "Thank you for playing In-between" +
                                                "\nYour total winnings is : " + money);
                                break;
                            }
                        }

                    }
                    else if (option == JOptionPane.NO_OPTION)
                    {
                        money = money - 100;
                        int ContinueOption = JOptionPane.showConfirmDialog(null,
                                "Your choice : No Deal" + "\nYou Lose!" +
                                        "\nYour total winnings is : " + money +
                                        "\nDo you want to continue?",
                                "Continue?", JOptionPane.YES_NO_OPTION);
                        if (ContinueOption == JOptionPane.NO_OPTION)
                        {
                            JOptionPane.showMessageDialog(null,
                                    "Thank you for playing In-between" +
                                            "\nYour total winnings is : " + money);
                            break;
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
                            money = money + bet;
                            int ContinueOption = JOptionPane.showConfirmDialog(null,
                                    "Your choice : High"
                                            + "\nThird Card : " + int_random3 + "\nYou Won!" +
                                            "\nYour total winnings is : " + money +
                                            "\nDo you want to continue?",
                                    "Continue?", JOptionPane.YES_NO_OPTION);
                            if (ContinueOption == JOptionPane.NO_OPTION)
                            {
                                JOptionPane.showMessageDialog(null,
                                        "Thank you for playing In-between" +
                                                "\nYour total winnings is : " + money);
                                break;
                            }
                        }
                        else
                        {
                            money = money - bet;
                            int ContinueOption = JOptionPane.showConfirmDialog(null,
                                    "Your choice : High"
                                            + "\nThird Card : " + int_random3 + "\nYou Lose!" +
                                            "\nYour total winnings is : " + money +
                                            "\nDo you want to continue?",
                                    "Continue?", JOptionPane.YES_NO_OPTION);
                            if (ContinueOption == JOptionPane.NO_OPTION)
                            {
                                JOptionPane.showMessageDialog(null,
                                        "Thank you for playing In-between" +
                                                "\nYour total winnings is : " + money);
                                break;
                            }
                        }
                    }
                    else if (option == JOptionPane.NO_OPTION)
                    {

                        if (int_random2 > int_random3)
                        {
                            money = money + bet;
                            int ContinueOption = JOptionPane.showConfirmDialog(null,
                                    "Your choice : Low"
                                            + "\nThird Card : " + int_random3 + "\nYou Won!" +
                                            "\nYour total winnings is : " + money +
                                            "\nDo you want to continue?",
                                    "Continue?", JOptionPane.YES_NO_OPTION);
                            if (ContinueOption == JOptionPane.NO_OPTION)
                            {
                                JOptionPane.showMessageDialog(null,
                                        "Thank you for playing In-between" +
                                                "\nYour total winnings is : " + money);
                                break;
                            }
                        }
                        else
                        {
                            money = money - bet;
                            int ContinueOption = JOptionPane.showConfirmDialog(null,
                                    "Your choice : Low"
                                            + "\nThird Card : " + int_random3 + "\nYou Lose!" +
                                            "\nYour total winnings is : " + money +
                                            "\nDo you want to continue?",
                                    "Continue?", JOptionPane.YES_NO_OPTION);
                            if (ContinueOption == JOptionPane.NO_OPTION)
                            {
                                JOptionPane.showMessageDialog(null,
                                        "Thank you for playing In-between" +
                                                "\nYour total winnings is : " + money);
                                break;
                            }
                        }
                    }
                }
            }
            else
            {
                break;
            }
        }
    }
}
