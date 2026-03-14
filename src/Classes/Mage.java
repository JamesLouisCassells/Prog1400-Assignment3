package Classes;
import javax.swing.ImageIcon;

public class Mage extends CharacterClass {

    private ImageIcon classImage;

    public Mage() {
        super("Mage", "Cloth","images/Mage.png");
    }

    @Override
    public int getClassBonus() {
        return 3;
    }


    @Override
    public String toString() {
        return getClassName();
    }
}