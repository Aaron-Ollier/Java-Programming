import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PercentageGuessingGameGUI extends JFrame implements ActionListener {

    // GUI components
    private JTextField guessField;
    private JButton submitButton;
    private JLabel feedbackLabel;
    private JLabel percentageLabel;
    private int percentage;
    private int turns = 0;

    public PercentageGuessingGameGUI() {
        // Set up the window
        setTitle("Percentage Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));

        // Generate the first percentage
        generatePercentage();

        // Add the GUI components
        percentageLabel = new JLabel(getPercentageRepresentation(), SwingConstants.CENTER);
        add(percentageLabel);
        feedbackLabel = new JLabel("Guess the percentage", SwingConstants.CENTER);
        add(feedbackLabel);
        guessField = new JTextField();
        add(guessField);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        // Make the window visible
        setVisible(true);
    }

    // Method to generate a new random percentage
    private void generatePercentage() {
        percentage = (int) (Math.random() * 100) + 1;
    }

    // Method to get a string representation of the current percentage
    private String getPercentageRepresentation() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < percentage; i++) {
            sb.append("-");
        }
        for (int i = percentage; i < 100; i++) {
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    // Method to handle button clicks
    public void actionPerformed(ActionEvent e) {
        // Get the user's guess
        int guess;
        try {
            guess = Integer.parseInt(guessField.getText());
            if (guess < 0 || guess > 100) {
                feedbackLabel.setText("Invalid guess. Please enter a number between 0 and 100.");
                return;
            }
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Invalid guess. Please enter a number between 0 and 100.");
            return;
        }

        // Check the guess
        if (guess == percentage) {
            feedbackLabel.setText("Correct! The percentage was " + percentage + "%");
            turns++;
            if (turns < 3) {
                // Generate a new percentage and update the GUI
                generatePercentage();
                percentageLabel.setText(getPercentageRepresentation());
                guessField.setText("");
                feedbackLabel.setText("Guess the percentage");
            } else {
                // End the game
                percentageLabel.setText("");
                guessField.setEnabled(false);
                submitButton.setEnabled(false);
            }
        } else {
            feedbackLabel.setText(guess < percentage ? "Too low! Guess again." : "Too high! Guess again.");
        }
    }

    public static void main(String[] args) {
        new PercentageGuessingGameGUI();
    }
}
