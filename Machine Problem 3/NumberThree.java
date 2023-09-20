import javax.swing.*;
import java.util.Random;
class NumberThree {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int playerTries = 0;
        int randomGuess = randomNum.nextInt(10);
        JOptionPane.showMessageDialog(null,
                "Simulate a guessing game.. Allow the user to guess a random number (0 - 10)." +
                        "\nThe program shall continuously ask for the user’s guess until the time the user " +
                        "guesses it correctly; and display if the guess is “higher” or “lower”. \nDisplay the " +
                        "number of tries and their corresponding player rank.\n\n" +
                "                       1 Try            :  Pro\n" +
                "                       2 - 4 Tries   :  Expert\n" +
                "                       5 - 6 Tries   :  Beginner\n" +
                "                       > 7 Ties      :  Novice");
        while (true)
        {
            JTextField guessInput = new JTextField();
            Object[] message = {
                    "Guess a number between 1-10", guessInput, randomGuess
            };
            int option = JOptionPane.showConfirmDialog(null,
                    message, "Input your guess", JOptionPane.OK_CANCEL_OPTION);
            int playerGuess = Integer.parseInt(guessInput.getText());
            if (option == JOptionPane.OK_OPTION)
            {
                ++playerTries;
                if (playerGuess == randomGuess)
                {
                    if (playerTries >= 7)
                    {
                        JOptionPane.showMessageDialog(null,
                                "Congratulations! You guessed correctly! " +
                                        "\nNumber of Tries:" + playerTries + "\nRank: Novice");
                        break;
                    }
                    else if ((playerTries >= 5) && (playerTries <= 6)) {
                        JOptionPane.showMessageDialog(null,
                                "Congratulations! You guessed correctly! " +
                                        "\nNumber of Tries:" + playerTries + "\nRank: Beginner");
                        break;
                    }
                    else if ((playerTries >= 2) && (playerTries <= 4)) {
                        JOptionPane.showMessageDialog(null,
                                "Congratulations! You guessed correctly! " +
                                        "\nNumber of Tries:" + playerTries + "\nRank: Expert");
                        break;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,
                                "Congratulations! You guessed correctly! " +
                                        "\nNumber of Tries:" + playerTries + "\nRank: Professional");
                        break;
                    }
                }
                else if (playerGuess > randomGuess)
                {
                    JOptionPane.showMessageDialog(null,
                            "Your guess was too high. Try again!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Your guess was too low. Try again!");
                }
            }
        }
    }
}