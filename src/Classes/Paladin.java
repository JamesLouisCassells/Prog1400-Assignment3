package Classes;
public class Paladin extends CharacterClass {
    public Paladin() {
        super("Paladin", "Mail");
    }

    @Override
    public int getClassBonus(){
        return 5;
    }
}