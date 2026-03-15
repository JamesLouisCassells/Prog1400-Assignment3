package GUI; //places this class inside the GUI package

import javax.swing.*; //imports Swing GUI components
import java.awt.*; //imports Color and Font classes
import java.util.Random; //imports Random for stat rerolling

public class CreationPanel extends JPanel { //CreationPanel is a JPanel (one screen of the program)

    private GameFrame frame; //reference to the main window so we can switch screens later

    //variables for user stats
    private JTextField txtName;
    private JTextField txtHp;
    private JTextField txtDefense;
    private JTextField txtAgility;
    private JTextField txtAttack;

    //Button variables
    private JRadioButton radWarrior;
    private JRadioButton radMage;
    private JRadioButton radPaladin;

    private JRadioButton radSword;
    private JRadioButton radStaff;
    private JRadioButton radHammer;

    private JLabel lblClassImage;
    private JLabel lblWeaponImage;

    private JTextArea txtClassInfo;
    private JTextArea txtWeaponInfo;

    private JTextField txtWeaponAttack;
    private JTextField txtWeaponWeight;

    public CreationPanel(GameFrame frame) { //constructor runs when the panel is created
        this.frame = frame; //stores the GameFrame reference
        setBackground(new Color(140,155,220)); //sets the background colour
        setLayout(null); //sets manual positioning

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

        //CHARACTER TYPE SECTION
        JLabel classLabel = new JLabel("Character Type");
        classLabel.setFont(new Font("Arial", Font.BOLD, 20));
        classLabel.setBounds(80, 150, 180, 30);
        add(classLabel);
        //class buttons
        radWarrior = new JRadioButton("Warrior");
        radMage = new JRadioButton("Mage");
        radPaladin = new JRadioButton("Paladin");
        //locatioon of class buttons
        radWarrior.setBounds(100, 200, 120, 30);
        radMage.setBounds(100, 240, 120, 30);
        radPaladin.setBounds(100, 280, 120, 30);
        //class button colours
        radWarrior.setBackground(new Color(140, 155, 220));
        radMage.setBackground(new Color(140, 155, 220));
        radPaladin.setBackground(new Color(140, 155, 220));
        //object of buttons created
        ButtonGroup classGroup = new ButtonGroup();
        classGroup.add(radWarrior);
        classGroup.add(radMage);
        classGroup.add(radPaladin);
        //adding the buttons to the panel
        add(radWarrior);
        add(radMage);
        add(radPaladin);

        //Pictures for the classes
        lblClassImage = new JLabel();
        lblClassImage.setBounds(250, 190, 120, 120);
        add(lblClassImage);

        //Box for class description
        txtClassInfo = new JTextArea();
        txtClassInfo.setBounds(80, 330, 350, 80);
        txtClassInfo.setEditable(false);
        txtClassInfo.setLineWrap(true);
        txtClassInfo.setWrapStyleWord(true);
        add(txtClassInfo);

        //setting parameters for my class and weapon pictures when radio button is selected
        lblClassImage = new JLabel();
        lblClassImage.setBounds(250, 190, 120, 120);
        add(lblClassImage);

        //Blurb actions and descriptions
        radWarrior.addActionListener(e -> {
            txtClassInfo.setText("Warriors like Payo are strong fighters with balanced stats.");
            ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Warrior.png"));
            Image img = icon.getImage();
            Image scaled = img.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            lblClassImage.setIcon(new ImageIcon(scaled));
        });

        radMage.addActionListener(e -> {
            txtClassInfo.setText("Mages like Xaryu use magic and gain a class bonus.");
            ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Mage.png"));
            Image img = icon.getImage();
            Image scaled = img.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            lblClassImage.setIcon(new ImageIcon(scaled));;
        });

        radPaladin.addActionListener(e -> {
            txtClassInfo.setText("Paladins like Esfand are tougher and more defensive.");
            ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Paladin.png"));
            Image img = icon.getImage();
            Image scaled = img.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            lblClassImage.setIcon(new ImageIcon(scaled));
        });

        //Adding the weapon section to the panel
        JLabel weaponLabel = new JLabel("Select Your Weapon");
        weaponLabel.setFont(new Font("Arial", Font.BOLD, 20));
        weaponLabel.setBounds(80, 430, 220, 30);
        add(weaponLabel);

        radSword = new JRadioButton("Sword");
        radStaff = new JRadioButton("Staff");
        radHammer = new JRadioButton("Hammer");

        radSword.setBounds(100, 480, 120, 30);
        radStaff.setBounds(100, 520, 120, 30);
        radHammer.setBounds(100, 560, 120, 30);

        radSword.setBackground(new Color(140, 155, 220));
        radStaff.setBackground(new Color(140, 155, 220));
        radHammer.setBackground(new Color(140, 155, 220));
        //same idea as with classes: an object of weapons created
        ButtonGroup weaponGroup = new ButtonGroup();
        weaponGroup.add(radSword);
        weaponGroup.add(radStaff);
        weaponGroup.add(radHammer);
        //weapons added to the panel
        add(radSword);
        add(radStaff);
        add(radHammer);

        //And the weapon images
        lblWeaponImage = new JLabel();
        lblWeaponImage.setBounds(250, 470, 140, 110);
        add(lblWeaponImage);

        //and Weapon descriptions
        txtWeaponInfo = new JTextArea();
        txtWeaponInfo.setBounds(80, 610, 350, 70);
        txtWeaponInfo.setEditable(false);
        txtWeaponInfo.setLineWrap(true);
        txtWeaponInfo.setWrapStyleWord(true);
        add(txtWeaponInfo);

        //Stats Section Title
        JLabel statsLabel = new JLabel("Character Stats"); //label for the stats area
        statsLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        statsLabel.setBounds(500, 140, 180, 30); //placing it on the right of the panel
        add(statsLabel);

        //Stat labels
        JLabel hpLabel = new JLabel("Hit Points"); //label for HP
        JLabel defenseLabel = new JLabel("Defense"); //label for defense
        JLabel agilityLabel = new JLabel("Agility"); //"" agility
        JLabel attackLabel = new JLabel("Base Attack"); //"" base attack

        hpLabel.setBounds(500, 190, 80, 30);
        defenseLabel.setBounds(500, 230, 80, 30);
        agilityLabel.setBounds(500, 270, 80, 30);
        attackLabel.setBounds(500, 310, 80, 30);

        add(hpLabel); //places this label on the panel (otherwise it just exists on code)
        add(defenseLabel);// ""
        add(agilityLabel);
        add(attackLabel);

        //Stat Input Fields - taking input from the user for their stats
        txtHp = new JTextField(); //text field for HP value
        txtDefense = new JTextField(); //text field for defense
        txtAgility = new JTextField(); //text field for agility
        txtAttack = new JTextField(); //text field for base attack

        //i want the stats to be randomly generated from the first click and never editable
        txtHp.setEditable(false);
        txtDefense.setEditable(false);
        txtAgility.setEditable(false);
        txtAttack.setEditable(false);

        txtHp.setBounds(650,190,20,30);
        txtDefense.setBounds(650,230,20,30);
        txtAgility.setBounds(650,270,20,30);
        txtAttack.setBounds(650,310,20,30);

        add(txtHp); //adds those stats to the panels
        add(txtDefense);
        add(txtAgility);
        add(txtAttack);

        //Weapon Stats
        JLabel weaponStatsLabel = new JLabel("Weapon Stats");
        weaponStatsLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        weaponStatsLabel.setBounds(500, 430, 180, 30);
        add(weaponStatsLabel);

        JLabel weaponAttackLabel = new JLabel("Attack Modifier");
        weaponAttackLabel.setBounds(500, 490, 140, 30);
        add(weaponAttackLabel);

        JLabel weaponWeightLabel = new JLabel("Weight");
        weaponWeightLabel.setBounds(500, 530, 140, 30);
        add(weaponWeightLabel);
        //assigns the randomly rolled stats to the weapon
        txtWeaponAttack = new JTextField();
        txtWeaponWeight = new JTextField();

        txtWeaponAttack.setBounds(650, 490, 20, 30);
        txtWeaponWeight.setBounds(650, 530, 20, 30);

        txtWeaponAttack.setEditable(false);
        txtWeaponWeight.setEditable(false);
        //adds the weapon stats to the panel
        add(txtWeaponAttack);
        add(txtWeaponWeight);
        //sword blurb comes up when the sword is clicked etc etc
        radSword.addActionListener(e -> {
            txtWeaponInfo.setText("A sword is a good all-round weapon.");
            lblWeaponImage.setIcon(new ImageIcon("src/Images/sword.png"));
            txtWeaponAttack.setText("5");
            txtWeaponWeight.setText("10");
        });

        radStaff.addActionListener(e -> {
            txtWeaponInfo.setText("A staff works well for magic users.");
            lblWeaponImage.setIcon(new ImageIcon("src/Images/staff.png"));
            txtWeaponAttack.setText("3");
            txtWeaponWeight.setText("6");
        });

        radHammer.addActionListener(e -> {
            txtWeaponInfo.setText("A hammer is heavy but powerful.");
            lblWeaponImage.setIcon(new ImageIcon("src/Images/hammer.png"));
            txtWeaponAttack.setText("8");
            txtWeaponWeight.setText("15");
        });
        //Button to actually begin the battle
        JButton startBattleButton = new JButton("Start Battle");
        startBattleButton.setFont(new Font("Calibri", Font.BOLD, 20));
        startBattleButton.setBounds(560, 610, 170, 40);
        add(startBattleButton);

        //Reroll Button - allows the user to completely reroll their stats (method at bottom of page)
        JButton rerollButton = new JButton("Reroll"); //button that generates random stats
        rerollButton.setBounds(620, 360, 110, 35);
        rerollButton.addActionListener(e -> rerollStats()); //when clicked this triggers method to reroll
        add(rerollButton);

        //call to rerollStats method within the constructor so it runs once at the beginning (first time page opens)
        rerollStats();

        //this sets the default screen to warrior and sword (nicer to begin populated)
        radWarrior.setSelected(true);
        radWarrior.doClick();
        radSword.setSelected(true);
        radSword.doClick();
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