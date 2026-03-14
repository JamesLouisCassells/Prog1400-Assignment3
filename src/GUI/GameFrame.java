//pseudo for this class:
// - creates the window
// - creates the three screens
// - stores the current player
// - switches between panels

package GUI;
import Classes.Player;
import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    //creating card structures variables
    private CardLayout cardLayout; //layout manager used to switch between screens
    private JPanel mainPanel; //main container panel that holds all the screens

    //creating three ui screen variables
    private SplashPanel splashPanel; //first title screen
    private CreationPanel creationPanel; //character creation panel
    private BattlePanel battlePanel; //battle summary screen
    private Player currentPlayer; //stores the player created in creation screen

    //gameframe constructor
    public GameFrame() {
        setTitle("Dragons n Dungeons Character Creation");
        setSize(800, 600); //sizing of the panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //centers the frame

        cardLayout = new CardLayout(); //creates a layout that can swap between panels
        mainPanel = new JPanel(cardLayout); //creates a panel based on the above layout

        splashPanel = new SplashPanel(this); //creates a splashscreen that uses gameframe
        creationPanel = new CreationPanel(this); //creates the character creatoin screen
        battlePanel = new BattlePanel(this); //creates battle summary screen

        mainPanel.add(splashPanel, "splash"); //adds splash panel to card layout
        mainPanel.add(creationPanel, "creation"); //adds a creation panel
        mainPanel.add(battlePanel, "battle"); //adds a battle panel

        add(mainPanel); //adds the main panel to the window
        showSplashPanel(); //shows the splashscren first
        setVisible(true); //makes the window visible!
    }

    public void showSplashPanel() { //method to display splash screen
        cardLayout.show(mainPanel, "splash"); //switches to splash panel
    }

    public void showCreationPanel() { //method to display creation screen
        cardLayout.show(mainPanel, "creation"); //switches to creation panel
    }

    public void showBattlePanel() { //method to display battle screen

        battlePanel.loadBattleData(currentPlayer); //send the created player to battle screen
        cardLayout.show(mainPanel, "battle"); //switches to battle panel
    }

    public Player getCurrentPlayer() { //getter method to access the current player
        return currentPlayer; //returns the stored player object
    }

    public void setCurrentPlayer(Player currentPlayer) { //setter method to update the player
        this.currentPlayer = currentPlayer; //stores the created player
    }
}


