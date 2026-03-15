package GUI; //places this class inside the GUI package

import Classes.*; //imports all the character classes
import javax.swing.*; //imports swing GUI components
import java.awt.*; //imports colour and font classes
import java.util.Random; //imports random for monster generation

public class BattlePanel extends JPanel { //BattlePanel is another screen of the program
    private GameFrame frame; //reference to GameFrame so we can switch screens
    //labels for player and monster titles
    private JLabel lblPlayerTitle;
    private JLabel lblMonsterTitle;
    //labels to hold images
    private JLabel lblPlayerImage;
    private JLabel lblMonsterImage;
    //text area that shows the battle summary
    private JTextArea txtBattleSummary;

    public BattlePanel(GameFrame frame) { //constructor runs when panel is created
        this.frame = frame;
        setLayout(null); //manual layout (same as CreationPanel)
        setBackground(new Color(140,155,220)); //same blue background as other screen

        //TITLE LABEL
        JLabel titleLabel = new JLabel("Battle To The Death!"); //title of battle screen
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 22)); //font styling
        titleLabel.setBounds(60, 40, 250, 30); //position of title
        add(titleLabel); //adds title to panel

        //PLAYER TITLE
        lblPlayerTitle = new JLabel("Player:");
        lblPlayerTitle.setFont(new Font("Calibri", Font.BOLD, 18));
        lblPlayerTitle.setBounds(140, 110, 200, 30);
        add(lblPlayerTitle);

        //MONSTER TITLE
        lblMonsterTitle = new JLabel("Monster:");
        lblMonsterTitle.setFont(new Font("Calibri", Font.BOLD, 18));
        lblMonsterTitle.setBounds(390, 110, 200, 30);
        add(lblMonsterTitle);

        //PLAYER IMAGE
        lblPlayerImage = new JLabel(); //label that will hold player picture
        lblPlayerImage.setBounds(170, 170, 120, 120);
        add(lblPlayerImage);

        //MONSTER IMAGE
        lblMonsterImage = new JLabel(); //label that will hold monster picture
        lblMonsterImage.setBounds(410, 170, 150, 120);
        add(lblMonsterImage);

        //TEXT AREA FOR BATTLE SUMMARY
        txtBattleSummary = new JTextArea(); //area that displays player + monster stats
        txtBattleSummary.setBounds(40, 330, 630, 210);
        txtBattleSummary.setEditable(false); //user cannot edit
        txtBattleSummary.setLineWrap(true); //wraps text automatically
        txtBattleSummary.setWrapStyleWord(true); //wraps on whole words
        txtBattleSummary.setFont(new Font("Calibri", Font.BOLD, 16));
        txtBattleSummary.setBackground(Color.WHITE); //white background like mockup
        txtBattleSummary.setForeground(new Color(180,200,225)); //light blue text
        add(txtBattleSummary);

        //PLAY AGAIN BUTTON
        JButton playAgainButton = new JButton("Play Again");
        playAgainButton.setFont(new Font("Calibri", Font.BOLD, 16));
        playAgainButton.setBounds(265, 560, 200, 35);
        //when clicked it returns to the character creation screen
        playAgainButton.addActionListener(e -> frame.showCreationPanel());
        add(playAgainButton);
    }

    //method called when the battle panel loads
    public void loadBattleData(Player player) {
        //if player somehow does not exist
        if (player == null) {
            txtBattleSummary.setText("No player created yet.");
            return;
        }

        //generate a monster opponent
        Monster monster = generateMonster();
        //update labels showing player and monster names
        lblPlayerTitle.setText("Player: " + player.getCharacterClass());
        lblMonsterTitle.setText("Monster: " + monster.getName());
        //set images for player and monster
        setPlayerImage(player);
        setMonsterImage(monster);
        //build the battle summary string
        String output =
                "Player: " + player.getName() + "\n"
                        + "-------------------------\n\n"
                        + "Class: " + player.getCharacterClass() + "\n\n"
                        + "HP: " + player.getHp()
                        + "        Defense: " + player.getDefence()
                        + "        Agility: " + player.getAgility()
                        + "        Base Attack: " + player.getBaseAttack() + "\n"
                        + "Weapon: " + player.getWeapon() + "\n\n"

                        + "Monster: " + monster.getName() + "\n"
                        + "-------------------------\n\n"
                        + "HP: " + monster.getHp()
                        + "        Defense: " + monster.getDefence()
                        + "        Agility: " + monster.getAgility()
                        + "        Base Attack: " + monster.getBaseAttack();
        //display the final text inside the summary area
        txtBattleSummary.setText(output);
    }

    //method to randomly generate a monster opponent
    public Monster generateMonster() {
        Random random = new Random(); //random object
        //array of monster names
        String[] monsterNames = {"Ragnaros", "Gruul", "Neltharion", "Jailer"};
        //randomly pick one name
        String name = monsterNames[random.nextInt(monsterNames.length)];

        //generate random stats
        int hp = 1 + random.nextInt(100);
        int defence = 1 + random.nextInt(100);
        int agility = 1 + random.nextInt(100);
        int baseAttack = 1 + random.nextInt(100);
        //return the monster object
        return new Monster(name, hp, defence, agility, baseAttack);
    }

    //method to set the correct player image depending on class
    private void setPlayerImage(Player player) {
        String className = player.getCharacterClass().toString();
        ImageIcon icon = null;
        if (className.equalsIgnoreCase("Warrior")) {
            icon = new ImageIcon(getClass().getResource("/Images/Warrior.png"));
        }
        else if (className.equalsIgnoreCase("Mage")) {
            icon = new ImageIcon(getClass().getResource("/Images/Mage.png"));
        }
        else if (className.equalsIgnoreCase("Paladin")) {
            icon = new ImageIcon(getClass().getResource("/Images/Paladin.png"));
        }

        if (icon != null) {

            //scale image so it fits the UI
            Image img = icon.getImage();
            Image scaled = img.getScaledInstance(120,120,Image.SCALE_SMOOTH);
            lblPlayerImage.setIcon(new ImageIcon(scaled));
        }
    }

    //method to set the monster image
    private void setMonsterImage(Monster monster) {
        ImageIcon icon = new ImageIcon("src/Images/monster.jpg");
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(150,120,Image.SCALE_SMOOTH);
        lblMonsterImage.setIcon(new ImageIcon(scaled));
    }
}