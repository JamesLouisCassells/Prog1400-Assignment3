package GUI;
import Classes.*;
import javax.swing.*;
import java.awt.*;
public class BattlePanel extends JPanel {

    private GameFrame frame;
    private JTextArea summaryArea;

    public BattlePanel(GameFrame frame) {
        this.frame = frame;
        setLayout(null); //layout is already determined as card
        setBackground(Color.red);

        //creating a title for the panel
        Jlabel titleLabel = new JLabel("Battle Summary");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
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



}