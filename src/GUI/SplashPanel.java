//pseudo for this class:
// Interface behaviour as a designer:
// - populates first panel with a background and an enter button
// - Uses wizardry to scale the picture to the background size
// - creates a title and button to switch to the next panel (creation screen)
// -This panel is mainly visual with a button. Its just an entry screen
package GUI;
import javax.swing.*;
import java.awt.*;

public class SplashPanel extends JPanel { //inherits from JPanel

    private GameFrame frame; //stores a reference to the main window

    public SplashPanel(GameFrame p_frame) { //constructor receives the GameFrame
        this.frame = p_frame; //saves the passed-in GameFrame
        setBackground(new Color(138, 154, 91)); //sets the panel background colour to moss green
        setLayout(null); //uses manual positioning for components

        //loads the splash image before the title so its always the background
        ImageIcon splashIcon = new ImageIcon(getClass().getResource("/Images/Creation.png"));
        //turns the icon into an Image so it can be resized
        Image splashImg = splashIcon.getImage();
        //rescales the image
        Image scaledSplashImg = splashImg.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
        //puts the scaled image back into an ImageIcon
        ImageIcon scaledSplashIcon = new ImageIcon(scaledSplashImg);
        //creates a label to hold the image
        JLabel imageLabel = new JLabel(scaledSplashIcon);
        //set to fill the entire panel
        imageLabel.setBounds(0, 0, 1000, 700);
        //adds the image to the panel
        add(imageLabel);

        //Title
        JLabel titleLabel = new JLabel("Dragons and Dungeons!!"); //creates the title text
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 28)); //this sets title font stylisation
        titleLabel.setBounds(240, 100, 350, 40); //sets title position and sizing
        add(titleLabel); //adds title to panel!

        //Start Button
        JButton buildButton = new JButton("Build A Character");
        buildButton.setFont(new Font("Calibri", Font.BOLD, 22));
        buildButton.setBounds(400, 220, 280, 40);
        buildButton.addActionListener(p_event -> frame.showCreationPanel());
        add(buildButton);

         JButton exitButton = new JButton("Exit");
         exitButton.setFont(new Font("Calibri", Font.BOLD, 22));
         exitButton.setBounds(400, 280, 280, 40);
         exitButton.addActionListener(p_event -> System.exit(0));
         exitButton.setBackground(Color.RED);
         exitButton.setOpaque(true);
         add(exitButton);
   }
}