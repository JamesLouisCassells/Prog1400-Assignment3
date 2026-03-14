/*
a title
an image placeholder
a button
 */
package GUI;
import javax.swing.*;
import java.awt.*;

public class SplashPanel extends JPanel { //inherits from JPanel

    private GameFrame frame; //stores a reference to the main window

    public SplashPanel(GameFrame p_frame) { //constructor receives the GameFrame
        this.frame = p_frame; //saves the passed-in GameFrame

        setBackground(new Color(138, 154, 91)); //sets the panel background colour to moss green
        setLayout(null); //uses manual positioning for components

        //Title
        JLabel titleLabel = new JLabel("Dragons and Dungeons!!"); //creates the title text
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 28)); //this sets title font stylisation
        titleLabel.setBounds(240, 50, 350, 40); //sets title position and sizing
        add(titleLabel); //adds title to panel!
        //Image
        ImageIcon splashImage = new ImageIcon("images/creation.png");
        JLabel imageLabel = new JLabel(splashImage); //placeholder image label
        imageLabel.setBounds(120, 120, 550, 280); //sets image area position and size
        add(imageLabel); //adds image placeholder to panel
        //Button
        JButton buildButton = new JButton("Build A Character"); //creates button to begin making a character
        buildButton.setFont(new Font("Calibri", Font.BOLD, 22)); //sets button font
        buildButton.setBounds(250, 460, 250, 40); //sets button position and size
        buildButton.addActionListener(p_event -> frame.showCreationPanel()); //switches to creation screen when clicked
        add(buildButton); //adds button to panel (very important)
    }
}