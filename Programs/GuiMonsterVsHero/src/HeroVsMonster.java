import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HeroVsMonster extends JFrame {
    private JLabel heroLabel, monsterLabel, resultLabel, statusLabel, actionLabel, powerLabel, itemLabel, itemListLabel;
    private JButton attackButton, defendButton, usePowerButton, useItemButton;
    private int heroHealth, heroMaxHealth, heroAttack, heroDefense, heroPower, heroMaxPower, heroLevel, heroXP, heroMaxXP, heroXPReq, heroGold, heroItems[], heroItemQuantity[];
    private int monsterHealth, monsterMaxHealth, monsterAttack, monsterDefense, monsterXP, monsterGold;
    private String heroName, heroClass, heroPowerName, heroItemNames[], monsterName;
    private boolean isPowerUsed, isItemUsed;
    private final String heroClasses[] = {"Warrior", "Mage", "Rogue", "Paladin", "Druid"};

    public HeroVsMonster() {
        // create panel to hold labels and buttons
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;

        // create label for game status
        statusLabel = new JLabel("Select a class to begin.");
        statusLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(statusLabel, c);

        // create label and text field for hero name
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        JTextField nameField = new JTextField(10);
        panel.add(nameField, c);

        // create label and combo box for hero class
        c.gridx = 0;
        c.gridy = 2;
        JLabel classLabel = new JLabel("Class:");
        panel.add(classLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        JComboBox<String> classComboBox = new JComboBox<>(heroClasses);
        panel.add(classComboBox, c);

        // create button to start game
        c.gridx = 2;
        c.gridy = 2;
        JButton startButton = new JButton("Start");
        panel.add(startButton, c);

        // add panel to frame
        add(panel, BorderLayout.CENTER);

        // set frame properties
        setTitle("Hero vs Monster");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);

        // add action listener to start button
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get hero name and class from input fields
                heroName = nameField.getText();
                heroClass = (String) classComboBox.getSelectedItem();

                // create hero and monster
                createHero();
                createMonster();

                // create hero and monster health labels
                heroLabel = new JLabel("Health: " + heroHealth + "/" + heroMaxHealth);
                monsterLabel = new JLabel("Health: " + monsterHealth + "/" + monsterMaxHealth);

                // create hero and monster stats labels
                JLabel heroStatsLabel = new JLabel("Level: " + heroLevel + " | Attack: " + heroAttack + " | Defense: " + heroDefense + " | Power: " + heroPower + "/" + heroMaxPower);
                // add action listener to attack button
                attackButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        attack();
                        updateLabels();
                    }
                });

// add action listener to defend button
                defendButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        defend();
                        updateLabels();
                    }
                });

// create panel for result and action labels
                JPanel resultPanel = new JPanel();
                resultPanel.setLayout(new GridLayout(2, 1));
                resultLabel = new JLabel("");
                resultPanel.add(resultLabel);
                actionLabel = new JLabel("");
                resultPanel.add(actionLabel);

// create panel for attack and defend buttons
                JPanel buttonsPanel = new JPanel();
                buttonsPanel.setLayout(new GridLayout(1, 2));
                buttonsPanel.add(attackButton);
                buttonsPanel.add(defendButton);

// create panel for power and item labels and buttons
                JPanel powerItemPanel = new JPanel();
                powerItemPanel.setLayout(new GridLayout(3, 2));
                powerLabel = new JLabel("Power: " + heroPower + "/" + heroMaxPower);
                powerItemPanel.add(powerLabel);
                itemLabel = new JLabel("Items: ");
                powerItemPanel.add(itemLabel);
                itemListLabel = new JLabel("");
                powerItemPanel.add(itemListLabel);
                powerItemPanel.add(usePowerButton);
                powerItemPanel.add(useItemButton);
                powerItemPanel.add(new JLabel(" "));

// create panel for hero and monster labels
                JPanel labelsPanel = new JPanel();
                labelsPanel.setLayout(new GridLayout(2, 2));
                labelsPanel.add(new JLabel("Hero: " + heroName + " (" + heroClass + ")"));
                labelsPanel.add(new JLabel("Health: " + heroHealth + "/" + heroMaxHealth));
                labelsPanel.add(new JLabel("Monster: " + monsterName));
                labelsPanel.add(new JLabel("Health: " + monsterHealth + "/" + monsterMaxHealth));

// create main panel
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BorderLayout());
                mainPanel.add(labelsPanel, BorderLayout.NORTH);
                mainPanel.add(resultPanel, BorderLayout.CENTER);
                mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
                mainPanel.add(powerItemPanel, BorderLayout.EAST);

// create frame and add main panel
                JFrame frame = new JFrame("Hero vs Monster");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(mainPanel);
                frame.pack();
                frame.setVisible(true);

// update labels
                updateLabels();
            }
        });
    }

    private void createHero() {
        // set hero stats based on class
        switch (heroClass) {
            case "Warrior":
                heroMaxHealth = 100;
                heroHealth = 100;
                heroAttack = 20;
                heroDefense = 10;
                heroPowerName = "Cleave";
                heroMaxPower = 50;
                heroPower = 50;
                heroLevel = 1;
                heroXP = 0;
                heroMaxXP = 100;
                heroXPReq = 100;
                heroGold = 0;
                heroItems = new int[5];
                heroItemQuantity = new int[5];
                heroItemNames = new String[] {"Potion", "Hi-Potion", "Ether", "Hi-Ether", "Elixir"};
                break;
            case "Mage":
                heroMaxHealth = 75;
                heroHealth = 75;
                heroAttack = 10;
                heroDefense = 5;
                heroPowerName = "Fireball";
                heroMaxPower = 100;
                heroPower = 100;
                heroLevel = 1;
                heroXP = 0;
                heroMax

