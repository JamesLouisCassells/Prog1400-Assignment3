package Classes;
import javax.swing.ImageIcon;
public class Warrior extends CharacterClass {
    private ImageIcon classImage;

    public Warrior() {
        super("Warrior", "Plate", "images/Warrior.png");
    }
}
    @Override
    public int getClassBonus() {
        return 7;
    }

    @Override
    public String toString() {
        return getClassName();
    }
