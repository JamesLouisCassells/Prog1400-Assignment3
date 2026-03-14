package Classes;
import javax.swing.ImageIcon;

public abstract class CharacterClass {
    private String className;
    private String armourType;
    private ImageIcon classImage;

    public CharacterClass(String className, String armourType, String imagePath) {
        this.className = className;
        this.armourType = armourType;
        this.classImage = new ImageIcon(imagePath);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }

    public ImageIcon getClassImage() {
        return classImage;
    }

    //superclass does not provide the value, FORCES THE SUBCLASS TO IMPLEMENT
    public abstract int getClassBonus();

    @Override
    public String toString() {
        return className + " (Armour Type: " + armourType + ")";
    }
}
