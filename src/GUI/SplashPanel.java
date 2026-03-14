package GUI;
import javax.swing.*;
import java.awt.*;

public class SplashPanel extends JPanel { //inherits from JPanel

    private GameFrame frame; //stores a reference to the main window

    public SplashPanel(GameFrame p_frame) { //constructor receives the GameFrame
        this.frame = p_frame; //saves the passed-in GameFrame

        setBackground(new Color(140, 155, 220)); //sets the panel background colour
        setLayout(null); //uses manual positioning for components

        JLabel titleLabel = new JLabel("Dragons and Dungeons!!"); //creates the title text
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 28)); //this sets title font stylisation
        titleLabel.setBounds(240, 50, 350, 40); //sets title position and sizing
        add(titleLabel); //adds title to panel!

        JLabel imageLabel = new JLabel("Splash Image Here", SwingConstants.CENTER); //placeholder image label
        imageLabel.setOpaque(true); //makes background colour visible
        imageLabel.setBackground(Color.WHITE); //sets placeholder background colour
        imageLabel.setBounds(120, 120, 550, 280); //sets image area position and size
        add(imageLabel); //adds image placeholder to panel

        JButton buildButton = new JButton("Build A Character"); //creates button to continue
        buildButton.setFont(new Font("Calibri", Font.BOLD, 22)); //sets button font
        buildButton.setBounds(250, 460, 250, 40); //sets button position and size
        buildButton.addActionListener(p_event -> frame.showCreationPanel()); //switches to creation screen when clicked
        add(buildButton); //adds button to panel
    }
}