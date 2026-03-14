package Classes;
import javax.swing.ImageIcon;
public class Paladin extends CharacterClass {
    private ImageIcon classImage;
    public Paladin() {
        super("Paladin", "Mail", "images/Paladin.png");
    }

    @Override
    public int getClassBonus() {
        return 5;
    }

    @Override
    public String toString() {
        return getClassName();
    }
}