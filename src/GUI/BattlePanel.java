package GUI;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BattlePanel extends JPanel {

    private GameFrame frame;
    private JTextArea summaryArea;

    public BattlePanel(GameFrame frame) {
        this.frame = frame;
        setLayout(null); //layout is already determined as card
        setBackground(Color.red);

        //creating a title for the panel
        JLabel titleLabel = new JLabel("Battle Summary");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(280, 30, 250, 40);
        add(titleLabel); //adds this title to the panel
        //Summary area creation
        summaryArea = new JTextArea();
        summaryArea.setBounds(100, 100, 600, 300);
        summaryArea.setEditable(false); //the user cannot change this area
        summaryArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        add(summaryArea);

        //Return to previous screen button
        JButton backButton = new JButton("Back to Creation");
        backButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
        backButton.setBounds(260, 450, 220, 40);
        backButton.addActionListener(e -> frame.showCreationPanel()); //give the button an action when clicked
        add(backButton);
    }
    //Sequence for importing created player
    public void loadBattleData(Player player) {
        if (player == null) {
            summaryArea.setText("No player created yet."); //if no player created yet it returns to previous screen
            return;
        }
        //generates a monster, names it monster
        Monster monster = generateMonster();

        //saves the lengthy string info to the variable output
        //calls on methods created throughout the classes with getters and setters
        String output = "PLAYER\n"
                + "-------------------------\n"
                + "Name: " + player.getName() + "\n"
                + "Class: " + player.getCharacterClass() + "\n"
                + "Weapon: " + player.getWeapon() + "\n"
                + "HP: " + player.getHp() + "\n"
                + "Defence: " + player.getDefence() + "\n"
                + "Agility: " + player.getAgility() + "\n"
                + "Base Attack: " + player.getBaseAttack() + "\n"
                + "Total Attack: " + player.calculateAttack() + "\n\n"
                + "MONSTER\n"
                + "-------------------------\n"
                + "Name: " + monster.getName() + "\n"
                + "HP: " + monster.getHp() + "\n"
                + "Defence: " + monster.getDefence() + "\n"
                + "Agility: " + monster.getAgility() + "\n"
                + "Base Attack: " + monster.getBaseAttack();

        summaryArea.setText(output); //puts that blurb in the summaryArea box on the panel
    }

    //method to create a monster with random stats
    public Monster generateMonster() {
        Random random = new Random(); //assigning random a variable

        String[] monsterNames = {"Ragnaros", "Gruul", "Neltharion", "Jailer"};//string array of monster names
        String name = monsterNames[random.nextInt(monsterNames.length)]; //randomly chooses one

        int hp = 1 + random.nextInt(100);
        int defence = 1 + random.nextInt(100);
        int agility = 1 + random.nextInt(100);
        int baseAttack = 1 + random.nextInt(100);

        return new Monster(name, hp, defence, agility, baseAttack);
    }
}


