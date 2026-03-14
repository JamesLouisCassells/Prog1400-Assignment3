package Classes;
public class Mage extends CharacterClass {
    public Mage() {
        super("Mage", "Cloth");
    }

    @Override
    public int getClassBonus(){
        return 3;
    }
}