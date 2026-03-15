package GUI; //places this class inside the GUI package

import javax.swing.*; //imports Swing GUI components
import java.awt.*; //imports Color and Font classes
import java.util.Random; //imports Random for stat rerolling

public class CreationPanel extends JPanel { //CreationPanel is a JPanel (one screen of the program)

    private GameFrame frame; //reference to the main window so we can switch screens later

    //text fields for user input
    private JTextField txtName;
    private JTextField txtHp;
    private JTextField txtDefense;
    private JTextField txtAgility;
    private JTextField txtAttack;

    public CreationPanel(GameFrame frame) { //constructor runs when the panel is created
        this.frame = frame; //stores the GameFrame reference
        setBackground(new Color(140,155,220)); //sets the background colour
        setLayout(null); //sets to center

        //TITLE LABEL
        JLabel titleLabel = new JLabel("Character Generator"); //creates title text
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 26)); //sets the font style
        titleLabel.setBounds(260, 20, 300, 40); //sets position and size
        add(titleLabel); //adds the label to the panel

        //NAME SECTION
        JLabel nameLabel = new JLabel("Enter Name"); //label describing the name field
        nameLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        nameLabel.setBounds(80, 80, 150, 30);
        add(nameLabel); //adds this box to the panel

        txtName = new JTextField(); //creates text field where user types their name
        txtName.setBounds(220, 80, 180, 30);
        add(txtName); //adds this to the panel

        //STATS SECTION TITLE
        JLabel statsLabel = new JLabel("Character Stats"); //label for the stats area
        statsLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        statsLabel.setBounds(500, 140, 180, 30); //placing it on the right of the panel
        add(statsLabel);

        //STAT LABELS
        JLabel hpLabel = new JLabel("Hit Points"); //label for HP
        JLabel defenseLabel = new JLabel("Defense"); //label for defense
        JLabel agilityLabel = new JLabel("Agility"); //"" agility
        JLabel attackLabel = new JLabel("Base Attack"); //"" base attack

        hpLabel.setBounds(500, 190, 120, 30);
        defenseLabel.setBounds(500, 230, 120, 30);
        agilityLabel.setBounds(500, 270, 120, 30);
        attackLabel.setBounds(500, 310, 120, 30);

        add(hpLabel); //places this label on the panel (otherwise it just exists on code)
        add(defenseLabel);// ""
        add(agilityLabel);
        add(attackLabel);

        //STAT INPUT FIELDS - taking input from the user for their stats
        txtHp = new JTextField(); //text field for HP value
        txtDefense = new JTextField(); //text field for defense
        txtAgility = new JTextField(); //text field for agility
        txtAttack = new JTextField(); //text field for base attack

        //i want the stats to be randomly generated from the first click and never editable
        txtHp.setEditable(false);
        txtDefense.setEditable(false);
        txtAgility.setEditable(false);
        txtAttack.setEditable(false);

        txtHp.setBounds(650,190,80,30);
        txtDefense.setBounds(650,230,80,30);
        txtAgility.setBounds(650,270,80,30);
        txtAttack.setBounds(650,310,80,30);

        add(txtHp); //adds those stats to the panels
        add(txtDefense);
        add(txtAgility);
        add(txtAttack);

        //REROLL BUTTON - allows the user to completely reroll their stats (method at bottom of page)
        JButton rerollButton = new JButton("Reroll"); //button that generates random stats
        rerollButton.setBounds(620, 360, 110, 35);
        rerollButton.addActionListener(e -> rerollStats());
        add(rerollButton);


        //REROLL BUTTON LOGIC
        rerollButton.addActionListener(e -> { //runs when the button is clicked

            Random random = new Random(); //creates random number generator

            //generate random stats
            int hp = 50 + random.nextInt(51);
            int defense = 10 + random.nextInt(31);
            int agility = 10 + random.nextInt(31);
            int attack = 10 + random.nextInt(21);

            //update the text fields with the new numbers
            txtHp.setText(String.valueOf(hp));
            txtDefense.setText(String.valueOf(defense));
            txtAgility.setText(String.valueOf(agility));
            txtAttack.setText(String.valueOf(attack));

        });
        //call to rerollStats method within the constructor so it runs once at the beginnging (first time page opens)
        rerollStats();
    }
    //method to roll stats using random modifier
    public void rerollStats() {
        Random random = new Random();

        int hp = 1 + random.nextInt(100);
        int defense = 1 + random.nextInt(100);
        int agility = 1 + random.nextInt(100);
        int attack = 1 + random.nextInt(100);

        txtHp.setText(String.valueOf(hp));
        txtDefense.setText(String.valueOf(defense));
        txtAgility.setText(String.valueOf(agility));
        txtAttack.setText(String.valueOf(attack));
    }
}