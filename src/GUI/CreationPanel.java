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
        setLayout(null); //uses manual positioning instead of automatic layout

        //TITLE LABEL
        JLabel titleLabel = new JLabel("Character Generator"); //creates title text
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 26)); //sets the font style
        titleLabel.setBounds(260, 20, 300, 40); //sets position and size
        add(titleLabel); //adds the label to the panel


        //NAME SECTION
        JLabel nameLabel = new JLabel("Enter Name"); //label describing the name field
        nameLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        nameLabel.setBounds(80, 80, 150, 30);
        add(nameLabel);

        txtName = new JTextField(); //creates text field where user types their name
        txtName.setBounds(220, 80, 180, 30);
        add(txtName);


        //STATS SECTION TITLE
        JLabel statsLabel = new JLabel("Character Stats"); //label for the stats area
        statsLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        statsLabel.setBounds(500, 140, 180, 30);
        add(statsLabel);


        //STAT LABELS
        JLabel hpLabel = new JLabel("Hit Points"); //label for HP
        JLabel defenseLabel = new JLabel("Defense"); //label for defense
        JLabel agilityLabel = new JLabel("Agility"); //label for agility
        JLabel attackLabel = new JLabel("Base Attack"); //label for attack

        hpLabel.setBounds(500, 190, 120, 30);
        defenseLabel.setBounds(500, 230, 120, 30);
        agilityLabel.setBounds(500, 270, 120, 30);
        attackLabel.setBounds(500, 310, 120, 30);

        add(hpLabel);
        add(defenseLabel);
        add(agilityLabel);
        add(attackLabel);


        //STAT INPUT FIELDS
        txtHp = new JTextField(); //text field for HP value
        txtDefense = new JTextField(); //text field for defense
        txtAgility = new JTextField(); //text field for agility
        txtAttack = new JTextField(); //text field for base attack

        txtHp.setBounds(650,190,80,30);
        txtDefense.setBounds(650,230,80,30);
        txtAgility.setBounds(650,270,80,30);
        txtAttack.setBounds(650,310,80,30);

        add(txtHp);
        add(txtDefense);
        add(txtAgility);
        add(txtAttack);


        //REROLL BUTTON
        JButton rerollButton = new JButton("Reroll"); //button that generates random stats
        rerollButton.setBounds(620,360,110,35);
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

    }
}