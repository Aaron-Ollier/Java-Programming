import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdventureGame extends JFrame implements ActionListener {
    private final String[] rooms = {"Room 1", "Room 2", "Room 3"};
    private final String[] descriptions = {"This is room 1.", "This is room 2.", "This is room 3."};
    private final int currentRoom = 0;
    private final JLabel roomLabel;
    private final JTextArea descriptionText;
    private final JPanel characterPanel;
    private final JLabel characterNameLabel;
    private final JTextField characterNameField;
    private final JLabel characterAppearanceLabel;
    private final JComboBox<String> characterAppearanceCombo;
    private final JLabel strengthLabel;
    private final JLabel intelligenceLabel;
    private final JLabel dexterityLabel;
    private final JSpinner strengthSpinner;
    private final JSpinner intelligenceSpinner;
    private final JSpinner dexteritySpinner;
    private JButton createCharacterButton;
    private ArrayList<Item> inventory;
    private final JPanel inventoryPanel;
    private final JTextArea inventoryText;
    private ArrayList<Quest> quests;
    private final JPanel questPanel;
    private final JTextArea questText;
    private final JButton acceptQuestButton;
    private final JButton completeQuestButton;
    private final int currentQuest = -1;
    private final JPanel combatPanel;
    private final JTextArea combatText;
    private final JButton attackButton;
    private final JButton defendButton;
    private final int playerHealth = 100;
    private final int enemyHealth = 100;
    private final boolean playerTurn = true;
    private final JPanel dialoguePanel;
    private final JTextArea dialogueText;
    private final JButton dialogueOption1Button;
    private final JButton dialogueOption2Button;
    private final boolean dialogueOption1Selected = false;
    private final boolean dialogueOption2Selected = false;
    private final ArrayList<Integer> completedQuests = new ArrayList<>();
    private final JButton saveButton;
    private final JButton loadButton;
    private final ArrayList<String> endings = new ArrayList<>();
    private final int currentEnding = -1;
    private final boolean gameFinished = false;

    public AdventureGame() {
        super("Adventure Game");

        // Set up the GUI
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the label and add it to the GUI
        roomLabel = new JLabel("Current Room: " + rooms[currentRoom]);
        add(roomLabel, BorderLayout.NORTH);

        // Create the text box and add it to the GUI
        descriptionText = new JTextArea(descriptions[currentRoom]);
        descriptionText.setEditable(false);
        add(descriptionText, BorderLayout.CENTER);

        // Create the character panel and add it to the GUI
        characterPanel = new JPanel(new GridLayout(0, 2));
        characterNameLabel = new JLabel("Name:");
        characterPanel.add(characterNameLabel);
        characterNameField = new JTextField();
        characterPanel.add(characterNameField);
        characterAppearanceLabel = new JLabel("Appearance:");
        characterPanel.add(characterAppearanceLabel);
        characterAppearanceCombo = new JComboBox<String>(new String[]{"Warrior", "Wizard", "Rogue"});
        characterPanel.add(characterAppearanceCombo);
        strengthLabel = new JLabel("Strength:");
        characterPanel.add(strengthLabel);
        strengthSpinner = new JSpinner(new SpinnerNumberModel(5, 1, 10, 1));
        characterPanel.add(strengthSpinner);
        intelligenceLabel = new JLabel("Intelligence:");
        characterPanel.add(intelligenceLabel);
        intelligenceSpinner = new JSpinner(new SpinnerNumberModel(5, 1, 10, 1));
        characterPanel.add(intelligenceSpinner);
        dexterityLabel = new JLabel("Dexterity:");
        characterPanel.add(dexterityLabel);
        dexteritySpinner = new JSpinner(new SpinnerNumberModel(5, 1, 10, 1));
        characterPanel.add(dexteritySpinner);
        characterPanel.add(createCharacterButton = new JButton("Create Character"));
        createCharacterButton.addActionListener(this);
        characterPanel.add(createCharacterButton);
        add(characterPanel, BorderLayout.WEST);
        // Create the inventory panel and add it to the GUI
        inventory = new ArrayList<>();
        inventoryPanel = new JPanel(new BorderLayout());
        inventoryPanel.setBorder(BorderFactory.createTitledBorder("Inventory"));
        inventoryText = new JTextArea();
        inventoryText.setEditable(false);
        inventoryPanel.add(inventoryText, BorderLayout.CENTER);
        add(inventoryPanel, BorderLayout.EAST);

        // Create the quest panel and add it to the GUI
        quests = new ArrayList<>();
        questPanel = new JPanel(new BorderLayout());
        questPanel.setBorder(BorderFactory.createTitledBorder("Quests"));
        questText = new JTextArea();
        questText.setEditable(false);
        questPanel.add(questText, BorderLayout.CENTER);
        acceptQuestButton = new JButton("Accept Quest");
        acceptQuestButton.addActionListener(this);
        questPanel.add(acceptQuestButton, BorderLayout.WEST);
        completeQuestButton = new JButton("Complete Quest");
        completeQuestButton.addActionListener(this);
        completeQuestButton.setEnabled(false);
        questPanel.add(completeQuestButton, BorderLayout.EAST);
        add(questPanel, BorderLayout.SOUTH);

        // Create the combat panel and add it to the GUI
        combatPanel = new JPanel(new BorderLayout());
        combatPanel.setBorder(BorderFactory.createTitledBorder("Combat"));
        combatText = new JTextArea();
        combatText.setEditable(false);
        combatPanel.add(combatText, BorderLayout.CENTER);
        attackButton = new JButton("Attack");
        attackButton.addActionListener(this);
        defendButton = new JButton("Defend");
        defendButton.addActionListener(this);
        defendButton.setEnabled(false);
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(attackButton);
        buttonPanel.add(defendButton);
        combatPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Create the dialogue panel and add it to the GUI
        dialoguePanel = new JPanel(new BorderLayout());
        dialoguePanel.setBorder(BorderFactory.createTitledBorder("Dialogue"));
        dialogueText = new JTextArea();
        dialogueText.setEditable(false);
        dialoguePanel.add(dialogueText, BorderLayout.CENTER);
        dialogueOption1Button = new JButton();
        dialogueOption1Button.addActionListener(this);
        dialogueOption1Button.setVisible(false);
        dialoguePanel.add(dialogueOption1Button, BorderLayout.WEST);
        dialogueOption2Button = new JButton();
        dialogueOption2Button.addActionListener(this);
        dialogueOption2Button.setVisible(false);
        dialoguePanel.add(dialogueOption2Button, BorderLayout.EAST);

        // Create the save and load buttons and add them to the GUI
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        add(saveButton, BorderLayout.SOUTH);
        loadButton = new JButton("Load");
        loadButton.addActionListener(this);
        add(loadButton, BorderLayout.NORTH);

        // Create the endings
        endings.add("Congratulations, you have completed the game!");
        endings.add("Sorry, you failed to complete the game.");

        // Set the size of the window and display it
        setSize(800, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button clicks
        if (e.getSource() == createCharacterButton) {
            // Create the player's character
            String name = characterNameField.getText();
            String appearance = (String) characterAppearanceCombo.getSelectedItem();
            int strength = (int) strengthSpinner.getValue();
            int intelligence = (int) intelligenceSpinner.getValue();
            int dexterity = (int) dexteritySpinner.getValue();
            Character player = new Character(name, appearance, strength, intelligence, dexterity);

            // Update the GUI to show the player's character
            characterPanel.setVisible(false);
            inventoryPanel.setVisible(true);
            questPanel.setVisible(true);
            combatPanel.setVisible(true);
            dialoguePanel.setVisible(true);
            saveButton.setVisible(true);
            loadButton.setVisible(true);
            characterNameLabel.setText("Name: " + player.getName(1));
            characterAppearanceLabel.setIcon(new ImageIcon(player.getAppearance()));
            strengthLabel.setText("Strength: " + player.getStrength());
            intelligenceLabel.setText("Intelligence: " + player.getIntelligence());
            dexterityLabel.setText("Dexterity: " + player.getDexterity());
            // Add starting quests to the player's quest list
            quests.add(new Quest("Find the Lost Key", "Explore the forest to find the lost key.", 50));
            quests.add(new Quest("Slay the Goblin King", "Travel to the Goblin King's castle and defeat him.", 100));

            // Update the GUI to show the starting quests
            updateQuestText();

            // Display a welcome message to the player
            dialogueText.setText("Welcome, " + Character.getName() + "! Your journey begins now.\n");
        } else if (e.getSource() == acceptQuestButton) {
            // Allow the player to accept a quest
            int selectedIndex = questText.getSelectedIndex();
            if (selectedIndex != -1) {
                Quest quest = quests.get(selectedIndex);
                if (!quest.isAccepted()) {
                    quest.acceptQuest();
                    updateQuestText();
                }
            }
        } else if (e.getSource() == completeQuestButton) {
            // Allow the player to complete a quest
            int selectedIndex = questText.getSelectedIndex();
            if (selectedIndex != -1) {
                Quest quest = quests.get(selectedIndex);
                if (quest.isAccepted() && !quest.isCompleted()) {
                    quest.completeQuest();
                    int reward = quest.getReward();
                    inventory.add(new Item("Gold", reward));
                    updateInventoryText();
                    updateQuestText();
                    completeQuestButton.setEnabled(false);
                }
            }
        } else if (e.getSource() == attackButton) {
            // Handle player attacking an enemy
            if (currentEnemy != null) {
                int damage = player.attack(currentEnemy);
                combatText.append("You attack the " + currentEnemy.getName() + " for " + damage + " damage.\n");
                if (currentEnemy.isDead()) {
                    combatText.append("You have defeated the " + currentEnemy.getName() + "!\n");
                    inventory.add(currentEnemy.getItemDrop());
                    updateInventoryText();
                    currentEnemy = null;
                    attackButton.setEnabled(false);
                    defendButton.setEnabled(false);
                } else {
                    enemyTurn();
                }
            }
        } else if (e.getSource() == defendButton) {
            // Handle player defending against an enemy
            if (currentEnemy != null) {
                player.defend();
                combatText.append("You defend against the " + currentEnemy.getName() + "'s attack.\n");
                enemyTurn();
            }
        } else if (e.getSource() == dialogueOption1Button) {
            // Handle player selecting dialogue option 1
            DialogueOption option = currentDialogue.getOption1();
            handleDialogueOption(option);
        } else if (e.getSource() == dialogueOption2Button) {
            // Handle player selecting dialogue option 2
            DialogueOption option = currentDialogue.getOption2();
            handleDialogueOption(option);
        } else if (e.getSource() == saveButton) {
            // Allow the player to save their progress
            try {
                FileOutputStream fileOut = new FileOutputStream("savefile.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(player);
                out.writeObject(quests);
                out.writeObject(inventory);
                out.writeObject(currentEnemy);
                out.writeObject(currentDialogue);
                out.close();
                fileOut.close();
                JOptionPane.showMessageDialog(frame, "Game saved.");
            } catch (IOException i) {
                i.printStackTrace();
            }
        } else if (e.getSource() == loadButton) {
// Allow the player to load a saved game
            try {
                FileInputStream fileIn = new FileInputStream("savefile.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                player = (Player) in.readObject();
                quests = (ArrayList<Quest>) in.readObject();
                inventory = (ArrayList<Item>) in.readObject();
                currentEnemy = (Enemy) in.readObject();
                currentDialogue = (Dialogue) in.readObject();
                in.close();
                fileIn.close();
                updateGUI();
                JOptionPane.showMessageDialog(frame, "Game loaded.");
            } catch (IOException i) {
                i.printStackTrace();
            } catch (ClassNotFoundException c) {
                System.out.println("Class not found");
                c.printStackTrace();
            }
        }
    }

    /**
     * Handles a dialogue option selected by the player.
     *
     * @param option the dialogue option selected by the player
     */
    private void handleDialogueOption(DialogueOption option) {
        if (option != null) {
            currentDialogue = option.getNextDialogue();
            dialogueText.append(option.getText() + "\n");
            updateDialogueOptions();
        } else {
            currentDialogue = null;
            dialoguePanel.setVisible(false);
            updateGUI();
        }
    }

    /**
     * Handles the enemy taking their turn in combat.
     */
    private void enemyTurn() {
        int damage = currentEnemy.attack(player);
        combatText.append("The " + currentEnemy.getName() + " attacks you for " + damage + " damage.\n");
        if (player.isDead()) {
            combatText.append("You have been defeated!\n");
            attackButton.setEnabled(false);
            defendButton.setEnabled(false);
        }
    }

    /**
     * Updates the GUI to show the player's inventory.
     */
    private void updateInventoryText() {
        inventoryText.setText("");
        for (Item item : inventory) {
            inventoryText.append(item.getName() + ": " + item.getQuantity() + "\n");
        }
    }

    /**
     * Updates the GUI to show the player's quests.
     */
    private void updateQuestText() {
        questListModel.clear();
        for (Quest quest : quests) {
            String questString = quest.getName();
            if (quest.isAccepted()) {
                if (quest.isCompleted()) {
                    questString += " (Completed)";
                } else {
                    questString += " (In Progress)";
                }
            }
            questListModel.addElement(questString);
        }
    }

    /**
     * Updates the GUI to show the current dialogue options.
     */
    private void updateDialogueOptions() {
        dialogueOption1Button.setVisible(false);
        dialogueOption2Button.setVisible(false);
        if (currentDialogue != null) {
            dialogueOption1Button.setText(currentDialogue.getOption1().getText());
            dialogueOption2Button.setText(currentDialogue.getOption2().getText());
            dialogueOption1Button.setVisible(true);
            dialogueOption2Button.setVisible(true);
        }
    }

    /**
     * Updates the entire GUI to reflect the current game state.
     */
    private void updateGUI() {
        characterNameLabel.setText("Name: " + player.getName());
        characterAppearanceLabel.setIcon(new ImageIcon(player.getAppearance()));
        strengthLabel.setText("Strength: " + player.getStrength());
        intelligenceLabel.setText("Intelligence: " + player.getIntelligence());
        dexterityLabel.setText("Dexterity: " + player.getDexterity());
        updateInventoryText();
        updateQuestText();
        if (currentEnemy != null) {
            enemyNameLabel.setText(currentEnemy.getName());
            enemyAppearanceLabel.setIcon(new ImageIcon(currentEnemy.getAppearance()));
            enemyHealthBar.setMaximum(currentEnemy.getMaxHealth());
            HealthBar.setValue(currentEnemy.getCurrentHealth());
            enemyPanel.setVisible(true);
        } else {
            enemyPanel.setVisible(false);
        }
        if (currentDialogue != null) {
            dialoguePanel.setVisible(true);
            dialogueText.setText(currentDialogue.getText());
            updateDialogueOptions();
        } else {
            dialoguePanel.setVisible(false);
        }
        if (player.isInCombat()) {
            combatPanel.setVisible(true);
            if (player.isDefending()) {
                combatText.append("You are defending.\n");
            } else {
                combatText.append("You attack the " + currentEnemy.getName() + ".\n");
                int damage = player.attack(currentEnemy);
                if (currentEnemy.isDead()) {
                    combatText.append("You have defeated the " + currentEnemy.getName() + "!\n");
                    player.endCombat();
                    currentEnemy = null;
                    attackButton.setEnabled(false);
                    defendButton.setEnabled(false);
                    updateGUI();
                } else {
                    combatText.append("The " + currentEnemy.getName() + " takes " + damage + " damage.\n");
                    enemyTurn();
                }
            }
        } else {
            combatPanel.setVisible(false);
        }
    }
    /**
     * Main method that starts the game.
     */
    public static void main(String[] args) {
        new AdventureGame();
    }
}

/**

 Represents a player in the game.
 */
class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Image appearance;
    private int strength;
    private int intelligence;
    private int dexterity;
    private ArrayList<Quest> quests;
    private ArrayList<Item> inventory;
    private boolean inCombat;
    private boolean defending;
    private int currentHealth;
    private int maxHealth;

    /**

     Creates a new player with the specified name, appearance, and stats.
     */
    public Player(String name, Image appearance, int strength, int intelligence, int dexterity) {
        this.name = name;
        this.appearance = appearance;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.quests = new ArrayList<Quest>();
        this.inventory = new ArrayList<Item>();
        this.inCombat = false;
        this.defending = false;
        this.currentHealth = 100;
        this.maxHealth = 100;

    /**

     Returns the player's name.
     */
    public String getName() {
        return name;
    }
    /**

     Returns the player's appearance.
     */
    public Image getAppearance() {
        return appearance;
    }
    /**

     Returns the player's strength stat.
     */
    public int getStrength() {
        return strength;
    }
    /**

     Returns the player's intelligence stat.
     */
    public int getIntelligence() {
        return intelligence;
    }
    /**

     Returns the player's dexterity stat.
     */
    public int getDexterity() {
        return dexterity;
    }
    /**

     Returns whether the player is currently in combat.
     */
    public boolean isInCombat() {
        return inCombat;
    }
    /**

     Returns whether the player is currently defending.
     */
    public boolean isDefending() {
        return defending;
    }
    /**

     Returns the player's current health.
     */
    public int getCurrentHealth() {
        return currentHealth;
    }
    /**

     Returns the player's maximum health.
     */
    public int getMaxHealth() {
        return maxHealth;
    }
    /**

     Sets the player's current health to the specified value.
     */
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    /**
     * Increases the player's current health by the specified amount, up to their maximum health.
     */
    public void heal(int amount) {
        currentHealth += amount;
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }
    }

    /**
     * Decreases the player's current health by the specified amount.
     */
    public void takeDamage(int amount) {
        currentHealth -= amount;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
    }

    /**
     * Adds the specified quest to the player's list of active quests.
     */
    public void addQuest(Quest quest) {
        if (quest != null) {
            quests.add(quest);
        }
    }


    /**
     * Removes the specified quest from the player's list of active quests.
     */
    public void removeQuest(Quest quest) {
        quests.remove(quest);
    }

    /**
     * Returns the player's list of active quests.
     */
    public ArrayList<Quest> getQuests() {
        return quests;
    }

    /**
     * Adds the specified item to the player's inventory.
     */
    public void addItem(Item item) {
        inventory.add(item);
    }

    /**
     * Removes the specified item from the player's inventory.
     */
    public void removeItem(Item item) {
        inventory.remove(item);
    }

    /**
     * Returns the player's inventory.
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    /**
     * Returns the player's total attack power, based on their strength and equipped weapon.
     */
    public int getAttackPower() {
        int weaponPower = 0;
        for (Item item : inventory) {
            if (item instanceof Weapon) {
                weaponPower += ((Weapon) item).getPower();
            }
        }
        return strength + weaponPower;
    }

    /**
     * Returns the player's total defense power, based on their dexterity and equipped armor.
     */
    public int getDefensePower() {
        int armorPower = 0;
        for (Item item : inventory) {
            if (item instanceof Armor) {
                armorPower += ((Armor) item).getPower();
            }
        }
        return dexterity + armorPower;
    }

    /**
     * Attacks the specified enemy and returns the amount of damage dealt.
     */
    public int attack(Enemy enemy) {
        int damage = getAttackPower() - enemy.getDefensePower();
        if (damage < 1) {
            damage = 1;
        }
        enemy.takeDamage(damage);
        return damage;
    }

    /**
     * Begins combat with the specified enemy.
     */
    public void startCombat(Enemy enemy) {
        currentHealth = maxHealth;
        inCombat = true;
        currentEnemy = enemy;
        updateGUI();
    }

    /**
     * Ends combat.
     */
    public void endCombat() {
        inCombat = false;
        defending = false;
        updateGUI();
    }

    /**
     * Sets the player to defend, reducing damage taken by 50% on the next enemy attack.
     */
    public void defend() {
        defending = true;
        combatText.append("You brace yourself for the " + currentEnemy.getName() + "'s attack.\n");
        enemyTurn();
    }

    /**
     * Handles the enemy's turn during combat.
     */
        private void enemyTurn() {
            if (!currentEnemy.isDead()) {
                if (defending) {
                    combatText.append("The " + currentEnemy.getName() + " attacks, but you block most of the damage.\n");
                    defending = false;
                } else {
                    int damage = currentEnemy.attack(this);
                    combatText.append("The " + currentEnemy.getName() + " attacks and deals " + damage + " damage.\n");
                }
                if (!isDead()) {
                    updateGUI();
                } else {
                    endCombat();
                }
            } else {
                endCombat();
            }
        }

    /**
     * Handles the player's turn during combat.
     */
    public void playerTurn(String action) {
        switch (action) {
            case "Attack":
                int damage = attack(currentEnemy);
                combatText.append("You attack the " + currentEnemy.getName() + " and deal " + damage + " damage.\n");
                if (!currentEnemy.isDead()) {
                    enemyTurn();
                } else {
                    endCombat();
                    int experience = currentEnemy.getExperience();
                    gold += currentEnemy.getGold();
                    combatText.append("You defeat the " + currentEnemy.getName() + " and earn " + experience + " experience and " + currentEnemy.getGold() + " gold.\n");
                    gainExperience(experience);
                    updateGUI();
                }
                break;
            case "Defend":
                defend();
                break;
            case "Use Item":
                // Code to use an item from the player's inventory
                break;
        }
    }

    /**
     * Updates the GUI with the player's current status.
     */
    public void updateGUI() {
        // Code to update the GUI with the player's current status
    }

    /**
     * Ends the game with the specified outcome (true for victory, false for defeat).
     */
    public void endGame(boolean victory) {
        // Code to end the game with the specified outcome
    }
    }
}





