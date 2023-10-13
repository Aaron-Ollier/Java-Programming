import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArenaGUI extends JFrame {

    private JLabel nameLabel;
    private JTextField nameTextField;
    private JButton startButton;
    private JTextArea outputTextArea;

    public ArenaGUI() {
        setTitle("Arena Game");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        nameLabel = new JLabel("Enter your name:");
        nameTextField = new JTextField(20);
        startButton = new JButton("Start");
        outputTextArea = new JTextArea(10, 40);
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        // Add components to container
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(nameLabel);
        inputPanel.add(nameTextField);
        inputPanel.add(startButton);
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Add action listener to start button
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
    }

    private void startGame() {
        String name = nameTextField.getText();
        outputTextArea.setText("");
        Arena arena = new Arena(name);
        arena.setPrintWriter(new PrintWriter(new TextAreaWriter(outputTextArea)));
        arena.LoadArena();
    }

    public static void main(String[] args) {
        ArenaGUI gui = new ArenaGUI();
        gui.setVisible(true);
    }

    private static class TextAreaWriter extends java.io.Writer {
        private JTextArea textArea;

        public TextAreaWriter(JTextArea textArea) {
            this.textArea = textArea;
        }

        public void write(char[] cbuf, int off, int len) {
            textArea.append(new String(cbuf, off, len));
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }

        public void flush() {}

        public void close() {}
    }
}
