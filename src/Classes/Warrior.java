public class Warrior extends CharacterClass {
    public Warrior() {
        super("Warrior", "Plate");
    }

    @Override
    public int getClassBonus(){
        return 7;
    }
}